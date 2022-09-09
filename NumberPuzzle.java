import java.util.Arrays;
// import java.util.*;
import java.util.Scanner;

public class NumberPuzzle {
    public static int numberPuzzle(int n,int[] arr){
        Arrays.sort(arr);
        int result=0;
        
        for(int i=1;i<=n;i++){
            result+=Math.abs(arr[i]-arr[i-1]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the length:-");
            int n=sc.nextInt();
            System.out.println("enter the elements in array:-");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(numberPuzzle(n,arr));
        }
    }
}
