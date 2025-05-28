// ArraysArray_and_Loop_Program_1.java
// This program demonstrates the use of a while loop and conditional logic to print even numbers from 1 to 6.

public class Array_and_Loop_Program_1 {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 6) {
            if (++i % 2 == 0) {
                System.out.printf("i=%d ", i);
            }
        }
    }
}