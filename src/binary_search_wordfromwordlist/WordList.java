package binary_search_wordfromwordlist;

public class WordList {
    public void binarySearchWord(String array[],int first,int last,String word) {
        int mid = (first + last) / 2;
        while (first <= last) {
            int result=array[mid].compareTo(word);
            if (result>0){
            first = mid + 1;
        }else if(result==0){
                System.out.println("Element found");
                break;
            }else {
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("Element not found");
        }
    }
}
