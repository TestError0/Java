package Array;

public class Array {

	public static void main(String[] args) {
		
		/*int []marks;
		marks = new int[10];
		*/
		
		int [] marks = new int[10];
		
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		//System.out.println(marks[4]);
		
		int sum = marks[0] + marks[1];
		System.out.println(sum);
		
		int sum1 = marks[3] + marks[4];
		System.out.println(sum1);
		int len = marks.length;
		System.out.println("Array size = " +len);
		
	}

}
