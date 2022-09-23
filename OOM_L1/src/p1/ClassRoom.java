package p1;

public class ClassRoom {
    int n;
    Student[] students;

    public ClassRoom(int n, QuestionPaper questionPaper, TA ta) {
        this.n = n;
        this.questionPaper = questionPaper;
        this.ta = ta;
    }

    QuestionPaper questionPaper;
    TA ta;
    AnswerKey answerKey;

    Evaluation e;

    public ClassRoom(int n, QuestionPaper questionPaper, TA ta, Evaluation e) {
        this.n = n;
        this.questionPaper = questionPaper;
        this.ta = ta;
        this.answerKey = this.ta.a;
        this.e = e;
    }


    public void setStudents(Student[] students) {
        this.students = students;
    }

    public ClassRoom(int n) {
        this.n = n;
        setStudents(this.n);
    }

    public void setStudents(int n) {
        this.students = new Student[n];
    }

    public void EvaluateClass(){
        for (int i = 0; i < n; i++) {
            EvaluateStudent(this.students[i]);
        }
    }
            void EvaluateStudent(Student s){
        TA.matchSheet(s,this.answerKey,questionPaper.marks);
            }


}
