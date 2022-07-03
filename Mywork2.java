import java.util.*;
class Mywork2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks - ");
		int mark = input.nextInt();
		if (mark >= 75) System.out.println("A");	
		else if (mark >= 50) System.out.println("B");	
		else System.out.println("C");
	}
}
