package saturdayndsunday;

import java.util.Scanner;

public class Employe {

	String name;
	double salary;

	public Employe(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void calculateBonous(String name, double salary) {
		this.salary = salary;
		this.name = name;
	}

	public double CalculateBonous() {
		return this.salary * 0.05;
	}

	public double ExperienceBonous(double experience) {
		if (experience >= 10)
			return salary * 0.20;
		if (experience >= 5)
			return salary * 0.10;
		if (experience >= 1)
			return salary * 0.05;
		return 0;
	}

	public void DisplayDetails() {
		double roleBonous = CalculateBonous();
		double experience;
		System.out.println("Entre the emplye experience");
		Scanner sc = new Scanner(System.in);
		experience = sc.nextDouble();
		double ExperienceBonous = ExperienceBonous(experience);
		System.out.println("Name: " + name + "Experience: " + experience + " years");
		System.out.println("Base Salary: ₹" + salary);
		System.out.println("Role Bonus: ₹" + roleBonous);
		System.out.println("Exp Bonus: ₹" + ExperienceBonous);
		System.out.println("Total Pay: ₹" + (salary + roleBonous + ExperienceBonous));
		System.out.println("-------");
	}

}

class Manager extends Employe {
	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double CalculateBonous() {
		return salary * 0.10;
	}
}

class Developer extends Manager {
	public Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double CalculateBonous() {
		return salary * 0.07;
	}
}
