/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.card;

/**
 *
 * @author MLemLoli
 */
public class StudentCard extends Card{
	double fee;
	
	public StudentCard(String id, int year, double days, double price, double fee) {
		super(id, year, days, price);
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return getPrice() * getDays() + this.fee;
	}

	@Override
	public String toString() {
		return "StudentCard [fee=" + fee + ", getFee()=" + getFee() + ", getId()="
				+ getId() + ", getYear()=" + getYear() + ", getDays()=" + getDays() + ", getPrice()=" + getPrice()
				+ "]";
	}
}

