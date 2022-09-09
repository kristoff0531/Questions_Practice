import java.util.Arrays;

public class ZerosAndOnes {
    public static void count(int[] arr){
        int n=arr.length;
        int count_o=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count_o++;
            }
        }
        for(int i=0;i<count_o;i++){
            arr[i]=0;
        }
        for(int i=count_o;i<n;i++){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
    // public static void showArray(int[] arr){
    // //     int n=arr.length-1;
    // //    for(int i=0;i<n;i++){
    //     System.out.println(Arrays.toString(arr));
    //    //}
    // }
    public static void main(String[] args) {
        int [] arr={0,1,0,1,0,1,0};
        count(arr);
        //showArray(arr);
    }
}
