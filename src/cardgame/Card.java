package cardgame;

public class Card {
    
    public static String SUITS[] = {"Hearts", "Clubs", "Spades", "Diamonds"};
    
    public static String VALUES[] = {"Jack", "Queen", "King", "Ace"};
    
    private String suit;
    
    private int value;
        
    public Card(int value, String suit){
        this.suit = suit;
        this.value = value;
    }
    
    public int getValue(){        
        return(value);                
    }
    
    public String getSuit(){
        return(suit);
    }

}
