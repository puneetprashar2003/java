import java.io.*;
import java.util.Scanner;
public class Armstrong
{
public static void main(String args[])
{
// all 3 digit armstrong numbers
for(int i=1;i<=999;i++)
{
 int a =i;
 int last_digit;
 int count=3;
 int sum=0;
 while(count>0)
 {last_digit=a%10;
 sum=sum+last_digit*last_digit*last_digit;
 count--;
 }
 if(sum==i)
 System.out.println(sum);
 }
 }
 }
