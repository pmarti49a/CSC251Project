//using wildcard import statement to import all classes of the java.util package.
import java.util.*;

/**
         This class contains the main method where the user will be asked information 
      regarding insurance policy and it's holder.
*/
class Project_patricio_martinez{

   public static void main(String args[]){
   
      Scanner input = new Scanner(System.in);
      
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = input.nextInt();
      input.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = input.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholders First Name: ");
      firstName = input.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholders Last Name: ");
      lastName = input.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholders Age: ");
      age = input.nextInt();
      input.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policholders Smoking Status (smoker/non-smoker): ");
      smokingStatus = input.nextLine();
      System.out.println();
      
      System.out.print("Please enter the Policyholders Height (in inches): ");
      height = input.nextDouble();
      System.out.println();
      
      System.out.print("Please enter the Policyholders Weight (in pounds): ");
      weight = input.nextDouble();
      System.out.println();
      System.out.println();
      
      //create instance of Policy using constructor
      
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: "+ policy.getProviderName());
      System.out.println("Policyholders First Name: " + policy.getPolicyHolderFirstName());
      System.out.println("Policyholders Last Name: " + policy.getPolicyHolderLastName());
      System.out.println("Policyholders Age: " + policy.getPolicyHolderAge());
      System.out.println("Policyholders Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholders Height: " + policy.getPolicyHolderHeight());
      System.out.println("Policyholders Weight: " + policy.getPolicyHolderWeight());
      System.out.println("Policyholders BMI: " + policy.calculateBMI()); 
      System.out.println("Policy Price: $" + policy.calculateInsurancePolicyPrice());
      
   }
      
}