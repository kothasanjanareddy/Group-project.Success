/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectblackjack;

import projectblackjack.Card.Suit;
import projectblackjack.Card.Value;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sanjana reddy kotha
 */
public class CardGame {
    public static void main(String[] args) {
        Card[] hand = new Card[2];
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++) {
            Card.Value value = Card.Value.values()[random.nextInt(Card.Value.values().length)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(Card.Suit.values().length)];
            Card card = new Card(value, suit);
            hand[i] = card;
        }
        
        for (Card card : hand) {
            System.out.println("Dealer Hand: " + card);
        }
    }
}