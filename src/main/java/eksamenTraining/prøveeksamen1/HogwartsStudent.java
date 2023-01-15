package eksamenTraining.prøveeksamen1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    private ArrayList<HogwartsStudent> students = new ArrayList<>();


    public HogwartsStudent(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = "House ikke sat endnu";
    }

    public HogwartsStudent(){

    }

    public String getLastName(){
        return lastName;
    }


    public void setHouse(String house) {
        switch (house){
            case "Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin" -> this.house = house;
        }

    }

    public void printList() {
        Collections.sort(students, new SortByLastName());
        for(HogwartsStudent student : students){
            System.out.println(student.firstName + " " + student.lastName + " " + student.house);
        }
    }




    public static void main(String[] args) {

        HogwartsStudent hogwartsStudent = new HogwartsStudent();

        HogwartsStudent harry = new HogwartsStudent("Harry", "Potter");
        HogwartsStudent ron = new HogwartsStudent("Ron", "Wesley");
        HogwartsStudent hermione = new HogwartsStudent("Hermione", "Granger");
        HogwartsStudent neville = new HogwartsStudent("Neville", "longbottom");

        harry.setHouse("Gryffindor");
        ron.setHouse("Gryffindor");
        System.out.println(harry.house);

        hogwartsStudent.students.add(harry);
        hogwartsStudent.students.add(ron);
        hogwartsStudent.students.add(hermione);
        hogwartsStudent.students.add(neville);

        hogwartsStudent.printList();





    }

}
