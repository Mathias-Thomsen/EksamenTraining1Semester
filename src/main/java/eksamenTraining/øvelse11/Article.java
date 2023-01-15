package eksamenTraining.øvelse11;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String author;
    private String [] words;


    public void setHeading(String heading){
        this.heading = heading;

    }
    public void setBody(String body){
        this.body = body;

    }
    public void setAuthor(String author){
        this.author = author;

    }

    public void setWords(){
        this.words = body.split(" ");
    }

    public String getLongestWord() {
        setWords();
        String longestWordPrint = " ";
        for (String word : words){
            if(word.length() > longestWordPrint.length()){
                longestWordPrint = word;
            }
        }
        return longestWordPrint;

    }

    public ArrayList getWords() {
        setWords();
        ArrayList<String> allWords = new ArrayList<>();
        for(String word : words){
            if(!allWords.contains(word)){
                allWords.add(word);
            }
        }
        return allWords;
    }

    public static void main(String[] args) {
        Article article = new Article();
        article.setHeading("Football");
        article.setBody("Lav en klasse Article der har tre attributter: heading, body og author. Lav test-kode der sætter alle tre attributter, og sørg for at body er en lang tekst – f.eks. indholdet af denne øvelsesbeskrivelse!");
        article.setAuthor("Peter");

        System.out.println(article.heading);
        System.out.println(article.body);
        System.out.println(article.author);

        System.out.println("Det længeste sekvens af tegn er: " + article.getLongestWord());

        System.out.println("Alle ord kun optrådt en gang: " + article.getWords());



    }

}
