package eksamenTraining.øvelse7;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;


    public Names(String fullName){
        String [] fullNameSplit = fullName.split(" ");
        if (fullNameSplit.length == 2) {
            this.firstName = fullNameSplit[0];
            this.lastName = fullNameSplit[1];
        }else{
            this.firstName = fullNameSplit[0];
            this.middleName = fullNameSplit[1];
            this.lastName = fullNameSplit[2];
        }

    }

    public String toString() {
        if (middleName == null) {
            return firstName + " " + lastName;

        }else {
            return firstName + " " + middleName + " " + lastName;
        }
    }


    public static void main(String[] args) {
        Names name1 = new Names("Mathias Møller Thomsen");

        System.out.println(name1);
    }
}
