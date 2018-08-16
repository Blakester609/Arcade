/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade;

/**
 *
 * @author blake
 */
public class Card {
    
    private int credits;
    private int tickets;
    private final int cardNumber;
    
    public Card(int cardNumber) {
        this.credits = 0;
        this.tickets = 0;
        this.cardNumber = cardNumber;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    
}
