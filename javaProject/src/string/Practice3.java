     //Practice string function

package string;

public class Practice3 {

	public static void main(String[] args) {
		
	   String name = "chirag";
	   String name2 = new String("jain");
	   String name3 = "chirag is a good boy";
	   String name4="chirag";
	   String name5 = new String("chirag");
	   
	   
	 //  System.out.println(name);
	   
	   System.out.println(name.charAt(2));				//i
	   System.out.println(name.length());				//6
	   System.out.println(name3.contains("hira"));		//true
	   System.out.println(name3.substring(12));			//good boy
	   System.out.println(name3.substring(12,16));		//good
	   System.out.println(name.isEmpty()); 				//false
	   System.out.println(name.equals(name2));			//false
	   System.out.println(name.equals(name4));			//true
	   System.out.println(name.equals(name5));			//true
	   System.out.println(name==name5);					//false
	   //concept of string pool area and heap memory
	}

}
