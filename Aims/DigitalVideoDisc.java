package com.hust.kstn;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private int length;
	private String director;
	private double cost;
	private int id;
	
	public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public double getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
}
