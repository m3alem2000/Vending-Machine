package com.vending.coin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Coin {
	
	private double weight;
	private double diameter;
	public static int NumQuarters;
	public static int NumDimes;
	public static int NumNickles;

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public int getNickles() {
		return NumNickles;
	}
	public void setNickles(int nickles) {
		this.NumNickles = nickles;
	}
	public int getQuarters() {
		return NumQuarters;
	}
	public void setQuarters(int quarters) {
		this.NumQuarters = quarters;
	}
	public int getDimes() {
		return NumDimes;
	}
	public void setDimes(int dimes) {
		this.NumDimes = dimes;
	}
	
	public void addQuarter() {
		NumQuarters++;
	}
	public void subtractQuarter() {
		NumQuarters--;
	}
	public void addDime() {
		NumDimes++;
	}
	public void subtractDime() {
		NumDimes--;
	}
	public void addNickle() {
		NumNickles++;
	}
	public void subtractNickle() {
		NumNickles--;
	}

}
