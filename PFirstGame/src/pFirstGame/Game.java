package pFirstGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = 1L;
	
	private Handler handler;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH /12 * 9;
	
	public static boolean paused = false;
	
	public int diff = 0;
	//0 = normal
	//1 = hard
	
	private Random r = new Random();
	private Thread thread;
	private boolean running = false;
	private HUD hud;
	private Spawn spawner;
	private Menu menu;
	
	public enum STATE {
		Menu,
		Game,
		Select,
		Help,
		End
	};
	
	public static STATE gameState = STATE.Menu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Game();
	}
	
	public Game() 
	{
		handler = new Handler();
		hud = new HUD();
		spawner = new Spawn(handler, hud, this);
		menu = new Menu(this, handler, hud);
		
		this.addKeyListener(new KeyInput(handler, this));
		this.addMouseListener(menu);
		
		AudioPlayer.load();
		//AudioPlayer.getMusic("music").loop();
		
		new Window(WIDTH, HEIGHT, "Wave - Developed by Matthew", this); 
		if(gameState == STATE.Game)
		{
			handler.addObject(new Player(WIDTH /2 - 32, HEIGHT /2 - 32, ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.BasicEnemy, handler));
		}else {
			for(int i = 0; i < 20; i++) {
				handler.addObject(new MenuParticle(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.MenuParticle, handler));
			}
		}
	}
	
	public static float clamp(float var, float min, float max) {
		if(var >= max){
		return var= max;
		}
		else if(var <= min){
			return var = min;
		}else {
			return var;
		}
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		
		try 
		{
			thread.join();
			running = false;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) 
			{
				tick();
				delta--;
			}
			if(running)
			{
				render();
				frames++;
			}
			
			if(System.currentTimeMillis() - timer > 1000)
			{
				timer += 1000;
				//System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void tick()
	{
		if(gameState == STATE.Game) {
			if(!paused){
				hud.tick();
				spawner.tick();
				handler.tick();
				if(HUD.HEALTH <= 0) {
					HUD.HEALTH = 100;
					gameState = STATE.End;
					handler.clearEnemies();
					for(int i = 0; i < 20; i++) {
						handler.addObject(new MenuParticle(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.MenuParticle, handler));
					}
				}
			}
		}else if(gameState == STATE.Menu || gameState == STATE.End || gameState == STATE.Select) {
			menu.tick();
			handler.tick();
		}
	}
	
	private void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		handler.render(g);
		
		if(paused) {
			g.setColor(Color.white);
			g.drawString("PAUSED", 100, 100);
		}
		if(gameState == STATE.Game) {
			hud.render(g);
		}else if(gameState == STATE.Menu || gameState == STATE.Help || gameState == STATE.End || gameState == STATE.Select) {
			menu.render(g);
		}
		g.dispose();
		bs.show();
	}
}
