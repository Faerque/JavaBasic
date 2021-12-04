package Insertion_and_deletion;

import java.util.Scanner;

public class InsertionAndDeletion {


    public static void main(String[] args) {

        // Declaring an array which capacity is 15

//        int length = 15;
        int a[] = new int[15];

        Scanner input = new Scanner(System.in);
        System.out.println("Input the Size of your Array: ");
        int size = input.nextInt();

        System.out.println("Input the array elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Array Before Insertion");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+", ");
        }

        // Insertion
        System.out.println();
        System.out.println("Input the array element to be Inserted: ");
        int x = input.nextInt();

        System.out.println("Input the array's position where you want to insert: ");
        int pos = input.nextInt();
        for (int i = size; i > pos ; i--) {
            a[i]=a[i-1];
        }
        a[pos]=x;
        ++size;


        System.out.println("Array After Insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+", ");
        }

        // Deletion
        System.out.println();
        System.out.println("Input the position for deletion: ");
        pos = input.nextInt();

        // Shifting the elements
        for (int i = pos; i <size ; i++) {
            a[i]=a[i+1];
        }
        --size;

        // Array After Deletion:
        System.out.println("After Deletion :");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+", ");
        }



    }

}
