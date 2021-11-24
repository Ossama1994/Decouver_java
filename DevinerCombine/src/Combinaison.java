import java.util.ArrayList;
import java.util.Scanner;

public class Combinaison {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		//Variables declarations
		
		int i ; 
		int j ;
		
		//ArrayList 1
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		//Add items to the arr1 
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		//Display arr1
		//System.out.println("array1 items are " + arr1);
		
       for(i = 0 ; i<arr1.size();i++) {
	    	
	    	//display arr1
	    	System.out.println(arr1.get(i));
	    }
		
		//ArrayList 2
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		//Use Scanner	
		Scanner scanner = new Scanner(System.in);
		 
		//inputs
		for(i=0 ; i < 4 ; i++)
		{
			int num1 = scanner.nextInt();
			arr2.add(num1);
			
		}
		

		//Display arr2 
		
		System.out.println("array2 items are "+ arr2);
		
        for(i=0 ; i < arr1.size() ; i++)
        {
        	
        		if(arr1.get(i) == arr2.get(i))
        		{
        			System.out.println("#");
        			
        		} else if (arr1.contains(arr2.get(i)))
        			
        		{
        			System.out.println("O");
        		}
        		
        }   
	   
	}

}
