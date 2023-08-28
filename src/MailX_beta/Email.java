package MailX_beta;

import java.util.Scanner;

public class Email {
    public String divide;
    private final String  firstName;
    private final String lastName;
    private String password;
    private final String department;
    private final String email;
    private int mailBoxCapacity = 500;
    private final int defaultPasswordlength = 16;
    private String alternateEmail;
    private final String companySuffix = "xcorp.com";

    //  Constructor to receive the first name and last name

    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);


        // Combine elements to generate email

//        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        email = department.equals("") ? firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix : firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; // if department is none remove "."
//        System.out.println("Your email is: " + email);

        // Call a method that return a random password
        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your password is: " + this.password);

    }

    //  Ask  for the department

    private String setDepartment() {
        System.out.print("New Worker "+ firstName+" "+ lastName+" DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        return switch (depChoice) {
            case 1 -> "sales";
            case 2 -> "dev";
            case 3 -> "acct";
            default -> "";
        };
    }


    //  Generate a random password
    private String randomPassword(int lenght) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        char[] password = new   char[lenght];
        for (int i=0; i<lenght; i++) {
            int rndm =  (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rndm);
        }
        return new String(password);
    }

    //  Set the mailbox capacity
    public void SetMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //  change the password
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailBoxCapacity (){return mailBoxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword (){return  password;}
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMAPNY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
    public static String divide(){
        return "---------------------------------";
    }
 }
