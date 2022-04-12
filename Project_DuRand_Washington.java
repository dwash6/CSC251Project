import java.util.*;
import java.io.*;

public class Project_DuRand_Washington { //begin class
   public static void main(String[] args) throws IOException { //begin main method
      
      File info = new File("PolicyInformation.txt"); //opens PolicyInformation.txt to read it
      Scanner file = new Scanner(info); //uses the text from PolicyInformaiton.txt as input
      
      //declare variables from Policy object to hold information from file
      int pNumber;
      String pName;
      
      String fName;
      String lName;
      int age;
      String smoke;
      double height;
      double weight;
      
      int smokers = 0;
      int non_smokers = 0;
      
      //begin while loop to loop through policy holder's information
      while(file.hasNext()) {
         //begin assigning values to variables using text from file
         pNumber = file.nextInt();
         file.nextLine();
         pName = file.nextLine();
         fName = file.nextLine();
         lName = file.nextLine();
         age = file.nextInt();
         file.nextLine();
         smoke = file.nextLine();
         height = file.nextDouble();
         weight = file.nextDouble();
         if(file.hasNext()) {
            file.nextLine();//this handles the case where we reach the end of the file - makes sure we don't get an exception
         }
         
         file.nextLine();
      
      //build Policy object using constructor with arguments
      Policy p = new Policy(pNumber, pName, fName, lName, age, smoke, height, weight);
      
      //if statement to tally smokers/non-smokers
      if(smoke.equalsIgnoreCase("smoker")) {
         smokers++;
      }
      else if(smoke.equalsIgnoreCase("non-smoker")) {
         non_smokers++;
      }
      
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
       System.out.printf("\nPolicy Price: $%,.2f\n", p.getPolicyPrice());
       
       
     } //end while loop
   //print smokers/non-smokers
   System.out.println("\nThe number of policies with a smoker is: " + smokers);
   System.out.print("The number of policies with a non-smoker is: " + non_smokers + "\n");
   } //end main method
} //end class