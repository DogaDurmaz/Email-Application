package emailapp;

import java.util.Scanner;

public class Email {
    // encapsulation-> make it private
   private String firstName;
    private String LastName;
   private String password;
   private String email ;
   private String deparment;
   private int MailBoxCapacity=500;
   private int PasswordLength=10;
   private String alternateEmail;
   private String companySuffix="company.com";
   // constructor to recieve first and last name
public Email(String firstName, String LastName ){
this.firstName=firstName;
this.LastName=LastName;
// System.out.println("Email created "+ this.firstName+" "+ this.LastName);
// call a method asking for a depertment and return the department
this.deparment=setdeparment();
// System.out.println("Department: " +this.deparment);
// Call a method that returns a random password
this.password =randomPassword(PasswordLength);
System.out.println("Your password is:" + this.password);

// Combine elements to generate email
 email=firstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+ deparment + "" +companySuffix;
// System.out.println("Your email is " +email);
}
// ask for department
    private String setdeparment(){
        System.out.print(" New Worker: "+ firstName+" Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department");
          Scanner scan = new Scanner(System.in);
        int depChoice= scan.nextInt();
          if(depChoice==1) {
            return "Sales";
          }
          else if(depChoice==2){
            return "MarketingDepartment";
          }
          else if (depChoice==3){
            return "ComputerEngineering";
          }
          else {
            return  "";
          }
    }
    // Generate random password
     private String randomPassword(int length) {
        String passwordSet="ABCDEFGHIJKLMNQPORSTJYLZ1234567890%&^#!";
        char [] password = new char[length];
        for(int i =0 ; i< length ; i++) {
         int rand= (int)  (Math.random() * passwordSet.length());
         password[i]=passwordSet.charAt(rand);
        //  System.out.print(rand);
        //  System.out.print(passwordSet.charAt(rand));
        }
        return new String (password);
 }  
   // set the mailbox capacity
public void setMailBoxCapacity(int capacity) {
this.MailBoxCapacity = capacity;
}

   // set the alternate email
public void setalternateEmail (String alternateEmail) {
this.alternateEmail=alternateEmail;
}
   // change the password
   public void changePassword(String password) {
    this.password=password;
   }
   public int getMailBoxCapacity(){
    return MailBoxCapacity;
   }
   public  String getalternateEmail (){
     return alternateEmail;
   }
   public String getPassword(){
    return password ;
   }
public String showInfo() {
    return "DISPLAY NAME: "+ firstName + " "+ LastName + "\nCOMPANY EMAİL:" + email+
    "\nMAILBOX CAPACİTY: " + MailBoxCapacity+"mb" ;
}
}
