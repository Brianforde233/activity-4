/**.
* Creating two classes which contain a main method 
* Activity 4
*@author Brian Forde Comp1210-001
@version 9/15/20
*/
public class UserInfo { 
   // instant variables 
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
  // constructor
 /**
 * @param firstNameIn inputs a first name.
 * @param lastNameIn  inputs a last name. 
 */
   public UserInfo(String firstNameIn, String lastNameIn) { 
    
    
    
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified"; 
      age = 0;
      status = OFFLINE;
    
   }

    // methods
    /**.
    *@return string representation of object 
    *
    */
    
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: "; 
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
   *@param locationIn takes input from the users location
   */
   public void setLocation(String locationIn) { 
      location = locationIn;
   }
   /**
   * @param ageIn input for users agge
   * @return variable age and isSet
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   
   }
   /**
   *@return returns age
   */

   public int getAge() {
      return age;
   
   }
   /**
   * @return the location
   */

   public String getLocation() {
      return location;
   
   }
   /**
   */

   public void logOff() {
      status = OFFLINE;
   }
   
   /**
   */

   public void logOn() {
      status = ONLINE;
   
   }
}
