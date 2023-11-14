import java.util.Scanner;

	
public class newjava{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a sentence :  ");
		String str=scan.nextLine();
		int len=str.length();
		int i=0;
		System.out.print("The reverse string is : ");
		for(i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));

		}
		System.out.println(" ");


	}

}
