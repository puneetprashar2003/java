import java.io.*;
import java.util.Scanner;
 public class greater_alphabet{
 
    static char nextGreatestLetter(char[] letters, char target,int start, int end) 
    {    char Target1=target;
        char [] lettrs1=letters;
         int start1=start;
             int end1=end;
     while(start1<= end1)
     {
     int mid =(start1+end1)/2;
     if(lettrs1[mid]>Target1)
         return nextGreatestLetter(lettrs1,Target1,start1,mid-1);
    else if(lettrs1[mid]<Target1)
         return nextGreatestLetter(lettrs1,Target1,mid +1,end1);
        else
            return(lettrs1[mid]);}
     

      return ('!')  ;
    }
    public static void main(String args[])
    {   Scanner input= new Scanner(System.in);
        char letters[]={'c','e','f'};
        int start=0;
        int end=letters.length-1;
        char target='e';
        char output= nextGreatestLetter(letters, ++target,start,end);
        while(output=='!')
            output=nextGreatestLetter( letters, target++,start,end);
        System.out.println(output);
    }
}
