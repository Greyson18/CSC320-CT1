import java.util.Scanner;

public class Directory {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstName;
		String lastName;
		String address;
		String city;
		String zipcode;
		
		System.out.println("What is the person's first name?");
		firstName = scnr.nextLine();
		System.out.println("What is the person's last name?");
		lastName = scnr.nextLine();
		System.out.println("What is the street address where they live?");
		address = scnr.nextLine();
		System.out.println("What city does the person live in?");
		city = scnr.nextLine();
		System.out.println("What is the zipcode of the area they live in?");
		zipcode = scnr.nextLine();
		
		System.out.println("Name and address information.");
		System.out.println("The individuals name is " + firstName +  " " + lastName + " and they live at " + address + " in " + city + " " + zipcode + ".");
	
	}

}
