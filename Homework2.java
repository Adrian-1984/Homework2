import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {	
	System.out.println("What is your age:");
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    int discount = 0;
	if(age>=65) {
	discount = 10;
	System.out.println("Your discount is " +discount + "%" );
	}
	else if (age<18) {
	discount = 25;
	System.out.println("Your discount is " +discount + "%" );
	}
	else if (age>18 && age<65) {
	discount = 5;
	System.out.println("Your discount is " +discount + "%" );
	}
}
}