package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.Octokitty;


public class SampleController
{

	public void SampleController()
	{
		
	}
	
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		Octokitty firstCat = new Octokitty();
		Octokitty secondCat;
		secondCat = new Octokitty();
		
		Octokitty thirdCat;
		thirdCat = new Octokitty(10);
		
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle" + secondCircle);
	}
	
	private void testScanner()
	{
		Scanner firstScanner; //declares a scanner objt.
		firstScanner = new Scanner(System.in); //instancates a scanner object
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
		System.out.println("How old are you????");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("You said that you are " + ageAnswer + " years old");
		
	}



	
}