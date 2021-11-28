package DS_Bubble_Sorting;

import java.util.Arrays;

public class Bubble_Sorting {
    public void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1] )
                {
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1] = temp;
                }
            }
        } 
    }
//    private void swap(int[] array, int index1,int index2){
//        var temp = array[index1];
//        array[index1] = array[index2];
//        array[index2] = temp;
//    }

    public static void main(String[] args) {
        int[] numbers = {1,5,7,9,6,8};
        Bubble_Sorting sorting = new Bubble_Sorting();
        sorting.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

