package ioAssign2no1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import ioAssign2no1.been.*;

public class Assign2no1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(sc.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp.setDob(sc.nextLine());
		System.out.print("Enter department: ");
		emp.setDepartment(sc.nextLine());
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.nextLine());
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("F:\\Wipro_work\\wokspace\\Abstract\\src\\ioAssign2no1\\OutFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("F:\\Wipro_work\\wokspace\\Abstract\\src\\ioAssign2no1\\OutFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		sc.close();
	}
}
/* OUTPUT :
Enter name: Sachin
Enter D.O.B.: 28/06/2000
Enter department: Computer
Enter designation: Devloper
Enter salary: 80000
Name: Sachin
D.O.B.: 28/06/2000
Department: Computer
Designation: Devloper
Salary: 80000.0
*/