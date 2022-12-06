package com.java.basics;

public class MaximumAmongThreeFloats<T> 
{
	T num1,num2,num3;

	public MaximumAmongThreeFloats(T num1,T num2,T num3)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	/*
	 * Comparision of three Variables
	 */
	public <T extends Comparable<T>> T maxAmong3Number(T num1, T num2, T num3)
	{
		T max = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0 )
			max = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			max = num2;
		else
			max = num3;
		return max;
	}
	public <T> void printMax(T num1, T num2, T num3, T max) 
	{
		System.out.println(max);
	}
	public static void main(String[] args) 
	{ 
		MaximumAmongThreeFloats obj = new MaximumAmongThreeFloats(78.99f,32.5f,56.98f);
		System.out.println("The Maximum Among 3 Float : "+obj.maxAmong3Number(78.99f,32.5f,56.98f));                 

	}

}
