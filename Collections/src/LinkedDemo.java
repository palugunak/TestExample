import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls = new LinkedList<String>();
		
		System.out.println("LinkedList operations");
		System.out.println("1 add an element");
		System.out.println("2 remove an element");
		System.out.println("3 change an element");
		System.out.println("4  exit an element");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String element;
		boolean n;		
		int choice=0;
		int position;
		
	//	int i =   Integer.parseInt(br.readLine());
		
		//menu
		while(choice<4)
			{
			    System.out.println("enter your choice");
			    choice =  Integer.parseInt(br.readLine());
			    
			    //perfrom a choice 
			    
			    switch(choice)
			    { 
			    case 1:  System.out.println("enter the element");
			             element = br.readLine();
			             
			             
			             
			  
			    }
			    
			
			}
		
		
		
		
		

	}

}
