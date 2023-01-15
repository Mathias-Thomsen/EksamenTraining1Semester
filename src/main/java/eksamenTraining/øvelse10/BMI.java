package eksamenTraining.øvelse10;

public class BMI {
    private int weight;
    private double height;


    public BMI(int weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBmi() {
        return weight / Math.pow(height,2);
    }

    public boolean isUnderWeight() {
        return (calculateBmi() < 18.5);
    }

    public boolean isNormalWeight() {
        return (calculateBmi() >= 18.5 && calculateBmi() <= 25);
    }

    public boolean isOverWeight() {
        return (calculateBmi() > 25);
    }





    public static void main(String[] args) {
        BMI mathias = new BMI(100, 1.83);

        System.out.println("Mathias BMI er: " + mathias.calculateBmi());
        System.out.println("Mathias er undervægtig: " + mathias.isUnderWeight());
        System.out.println("Mathias er normalvægtig: " + mathias.isNormalWeight());
        System.out.println("Mathias er overvægtig: " + mathias.isOverWeight());

    }


}
