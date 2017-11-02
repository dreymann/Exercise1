import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello ASE2017 - How are you? :)");
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your name:");
		String username = sc.next();
		HelloUser hu = new HelloUser ();
		hu.greetUser(username);
	}

}
