//class Sorts is a child class (sub class) of Practice
//Practice is base class

import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class
import java.util.Collections;
import java.util.Random;

public class Sorts extends Practice{

    /*
    Time Complexity: O(n2). Because there are two nested loops.
    Auxiliary Space: O(1).  Never takes more than O(n) swaps and can be useful when memory write is costly
    */
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arrayList){
        System.out.println("beginning Selection Sort");
        int arrSize = arrayList.size(); 
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < arrSize - 1; i++){
            // Find the minimum element in unsorted array 
            int minIndex = i; 
            for (int j = i + 1; j < arrSize; j++)
                if (arrayList.get(j) < arrayList.get(minIndex)) 
                    minIndex = j; //get index of min element 
            // Swap the found minimum element with the first element 
            int temp = arrayList.get(minIndex);         //temp = arr[minIndex]
            arrayList.set(minIndex, arrayList.get(i));  //set arr[minindex] to arr[i]
            arrayList.set(i, temp);                     //set arr[i] to temp
        }
        return arrayList;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList){
        System.out.println("beginning bubble Sort");
        int i, j, temp;
        int n = arrayList.size();
        boolean swapped;

        for (i = 0; i < n-1; i++){
            swapped = false;

            for (j = 0; j < n-i-1; j++){
                if(arrayList.get(j) > arrayList.get(j + 1)){
                    //swap
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                    swapped = true;
                }
            }
            //IF no two elements were swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        }
        return arrayList;
    }

    public static void staticEx(){
        System.out.println("Example of static function being called without object made.");
    }

    public static void printArrayList(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) System.out.print(arrayList.get(i) + ", ");
        System.out.println("");
    }

    public static ArrayList<Integer> generateArrayList(int size){
        ArrayList<Integer> newArrayList = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++){
            // Obtain a number between [0 - 99].
            int n = rand.nextInt(100);
            //add one so range is [1 - 100]
            newArrayList.add(n++);
        }
        //shuffle 
        Collections.shuffle(newArrayList);
        
        return newArrayList;
    }



}