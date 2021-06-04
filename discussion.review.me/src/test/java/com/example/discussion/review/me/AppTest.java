package com.example.discussion.review.me;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("deprecation")
public class AppTest {
	@Test
	public void testWithPurchaseAmountGreaterThanThousand() {
		assertEquals((1001 * 0.8d), App.getPurchaseAmountAfterDiscount(1001d), 0);
	}
	
	@Test
	public void testWithPurchaseAmountLesserThanThousand() {
		assertEquals(999d, App.getPurchaseAmountAfterDiscount(999d), 0);
	}
}
