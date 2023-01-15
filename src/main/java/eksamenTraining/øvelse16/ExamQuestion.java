package eksamenTraining.øvelse16;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {
    private int number;
    private char grade;


    public void setGrade() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(1, 7);

        switch (randomNumber) {
            case 1 -> this.grade = 'A';
            case 2 -> this.grade = 'B';
            case 3 -> this.grade = 'C';
            case 4 -> this.grade = 'D';
            case 5 -> this.grade = 'E';
            case 6 -> this.grade = 'F';

        }

    }


   public ArrayList<String> examQuestions () throws FileNotFoundException {
        PrintStream output = new PrintStream("questions.txt");
        ArrayList<String> questions = new ArrayList<>();

        for (int i = 1; i < 15; i++) {
           setGrade();
           questions.add(i + "-->" + grade);
        }
        output.println(questions);
        return questions;
   }


    public static void main(String[] args) {

        ExamQuestion examQuestion = new ExamQuestion();

        try {
            System.out.println(examQuestion.examQuestions());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
