package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter gender: ");
        String gender = scan.next(); //FemaleEnter
        System.out.println("Your gender is: "+gender);

        System.out.println("Enter age: ");
        int age = scan.nextInt(); //28Enter
        System.out.println("Your age is: "+age);

        scan.nextLine(); //before nextInt()

        System.out.println("Enter full name: ");
        String fullName = scan.nextLine();
        System.out.println("Your full name is: "+fullName);

        System.out.println("Enter zipcode: ");
        int zipcode = scan.nextInt();
        System.out.println("Your zipcode is: "+zipcode);

        scan.nextLine(); //before nextInt()

        System.out.println("Enter country name: ");
        String country = scan.nextLine();
        System.out.println("Your country name is: "+country);

        System.out.println("Enter salary: ");
        double salary = scan.nextDouble();
        System.out.println("Your salary is: "+salary);

        scan.nextLine(); // before nextDouble()

        System.out.println("Enter company name: ");
        String company = scan.nextLine();
        System.out.println("Your company name is: "+company);

        System.out.println("Enter address: ");
        String address = scan.nextLine();
        System.out.println("Your address is: "+address);

        scan.close();



    }

}

/*
1. ask gender (next())
2. ask age (nextInt())
3. ask full name (nextLine())
4. ask zipcode (nextInt())
5. ask country name (nextLine())
6. ask salary (nextDouble())
7. ask company name (nextLine())
8. ask address (nextLine())
 */