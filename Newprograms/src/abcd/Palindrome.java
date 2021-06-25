package abcd;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		
		
		
		
String reverse="";
Scanner a=new Scanner(System.in);
System.out.println("enter the palendrome value");
	String b=a.nextLine();
	for(int i=b.length()-1;i>0;i--){
reverse=reverse+b.charAt(i);
if(b.equals(reverse)){
	System.out.println("it is palindome");
}
else {
	System.out.println("it is not a palindrome");
}
	}

}
}