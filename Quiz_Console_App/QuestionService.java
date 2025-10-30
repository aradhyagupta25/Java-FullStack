package Quiz_Console_App;

public class QuestionService {
    Questions[] questions = new Questions[5];

    public QuestionService(){
        questions[0] = new Questions(1, "Which lang", "java", "c++", "javascript", "python", "java");
        questions[1] = new Questions(2, "Which car", "java", "c++", "javascript", "python", "java");
        questions[2] = new Questions(3, "Which city", "java", "c++", "javascript", "python", "java");
        questions[3] = new Questions(4, "Which ", "java", "c++", "javascript", "python", "java");
        questions[4] = new Questions(5, "What", "java", "c++", "javascript", "python", "java");
    }

    public void playQuiz() {
        System.out.println("In Display Questions");
        for(Questions q :  questions ){
            System.out.println(q);
        }

    }
}
