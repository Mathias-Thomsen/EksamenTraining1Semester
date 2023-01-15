package eksamenTraining.prøveeksamen2;

import java.util.ArrayList;

public class Beer {
    private String name;
    private double alcoholPercentage;
    private int price;

    public Beer(String name) {
        this.name = name;
    }

    public void setAlcoholPercentage(double percentage) throws Exception {
        if(percentage > 0 && percentage <=100 ){
            this.alcoholPercentage = percentage;
        }
    }

    public void setPrice(int price) throws Exception {
        if(price > 0) {
            this.price = price;
        }
    }

    public int getPrice(){
        return price;
    }


    public static void main(String[] args) {
        Beer beer1 = new Beer("Tuborg");
        Beer beer2 = new Beer("Carlsberg");
        Beer beer3 = new Beer("Heineken");
        ArrayList<Beer> beers = new ArrayList<>();

        beers.add(beer1);
        beers.add(beer2);
        beers.add(beer3);

        try {
            beer1.setAlcoholPercentage(3.2);
        } catch (Exception e) {
            System.out.println("Dette er ikke inden for den rigtige procent");
        }
        try {
            beer1.setPrice(6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            beer2.setPrice(23);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            beer2.setAlcoholPercentage(4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            beer3.setPrice(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            beer3.setAlcoholPercentage(2.3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int gennmsnit = 0;
        for(Beer beer : beers){
            gennmsnit += beer.getPrice();
        }

        gennmsnit = gennmsnit/beers.size();

        System.out.println("Gennemsnitspris: " + gennmsnit);


    }





}
