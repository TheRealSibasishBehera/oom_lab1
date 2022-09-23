package p1;

import java.util.Map;
import java.util.Scanner;

public class TA {

    AnswerKey a;
    QuestionPaper q;

    public static void matchSheet(Student s, AnswerKey answerKey,int m) {
        for (Map.Entry<Que, Boolean> entry : s.answerSheet.map.entrySet()) {
            if (entry.getValue()==true){
                if(
                        entry.getKey().answer== answerKey.que[Integer.parseInt(entry.getKey().question)].answer
                ){
                    s.marks+=m;
                }

            }

        }
    }

    public void setQuestion(){
        this.q.marks=;
        for (int i = 0; i < this.q.n; i++) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter question "+ i+ "is :" + q.que[i].question);
            String question = myObj.nextLine();  // Read user input
            this.q.que[i].question=question;
        }

    }
}
