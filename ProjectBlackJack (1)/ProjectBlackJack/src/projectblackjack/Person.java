/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectblackjack;

/**
 *
 * @author sanjana reddy kotha
 */
public abstract class Person {
     private Hand hand;
    private String name;

    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    public Hand getHand() {
        return hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}