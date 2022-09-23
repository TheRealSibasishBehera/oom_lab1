package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TA ta =new TA();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        int noOfStudents = myObj.nextInt();  // Read user input
        QuestionPaper q= new QuestionPaper(ta.);
        Evaluation e=new Evaluation();
        ClassRoom classRoom = new ClassRoom(noOfStudents,q,ta,e);



    }
}
