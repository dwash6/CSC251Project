public class Policy { //begin class
   
   //fields!
   
   //user's insurance info
   private int policyNum;
   private String providerName;
   
   private static int policiesMade = 0;
   
   private PolicyHolder pHolder; //demonstrates a Policy that 'has a' PolicyHolder


   //constructors!
   
   //no-arg constructor
   public Policy() {
      policyNum = 0;
      providerName = "";
      PolicyHolder pHolder;
   }
   //constructor that accepts arguments
   public Policy(int policyNum, String providerName, PolicyHolder holder) {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.pHolder = new PolicyHolder(holder);
      policiesMade++;
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
   
   /* getPoliciesMade() method
      @return - number of policies that were made
   **/
   public int getPoliciesMade() {
      return policiesMade;
   }
   
   /* getPolicyHolder() method
      @return - returns deep copy of a PolicyHolder object
   **/
   public PolicyHolder getPolicyHolder() {
      return new PolicyHolder(pHolder);
   }
   
   //toString method for output
   public String toString() {
      return String.format("Policy Number: " + policyNum + 
      "\nProvider Name: " + providerName + pHolder);
   }
   
} //end class