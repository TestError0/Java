package Demo;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		System.out.println(""+a);
		
		long aa = 2342423424L;
		System.out.println(""+aa);
		
		float b = 4;
		System.out.println(""+b);
		
		char letter =  'a';
		
		boolean isAdulte = false;
		
		//Non-Primitive types
		
		String name = "SQA";
		System.out.println(name.length());  //For string length
		
		//Concatenate
		
		String name1 = "SQA";
		String name2 = "Engineer";
		String name3 = name1 + name2;
		System.out.println(name3);
		
		//charAt - index dhore dhore value ver kora 
		String name0 = "SQA";
		System.out.println(name.charAt(0));
		
		//replace
		
		String name7 = "Test";
		String name8 = name7.replace('e', 'E');  //RUn hocche na 
		System.out.println(name8);
		
		//substring
		
		String adda = "Rahim and Karim";
		System.out.println(adda.substring(9,12));

	}

}
