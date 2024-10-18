import java.util.*;
public class SumOfArray{
    public static int SumOfArray(int[] arr){
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int result=SumOfArray(arr);
        System.out.println(result);
    }
}