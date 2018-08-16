/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade;

import java.util.Random;
/**
 *
 * @author blake
 */
public class Game {
    private final int creditsRequired;
    private final Random tickets;
    private int awardedTickets;

    public Game(int creditsRequired) {
        this.creditsRequired = creditsRequired;
        this.tickets = new Random();     
    }
    
    public void swipeCard(Card card) {
        this.awardedTickets = this.tickets.nextInt(50);
        if(card.getCredits() < this.getCreditsRequired()) {
            System.out.println("You have insufficient credits");
        } else {
            card.setCredits(card.getCredits() - this.creditsRequired);
            card.setTickets(card.getTickets() + this.awardedTickets);
        }
    }
    
    public void displayCardValues(Card card) {
        System.out.println("Card Number: " + card.getCardNumber());
        System.out.println("Tickets won: " + this.awardedTickets);
        System.out.println("New ticket total: " + card.getTickets());
    }
    
    public void playGame(Card card) {
        swipeCard(card);
        if(card.getCredits() > this.getCreditsRequired())
            displayCardValues(card);
    }

    public int getCreditsRequired() {
        return creditsRequired;
    }
}
