package eksamenTraining.øvelse9;

import java.util.ArrayList;

public class Motherboard {
    private ArrayList<SataDrive> tilkobletSataDrives = new ArrayList<>(4);
    private SataDrive sataDrive;



    public void printAktiveSataDrives() {
        for(int i = 1; i <= 4; i++) {
            System.out.println(i + " Active sataDrive");
        }
    }

    public void addSataDrive(){
        if(tilkobletSataDrives.size() < 4) {
            tilkobletSataDrives.add(sataDrive);
        }else{
            System.out.println("The motherboard is full!");
        }
    }

    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();

        motherboard.addSataDrive();
        motherboard.addSataDrive();
        motherboard.addSataDrive();
        motherboard.addSataDrive();


        motherboard.printAktiveSataDrives();
        motherboard.addSataDrive();

    }




}
