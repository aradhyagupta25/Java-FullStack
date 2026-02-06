package S3_Java_Advance.Enums;

public class Demo2 {
    public static void main(String[] args) {
        status s = status.running;
        switch(s) {

            case running:
                System.out.println("All Good Boss");
                break;
            case failed:
                System.out.println("Try Again Boss");
                break;

            case pending:
                System.out.println("Pending Boss");
                break;

            default:
                System.out.println("Done Boss");
                break;
        }



    }
}
