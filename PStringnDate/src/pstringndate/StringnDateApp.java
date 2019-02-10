package pstringndate;

import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class StringnDateApp {

	public static void main(String[] args) {
		// Start a timer and complete the exercises
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getDayOfWeek());
		LocalDate tomorrows = LocalDate.of(2016, 06, 02);
		System.out.println(tomorrows);
		String birthDate;
		birthDate = JOptionPane.showInputDialog("Please enter your birth date divided.");
		int firstSlash = birthDate.indexOf("/");
		int day = Integer.parseInt(birthDate.substring(0, firstSlash));
		
		int secondSlash = birthDate.indexOf("/", firstSlash + 1);
		int month = Integer.parseInt(birthDate.substring(firstSlash + 1, secondSlash));
		
		int year = Integer.parseInt(birthDate.substring(secondSlash + 1));
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		
		LocalDate birthD = LocalDate.of(year, month, day);
		JOptionPane.showMessageDialog(null, birthD);
		System.out.println(birthD);
		
		//Get age using birth date
		int age = currentDate.getYear() - birthD.getYear();
		
		if(currentDate.getMonthValue() < birthD.getMonthValue())
		{
			age --;
		}
		else if(currentDate.getMonthValue() == birthD.getMonthValue())
		{
			if(currentDate.getDayOfMonth() < birthD.getDayOfMonth())
			{
				age --;
			}
		}
		System.out.println(age);
		
		
	}
	

}
