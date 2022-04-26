import java.util.*;
import java.io.*;

public class Project_DuRand_Washington { //begin class
   public static void main(String[] args) throws IOException { //begin main method
      
      File info = new File("PolicyInformation.txt"); //opens PolicyInformation.txt to read it
      Scanner file = new Scanner(info); //uses the text from PolicyInformaiton.txt as input
      
      //declare variables from Policy object to hold information from file
      int pNumber = 0;
      String pName = "";
      
      String fName = "";
      String lName = "";
      int age = 0;
      String smoke = "";
      double height = 0.0;
      double weight = 0.0;
      
      int smokers = 0;
      int non_smokers = 0;
      
      ArrayList<Policy> list = new ArrayList<Policy>(); //ArrayList to hold all info
      
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
      
      
      //build PolicyHolder object using constructor with arguments
      PolicyHolder h = new PolicyHolder(fName, lName, age, smoke, height, weight);
      
      //build Policy object using constructor with arguments
      Policy p = new Policy(pNumber, pName, h);
      
      //Add Policy to the ArrayList
      list.add(p);
      
      //if statement to tally smokers/non-smokers
      if(smoke.equalsIgnoreCase("smoker")) {
         smokers++;
      }
      else if(smoke.equalsIgnoreCase("non-smoker")) {
         non_smokers++;
      }
      
       
     } //end while loop
     
     //use for-loop to display info from file
     for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
     }
     
   System.out.println("\nThere were " + list.get(0).getPoliciesMade() + " Policy objects created.\n");
     
   //print smokers/non-smokers
   System.out.println("\nThe number of policies with a smoker is: " + smokers);
   System.out.print("The number of policies with a non-smoker is: " + non_smokers);
   } //end main method
} //end class