// Given an integer array, find the maximum element in the array and print it.

// import java.util.*;
// public class array_test{
//     public static void main (String[]args){
//    Scanner sc = new Scanner (System.in);
//    int n = sc.nextInt();
//    int []arr= new int[n];
//    for(int i = 0;i<arr.length;i++){
//     arr[i]= sc.nextInt();
//    }
//     int max = arr[0];  //assume first elemnet to be zero
//      for(int i=0;i<arr.length;i++){
//         if(arr[i]> max){
//             max=arr[i]; 
//         }
//      }
//      System.out.println(max);
//      }
//     }



import java.util.*;
public class array_test{
    public static void main (String[]args){
   Scanner sc = new Scanner (System.in);
   int n = sc.nextInt();
   int []arr= new int[n];
   for(int i = 0;i<arr.length;i++){
    arr[i]= sc.nextInt();
   }
    int max = arr[0];  //assume first elemnet to be zero
     for(int i=0;i<arr.length;i++){
        if(arr[i]> max){
            max=arr[i]; 
        }
     }
     System.out.println(max);
     }
    }
    