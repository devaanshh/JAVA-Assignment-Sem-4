package mypackage;

public class CardsClass {
    public static void main(String[] args) {

        Deck d = new Deck();
        d.createDeck();
        d.dealCards();
        d.printDeck();
        Card toFind = new Card(2, 4);

        int found = d.findCard(toFind);
        if(found == 1)
            System.out.println("Card found.");
        else
            System.out.println("Card not found.");
    }
}