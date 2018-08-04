
package com.capgemini.intermediateinheritance;

/**
 * @author Pooja Karnik Program to perform upcasting using inheritance
 *
 */
//testing constructor invocation
public class Test {

	// passing different parameters to constructors using upcasting
	public static void main(String[] args) {

		Training publicTraining = new PublicTraining("Java", 5000, 50);
		publicTraining.getOrderValue();

		Training corporateTraining = new CorporateTraining("Big Data", 35000, 4);
		corporateTraining.getOrderValue();
	}
}
