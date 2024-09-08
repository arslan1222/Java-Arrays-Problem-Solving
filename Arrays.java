import java.util.*;
public class Arrays{
    /*
    public static void Arrays(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    */
    // Linear Search
    /*
    public static int LinearSearch(int array[], int key){
        for(int i=0; i<array.length; i++){
            if(array[i] == key){
                // System.out.print(i);
                return i;
            } 
        }
        return -1;
    }
    */
    // Find max or min value from the array
    /*
    public static int Largest(int array[]){
        // int max = Integer.MIN_VALUE;   // -infinity & Integer.MAX_VALUE -> +infinity
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    */
   /*
    public static int BinarySearch(int array[], int key){
        int start = 0;
        int end = array.length -1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    */

    /* Reverse Array
        public static void Reverse(int array[]){
            int first = 0; int last = array.length -1;

            while(first < last){
                int temp = array[last];
                array[last] = array[first];
                array[first] = temp;

                first++;
                last--;
            }
        }
        */
        /* Pairs of an array
        public static void Pairs(int array[]){
            int tp = 0;
            for(int i=0; i<array.length; i++){
                int current = array[i];

                for(int j=i+1; j<array.length; j++){
                    System.out.print("(" + current + ", " + array[j] + ")");
                    tp++;
                }
                System.out.println();
            }

            System.out.print("Total Pairs = " + tp);
        }
        */
        /* Print SubArray
        public static void SubArray(int array[]){
            int tp = 0;
            int totSubArr = 0;
            for(int i=0; i<array.length; i++){

                int start = i;
                for(int j=i; j<array.length; j++){
                    int end = j;
                    for(int k=start; k<=end; k++){
                        System.out.print(array[k]+ " ");
                        totSubArr += array[k];  // Home Work Done => Total of sub array
                    }
                    System.out.print("= " + totSubArr);
                    
                    totSubArr = 0;
                    tp++;
                    System.out.println();

                }
                System.out.println();
            }
            System.out.print("Total SubArrays = " + tp);
        }
        */
        /* Sum of Sub Array
        public static void SumOfSubArray(int array[]){

            int CurrSum = 0;
            int maxSum =   Integer.MIN_VALUE; 

            for(int i=0; i<array.length; i++){

                int start = i;
                for(int j=i; j<array.length; j++){
                    int end = j;
                    for(int k=start; k<=end; k++){
                        CurrSum += array[k];
                    }
                    System.out.println(CurrSum);
                    if(maxSum < CurrSum){
                        maxSum = CurrSum;
                    }
                    CurrSum = 0;

                }
            }
            System.out.println(maxSum);
        }
        */
        /* Kadane Algorithm
        public static void Kadanes(int array[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            for(int i=0; i<array.length; i++){ // {-2,3,-5,6,-7};
                cs += array[i];
                if(cs < 0){
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.print(ms);
        }
        */


    public static void main(String args[]){
        /*
        // Simple array
        int marks[] = {95, 96, 97};
        Arrays(marks);
        // Print arrays
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        */
       /*
       // Linear Search
       int array[] = {1,2,3,4,5,6,7,8,9};
       int key = 15;
       System.out.print(LinearSearch(array, key));
       */

        /*
        // Largest or Minimun number in the given array
        int array[] = {15, 7, 4, 9, 13};
        System.out.print(Largest(array));
        */

        /*
         // Binary Search
        int array[] = {3,4,5,6,7,8,9,19,34,23};
        int key = 78;
        System.out.print(BinarySearch(array, key));
        */
        /* Revrse array
        int array[] = {3,4,5,7,8,9};
        Reverse(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        */

        /* Pairs of an array
        int array[] = {2,3,5,6,7,8};
        Pairs(array);
        */

        /* Print SubArray
        int array[] = {2,3,5,6,7};
        SubArray(array);
        */
        /* Sum of Sub Array
        int array[] = {2,3,5,6,7};
        SumOfSubArray(array);
        */
        /* Kadanes Algoriithm
        int array[] = {-2,3,-5,6,-7};
        Kadanes(array);
        */







    }
}