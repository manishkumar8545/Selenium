import java.lang.reflect.Array;
import java.util.ArrayList;

public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mynum=5;
		String Website = "Rahul Shetti";
		char letter = 'r';
		double decimal = 5.9;
		boolean mycard = true;
		
		System.out.println(Website);
		System.out.println(mynum + "is the value of mynum");
		
		//Arrays
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2= {1,2,3,4,5};
		//System.out.println(arr2[2]);
		
		//for loop
		for(int i=0; i<arr.length; i++)
		{
		System.out.println(arr[i]);
		}
		
		String[] name = {"Manish", "Shweta", "Selenium"};
		for(int i=0; i<name.length; i++)
		{
		System.out.println(name[i]);
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Manish");
		a.add("Shweta");
		a.add("M Selenium");
		
		System.out.println(a.get(2));
		
		
	}

}
