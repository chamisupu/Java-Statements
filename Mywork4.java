import java.util.*;
class Mywork4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int mark = input.nextInt();
		String result;
		result = (mark > 50) ? "Pass" : "Fail";
		System.out.println(result);
	}
}
