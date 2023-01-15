package eksamenTraining.øvelse4;

import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;

    private ArrayList<Keyword> seeAlso = new ArrayList<>();

    public Keyword(String word, String definition){
        this.word = word;
        this.definition = definition;
    }


    public boolean matches(String wordInput){
        return (word.toLowerCase().contains(wordInput.toLowerCase()));
    }

    public void addSeeAlso(Keyword keyword){
        seeAlso.add(keyword);
    }

    public void udskriv() {
        System.out.println(word + " - " + definition);
        if ( !seeAlso.isEmpty()) {
            System.out.print("Se også: ");
            for (Keyword liste : seeAlso) {
                System.out.print(liste.word);
                System.out.print(" ");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Keyword kat = new Keyword("Kat", "missekat");
        Keyword hund = new Keyword("Hund", "puddle");
        Keyword marsvin = new Keyword("Marsvin", "ligner et hamster");

        System.out.println(marsvin.matches("Svin"));

        kat.addSeeAlso(hund);
        hund.addSeeAlso(marsvin);
        marsvin.addSeeAlso(kat);

        marsvin.udskriv();



    }

}
