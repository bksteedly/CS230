import java.util.Random;
/**
 * Deck creates a deck of card objects and contains methods to cut and shuffle the deck. 
 *
 * @author (Bella Steedly)
 * @version (2/23/2023)
 */
public class Deck
{
    private int currentDeck;
    private static final int fullDeck = 52;
    private Card[] deck;
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        deck = new Card[fullDeck];
        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(suits[count/13],values[count%13]);
        }
    }

    /**
     * toString method
     * 
     * @return String deckRepresentation is a string representation of the cards in the deck, separated by commas
     */
    public String toString()
    {
        String deckRepresentation = "";
        for(int i = 0; i < deck.length-1; i++)
        {
            deckRepresentation += (deck[i] + ", ");
        }
        deckRepresentation += (deck[deck.length-1]);
        return deckRepresentation;
    }

    /**
     * method to cut the deck at a randomly generated point in the deck
     * 
     * @return Card[] deck is the cut version of the deck
     */
    public Card[] cut()
    {
        Random random = new Random();
        int split = random.nextInt(52) + 1;
        Card[] temp1 = new Card[split];
        Card[] temp2 = new Card[fullDeck-split];
        Card[] temp = new Card[fullDeck];
        for(int cardNum = 0; cardNum < split; cardNum++)
        {    
            temp1[cardNum] = deck[cardNum];
        }
        for(int cardNum = 0; cardNum < (fullDeck-split); cardNum++)
        {
            temp2[cardNum] = deck[cardNum + split];
        }
        for(int cardNum = 0; cardNum < (fullDeck-split); cardNum++)
        {
            temp[cardNum] = temp2[cardNum];
        }
        for(int cardNum = 0; cardNum < split; cardNum++)
        {
            temp[fullDeck-(split-cardNum)] = temp1[cardNum];
        }
        deck = temp;
        return deck;
    }

    /**
     * method to shuffle the deck of cards
     * 
     * @return Card[] deck is a shuffled version of the deck
     */
    public Card[] shuffle()
    {
        Random random = new Random();
        Card[] temp = new Card[fullDeck];
        for(int i = 0; i < fullDeck; i++)
        {
            int randCard = random.nextInt(52);
            while(deck[randCard] == null)
            {
                randCard = random.nextInt(52);
            }
            temp[i] = deck[randCard];
            deck[randCard] = null;
        }
        deck = temp;
        return deck;
    }
}