package Quiz_Console_App;

public class QuestionService {
    Questions[] questions = new Questions[5];

    public QuestionService(){
        questions[0] = new Questions(1, "What", "java", "c++", "javascript", "python", "java");
    }

    public void displayQuestions() {
        System.out.println("In Display Questions");

    }
}
