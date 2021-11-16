//import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Lab {
    public static void main(String[] args) {
        int[] a = new int[17]; // declaring first array
        for (int i = 0; i < 17; i++) { //filling first array
            a[i] = i + 1;
        }
        double min = -13.0;
        double max = 8.0;
        double diff = max - min;
        Random random = new Random();
        double[] x = new double[16]; // declaring second array
        for (int i = 0; i < 16; i++) { // filling sec array with random nums from -13.0 to 8.0
            double number = random.nextDouble() * diff + min;
            x[i] = number;
        }
        // for (double i : x) System.out.print(i + " "); // check print
        double[][] A = new double[17][16]; // declaring two-dimensional array
        int[] nums = {5, 6, 7, 8, 11, 13, 15, 16}; // extra positions
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 16; j++) {
                if (a[i] == 17) {
                    A[i][j] = 0.0;
                } else if (contains(nums, a[i])){
                    A[i][j] = Math.pow(Math.cos(Math.sin(x[j])), (0.5/ Math.cos(x[j]) *
                            (Math.tan(Math.pow(x[j], 1/3 + x[j])) - 0.5)));
                } else{
                    A[i][j] = Math.log(Math.pow((5 * Math.sqrt(Math.acos((x[j] - 2.5)/21)) + 1), 2));
                }
            }
        }
        for (double[] i : A){
            for (double j: i){
                System.out.printf("%.4f", j); // main print
                System.out.print("\t"); // beautify
            }
            System.out.println("\t");
        }
    }
    public static boolean contains(final int[] arr, final int key) { //the method that checks if array contains int
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
