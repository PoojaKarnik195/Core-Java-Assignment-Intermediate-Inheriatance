
package com.capgemini.intermediateinheritance;

//Parent class created
abstract class Training {

	private int id;
	private String subject;
	private float fees;

	// Parameterized constructor created
	Training(String subject, float fees) {
		this.subject = subject;
		this.fees = fees;
	}

	// function to get training fees
	public float getFees() {
		return fees;
	}

	abstract void getOrderValue();
}
