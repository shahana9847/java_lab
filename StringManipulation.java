package shahana;
import java.util.Scanner;
public class StringManipulation {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string:");
		String str=sc.nextLine();
		System.out.println("Length:"+str.length());
		System.out.println("Uppercase:"+str.toUpperCase());
		System.out.println("Lowercase:"+str.toLowerCase());
		String reversed="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversed+=str.charAt(i);
		}
		System.out.println("Reversedstring:"+reversed);
		System.out.println("enter another string to concatinate:");
		String str2=sc.nextLine();
		System.out.println("Concatenated string:"+str.concat(str2));
		if(str.equals(str2));
		{
			System.out.println("both strings are equal.");
		}
		sc.close();
	}

}
