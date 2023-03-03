package mypackage;

public class Card {

    private int suit, rank;
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // Constructor
    public Card() {
        this.suit = 0;
        this.rank = 0;
    }

    // Constructor
    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    // Print this card
    public void printCard() {
        System.out.println(ranks[rank] + " of " + suits[suit]);
    }

    // Compare with another Card
    public int compareCard(Card toCompare) {
        /*
         * Return 1 if this Card is greater than toCompare
         * Return 0 if cards are equal
         * Return -1 if toCompare is greater
         */

        if(this.suit > toCompare.suit)
            return 1;
        if(this.suit < toCompare.suit)
            return -1;

        // Suits are equal
        if(this.rank > toCompare.rank)
            return 1;
        if(this.rank < toCompare.rank)
            return -1;

        // Cards are the same
        return 0;
    }

    // return a new card just like this one
    public Card sameCard() {
        Card toReturn = new Card(suit, rank);
        return toReturn;
    }
}