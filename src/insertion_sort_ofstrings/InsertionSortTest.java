package insertion_sort_ofstrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class InsertionSortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string of world: ");
        String sentence=sc.nextLine();
        String[]arr=sentence.split(" ");
        InsertionSort sort=new InsertionSort();
        sort.insertionSort(arr);
        sort.printArray(arr);
    }
}
