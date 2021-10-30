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


public class SignUp extends JFrame implements ActionListener {

    JCheckBox showPassword = new JCheckBox();
    JButton signUpButton = new JButton("Sign up");
    JButton loginButton = new JButton("Sign in");
    String path = "database.txt";
    JTextField firstName = new JTextField();
    JTextField lastName = new JTextField();
    JTextField phoneNumber = new JTextField();
    JPasswordField password = new JPasswordField();
//    JPasswordField confirmPassword = new JPasswordField();
    
  public SignUp(){
        
        this.setTitle("BTMS - Sign up");
        this.setBounds(500, 100, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java\\background bus.jpg"));
        
        addActionEvent();
                
        Font font =new Font("Nirmala UI", Font.BOLD, 30);
               
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));      
        heading.setBounds(0,0,900,100);
        JLabel header = new JLabel("Sing up portal");
        header.setForeground(Color.black);
        header.setBounds(200,50,400,50);
        header.setFont(font);
        heading.add(header);
       
        
        JPanel container = new JPanel();
        container.setLayout(null);        
        container.setSize(800, 650);
        container.setBackground(new Color(0,0,0,80));
        container.setBounds(450, 160, 400, 400);
 
        
        
        firstName.setToolTipText("First name");
        firstName.setBounds(50, 50, 300, 35);
        container.add(firstName);
        
        lastName.setToolTipText("Last name");
        lastName.setBounds(50, 100, 300, 35);
        container.add(lastName);
        
        phoneNumber.setToolTipText("Phone number");
        phoneNumber.setBounds(50, 150, 300, 35);
        container.add(phoneNumber);
        
        password.setToolTipText("Enter password");
        password.setBounds(50, 200, 300, 35);
        container.add(password);
        
        showPassword.setBounds(355, 212, 20, 20);
        showPassword.setBackground(Color.white);
//        showPassword.setBackground(new Color(0,0,0,80));
        showPassword.setToolTipText("Show password");
        container.add(showPassword);
        
//        confirmPassword.setToolTipText("Confirm Password");
//        confirmPassword.setBounds(50, 250, 300, 35);
//        container.add(confirmPassword);
        
        signUpButton.setBounds(125, 310, 150, 30);
        signUpButton.setBackground(new Color(90, 252, 3));
        signUpButton.setFont(new Font("Nirmala UI",Font.BOLD,20));
        container.add(signUpButton);
        
        loginButton.setBounds(125, 350, 150, 30);
        loginButton.setBackground(new Color(90, 252, 3));
        loginButton.setFont(new Font("Nirmala UI", Font.BOLD, 20));
        container.add(loginButton);
        
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
        
    
    }

    private void addActionEvent()
    {
        showPassword.addActionListener(this);
        signUpButton.addActionListener(this);
        loginButton.addActionListener(this);
    }
    
    public boolean check(String phoneNumber)
    {
        String line;
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            while ((line = br.readLine()) != null)
            {
                if(phoneNumber.equalsIgnoreCase(line.split(" ")[2]))
                {
                    return true;
                }
            }
        } 
        catch (IOException e)
        {
            System.out.println("Error 404! File not found");
        }
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loginButton)
        {
            this.setVisible(false);
            SignInPage l = new SignInPage();
            l.setVisible(true);
        }
        
        if (e.getSource() == signUpButton)
        {
            try
            {
                if(!check(phoneNumber.getText()))
                {
                    FileWriter writer = new FileWriter(path, true);
                    {
                        writer.write(firstName.getText() + " " + lastName.getText() + " " +
                                phoneNumber.getText() + " " + password.getText() + "\n");
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Successfully registered", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Phone number laready exist", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } 
            catch (Exception ex)
            {
                System.out.println("Unknown error occured");
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
    }
    
    public static void main(String[] args)
    {
        SignUp s = new SignUp();
        s.setVisible(true);
    }
}