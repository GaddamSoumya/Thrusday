package basicprogram;

import java.util.Scanner;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		float time,rate,principleamount,simpleinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time:");
	    time=sc.nextFloat();
	    System.out.println("Enter rate:");
	    rate=sc.nextFloat();
	    System.out.println("Enter principleamount:");
	    principleamount=sc.nextFloat();
	    simpleinterest=(time*rate*principleamount)/100;
	    System.out.println("simpleinterest:" +simpleinterest);
		}
	}
		