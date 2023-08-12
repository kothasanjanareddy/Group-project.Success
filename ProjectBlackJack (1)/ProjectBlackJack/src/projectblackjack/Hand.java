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

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void takeCardFromDeck(Deck deck) {
        Card card = deck.drawCard();
        cards.add(card);
    }
    
    public int calculatedValue() {
        int value = 0;
        int numAces = 0;
        
        for (Card card : cards) {
            switch (card.getValue()) {
                case ACE:
                    numAces++;
                    value += 11;
                    break;
                case TWO: case THREE: case FOUR: case FIVE: case SIX: 
                case SEVEN: case EIGHT: case NINE: case TEN:
                    value += card.getValue().ordinal() + 1;
                    break;
                default:
                    value += 10; // For face cards
            }
        }
        
        // Adjust value if there are aces and value is greater than 21
        while (numAces > 0 && value > 21) {
            value -= 10;
            numAces--;
        }
        
        return value;
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public void reset() {
        cards.clear();
    }
}