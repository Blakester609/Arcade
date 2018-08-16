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
public class Arcade {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card card1 = new Card(1);
        Card card2 = new Card(2);
        PrizeCategory stuffedBear = new PrizeCategory("Stuffed Bear", 80, 5);
        PrizeCategory sillyPutty = new PrizeCategory("Silly Putty", 20, 3);
        PrizeCategory kingSizedCandy = new PrizeCategory("King-sized Candy", 15, 8);
        Terminal terminal1 = new Terminal(stuffedBear, sillyPutty, kingSizedCandy);
        Game pinball = new Game(8);
        Game skeeball = new Game(15);
        Game spinthewheel = new Game(5);
        
        terminal1.awardCredits(100, card1);
        terminal1.awardCredits(50, card2);
        
        pinball.playGame(card1);
        System.out.println("");
        pinball.playGame(card1);
        System.out.println("");
        skeeball.playGame(card2);
        System.out.println("");
        spinthewheel.playGame(card2);
        System.out.println("");
        skeeball.playGame(card1);
        System.out.println("");
        pinball.playGame(card2);
        System.out.println("");
        
        terminal1.displayCardValues(card1);
        System.out.println("");
        terminal1.displayCardValues(card2);
        System.out.println("");
        
        terminal1.transferCreditsAndTickets(card1.getCredits(), card1.getTickets(), card1, card2);
        System.out.println("");
        
        terminal1.displayCardValues(card1);
        System.out.println("");
        terminal1.displayCardValues(card2);
        System.out.println("");
        
        terminal1.exchangeTicketsForPrizes("Prize 1", card2);
        System.out.println("");
        
        skeeball.playGame(card1);
        System.out.println("");
        
        terminal1.exchangeTicketsForPrizes("Prize 3", card1);
        
        System.out.println(card1.getTickets());
        System.out.println(card1.getCredits());
        
    }
    
}
