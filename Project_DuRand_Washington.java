import java.util.*;

public class Project_DuRand_Washington { //begin class
   public static void main(String[] args) { //begin main method
      
      Scanner keyboard = new Scanner(System.in); //declare Scanner object for user input
      
      //declare variables from Policy object to hold user input
      int pNumber;
      String pName;
      
      String fName;
      String lName;
      int age;
      String smoke;
      double height;
      double weight;
      
      //print instructions and collect user input
      System.out.print("Please enter the Policy Number: ");
      pNumber = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter Provider Name: ");
      pName = keyboard.nextLine();
      
      System.out.print("Please enter Policyholder's First Name: ");
      fName = keyboard.nextLine();
      System.out.print("Please enter Policyholder's Last Name: ");
      lName = keyboard.nextLine();
      
      System.out.print("Please enter Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter Policyholder's Smoking Status (smoker/non-smoker): ");
      smoke = keyboard.nextLine();
      
      System.out.print("Please enter Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      System.out.print("Please enter Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //build Policy object using constructor with arguments
      Policy p = new Policy(pNumber, pName, fName, lName, age, smoke, height, weight);
      
      //display output using accessor methods
       System.out.println("\nPolicy Number: " + p.getPolicyNumber());
       System.out.println("Provider Name: " + p.getProviderName());
       System.out.println("Policyholder's First Name: " + p.getFirstName());
       System.out.println("Policyholder's Last Name: " + p.getLastName());
       System.out.println("Policyholder's Age: " + p.getAge());
       System.out.println("Policyholder's Smoking Status: " + p.getSmokeStatus());
       System.out.println("Policyholder's Height: " + p.getHeight() + " inches");
       System.out.println("Policyholder's Weight: " + p.getWeight() + " pounds");
       System.out.printf("Policyholder's BMI: %.2f", p.getBMI());
       System.out.printf("\nPolicy Price: $%,.2f", p.getPolicyPrice());
   
   } //end main method
} //end class