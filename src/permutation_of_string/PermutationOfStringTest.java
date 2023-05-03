package permutation_of_string;
import java.util.Scanner;

public class PermutationOfStringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word= sc.next();
        int n =word.length()-1;
        Permutation p =new Permutation(word,0,n);
        p.printPermutation();
    }

}
