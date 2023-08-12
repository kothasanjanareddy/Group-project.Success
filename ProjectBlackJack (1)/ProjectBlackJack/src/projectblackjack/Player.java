/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectblackjack;

/**
 *
 * @author sanjana reddy kotha
 */
import java.util.Scanner;

public class Player extends Person {
    private int wins;
    private int losses;
    private int pushes;

    Scanner input = new Scanner(System.in);

    public Player() {
        super.setName("Player");
        wins = 0;
        losses = 0;
        pushes = 0;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getPushes() {
        return pushes;
    }

    public void incrementWins() {
        wins++;
    }

    public void incrementLosses() {
        losses++;
    }

    public void incrementPushes() {
        pushes++;
    }

    public void makeDecision(Deck deck) {
        int decision = 0;

        while (decision != 2) {
            System.out.println("Would you like to: 1) Hit or 2) Stand");
            decision = input.nextInt();

            if (decision == 1) {
                this.getHand().takeCardFromDeck(deck);
                this.printHand();

                int playerValue = this.getHand().calculatedValue();
                if (playerValue >= 21) {
                    System.out.println("You have gone over 21.\n");
                    return;
                }
            }
        }
    }

 
   public void printHand() {
        System.out.print(getName() + "'s hand looks like this:\n");
        for (Card card : getHand().getCards()) {
            System.out.println(card);
        }
        System.out.println(" Valued at: " + this.getHand().calculatedValue());
    }

     public void reset() {
        getHand().reset();
        wins = 0;
        losses = 0;
        pushes = 0;
    }
}