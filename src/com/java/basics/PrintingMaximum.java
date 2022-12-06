package com.java.basics;

public class PrintingMaximum<T>
{
	T num1, num2, num3, num4;
	/*
	 * Adding the 4th Variable
	 */
	public PrintingMaximum(T num1, T num2, T num3, T num4)                                                                

	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public static <T extends Comparable<T>> T maxAmong4Number(T num1, T num2, T num3, T num4) {
		T max = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0 && num1.compareTo(num4) > 0  )
			max = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0 && num2.compareTo(num4) > 0)
			max = num2;
		else if (num3.compareTo(num4) > 0)
			max = num3;
		else
			max = num4;
		return max;
	}
	/*
	 * Adding the Function for Printing Maximum
	 */
	public static <E> void printMax(E num1, E num2, E num3, E num4, E max) 
	{
		System.out.println(max);
	}


	public static void main(String[] args) {                                                                      
		System.out.println("The Maximum Among 4 String : "+maxAmong4Number("which","what","when","where"));
		System.out.println("The Maximum Among 4 Integer : "+maxAmong4Number(40,30,20,10));                 
		System.out.println("The Maximum Among 4 Float : "+maxAmong4Number(99.89f,78.99f,32.5f,56.98f));   
	}
}
