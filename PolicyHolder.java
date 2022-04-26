public class PolicyHolder { //begin class

   //Aggregate class to Policy Class
   
   //fields
   private String firstName;
   private String lastName; 
   private int age;
   private String smokeStatus;
   private double height;
   private double weight;

   //Constructors
   //No-Arg Constructor
   public PolicyHolder() {
      firstName = "";
      lastName = "";
      age = 0;
      smokeStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   //Constructor w/ args
   public PolicyHolder(String firstName, String lastName, int age, String smokeStatus, double height, double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokeStatus = smokeStatus;
      this.height = height;
      this.weight = weight;
   }
   
   //Copy constructor to avoid security-holes
   public PolicyHolder(PolicyHolder copy) {
      firstName = copy.firstName;
      lastName = copy.lastName;
      age = copy.age;
      smokeStatus = copy.smokeStatus;
      height = copy.height;
      weight = copy.weight;
   }
   
   //setters
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
   
   //calculated methods
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
      final int SENIOR = 50;
      final int SENIOR_FEE = 75;
      final int SMOKER = 100;
      final int BMI_LIMIT = 35;
      double price = 0.0;
      
      if(age > SENIOR) { //if user is over 50, a fee of $75 will be added to price
            price = price + SENIOR_FEE;
      }
      
      if(smokeStatus.equalsIgnoreCase("smoker")) { //if user is a smoker, a fee of $100 will be added to price
         price = price + SMOKER;
      }
      
      if(getBMI() > 35) { //if user has a BMI over 35, a calculated fee will be added to price
         price = ((getBMI() - BMI_LIMIT) * 20) + price;
      }
      
      return BASE_FEE + price;
   }
   
   //toString for output
   public String toString() {
      return String.format("\nPolicyholder's First Name: " + firstName +
             "\nPolicyholder's Last Name: " + lastName +
             "\nPolicyholder's Age: " + age +
             "\nPolicyholder's Smoking Status (Y/N): " + smokeStatus +
             "\nPolicyholder's Height: %,.1f inches\n" +  
             "Policyholder's Weight: %,.1f pounds\n" + 
             "Policyholder's BMI: %,.2f\n" +
             "Policy Price: $%,.2f\n\n", height, weight, getBMI(), getPolicyPrice());
   }
   
   
} //end class