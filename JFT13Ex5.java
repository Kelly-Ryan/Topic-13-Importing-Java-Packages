/*
Kelly Ryan
30 April 2019

Exercise 5 – Programming Challenge!

A player is dealt 3 random cards (from a pack of 52) with values ranging from 1-13. The program should generate the three random cards.
Aces are low in value (1) and Kings are high in value (13). Jokers aren't played.
The player beats the house if the sum of the 3 cards dealt is less than or equal to 21.
Otherwise, the house wins.
Write a program to simulate the game.
Save your class as Blackjack.JFT13Ex5.java.
 */

import java.util.Random;
import java.util.ArrayList;

public class JFT13Ex5 {

    public static void main(String[] args) {

        ArrayList<String> cardSuits = new ArrayList<>();
        cardSuits.add("HEARTS");
        cardSuits.add("DIAMONDS");
        cardSuits.add("CLUBS");
        cardSuits.add("SPADES");

        ArrayList<String> cardTypes = new ArrayList<>();
        cardTypes.add("ACE");
        cardTypes.add("TWO");
        cardTypes.add("THREE");
        cardTypes.add("FOUR");
        cardTypes.add("FIVE");
        cardTypes.add("SIX");
        cardTypes.add("SEVEN");
        cardTypes.add("EIGHT");
        cardTypes.add("NINE");
        cardTypes.add("TEN");
        cardTypes.add("JACK");
        cardTypes.add("QUEEN");
        cardTypes.add("KING");

        int score = 0;

        Random s = new Random();

        Random t = new Random();

        for(int i = 0; i < 3; i++) {

            int x = t.nextInt(13);
            int y = s.nextInt(4);
            System.out.println(cardTypes.get(x) + " of " + cardSuits.get(y));
            score = score + (x + 1);
        }

        System.out.println("Your score is: " + score);

        String result = score <= 21 ? "Result - Victory - you beat the house!" : "Result - Defeat - house wins!";
        System.out.println(result);

    }
}
