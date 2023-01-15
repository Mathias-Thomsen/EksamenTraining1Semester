package eksamenTraining.øvelse5;

import java.util.Random;

public class Card {
    private String suit;
    private int value;

    private String[] list = {"Hearts", "Diamonds", "Clubs", "Spades"};

    private Random random = new Random();

    int index = random.nextInt(list.length);


    //TODO gør øvelsen færdig.

    public Card() {
        this.suit = list[index];
        this.value = random.nextInt(1,14);
    }



    public boolean beats(Card card1, Card card2) {
        return (card1.value > card2.value);
    }


    public String toString(){
        return suit + " " + value;
    }


    public static void main(String[] args) {

        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println(card1);
        System.out.println(card2);

        System.out.println(card1.beats(card1, card2));


    }





}
