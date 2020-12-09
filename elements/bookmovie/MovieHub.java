package com.xworkz.elements.bookmovie;

import java.util.Arrays;

public class MovieHub {
//instance variable
	private String[] movieNames;
	private String theaterName;
	private int totalTickets;
	private double ticketPrice = 100;
	private String[] snackList = { "pop corn", "nacho", "samosa", "soda", "chips" };
	private double snackPrice = 50;
	private int totalSnacks = 1500;
//constructor
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

	/**
	 * 
	 * @param nameOfMovie
	 * @param bookedBy
	 * @param noOfTickets
	 * @return
	 */
//number of ticket method
	public double getTicket(String nameOfMovie, String bookedBy, int noOfTickets) {
		double totalAmount = 0;
		System.out.println("########################################");
		System.out.println("invoked get ticket method");
		System.out.println("selected movie name:" + nameOfMovie);
		System.out.println("booked by name:" + bookedBy);
		System.out.println("no of tickets booked:" + noOfTickets);

		for (int a = 0; a < movieNames.length; a++) {
			String movie = movieNames[a];
			if (nameOfMovie.equals(movie)) {
				System.out.println("movie found booking proceed");
				if (noOfTickets <= totalTickets) {
					System.out.println("ticket available:" + this.totalTickets);
					this.totalTickets = this.totalTickets - noOfTickets;
					System.out.println("ticket available after booked:" + this.totalTickets);
					return totalAmount;
				} else {
					System.out.println("ticket sold out");
				}
			} else {
				System.out.println("movie not found");
			}
		}
		return totalAmount;
	}

	// snack details
	public double buySnacks(String nameOfSnack, int quantity, boolean selfService, String seatNo) {
		double totalPrice = 0;
		System.out.println("* * * * * * * * * * * * * * ** *");
		System.out.println("invoked buySnacks");
		System.out.println("arg 1 name of snack:" + nameOfSnack);
		System.out.println("arg 2 quantity: " + quantity);
		System.out.println("arg 3:" + selfService);
		System.out.println("arg 4:" + seatNo);

		for (int s = 0; s < this.snackList.length; s++) {
			System.out.println("snack:" + this.snackList[s]);
			String snack = this.snackList[s];
			if (snack.equals(nameOfSnack)) {
				System.out.println("snack is available");
				if (quantity < +this.totalSnacks) {
					System.out.println("snack quantity available");
					this.totalSnacks = this.totalSnacks - quantity;
					System.out.println("total snacks remaining:" + this.totalSnacks);
					totalPrice = quantity * this.snackPrice;
					System.out.println("total price of snacks:" + totalPrice);
				} else {
					System.out.println("snacks quanitiy is not available");
				}
				break;

			} else {
				System.out.println("snacks are not available");
			}
		}
		return totalPrice;
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

	public double getTicketPrice() {
		return ticketPrice;
	}

	public String[] getSnackList() {
		return snackList;
	}

}
