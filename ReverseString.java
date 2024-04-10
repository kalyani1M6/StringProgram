import java.util.Scanner;
class ReverseString{
	
	public static void main(String[] args){
		/*using scanner 

    Scanner src = new Scanner(System.in);

    System.out.println("Enter your string ");

    String s = src.nextLine();

    System.out.println(s.length());

    for(int i=s.length()-1;i>=0;i--)
    {
      System.out.print(s.charAt(i));
    }*/


    String input = "NOone";
    System.out.println(input.length());

    for(int i=4; i>=0; i--)
    {

    	System.out.print(input.charAt(i));
    }

	}
}