/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectblackjack;

/**
 *
 * @author sanjana reddy kotha
 */
public class Dealer extends Person {
    public Dealer() {
        super.setName("Dealer");
    }

    public void printFirstHand() {
        System.out.println("The dealer's hand looks like this:");
        System.out.println(super.getHand().getCards().get(0));
        System.out.println("Dealer's Hand Face Card Down:");
    }
    
    public void playTurn(Deck deck) {
        while (super.getHand().calculatedValue() < 17) {
            super.getHand().takeCardFromDeck(deck);
        }
    }
}
