import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class
/*
List acts as an interface and Array list is an implementation of the list. List interface consists of methods.
*/
import java.util.Collections;
import java.util.Random;

public class Practice{
    public static void main(String args[]){
        System.out.println("Start of Practice.");

        //make new ArrayList of random ints, print and sort it 
        ArrayList<Integer> arrayList = Sorts.generateArrayList(11);
        Sorts.printArrayList(arrayList);
        //selection sort
        ArrayList<Integer> arrayList_selectionSorted = Sorts.selectionSort(arrayList);
        Sorts.printArrayList(arrayList_selectionSorted);
        //bubble sort
        ArrayList<Integer> arrayList_bubbleSorted = Sorts.bubbleSort(arrayList);
        Sorts.printArrayList(arrayList_bubbleSorted);

    }


}