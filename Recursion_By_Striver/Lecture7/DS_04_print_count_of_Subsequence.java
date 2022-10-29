package Recursion_By_Striver.Lecture7;

public class DS_04_print_count_of_Subsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(printCount2(arr,0,0,9));
    }

    static int printCount(int[] arr, int i , int s, int sum){

        if (i == arr.length){
            if (s == sum){
                return 1;
            }else return 0;
        }
        s+=arr[i];
        int l = printCount(arr,i+1,s,sum);
        s-=arr[i];
        int r = printCount(arr,i+1,s,sum);

        return l + r;
    }
    static int printCount2(int[] arr, int i , int s, int sum){

        if (i == arr.length){
            if (s == sum){
                return 1;
            }else return 0;
        }
        s+=arr[i];
        int l = printCount2(arr,i+1,s,sum);
        s-=arr[i];


        return l +printCount2(arr,i+1,s,sum) ;
    }
}
