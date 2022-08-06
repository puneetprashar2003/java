import java.io.*;
import java.util.Scanner;
public class Fibonacci
{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
int number_of_terms=input.nextInt();//number-OF_TERMS>2
int a=0;
int b=1;
int c=0;
System.out.println(a);
System.out.println(b);
while(number_of_terms>2)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
number_of_terms--;
}
}
}


