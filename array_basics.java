import java.util.*;
public class array_basics{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,8,9,6};
        for(int i =0;i<=arr.length-1;i++){
         if (arr[i]%2==0){
            System.out.println("even numbers: "+arr[i]);
         }
        }
    }
}



