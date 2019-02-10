package passignment1;
import java.util.*;

public class ArrayAndListUtilities {

	
	
	public static int findMax(int[] numbers)
	{
		int smallest = numbers[0];
        int largest = numbers[0];
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return largest;
	}
	
	public static int findMax(ArrayList<Integer>numbers)
	{
		int smallest = numbers.get(0);
        int largest = numbers.get(0);
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return largest;
	}
	
	public static String bucketSort(int[] numbers) 
	{
		int largestN = findMax(numbers);
		int[] bucket = new int[largestN + 1];
		for(int i = 0; i < numbers.length; i++)
		{
			bucket[numbers[i]]++;
		}
		int i = 0;
		for(int b = 0; b < bucket.length; b++)
		{
			if(bucket[b] > 0)
			{
				for(int count = 0; count < bucket[b]; count++)
				{
					numbers[i] = b;
					i++;
				}
			}
		}
		return Arrays.toString(numbers);
	}
	
	public static int findMin(int[] numbers)
	{
		int smallest = numbers[0];
        int largest = numbers[0];
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return smallest;
	}
	
	public static int findMin(ArrayList<Integer>numbers) 
	{
		int smallest = numbers.get(0);
        int largest = numbers.get(0);
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return smallest;
	}
	
	public static String findIt(int[] numbers, int wanted)
	{
		int count = 0;
		for(int num : numbers)
		{
			if(wanted == num)
			{
				return ("Found at index, " + count);
			}
			count++;
		}
		return "We couldn't find that number";
	}	
	
	
	
	public static String findIt(ArrayList<Integer>numbers, int wanted)
	{
		int count = 0;
		for(int num : numbers)
		{
			if(wanted == num)
			{
				return ("Found at index, " + count);
			}
			count++;
		}
		return "We couldn't find that number";
	}
	
	public static int[] bubbleV1(int[] numbers)
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			for(int j = 0; j <numbers.length - 1; j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}
	
	public static String[] bubbleS(String[] numbers)
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			for(int j = 0; j <numbers.length - 1; j++)
			{
				if(numbers[j] == numbers[j+1])
				{
					String temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}
	
	public static int[] bubbleV2(int[] numbers)
	{
		int var = 1;
		for(int i = 0; i < numbers.length - 1; i++)
		{
			for(int j = 0; j <numbers.length - var; j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
			var ++;
		}
		return numbers;
	}
	
	public static void bubbleV3(int[] numbers)
	{
		boolean sorted = false;
		while(!sorted)
		{
			sorted = true;
			for(int i = 0; i < numbers.length -1; i++)
			{
				if(numbers[i] > numbers[i+1])
				{
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	public static int[] selectionSort(int[] numbers)
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			int smallestPos = i;
			for(int j = i; j < numbers.length - 1; j++)
			{
				if (numbers[j+1] < numbers[smallestPos])
				{
					smallestPos = j + 1;
				}
			}
			if(smallestPos != i)
			{
				int temp = numbers[smallestPos]; 
	            numbers[smallestPos] = numbers[i];
	            numbers[i] = temp;
			}
		}
		return numbers;
	}
	
	    public static int[] insertionSort(int[] input){
	        for (int i = 1; i < input.length; i++) 
	        {
	            for(int j = i ; j > 0 ; j--)
	            {
	                if(input[j] < input[j-1])
	                {
	                    int temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
	    
	    public static String binarySearch(int[] numbers, int wanted) {
	    	bubbleV1(numbers);
	    	int left = numbers[0];
	    	int right = numbers[numbers.length - 1];
	    	int middle = (left + right) / 2;
	    	String result = "Wasn't found";
	    	while(left <= right)
	    	{
	    		middle = (left + right) / 2;
	    			if(numbers[middle] == wanted)
	    			{
	    				return "Found the wanted number at index: " + middle;
	    			}
	    			else {
	    				if(wanted < numbers[middle])
	    				{
	    					right = middle - 1;
	    				}
	    				if(wanted > numbers[middle])
	    				{
	    					left = middle + 1;
	    				}	
	    			}
	    	}
	    	return result;
	    }
	    public static String binarySearch2(String[] library, String wanted) {
	    	bubbleS(library);
	    	int left = 0;
	    	int right = library.length - 1;
	    	int middle = (left + right) / 2;
	    	String result = "Wasn't found";
	    	while(left <= right)
	    	{
	    		middle = (left + right) / 2;
	    			if(library[middle].compareTo(wanted) == 0)
	    			{
	    				return "Found the wanted name at index: " + middle;
	    			}
	    			else {
	    				if(wanted.compareTo(library[middle]) < 0)
	    				{
	    					right = middle - 1;
	    				}
	    				if(wanted.compareTo(library[middle]) > 0)
	    				{
	    					left = middle + 1;
	    				}	
	    			}
	    	}
	    	return result;
	    }
	}

