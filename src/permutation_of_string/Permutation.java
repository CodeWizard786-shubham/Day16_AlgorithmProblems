package permutation_of_string;
import  java.util.Iterator;
class Permutation {
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    private String word;
    private int first;
    private int last;
   Permutation(String word,int f, int l) {
       this.word = word;
       this.first=f;
       this.last=l;
   }
    static void permuteRecursive(String word,int f,int l) {
        if (f == l) {
            System.out.println(word);
        } else {
            for (int i = f; i <= l; i++) {
                word = swap(word, f, i);
                permuteRecursive(word, f + 1, l);
                word = swap(word, f, i);
            }
        }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

   public void printPermutation(){
       System.out.println("Possible permutations using recursive function are: ");
       permuteRecursive(word,first,last);
    }

    }
