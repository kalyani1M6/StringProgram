import java.util.Scanner;
class StringPrintN{
	public static void main(String[] args){
// program to print String using Scanner ie from user
Scanner src = new Scanner(System.in);
System.out.println("Enter you String");
String input= src.nextLine();

System.out.println(input.length());

for(int i=0 ; i<= input.length()-1; i++)
{
	System.out.print(input.charAt(i));
}



	}
}