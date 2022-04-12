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
   public Policy(int policyNum, String providerName, String firstName, String lastName, int age, String smokeStatus, double height, double weight) {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokeStatus = smokeStatus;
      this.height = height;
      this.weight = weight;
   }
   
   //accesser & mutator methods!
   
   //setters
   /* setPolicyNum(num) method
      @param - policy number
   **/
   public void setPolicyNum(int num) {
      num = policyNum;
   }
   /* setProviderName(pname) method
      @param - provider name
   **/
   public void setProviderName(String pname) {
      pname = providerName;
   }
   /* setFirstName(fname) method
      @param - first name
   **/
   public void setFirstName(String fname) {
      fname = firstName;
   }
   /* setLastName(lname) method
      @param - last name
   **/
   public void setLastName(String lname) {
      lname = lastName;
   }
   /* setAge(a) method
      @param - age
   **/
   public void setAge(int a) {
      a = age;
   }
   /* setSmokeStatus(s) method
      @param - smoke status
   **/
   public void setSmokeStatus(String s){
      s = smokeStatus;
   }
   /* setHeight(h) method
      @param - height
   **/
   public void setHeight(double h) {
      h = height;
   }
   /* setWeight(w) method
      @param - weight
   **/
   public void setWeight(double w) {
      w = weight;
   }
   
   //getters
   /* getPolicyNumber() method
      @return - policy number
   **/
   public int getPolicyNumber() {
      return policyNum;
   }
   /* getProviderName() method
      @return - provider name
   **/
   public String getProviderName() {
      return providerName;
   }
   /* getFirstName() method
      @return - first name
   **/
   public String getFirstName() {
      return firstName;
   }
   /* getLastName() method
      @return - last name
   **/
   public String getLastName() {
      return lastName;
   }
   /* getAge() method
      @return - age
   **/
   public int getAge() {
      return age;
   }
   /* getSmokeStatus() method
      @return - smoke status
   **/
   public String getSmokeStatus() {
      return smokeStatus;
   }
   /* getHeight() method
      @return - height
   **/
   public double getHeight() {
      return height;
   }
   /* getWeight() method
      @return - weight
   **/
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
      
      return BASE_FEE + price;
   }
} //end class