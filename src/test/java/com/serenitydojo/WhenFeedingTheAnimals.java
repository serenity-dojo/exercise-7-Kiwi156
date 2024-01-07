package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;
import static com.serenitydojo.model.FoodType.TUNA;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds(CAT, false);

        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds(HAMSTER, false);

        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds(DOG, false);

        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds(CAT, true);

        Assert.assertEquals(SALMON, food);
    }

    @Test
    public void shouldFeedPremiumDogsPremiumFood() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds(DOG, true);

        Assert.assertEquals(STEAK, food);

    }

    @Test
    public void shouldFeedPremiumHamstersLettuce() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds(HAMSTER, true);

        Assert.assertEquals(LETTUCE, food);

    }

    @Test

    public void ListOfColors() {


        Set<String> myColors = new HashSet<>();
        myColors.add("red");
        myColors.add("blue");
        myColors.add("purple");
        myColors.add("red");


        for (String someColor : myColors) {
            System.out.println("Color: " + someColor);


        }
    }
}