package p1;

import java.util.Map;
import java.util.Scanner;

public class AnswerKey extends QuestionPaper{

//    Map<Que,String> gfg = new HashMap<String,String>();
    public AnswerKey(int n, int marks, Que[] que) {
        super(n, marks, que);
    }

    void setAnswerKey(){
        for (int i=0; i<= n; i++){
            System.out.println("The question "+ i+ "is :" + que[i].question);
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter Answer Please");
            String ans = myObj.nextLine();  // Read user input
            que[i].answer=ans;
        }
    }

}
