package Project;

import java.util.*;
import javax.swing.*;
import java.awt.*;
        
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
        
class BusRoute extends JFrame implements ActionListener{
    
    Container container = getContentPane();
    //Application Label
    
    JLabel route = new JLabel("Bus Route");
    
    JLabel raj = new JLabel("Dhaka to Rajshahi");
    JLabel syl = new JLabel("Dhaka to Sylhet");
    JLabel khu = new JLabel("Dhaka to Khulna");
    JLabel rang = new JLabel("Dhaka to Rangpur");
    JLabel ctg = new JLabel("Dhaka to Chattogram");
    
    JLabel time = new JLabel ("Journey Time");
    
    JLabel one = new JLabel("7 AM");
    JLabel two = new JLabel("9 AM");
    JLabel three = new JLabel("11 AM");
    JLabel four = new JLabel("1 PM");
    JLabel five = new JLabel("3 PM");
    
    
    JButton backButton = new JButton("Back to menu");
    
    
    BusRoute(){
        
        this.setTitle("Bus Route");
        this.setBounds(500, 100, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java\\Bus.png"));
       
        Initialize();
        addActionEvent();
    }
    public void Initialize(){
        
        container.setLayout(null);
        container.setBackground(Color.LIGHT_GRAY);
         
        route.setFont(new Font("Nirmala UI",Font.BOLD,25));
        route.setBounds(105, 75, 364, 45);        
        container.add(route);
        
        raj.setFont(new Font("Nirmala UI",Font.BOLD,18));
        raj.setBounds(90, 125, 364, 35);
        raj.setForeground(Color.red);
        container.add(raj);
        
        syl.setFont(new Font("Nirmala UI",Font.BOLD,18));
        syl.setBounds(90, 165, 364, 35); 
        syl.setForeground(Color.blue);
        container.add(syl);
        
        khu.setFont(new Font("Nirmala UI",Font.BOLD,18));
        khu.setBounds(90, 205, 364, 35);
        khu.setForeground(Color.red);
        container.add(khu);
        
        rang.setFont(new Font("Nirmala UI",Font.BOLD,18));
        rang.setBounds(90, 245, 364, 35);
        rang.setForeground(Color.blue);
        container.add(rang);
        
        ctg.setFont(new Font("Nirmala UI",Font.BOLD,18));
        ctg.setBounds(90, 285, 364, 35);
        ctg.setForeground(Color.red);
        container.add(ctg);
        
        time.setFont(new Font("Nirmala UI",Font.BOLD,25));
        time.setBounds(340, 75, 364, 45);
        time.setForeground(Color.black);        
        container.add(time);
        
        one.setFont(new Font("Nirmala UI",Font.BOLD,18));
        one.setBounds(380, 125, 364, 35);
        one.setForeground(Color.red);
        container.add(one);
        
        two.setFont(new Font("Nirmala UI",Font.BOLD,18));
        two.setBounds(380, 165, 364, 35);
        two.setForeground(Color.blue);
        container.add(two);
        
        three.setFont(new Font("Nirmala UI",Font.BOLD,18));
        three.setBounds(380, 205, 364, 35);
        three.setForeground(Color.red);
        container.add(three);
        
        four.setFont(new Font("Nirmala UI",Font.BOLD,18));
        four.setBounds(380, 245, 364, 35);
        four.setForeground(Color.blue);
        container.add(four);
        
        five.setFont(new Font("Nirmala UI",Font.BOLD,18));
        five.setBounds(380, 285, 364, 35);
        five.setForeground(Color.red);
        container.add(five);
                
        
        
        backButton.setBounds(05, 05, 130, 45);
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(Color.RED);
        backButton.setFont(new Font("Nirmala UI",Font.PLAIN,16));
        container.add(backButton);
    }

    private void addActionEvent()
    {
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == backButton)
        {
            this.setVisible(false);
            Options o = new Options();
            o.setVisible(true);
        }
    }
    
    public static void main (String [] args){
        
        BusRoute lframe = new BusRoute();
        lframe.setVisible(true);
    }
 }