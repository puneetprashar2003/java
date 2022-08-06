import java.io.*;
import java.util.Scanner;
public class if_statment
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int salary=input.nextInt();
int bonus =0;
if(salary>2000)
bonus=10000;
else
bonus=20000;
System.out.println(bonus);
}}

