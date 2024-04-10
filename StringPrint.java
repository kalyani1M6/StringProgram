import java.util.Scanner;
class StringPrint{
	public static void main(String[] args){
		
		String in = "Kalyani";

		System.out.println(in.charAt(0));
		System.out.println(in.charAt(1));
		System.out.println(in.charAt(2));
		System.out.println(in.charAt(3));
		System.out.println(in.charAt(4));
		System.out.println(in.charAt(5));
		System.out.println(in.charAt(6));
		

		//using scanner 
		Scanner src = new Scanner(System.in);

		System.out.println("Enter your input");

		String input =src.nextLine();
		System.out.println(input.charAt(0));
		System.out.println(input.charAt(1));
		System.out.println(input.charAt(2));
		




	}
}