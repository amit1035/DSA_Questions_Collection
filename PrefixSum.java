import java.util.*;
class Array{
  public static void prefixSum(int arr[]){
    for(int i=1; i<arr.length;i++){
      arr[i] = arr[i-1]+arr[i];
    }
  }
  public static void main(String[] args){
    int arr[] = {10, 20, 10, 5, 15};
    prefixSum(arr);
    for(int nums : arr){
    System.out.print("Prefix Sum is "+ nums);
    }
  }
}

/*Time complexity : 0(n) */
    
