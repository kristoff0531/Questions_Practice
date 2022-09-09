import java.util.Arrays;

public class secondHighest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,6,4,8};
        int answer=surchIt(arr);
        System.out.println(answer);
    }
    static int surchIt(int[] arr){
        Arrays.sort(arr);
        if(arr.length==0){
            return -1;
        }
        for(int i=arr.length;i>=1;){
            return arr[i-2];
        }
        return -1;

    }
    
}
