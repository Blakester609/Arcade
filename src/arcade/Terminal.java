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
public class Terminal {
    
    private final PrizeCategory prize1;
    private final PrizeCategory prize2;
    private final PrizeCategory prize3;
    
    public Terminal(PrizeCategory prize1, PrizeCategory prize2, PrizeCategory prize3) {
        this.prize1 = prize1;
        this.prize2 = prize2;
        this.prize3 = prize3;
    }
    
    public void awardCredits(int monies, Card card) {
        card.setCredits(card.getCredits() + (monies*2));
    }
    
    public void displayCardValues(Card card) {
        System.out.println("Card Number: " + card.getCardNumber());
        System.out.println("Tickets: " + card.getTickets());
        System.out.println("Credits: " + card.getCredits());
    }

    public void transferCredits(int numCreditsToTransfer, Card card1, Card card2) {
        if(numCreditsToTransfer > card1.getCredits()) {
            System.out.println("Cannot transfer credits");
        } else {
           card1.setCredits(card1.getCredits() - numCreditsToTransfer);
           card2.setCredits(card2.getCredits() + numCreditsToTransfer); 
        }
    }
    
    public void transferTickets(int numTicketsToTransfer, Card card1, Card card2) {
        if(numTicketsToTransfer > card1.getTickets()) {
            System.out.println("Cannot transfer tickets");
        } else {
           card1.setTickets(card1.getTickets() - numTicketsToTransfer);
           card2.setTickets(card2.getTickets() + numTicketsToTransfer); 
        }
    }
    
    public void transferCreditsAndTickets(int numCreditsToTransfer, int numTicketsToTransfer, Card card1, Card card2) {
        transferCredits(numCreditsToTransfer, card1, card2);
        transferTickets(numTicketsToTransfer, card1, card2);
    }
    
    public void exchangeTicketsForPrizes(String prizeCategory, Card card) {
        PrizeCategory prize = getPrize1();
        switch (prizeCategory) {
            case "Prize 1":
                prize = getPrize1();
                break;
            case "Prize 2":
                prize = getPrize2();
                break;
            case "Prize 3":
                prize = getPrize3();
                break;
        }
        
        if(prize.getNumItemsRemaining() == 0) {
            System.out.println("There are none of these prizes left. Please choose another prize");
        } else if(card.getTickets() < prize.getTicketsRequired()) {
            System.out.println("You have insufficient credits");
        } else {
            prize.setNumItemsRemaining(prize.getNumItemsRemaining() - 1);
            card.setTickets(card.getTickets() - prize.getTicketsRequired());
            System.out.println("You got the " + prize.getName() + "!");
            System.out.println("There are " + prize.getNumItemsRemaining() + " of this item remaining");
        }
                
    }
 
    
//    public void exchangeTicketsForPrize1(Card card) {
//        if(getPrize1().getNumItemsRemaining() == 0) {
//            System.out.println("There are none of these prizes left. Please choose another prize");
//        }else if(card.getTickets() < getPrize1().getTicketsRequired()) {
//            System.out.println("You have insufficient credits");
//        } else {
//            getPrize1().setNumItemsRemaining(getPrize1().getNumItemsRemaining() - 1);
//            card.setTickets(card.getTickets() - getPrize1().getTicketsRequired());
//            System.out.println("You got Prize1!");
//            System.out.println("There are " + getPrize1().getNumItemsRemaining() + "of this item remaining");
//        }
//    }
//    
//    public void exchangeTicketsForPrize2(Card card) {
//        if(getPrize2().getNumItemsRemaining() == 0) {
//            System.out.println("There are none of these prizes left. Please choose another prize");
//        }else if(card.getTickets() < getPrize2().getTicketsRequired()) {
//            System.out.println("You have insufficient credits");
//        } else {
//            getPrize2().setNumItemsRemaining(getPrize2().getNumItemsRemaining() - 1);
//            card.setTickets(card.getTickets() - getPrize2().getTicketsRequired());
//            System.out.println("You got Prize1!");
//            System.out.println("There are " + getPrize2().getNumItemsRemaining() + "of this item remaining");
//        }
//    }
//    
//    public void exchangeTicketsForPrize3(Card card) {
//        if(getPrize3().getNumItemsRemaining() == 0) {
//            System.out.println("There are none of these prizes left. Please choose another prize");
//        }else if(card.getTickets() < getPrize3().getTicketsRequired()) {
//            System.out.println("You have insufficient credits");
//        } else {
//            getPrize3().setNumItemsRemaining(getPrize3().getNumItemsRemaining() - 1);
//            card.setTickets(card.getTickets() - getPrize3().getTicketsRequired());
//            System.out.println("You got Prize1!");
//            System.out.println("There are " + getPrize3().getNumItemsRemaining() + "of this item remaining");
//        }
//    }
    
//    public int getMonies() {
//        return monies;
//    }

//    public Card getCard() {
//        return card;
//    }

    public PrizeCategory getPrize1() {
        return prize1;
    }
    
    public PrizeCategory getPrize2() {
        return prize2;
    }
    
    public PrizeCategory getPrize3() {
        return prize3;
    }
}
