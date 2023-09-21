import java.util.*;
public class PersonDemo {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter Person Name: ");
		String name = s1.next();
		System.out.print("Enter Age: ");
		int age = s1.nextInt();
		System.out.print("Enter Gender: ");
		String gender = s1.next();
		System.out.print("Enter Taxable Income: ");
		int income = s1.nextInt();
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println("Before calculating tax:");
		System.out.println(person);
		
		TaxCalculator cal = new TaxCalculator();
		cal.calculateTax(person);
		System.out.println("After calculating tax:");
		System.out.println(person);
		
		s1.close();
	}
}
