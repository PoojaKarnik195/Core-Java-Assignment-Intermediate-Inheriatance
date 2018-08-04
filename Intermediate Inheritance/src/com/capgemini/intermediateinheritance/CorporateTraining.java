
package com.capgemini.intermediateinheritance;

//default class created
class CorporateTraining extends Training {

	private int days;

	// parameterized constructor invokes parameterized parent constructor first
	CorporateTraining(String subject, float fees, int days) {

		super(subject, fees);
		this.days = days;
	}

	// calculating the cost of corporate training
	@Override
	public void getOrderValue() {
		System.out.println("Cost of Corporate Training is : " + (getFees() * days));
	}
}
