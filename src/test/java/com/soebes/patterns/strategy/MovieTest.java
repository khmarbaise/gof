package com.soebes.patterns.strategy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.soebes.patterns.strategy.BlockBusterPrice;
import com.soebes.patterns.strategy.ChildrensPrice;
import com.soebes.patterns.strategy.Movie;
import com.soebes.patterns.strategy.RegularPrice;

@Test
public class MovieTest {
	public static double EPSILON = 1E-06;
	
	@DataProvider(name = "createChildrenMovie")
	public Object[][] createChildrensMovie() {
		return new Object[][] {
			// Movie             Type Of Movie,         rentedDays, expectedCharge
			{ new Movie("Ariel", new ChildrensPrice()), 1, 1.5 },
			{ new Movie("Ariel", new ChildrensPrice()), 2, 1.5 },
			{ new Movie("Ariel", new ChildrensPrice()), 3, 1.5 },
			{ new Movie("Ariel", new ChildrensPrice()), 4, 3.0 },
			{ new Movie("Ariel", new ChildrensPrice()), 5, 4.5 },
		};
	}
	@Test(dataProvider = "createChildrenMovie")
	public void childrensMovie(Movie movie, int rentedDays, double charge) {
		double calculatedCharge = movie.getCharge(rentedDays);
		Assert.assertEquals(calculatedCharge, charge, EPSILON);
	}

	@DataProvider(name = "createRegularMovie")
	public Object[][] createRegularMovie() {
		return new Object[][] {
			// Movie             Type Of Movie,         rentedDays, expectedCharge
			{ new Movie("Die Hard", new RegularPrice()), 1, 2.0 },
			{ new Movie("Die Hard", new RegularPrice()), 2, 2.0 },
			{ new Movie("Die Hard", new RegularPrice()), 3, 3.5 },
			{ new Movie("Die Hard", new RegularPrice()), 4, 5.0 },
			{ new Movie("Die Hard", new RegularPrice()), 5, 6.5 },
		};
	}
	@Test(dataProvider = "createRegularMovie")
	public void regularMovie(Movie movie, int rentedDays, double charge) {
		double calculatedCharge = movie.getCharge(rentedDays);
		Assert.assertEquals(calculatedCharge, charge, EPSILON);
	}

	@DataProvider(name = "createBlockBusterMovie")
	public Object[][] createBlockBusterMovie() {
		return new Object[][] {
			// Movie             Type Of Movie,         rentedDays, expectedCharge
			{ new Movie("Die Hard", new BlockBusterPrice()), 1, 3.0 },
			{ new Movie("Die Hard", new BlockBusterPrice()), 2, 6.0 },
			{ new Movie("Die Hard", new BlockBusterPrice()), 3, 9.0 },
			{ new Movie("Die Hard", new BlockBusterPrice()), 4,12.0 },
			{ new Movie("Die Hard", new BlockBusterPrice()), 5,15.0 },
		};
	}
	@Test(dataProvider = "createBlockBusterMovie")
	public void blockBusterMovie(Movie movie, int rentedDays, double charge) {
		double calculatedCharge = movie.getCharge(rentedDays);
		Assert.assertEquals(calculatedCharge, charge, EPSILON);
	}

}