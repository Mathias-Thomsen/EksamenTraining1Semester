package eksamenTraining.øvelse3;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private ArrayList<Integer> terninger;



    public Raflebæger(int antal){
        this.antalTerninger = antal;
        this.terninger = new ArrayList<>();
    }


    public int ryst(){
        int samledeAntalTerninger = 0;

        terninger.clear();

        Random random = new Random();

        for(int i = 0; i < antalTerninger; i++) {
            int øjne = random.nextInt(1,7);
            terninger.add(øjne);
            samledeAntalTerninger += øjne;
        }
        return samledeAntalTerninger;

    }


    public ArrayList<Integer> se() {
        return terninger;
    }





    public static void main(String[] args){
        Raflebæger raflebæger = new Raflebæger(6);

        System.out.println(raflebæger.ryst());

        System.out.println(raflebæger.se());


    }

}
