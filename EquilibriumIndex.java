import java.util.*;

class Array{
    public static int Equilibrim(int arr[]){
        int rightSum = 0;
        for(int i = 0; i<arr.length;i++){
            rightSum -= arr[i];
        }
        int leftSum = 0;
        for(int i =0; i<arr.length;i++){
            leftSum+= arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum +=arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {-7,1,5,2,-4,3,0};
        System.out.print("Equalibrim Sum is " +Equilibrim(arr));
    }
}

/* Time Complexity: O(n) (Single loop through the array)
Space Complexity: O(1) (Constant space usage) */
