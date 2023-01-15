package eksamenTraining.øvelse13;

import java.util.Random;

public class Julegave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;
    private Random rand = new Random();

    public Julegave(){
        this.isSoft = rand.nextBoolean();
        this.isRectangular = rand.nextBoolean();
        this.doesRattle = rand.nextBoolean();
    }

    public boolean couldBeLego(){
        return !isSoft && isRectangular && doesRattle;
    }




    public static void main(String[] args) {
        Julegave julegave = new Julegave();

        System.out.println("Er den blød: " + (julegave.isSoft? "Ja" : "Nej"));
        System.out.println("Er den rektanglet: " + (julegave.isRectangular? "Ja" : "Nej"));
        System.out.println("Rasler den: " + (julegave.doesRattle?"Ja" : "Nej"));

        System.out.println("Kunne det være lego: " + (julegave.couldBeLego()?"Ja" : "Nej"));
    }
}
