package pkgSMS;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

/**
 * @author tendai simbanegavi
 */
public class GUI 
{
    JFrame frameLogin = new JFrame("studentManagerLogin");
    JFrame frameRegister = new JFrame("studentManagerRegister");
    JFrame frameApplication = new JFrame("studentManagerApplication");
    Account newAccount = new Account();
    
    //
    public void setHomeGUI()
    {
        JFrame frameHome = new JFrame("studentManagerHome");
        JPanel panelHome = new JPanel();
        
        frameHome.setSize(900, 600);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelHome.setLayout(null);
        frameHome.add(panelHome);
        
        //
        JButton btnLoginHome = new JButton("LOGIN");
        btnLoginHome.setBounds(400, 400, 124, 40);
        btnLoginHome.addActionListener(new AbstractAction("goToLogin")
        {
            public void actionPerformed(ActionEvent gtl)
            {
                System.out.println("login button clicked");
                setLoginGUI(frameHome, frameRegister);
            }
        });
        
        JButton btnRegisterHome = new JButton("REGISTER");
        btnRegisterHome.setBounds(400, 450, 124, 40);
        btnRegisterHome.addActionListener(new AbstractAction("goToRegister")
        {
            public void actionPerformed(ActionEvent gtr)
            {
                System.out.println("register button clicked");
                setRegisterGUI(frameHome, frameLogin);
            }
        });
        
        panelHome.add(btnLoginHome);
        panelHome.add(btnRegisterHome);
        
        frameHome.setVisible(true);
        frameLogin.setVisible(false);
        frameRegister.setVisible(false);
    }
    
    //
    public void setLoginGUI(JFrame frameHome, JFrame frameRegister)
    {
        JPanel panelLogin = new JPanel();
        
        frameLogin.setSize(900, 600);
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelLogin.setLayout(null);
        
        frameLogin.add(panelLogin);
        frameLogin.setVisible(true);
        
        JTextField txfEmailAddress = new JTextField();
        txfEmailAddress.setBounds(150, 100, 300, 30);
        txfEmailAddress.setText("");
        panelLogin.add(txfEmailAddress);
        
        JTextField txfPassword = new JTextField();
        txfPassword.setBounds(150, 150, 300, 30);
        txfPassword.setText("");
        panelLogin.add(txfPassword);
        
        JLabel lblEmailAddress = new JLabel("email address");
        lblEmailAddress.setBounds(50, 100, 100, 30);
        panelLogin.add(lblEmailAddress);
        
        JLabel lblPassword = new JLabel("password");
        lblPassword.setBounds(50, 150, 100, 30);
        panelLogin.add(lblPassword);
        
        JButton btnLogin = new JButton("log in");
        btnLogin.setBounds(150, 200, 100, 30);
        btnLogin.addActionListener(new AbstractAction("logIn")
        {
            
            public void actionPerformed(ActionEvent gth)
            {
                
                Login login  = new Login(newAccount);
                login.setEmailInput(txfEmailAddress.getText());
                login.setPasswordInput(txfPassword.getText());
                login.attemptLogin();
                
                if (login.getIsValid() == true) 
                {
                    studentManagerApplication(frameLogin);
                }
                else
                {
                    JOptionPane.showMessageDialog(frameLogin, "email or password incorrect!");
                    txfEmailAddress.setText("");
                    txfPassword.setText("");
                }
            }
        });
        panelLogin.add(btnLogin);
        
        JButton btnBack = new JButton("back");
        btnBack.setBounds(700, 500, 100, 30);
        btnBack.addActionListener(new AbstractAction("goBack")
        {
            public void actionPerformed(ActionEvent back)
            {
                System.out.println("back button clicked");
                setHomeGUI();
            }
        });
        panelLogin.add(btnBack);
        
        
        
        
        
        frameHome.setVisible(false);
    }
    
    //
    public void setRegisterGUI(JFrame frameHome, JFrame frameLogin)
    {
        JPanel panelRegister = new JPanel();
        
        frameRegister.setSize(900, 600);
        frameRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelRegister.setLayout(null);
        frameRegister.add(panelRegister);
        frameRegister.setVisible(true);
        
        JTextField txfEmailAddress = new JTextField();
        txfEmailAddress.setBounds(150, 100, 300, 30);
        txfEmailAddress.setText("");
        panelRegister.add(txfEmailAddress);
        
        JTextField txfPassword = new JTextField();
        txfPassword.setBounds(150, 150, 300, 30);
        txfPassword.setText("");
        panelRegister.add(txfPassword);
        
        JLabel lblEmailAddress = new JLabel("email address");
        lblEmailAddress.setBounds(50, 100, 100, 30);
        panelRegister.add(lblEmailAddress);
        
        JLabel lblPassword = new JLabel("password");
        lblPassword.setBounds(50, 150, 100, 30);
        panelRegister.add(lblPassword);
        
        JButton btnCreate = new JButton("CREATE");
        btnCreate.setBounds(150, 200, 100, 30);
        btnCreate.addActionListener(new AbstractAction("create account")
        {
            
            public void actionPerformed(ActionEvent create)
            {
                newAccount.setEmailAddress(txfEmailAddress.getText());
                newAccount.setPassword(txfPassword.getText());
                JOptionPane.showMessageDialog(frameLogin, "account successfully created!");
                System.out.println("new account email address -> " + newAccount.getEmailAddress());
                System.out.println("new account password -> " + newAccount.getPassword());
            }
        });
        panelRegister.add(btnCreate);
        
        JButton btnBack = new JButton("back");
        btnBack.setBounds(700, 500, 100, 30);
        btnBack.addActionListener(new AbstractAction("goBack")
        {
            public void actionPerformed(ActionEvent back)
            {
                System.out.println("back button clicked");
                setHomeGUI();
            }
        });
        panelRegister.add(btnBack);
                
        frameHome.setVisible(false);
    }
    
    //
    public void studentManagerApplication(JFrame frameLogin)
    {
        JPanel panelApplication = new JPanel();
        
        frameApplication.setSize(900, 600);
        frameApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelApplication.setLayout(null);
        
        frameApplication.add(panelApplication);
        frameApplication.setVisible(true);
        
        frameLogin.setVisible(false);
        
        JButton btnLogout = new JButton("log out");
        btnLogout.setBounds(700, 500, 100, 30);
        btnLogout.addActionListener(new AbstractAction("log out")
        {
            public void actionPerformed(ActionEvent back)
            {
                System.out.println("log out button clicked");
                setHomeGUI();
            }
        });
        panelApplication.add(btnLogout);
    }
}

