import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Random;

public class ArraysRandom {
    public static void main(String[] args) {
        String S = "abacc";
        canPalindrome(5,S);
    }
    static void canPalindrome(int n, String s) {
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            int ind = s.charAt(i) - 'a';
            arr[ind] = arr[ind] + 1;
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 ){
                count++;
            }
        }
        System.out.println(count);
    }

}
