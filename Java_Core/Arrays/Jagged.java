package Java_Core.Arrays;

import java.util.Arrays;

public class Jagged {
    public static void main(String[] args) {
        int test[][] = new int[3][4];

        test[0] = new int[2];   //Jagged Array
        test[1] = new int[3];
        test[2] = new int[4];

        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[i].length; j++){
                test[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(test));
        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[i].length; j++){
                System.out.print(test[i][j] + " " );
            }
            System.out.println("");
        }
    }
}
