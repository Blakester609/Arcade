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
public class PrizeCategory {
    
    private final String name;
    private final int ticketsRequired;
    private int numItemsRemaining;
    
    public PrizeCategory(String name, int ticketsRequired, int numItemsRemaining) {
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.numItemsRemaining = numItemsRemaining;
    }

    public String getName() {
        return name;
    }

    public int getTicketsRequired() {
        return ticketsRequired;
    }

    public int getNumItemsRemaining() {
        return numItemsRemaining;
    }

    public void setNumItemsRemaining(int numItemsRemaining) {
        this.numItemsRemaining = numItemsRemaining;
    }
    
    
}
