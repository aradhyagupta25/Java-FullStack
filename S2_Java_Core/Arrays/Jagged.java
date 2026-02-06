package S2_Java_Core.Arrays;

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

        int threeD[][][] = new int[3][3][3];
        for(int i = 0; i < threeD.length; i++){
            for(int j = 0; j < threeD[i].length; j++){
                for(int k = 0; k < threeD[i].length; k++){
                    threeD[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        System.out.println(Arrays.deepToString(threeD));

    }
}
