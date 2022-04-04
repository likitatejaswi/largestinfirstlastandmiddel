package firstlastandmiddle;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
       int n = s.nextInt();
       int[] array = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the number");
            array[i] = s.nextInt();
        }
        Ex82 ex = new Ex82();
        int result = ex.first(array);
        System.out.println("Final result:"+result);

    }
}
