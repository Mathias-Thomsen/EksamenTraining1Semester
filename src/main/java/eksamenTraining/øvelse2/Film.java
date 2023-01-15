package eksamenTraining.øvelse2;

import java.time.Year;

public class Film {
    private String filmTitel;
    private int udgivelsesÅr;
    private Year thisYear = Year.now();
    private Producer producer;


    public Film(String filmTitel, int udgivelsesÅr) {
        this.filmTitel = filmTitel;
        this.udgivelsesÅr = udgivelsesÅr;
    }

    public Film(String filmTitel) {
        this.filmTitel = filmTitel;
        this.udgivelsesÅr = Integer.parseInt(String.valueOf(thisYear));
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public String toString() {
        return filmTitel + " " + udgivelsesÅr + " " + producer;
    }

    public static void main(String[] args) {
        Producer producer1 = new Producer("Mathias");

        Film film1 = new Film("Spiderman", 2003);
        Film film2 = new Film("Karate Manden");

        film1.setProducer(producer1);
        film2.setProducer(producer1);


        System.out.println(film1);
        System.out.println(film2);






    }

}
