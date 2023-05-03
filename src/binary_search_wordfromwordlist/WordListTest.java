package binary_search_wordfromwordlist;

import java.util.Arrays;
import java.util.Scanner;

public class WordListTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a list of words");
        String words=sc.nextLine();
        String []array=words.split(" ");
        int last=array.length-1;
        System.out.println("Enter a word to find: ");
        String word=sc.nextLine();
        WordList list=new WordList();
        list.binarySearchWord(array,0,last,word);

    }
}
