public class Policy { //begin class
   
   //fields!
   
   //user's insurance info
   private int policyNum;
   private String providerName;
   
   private static int policiesMade = 0;


   //constructors!
   
   //no-arg constructor
   public Policy() {
      policyNum = 0;
      providerName = "";
   }
   //constructor that accepts arguments
   public Policy(int policyNum, String providerName) {
      this.policyNum = policyNum;
      this.providerName = providerName;
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
   
   //toString method for output
   public String toString() {
      return String.format("Policy Number: " + policyNum + 
      "\nProvider Name: " + providerName);
   }
   
} //end class