package insertion_sort_ofstrings;

public class InsertionSort {
    public String[]  insertionSort(String arr[]) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
        static void printArray (String arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

