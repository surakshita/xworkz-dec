package com.xworkz.elements.bookmovie;

import java.util.Arrays;

public class MovieHub {

	private String[] movieNames;
	private String theaterName;
	private int totalTickets;

	public MovieHub(String[] movieNames, String theaterName, int totalTickets) {
		System.out.println("invoked constructor movie hub");
		String movieNameInArray = Arrays.toString(movieNames);
		System.out.println("movie running:" + movieNameInArray);
		System.out.println("name of theater:" + theaterName);
		System.out.println("available tickets:" + totalTickets);
		System.out.println("#######################################");
		this.movieNames = movieNames;
		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
	}
//
	public double getTicket(String nameOfMovie,String bookedBy,int noOfTickets)
	{
		double totalAmount=0;
		System.out.println("########################################");
		System.out.println("invoked get ticket method");
		System.out.println("selected movie name:"+nameOfMovie);
		System.out.println("booked by name:"+bookedBy);
		System.out.println("no of tickets booked:"+noOfTickets);
		
		for(int a=0;a<movieNames.length;a++)
		{
			String movie=movieNames[a]; 
			if(nameOfMovie.equals(movie))
		{
			System.out.println("movie found booking proceed");
			if(noOfTickets<=totalTickets)
			{
				System.out.println("ticket available:"+this.totalTickets);
				this.totalTickets=this.totalTickets-noOfTickets;
				System.out.println("ticket available after booked:"+this.totalTickets);
				return totalAmount;
			}
			else
			{
				System.out.println("ticket sold out");
			}
		}
		else
		{
			System.out.println("movie not found");
		}
	}
	return totalAmount;
	}

	public String[] getMovieNames() {
		return movieNames;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

}
