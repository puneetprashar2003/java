import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Arm
{
public static void main(String args[])
{
// all 3 digit armstrong numbers
for(int i=100;i<=999;i++)
{
 int a =i;
 int last_digit;
 int count=3;
 int sum=0;
 while(count>0)
 {last_digit=a%10;
 sum=sum+(int)Math.pow(last_digit,3);
 a=a/10;
 count--;
 }
 if(sum==i)
 System.out.println(sum);
 }
 }
 }
