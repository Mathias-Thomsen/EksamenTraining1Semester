package eksamenTraining.øvelse1;

import java.util.ArrayList;

public class Tekst {
    private ArrayList <String> tekstLinjer = new ArrayList<>();
    private ArrayList <String> unikkeLinjer = new ArrayList<>();
    private int antalUnikke;




    public void tilføj(String tekstInput) {
        tekstLinjer.add(tekstInput);
    }


    public int findAntalUnikke() {
        for (String tekst : tekstLinjer) {
            if (!unikkeLinjer.contains(tekst)) {
                unikkeLinjer.add(tekst);
            }
        }
       return antalUnikke = unikkeLinjer.size();
    }






    public static void main(String[] args){
        Tekst tekst = new Tekst();

        tekst.tilføj("Hallo");
        tekst.tilføj("Hej");
        tekst.tilføj("Hejsa");
        tekst.tilføj("Hallo");
        tekst.tilføj("Hallo");

        System.out.println(tekst.tekstLinjer);

        System.out.println(tekst.findAntalUnikke());





    }


}
