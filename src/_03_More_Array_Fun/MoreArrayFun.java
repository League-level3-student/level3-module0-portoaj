package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] test = {"as", "be", "d", "z", "test"};
		//System.out.println("rip1");
		jumbleArr(test);
		//System.out.println("rip");
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printArr(String [] strings)
	{
		for(String str : strings)
		{
			System.out.println(str);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printArrReverse(String [] strings)
	{
		for(int i = strings.length - 1; i > -1; i-- )
		{
			System.out.println(strings[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printArrButString(String [] strings, String target)
	{
		for(int i = strings.length - 1; i > -1; i-- )
		{
			if(strings[i] != target)
			System.out.println(strings[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void jumbleArr(String [] strings)
	{
		Random rand = new Random();
		int [] indices = new int[strings.length];
		for(int i = 0; i < indices.length; i++)
		{ 
			indices[i] = -1;
		}
		for(int i = 0; i < indices.length; i++)
		{ 
			int value = rand.nextInt(indices.length);
			while(contains(indices, value))
			{
			//	System.out.println(value + " " + i);
				value = rand.nextInt(indices.length);
			}
			indices[i] = value;
		}
		String [] newStrings = new String[strings.length];
		for(int i = 0; i < strings.length; i++)
		{ 
			newStrings[indices[i]] = strings[i];
		}
		for(int i = 0; i < newStrings.length; i++)
		{ 
			System.out.println(newStrings[i]);
		}
	}
	static boolean contains(int [] arr, int value)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == value)
			return true;
		}
		return false;
	}
	
}
