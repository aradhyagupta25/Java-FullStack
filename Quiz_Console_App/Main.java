package Quiz_Console_App;

public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuiz(); // Prints Questions and Answers and take user input
        service.printScore();   // Prints the total score
    }
}
