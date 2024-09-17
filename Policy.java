 /**
      Class is intended to keep track of insurance policies and it's many attributes. 
      Creates instances of Policy. 
      
 */

class Policy{

   //instance fields
   private int policy_number;
   private String provider_name;
   private String holder_fname;
   private String holder_lname;
   private int holder_age;
   private String smoking_status;
   private double holder_height;
   private double holder_weight;
   
   
   //no argument constructor
   public Policy()
   {
   
   }
   
   //default constructor
   public Policy(int policyNumber, String providerName, String holder_fName, String holder_lName, 
      int holderAge, String smokingStatus, double holderHeight, double holderWeight)
      {
         policy_number = policyNumber;
         provider_name = providerName;
         holder_fname = holder_fName;
         holder_lname = holder_lName;
         holder_age = holderAge;
         smoking_status = smokingStatus;
         holder_height = holderHeight;
         holder_weight = holderWeight; 
      }
      
      
   //setter methods**
   public void setPolicyNumber(int x)
   {
      policy_number = x;
   }
   
   public void setProviderName(String x)
   {
      provider_name = x;
   }
   
   public void setPolicyHolderFirstName(String x)
   {
      holder_fname = x;
   }
   
   public void setPolicyHolderLastName(String x)
   {
      holder_lname = x;
   }
   
   public void setPolicyHolderAge(int x)
   {
      holder_age = x;
   }
   
   public void setSmokingStatus(String x)
   {
      smoking_status = x;
   }
   
   public void setPolicyHolderHeight(double x)
   {
      holder_height = x;
   }
   
   public void setPolicyHolderWeight(double x)
   {
      holder_weight = x;
   }
   
   
   //getter methods**
   
   public int getPolicyNumber()
   {
      return policy_number;
   }
   
   public String getProviderName()
   {
      return provider_name;
   }
   
   public String getPolicyHolderFirstName()
   {
      return holder_fname;
   }
   
   public String getPolicyHolderLastName()
   {
      return holder_lname;
   }  
   
   public int getPolicyHolderAge()
   {
      return holder_age;
   }
   
   public String getSmokingStatus()
   {
      return smoking_status;
   }
   
   public double getPolicyHolderHeight()
   {
      return holder_height;
   }
   
   public double getPolicyHolderWeight()
   {
      return holder_weight;
   }
   
   //calculateBMI uses the instance's weight and height to calculate BMI.
   
   public double calculateBMI()
   {
      return Math.round(((holder_weight * 703) / (holder_height * holder_height)) * 100) / 100.0;
   }
   
   //insurancePolicyPrice uses the BMI calculated with calculateBMI 
   
   public double calculateInsurancePolicyPrice(){
      double totalPrice = 600.0;
      double BMI = calculateBMI();
      
      if(holder_age > 50)
      {
         totalPrice += 75.0;
      }
      
      if(smoking_status.equalsIgnoreCase("smoker"))
      {
         totalPrice += 100.0;
      }
      
      if(BMI > 35)
      {
         totalPrice += ((BMI - 35.0) * 20.0);
      }
      
      return totalPrice;
      
   }  
   
}