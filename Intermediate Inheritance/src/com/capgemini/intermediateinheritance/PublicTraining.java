
package com.capgemini.intermediateinheritance;

//default class created
class PublicTraining extends Training {

	private int participants;

	// parameterized constructor invokes parameterized parent constructor first
	PublicTraining(String subject, float fees, int participants) {

		super(subject, fees);
		this.participants = participants;
	}

	// calculating the cost of corporate training
	@Override
	public void getOrderValue() {
		System.out.println("Cost of Public Training is : " + (getFees() * participants));
	}
}
