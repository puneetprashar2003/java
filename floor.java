 import java.io.*;
 public class floor{
    
    static int  binarySearch(int arr[], int start, int r, int target)
    {//doesnot have target as the last integer
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
        int target = 4;
        int result = binarySearch(arr, 0, end , target);
        int a=result;
        while(a ==-1)
         {  a=  binarySearch(arr,0,end,target--);
         }
         
        
            System.out.println("Element found at index "
                               + a);
    }
}
