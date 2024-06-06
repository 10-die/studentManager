/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgSMS;

import java.util.Scanner;

/**
 *
 * @author simte
 */
public class Login 
{
    public Account account = new Account();
    public GUI gui = new GUI();
    private Scanner sc = new Scanner(System.in);
    private String emailAddressInput = "";
    private String passwordInput = "";
    private boolean isValid;
    
    //
    public Login()
    {
        
    }
    
    //
    public Login(Account account)
    {
        this.account = account;
    }
    
    
    // 
    public void setEmailInput(String emailAddressInput)
    {
        this.emailAddressInput = emailAddressInput;
        
    }
    public void setPasswordInput(String passwordInput)
    {
        this.passwordInput = passwordInput;
        
    }
    public void setIsValid(boolean trueOrFalse)
    {
        this.isValid = trueOrFalse;
    }
    
    // return user input
    public String getEmailInput()
    {
        return this.emailAddressInput;
    }
    public String getPasswordInput()
    {
        return this.passwordInput;
    }
    public boolean getIsValid()
    {
        return this.isValid;
    }
    
    
    public void attemptLogin()
    {
        if (this.account.getEmailAddress().equals(getEmailInput()) && this.account.getPassword().equals(getPasswordInput())) 
        {
            System.out.println("log in successfull");
            /*System.out.println("correct email address  -> " + this.account.getEmailAddress());
            System.out.println("correct password -> " + this.account.getPassword());
            
            System.out.println("email address entered -> " + this.emailAddressInput);
            System.out.println("password entered -> " + this.passwordInput);*/
            
            
            setIsValid(true);
        }
        else
        {
            System.out.println("log in unsuccessfull");
            /*System.out.println("correct email address  -> " + this.account.getEmailAddress());
            System.out.println("correct password -> " + this.account.getPassword());
            
            System.out.println("email address entered -> " + this.emailAddressInput);
            System.out.println("password entered -> " + this.passwordInput);*/
            
            setIsValid(false);
        }
    }
    
}
