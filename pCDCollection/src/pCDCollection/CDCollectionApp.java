package pCDCollection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CDCollectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "";
		String line = "";
		ArrayList<Artist> artists = new ArrayList();
		try {
			BufferedReader in = new BufferedReader(new FileReader("data.csv"));
			while((line = in.readLine()) != null)
			{
				ArrayList<Song> songs = new ArrayList();
				name = line;
				for(int i = 0; i < 3; i++)
				{
					line = in.readLine();
					songs.add(new Song(line));
				}
				artists.add(new Artist(name, songs));
				Collections.sort(songs);
				Collections.sort(artists);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error reading file");
		}
		CDCollection cd = new CDCollection(artists);
		System.out.println(cd.toString());
		
	}

}
