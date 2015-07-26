package com.soebes.patterns.strategy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MovieTest {
    public static double EPSILON = 1E-06;

    @DataProvider(name = "createChildrensMovie")
    public Object[][] createChildrensMovie() {
        //@formatter:off
        return new Object[][] {
                // Movie Type Of Movie, rentedDays, expectedCharge
                { new Movie("Ariel", new ChildrensPrice()), 1, 1.5 }, 
                { new Movie("Ariel", new ChildrensPrice()), 2, 1.5 },
                { new Movie("Ariel", new ChildrensPrice()), 3, 1.5 }, 
                { new Movie("Ariel", new ChildrensPrice()), 4, 3.0 },
                { new Movie("Ariel", new ChildrensPrice()), 5, 4.5 }, 
        };
        //@formatter:on
    }

    @Test(dataProvider = "createChildrensMovie")
    public void childrensMovie(Movie movie, int rentedDays, double expectedCharge) {
        double calculatedCharge = movie.getCharge(rentedDays);
        assertThat(calculatedCharge).isEqualTo(expectedCharge, offset(EPSILON));
    }

    @DataProvider(name = "createRegularMovie")
    public Object[][] createRegularMovie() {
    	//@formatter:off
        return new Object[][] {
            // Movie Type Of Movie, rentedDays, expectedCharge
            { new Movie("Die Hard", new RegularPrice()), 1, 2.0 }, 
            { new Movie("Die Hard", new RegularPrice()), 2, 2.0 },
            { new Movie("Die Hard", new RegularPrice()), 3, 3.5 },
            { new Movie("Die Hard", new RegularPrice()), 4, 5.0 },
            { new Movie("Die Hard", new RegularPrice()), 5, 6.5 }, 
        };
    	//@formatter:on
    }

    @Test(dataProvider = "createRegularMovie")
    public void regularMovie(Movie movie, int rentedDays, double expectedCharge) {
        double calculatedCharge = movie.getCharge(rentedDays);
        assertThat(calculatedCharge).isEqualTo(expectedCharge,offset(EPSILON));
    }

    @DataProvider(name = "createBlockBusterMovie")
    public Object[][] createBlockBusterMovie() {
        return new Object[][] {
                // Movie Type Of Movie, rentedDays, expectedCharge
                { new Movie("Die Hard", new BlockBusterPrice()), 1, 3.0 },
                { new Movie("Die Hard", new BlockBusterPrice()), 2, 6.0 },
                { new Movie("Die Hard", new BlockBusterPrice()), 3, 9.0 },
                { new Movie("Die Hard", new BlockBusterPrice()), 4, 12.0 },
                { new Movie("Die Hard", new BlockBusterPrice()), 5, 15.0 }, };
    }

    @Test(dataProvider = "createBlockBusterMovie")
    public void blockBusterMovie(Movie movie, int rentedDays, double expectedCharge) {
        double calculatedCharge = movie.getCharge(rentedDays);
        assertThat(calculatedCharge).isEqualTo(expectedCharge, offset(EPSILON));
    }

}
