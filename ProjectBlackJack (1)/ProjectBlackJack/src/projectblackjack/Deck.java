/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectblackjack;

/**
 *
 * @author sanjana reddy kotha
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> discard;

    public Deck() {
        deck = new ArrayList<>();
        discard = new ArrayList<>();
        
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                deck.add(new Card(value, suit));
            }
        }
        
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
    
    public Card drawCard() {
        if (deck.isEmpty()) {
            deck.addAll(discard);
            discard.clear();
            shuffle();
        }
        
        Card card = deck.remove(deck.size() - 1);
        discard.add(card);
        return card;
    }
}
