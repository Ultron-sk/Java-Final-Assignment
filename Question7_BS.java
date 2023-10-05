import java.util.Arrays;

public class Question7_BS {
    public static void main(String[] args) {
        int [] arr = {72,27,3,90,6,82,66,55,43,39,1};
        Arrays.sort(arr);
       int index =  binarySearch(arr,1);
       if(index==-1){
        System.out.println("The Element is not present");
       }else{
        System.out.println("The Element is at Index ::"+index);
       }
    }

    private static int binarySearch(int[] arr,int target) {
          int start = 0;
          int end = arr.length-1;
          while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid +1;
            }
          }

        return -1;
    }
}
