package cardgame;

/**
 *
 * @author Rohan Battu
 * @date 2022/02/04
 */
public class Card {
    
 public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS
      }
    
    public enum Value {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
            EIGHT, NINE, TEN, JACK, QUEEN, KING
       }
    
    private Value value;
    private Suit suit;
    

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    
    
    public Value getValue() {
        return this.value;
    }

    /**
     * 
     * @param value
     */
    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    /**
     * 
     * @param suit
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    // I am done.
    public void printInfo() {
        System.out.println("Hi, I am Rohan Battu \n a student at Sheridan College \n pursuing Computer Programmming ; I have interest in coding.");
    }

}