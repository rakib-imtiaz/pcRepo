/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
 
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class SignInPage extends JFrame implements ActionListener {
    
    JButton loginButton = new JButton("Login");
    JButton registrationButton = new JButton("Sign Up");
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JCheckBox showPassword = new JCheckBox();
    
    public SignInPage(){
        
        this.setTitle("BTMS - Sign in");
        this.setBounds(500, 100, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java\\icon bus image.png"));
                
        Font font =new Font("Nirmala UI", Font.BOLD, 30);
               
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));      
        heading.setBounds(0,0,900,100);
        JLabel name = new JLabel("Login portal");
        name.setForeground(Color.black);
        name.setBounds(200,50,400,50);
        name.setFont(font);
        heading.add(name);
       
        
        JPanel container = new JPanel();
        container.setLayout(null);        
        container.setSize(800, 650);
        container.setBackground(new Color(0,0,0,80));
        container.setBounds(250, 160, 400, 420);
                
        
        JLabel user = new JLabel("Phone number:");
        user.setForeground(Color.YELLOW);
        user.setFont(new Font("Nirmala UI",Font.BOLD,18));
        user.setBounds(50, 42, 300, 45);
        container.add(user);
        
        JLabel pass = new JLabel("Password:"); 
        pass.setForeground(Color.YELLOW);
        pass.setFont(new Font("Nirmala UI",Font.BOLD,18));
        pass.setBounds(50, 120, 350, 45);
        container.add(pass);
        
        showPassword.setBounds(355, 175, 20, 20);
        showPassword.setBackground(Color.white);
        showPassword.setToolTipText("Show password");
        container.add(showPassword);
        
        username.setToolTipText("Enter phone number");
        username.setBounds(50, 80, 300, 40);
        container.add(username);
        
        password.setToolTipText("Enter password");
        password.setBounds(50, 160, 300, 40);
        container.add(password);
        
        JLabel noAccount = new JLabel("Don't have an account?");
        noAccount.setForeground(Color.WHITE);
        noAccount.setFont(new Font("Nirmala UI",Font.BOLD,20));
        noAccount.setBounds(95, 300, 350, 45);
        container.add(noAccount);
        
        loginButton.setBounds(125, 240, 150, 30);
        loginButton.setFont(new Font("Nirmala UI",Font.BOLD,20));
        loginButton.setBackground(Color.LIGHT_GRAY);
        container.add(loginButton);
        
        registrationButton.setBounds(125, 345, 150, 30);
        registrationButton.setBackground(new Color(90, 252, 3));
        registrationButton.setFont(new Font("Nirmala UI",Font.BOLD,20));
        container.add(registrationButton);
        
        //frame
        setSize(900,700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //background
        ImageIcon background_image = new ImageIcon("D:\\Java\\background bus.jpg");
        
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,600, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_image, JLabel.CENTER);
        
        background.add(container);
        background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        
//        File file = new File("D://Java//LoginSession.txt");
//        if(file.exists())
//        {
//            try
//            {
//                BufferedReader loggedIn = new BufferedReader(new FileReader("D://Java//LoginSession.txt"));
//                BufferedReader br = new BufferedReader(new FileReader("D://Java//database.txt"));
//                String line, loggedInUser;
//                loggedInUser = loggedIn.readLine();
//                while ((line = br.readLine()) != null)
//                {
//                    if (line.split(" ")[2].equalsIgnoreCase(loggedInUser));
//                    {
//                        this.setVisible(false);
//                        
//                        Options o = new Options();
//                        o.setVisible(true);
//                    }
//                }
//            } catch (Exception e)
//            {
//                System.out.println("Can\'t verify login sessiion.");
//            }
//        }
//        
        addActionEvent();
    }
   

  @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loginButton)
        {
            String phoneNumber = username.getText();
            String passText = password.getText();
            
            try
            {
                String path = "database.txt";
                BufferedReader br = new BufferedReader(new FileReader(path));
                
                boolean isLoginSuccess = false;
                int u = 0;
                String line, userNumber = null, userPassword = null;
                
                while ((line = br.readLine()) != null)
                {
                    userNumber = line.split(" ")[2];
                    userPassword = line.split(" ")[3];
                    
                    if(userNumber.equalsIgnoreCase(phoneNumber) && userPassword.equalsIgnoreCase(passText))
                    {
                        isLoginSuccess = true;
                        
                        
                        FileWriter writer = new FileWriter("D://Java//SigninSession.txt", false);
                        writer.write(username.getText());
                        writer.close();
                        
                        this.setVisible(false);
                        Options m = new Options();
                        m.setVisible(true);
                        break;
                    }
                    else if (userNumber.equalsIgnoreCase(phoneNumber))
                    {
                        u++;
                    }
                }
                if(!isLoginSuccess)
                {
                    if(u > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Invalid password", "Log in failed", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Invalid number", "Sign in failed", JOptionPane.ERROR_MESSAGE);
                    }
                }
                br.close();
            } 
            catch (Exception ex)
            {
                System.out.println("Error 404! File not found.");
            }
        }
        
        if (e.getSource() == showPassword)
        {
            if (showPassword.isSelected())
            {
                password.setEchoChar((char) 0);
            }
            else
            {
                password.setEchoChar((char) 8226);
            }
        }
        
        if (e.getSource() == registrationButton)
        {
            this.setVisible(false);
            
            SignUp s = new SignUp();
            s.setVisible(true);
        }
    }

    private void addActionEvent()
    {
        loginButton.addActionListener(this);
        registrationButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
    
    public static void main(String[] args)
    {
        SignInPage s = new SignInPage();
        s.setVisible(true);
    }
}
