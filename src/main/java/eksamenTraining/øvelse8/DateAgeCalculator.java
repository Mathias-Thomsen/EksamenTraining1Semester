package eksamenTraining.øvelse8;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;


    public DateAgeCalculator(int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }



    public int lowestAccept() {
        int lowest = (yourAge / 2) + 7;
        return lowest;
    }

    public void tooYoung(){
        if(dateAge < lowestAccept()) {
            System.out.println("Personen er desværre for ung!");
        }else{
            System.out.println("Hun er ikke for ung til dig, held og lykke!");
        }
    }


    public static void main(String[] args) {
        DateAgeCalculator date = new DateAgeCalculator(29, 21);

        System.out.println(date.lowestAccept());

        date.tooYoung();



    }
}
