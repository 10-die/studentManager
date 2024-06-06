/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgSMS;

/**
 *
 * @author simte
 */
import java.util.Scanner;

public class Account 
{
    // variables
    private String emailAddress = "";
    private String password = "";
    private Scanner sc = new Scanner(System.in);
    
    // default constructor
    public Account()
    {

    }

    //parameterized constructor
    public Account(String emailAddress, String password)
    {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    // capture user input
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    // return user input
    public String getEmailAddress()
    {
        return this.emailAddress;
    }
    public String getPassword()
    {
        return this.password;
    }
}

