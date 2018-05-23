import java.util.HashSet;
import java.util.Iterator;

public class HS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a hash set to sotre string
       
		   HashSet<String>  hs = new HashSet<String>();
		   
		   hs.add("India");
		   hs.add("srilanka");
		   hs.add("Bangladesh");
		   hs.add("Indonesia");
		   
		   System.out.println("Hash set"+ hs);
		   
		   // add iterator to hs
		   
		//   Iterator it = hs.iterator();
		   
		   Iterator it = hs.iterator();
	   
		   
		   // display all element using iterator
		   System.out.println("display all the elements using iterator");
		   
		   
		   while(it.hasNext())
		   {
			   String s = (String)it.next();
			   System.out.println(s);
			   
		   }
		   
		   

		   
		   
		   
		   
		   
		   
		   
	}

}
