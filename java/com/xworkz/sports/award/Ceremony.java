package com.xworkz.sports.award;

public class Ceremony {

	private String name;
	private String[] foods;

	public Ceremony() {
		System.out.println("created constructor ceremony");
	}

	public Ceremony(String name) {

		this.name = name;
	}

	public void distributeAward(String personName, String award) {
		System.out.println("person name:" + personName);
		System.out.println("award:" + award);
	}

	public void displayFood() {
		if (this.foods != null) {
			for (int f = 0; f < this.foods.length; f++) {
				String food = this.foods[f];
				System.out.println(food);
			}
		}
	}

	public void displayCeremonyAndFood() {
		System.out.println(this.name);
		this.displayFood();

	}
	public void parentMember()
	{
	int hCode=super.hashCode();
	System.out.println(hCode);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getFoods() {
		return foods;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}

}
