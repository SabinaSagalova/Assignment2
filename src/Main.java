import BankSystem.Person;
import BankSystem.Student;
import BankSystem.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void printData(Iterable<Person> people) {
        for(Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge" );
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        String position;
        double gpa;
        double salary;

        boolean exit = false;
        System.out.println("Choose the option and write it:");
        System.out.println("add student ");
        System.out.println("add employee ");
        System.out.println("print data ");
        System.out.println("end the program ");
        while (!exit) {
            String answer = scanner.nextLine();
            switch (answer) {
                case "add student" :
                    System.out.print("enter name: ");
                    name = scanner.nextLine();
                    System.out.print("enter surname: ");
                    surname = scanner.nextLine();
                    System.out.print("enter gpa: ");
                    gpa = scanner.nextDouble();

                    people.add(new Student(name, surname, gpa));
                    System.out.println();
                    break;
                case "add employee" :
                    System.out.print("enter name: ");
                    name = scanner.nextLine();
                    System.out.print("enter surname: ");
                    surname = scanner.nextLine();
                    System.out.print("enter position: ");
                    position = scanner.nextLine();
                    System.out.print("enter salary: ");
                    salary = scanner.nextDouble();

                    people.add(new Employee(name, surname, position, salary));
                    System.out.println();
                    break;
                case "print data" :
                    Collections.sort(people);
                    printData(people);
                    System.out.println();
                    break;
                case "end the program" :
                    exit = true;
                    break;
            }
        }
    }
}
