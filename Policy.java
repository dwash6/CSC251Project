public class Policy { //begin class
   
   //fields!
   
   //user's insurance info
   private int policyNum;
   private String providerName;
   //user's personal info
   private String firstName;
   private String lastName; 
   private int age;
   private String smokeStatus;
   private double height;
   private double weight;
   
   //constructors!
   
   //no-arg constructor
   public Policy() {
      policyNum = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokeStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   //constructor that accepts arguments
   public Policy(int num, String pname, String fname, String lname, int a, String s, double h, double w) {
      num = policyNum;
      pname = providerName;
      fname = firstName;
      lname = lastName;
      a = age;
      s = smokeStatus;
      h = height;
      w = weight;
   }
   
   //accesser & mutator methods!
   
   //setters
   public void setPolicyNum(int num) {
      num = policyNum;
   }
   
   public void setProviderName(String pname) {
      pname = providerName;
   }
   
   public void setFirstName(String fname) {
      fname = firstName;
   }
   
   public void setLastName(String lname) {
      lname = lastName;
   }
   
   public void setAge(int a) {
      a = age;
   }
   
   public void setSmokeStatus(String s){
      s = smokeStatus;
   }
   
   public void setHeight(double h) {
      h = height;
   }
   
   public void setWeight(double w) {
      w = weight;
   }
   
   //getters
   public int getPolicyNumber() {
      return policyNum;
   }
   
   public String getProviderName() {
      return providerName;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public int getAge() {
      return age;
   }
   
   public String getSmokeStatus() {
      return smokeStatus;
   }
   
   public double getHeight() {
      return height;
   }
   
   public double getWeight() {
      return weight;
   }
   
   /* getBMI() method
      @return - calculates and returns BMI of the policyholder (user)
   **/
   public double getBMI() {
      return (weight * 703)/(height * height);
   }
   
   /* getPolicyPrice() method
      @return - calculates and returns the price of the insurance policy
   **/
   public double getPolicyPrice() {
      final int BASE_FEE = 600;
      double price = 0.0;
      
      if(age > 50) { //if user is over 50, a fee of $75 will be added to price
            price = price + 75;
      }
      
      if(smokeStatus.equalsIgnoreCase("smoker")) { //if user is a smoker, a fee of $100 will be added to price
         price = price + 100;
      }
      
      if(getBMI() > 35) { //if user has a BMI over 35, a calculated fee will be added to price
         price = ((getBMI() - 35) * 20) + price;
      }
      
      return price;
   }
} //end class