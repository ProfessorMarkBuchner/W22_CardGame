

package cardgame;

/**
 * This class +++Insert Description Here+++
 *
 * @author Sukhmandeep Kaur
 */
public class CardTrick{
    private String suitOfCard;
    private int valueOfCard;
    
    //gettters
    public String getSuit(){
        return suitOfCard;
    }
    public int getValue(){
        return valueOfCard;
    }
    
    public static String suits[]={"Heart","Club","Spade","Diamond"};
    
    //constructor added here that takes two parameters 
    public CardTrick(String suit,int value){
        suitOfCard=suit;
        valueOfCard=value;
    }
    
}
