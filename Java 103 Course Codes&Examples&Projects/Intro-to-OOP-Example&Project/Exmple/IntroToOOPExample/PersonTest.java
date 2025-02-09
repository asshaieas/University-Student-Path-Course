package IntroToOOPExample;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        int age;
        while (true){
            System.out.print("Enter your age: ");
            if (input.hasNextInt()) {
                age = input.nextInt();
                if (age >= 0) {
                    break; //means valid age, exit loop
                } else {
                    System.out.println("Age must be non-negative.");
                }
            }else{
                System.out.println("Invalid input, please enter a valid number.");
                input.next(); // to clear the input
            }
        }
        input.nextLine(); // Consume the newline left by nextInt()
        System.out.print("Enter your country: ");
        String country = input.nextLine();
        System.out.print("Enter your city: ");
        String city = input.nextLine();
        String gender;
        while (true){
            System.out.print("Enter your gender 'Male' or 'Female': ");
            gender = input.nextLine();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                break; // break, meaning the input is valid, so exit the loop
            }else{
                System.out.println("Invalid input, please enter 'Male' or 'Female'.");
            }
        }
        Person person = new Person(name, age, gender, country, city);
        System.out.println(person.toString());
        input.close();

    }
}
