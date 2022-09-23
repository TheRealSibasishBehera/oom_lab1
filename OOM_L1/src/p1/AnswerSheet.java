package p1;

import java.util.HashMap;
import java.util.Map;

public class AnswerSheet extends QuestionPaper{
    Map<Que,Boolean> map=new HashMap<Que,Boolean>();

    public AnswerSheet(int n, int marks, Que[] que) {
        super(n, marks, que);
    }

}
