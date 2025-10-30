package Quiz_Console_App;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Questions(1, "Which lang", "java", "c++", "javascript", "python", "java");
        questions[1] = new Questions(2, "Which car", "java", "c++", "javascript", "python", "java");
        questions[2] = new Questions(3, "Which city", "java", "c++", "javascript", "python", "java");
        questions[3] = new Questions(4, "Which ", "java", "c++", "javascript", "python", "java");
        questions[4] = new Questions(5, "What", "java", "c++", "javascript", "python", "java");
    }

    public void playQuiz() {
        int i = 0;
        for(Questions q :  questions ){
            System.out.println("question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner scanner = new Scanner(System.in);
            selection[i] = scanner.nextLine();
            i++;
        }
        System.out.println(Arrays.toString(selection));
    }
}
