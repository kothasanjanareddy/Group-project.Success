/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectblackjack;

/**
 *
 * @author sanjana reddy kotha
 */

import java.util.Scanner;

public class ProjectBlackJack {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack");

        Dealer dealer = new Dealer();
        Player player = new Player();
        Deck deck = new Deck();

        while (true) {
            System.out.println("\nStarting Next Round... Wins: " + player.getWins() + " Losses: " + player.getLosses() + " Pushes: " + player.getPushes());
            System.out.println();

            dealer.getHand().reset();
            player.getHand().reset();

            // Deal initial cards
            player.getHand().takeCardFromDeck(deck);
            dealer.getHand().takeCardFromDeck(deck);

            player.getHand().takeCardFromDeck(deck);
            dealer.getHand().takeCardFromDeck(deck);

            player.printHand();
            dealer.printFirstHand();

            // Player's turn
            player.makeDecision(deck);

            // Dealer's turn
            dealer.playTurn(deck);

            // Determine winner
            int playerValue = player.getHand().calculatedValue();
            int dealerValue = dealer.getHand().calculatedValue();

            if (playerValue > 21) {
                System.out.println("Player busted! Dealer wins.");
                player.incrementLosses();
            } else if (dealerValue > 21) {
                System.out.println("Dealer busted! Player wins.");
                player.incrementWins();
            } else if (playerValue > dealerValue) {
                System.out.println("Player wins!");
                player.incrementWins();
            } else if (dealerValue > playerValue) {
                System.out.println("Dealer wins.");
                player.incrementLosses();
            } else {
                System.out.println("It's a push.");
                player.incrementPushes();
            }

            // Ask if the player wants to play another round
            System.out.println("Do you want to play another round? 1) Yes 2) No");
            int playAgain = new Scanner(System.in).nextInt();
            if (playAgain != 1) {
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}
