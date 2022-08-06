 import java.io.*;
 public class Binary_2{
    
    static int  binarySearch(int arr[], int start, int r, int target)
    {
        if (r >= start) {
            int mid = start + (r - start) / 2;
 
         
            if (arr[mid] == target)
                return mid;
 
           
            else if (arr[mid] > target)
                return binarySearch(arr, start, mid - 1, target);
            else
 
            return binarySearch(arr, mid + 1, r, target);
        }
 
        
        return -1;
    }
 
    
    public static void main(String args[])
    {
      
        int arr[] = { 2, 3, 4, 10, 40 };
        int end = arr.length-1;
        int target = 10;
        int result = binarySearch(arr, 0, end , target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}

 


