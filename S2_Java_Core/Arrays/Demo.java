package S2_Java_Core.Arrays;

public class Demo {
    public static void main(String[] args) {
        String name1[] = {"A", "B", "C", "D" };
        name1[3] = "E";
        System.out.println(name1[2]);
        System.out.println(name1[3]);

        float num1[] = new float[4];    // dynamic allocation
        System.out.println(num1[2]);    // all zero values

        int array2d[][] = new int[4][4];    // 2D Array

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                array2d[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
