package com.xworkz.elements;

import java.util.Arrays;

import com.xworkz.elements.bookmovie.MovieHub;

public class MovieTester {

	public static void main(String[] args) {
		
		String[] movieNames= {"zootopia","inside-out","om shanti om","call"};
		MovieHub movieHub=new MovieHub(movieNames,"miraj",400);
		String arrayOfMovies=Arrays.toString(movieHub.getMovieNames());
		System.out.println("movie name:"+arrayOfMovies);
		System.out.println("theater name:"+movieHub.getTheaterName());
		System.out.println("total ticket:"+movieHub.getTotalTickets());
		
		movieHub.getTicket("zootopia", "surakshita",10);
		
		movieHub.getTicket("call", "emily", 20);
		
		movieHub.getTicket("lovemocktail", "ram", 2);
		//invoking snacks method
		double price=movieHub.buySnacks("nacho", 2, true, null);
		System.out.println("total snack price="+price);
		String[] snacks=movieHub.getSnackList();
		for (int s=0;s<snacks.length;s++)
		{
			System.out.println(snacks[s]);
		}
	}
	

}
