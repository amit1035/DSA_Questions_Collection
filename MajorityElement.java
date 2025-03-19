/*  Find the Majority Element in Array 
    using Moore’s Voting Algorith
    Time Complexity = 0(n)
    Space Complexity = 0(1)
    
*/

class MajorityElement{
  public static int majority(int arr[]){
    int count = 0;
    int majority = arr[0];

    for(int i = 0; i<arr.length; i++){
      if(count==0){
        count++;
        majority = arr[i];
      }
      else if(majority == arr[i]){
        count++;
      }
      else{
        count--;
      }
    }
    return majority;
  }
    public static void main(String[] args){
      int arr [] = {2,3,3,3,4};
      System.out.print("The Majority Element is " +majority(arr));
    }
}
      
