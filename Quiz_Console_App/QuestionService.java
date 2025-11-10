package Quiz_Console_App;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Questions(1, "Which Lang", "JAVA", "C++", "JS", "PYTHON", "JAVA");
        questions[1] = new Questions(2, "Which Car", "BMW", "AUDI", "FERRARI", "PORSCHE", "PORSCHE");
        questions[2] = new Questions(3, "Which City", "SF", "MOUNTAIN VIEW", "LA", "SAN JOSE", "SF");
        questions[3] = new Questions(4, "Which Month", "June", "July", "March", "May", "July");
        questions[4] = new Questions(5, "Which year", "2027", "2028", "2029", "2030", "2027");
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
        //System.out.println(Arrays.toString(selection));
    }

    public void printScore(){
        int score = 0;
        for(int i = 0 ; i < questions.length; i++){
            Questions que = questions[i];
            String answer = que.getAnswer();
            String useranswer = selection[i];

            if(useranswer.equals(answer)){
                score++;
            }
        }
        System.out.println("Your Score is: " + score);
    }
}
