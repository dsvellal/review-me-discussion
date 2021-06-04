package com.example.discussion.review.me;

/**
 * Hello world!
 *
 */
public class App 
{
    public static double getPurchaseAmountAfterDiscount(double purchaseAmount) {
    	if (purchaseAmount > 1000) {
    		return 0.8 * purchaseAmount;
    	}
    	return purchaseAmount;
    }
}
