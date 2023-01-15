package eksamenTraining.øvelse12;

import java.util.Random;

public class User {
    private String fullName;
    private String userId;

    public User(String fullName) {
        this.fullName = fullName.toLowerCase();
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    public boolean validUserId(String userId) {
        int first4Letters = 0;
        int numbers = 0;
        int lowercaseStrings = 0;

        char [] chars = userId.toCharArray();

        for(char allChar : chars) {
            if(!Character.isDigit(allChar)){
                first4Letters++;
            }
        }
        if(first4Letters == 4) {
            for(char allChars : chars) {
                if(Character.isLowerCase(allChars)){
                    lowercaseStrings++;
                } else if (Character.isDigit(allChars)){
                    numbers++;
                }
            }
            return numbers < 5 && lowercaseStrings < 5;
        }

        return false;

    }

    public void createUserId(String fullName) {
        String [] splitFullname = fullName.split(" ");
        String firstName = splitFullname[0];
        String lastName = splitFullname[1];

        char [] splitFirstName = firstName.toCharArray();
        String firstNameChar1 = String.valueOf(splitFirstName[0]);
        String firstNameChar2 = String.valueOf(splitFirstName[1]);

        char [] splitLastName = lastName.toCharArray();
        String lastNameChar1 = String.valueOf(splitLastName[0]);
        String lastNameChar2 = String.valueOf(splitLastName[1]);

        Random rand = new Random();

        String randomNumber = String.format("%04d", rand.nextInt(10000));

        String userId = firstNameChar1 + firstNameChar2 + lastNameChar1 + lastNameChar2 + randomNumber;

        setUserId(userId);

    }



    public static void main(String[] args) {
        User mathias = new User("Mathias Thomsen");
        mathias.createUserId(mathias.fullName);
        System.out.println(mathias.userId);


    }
}
