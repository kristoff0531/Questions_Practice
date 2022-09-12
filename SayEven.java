public class SayEven {
    public static int say(int arr[]){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
            
        }
        return count;
    }

    static boolean even(int num){
        int numDigit=digits(num);
        //return numDigit%2==0;
        if(numDigit%2==0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr={10,33,4562,5678};
        System.out.println(say(arr));
    }
}
