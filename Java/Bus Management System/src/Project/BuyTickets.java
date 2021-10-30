/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Project.Options;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 *
 * @author 
 */
public class BuyTickets extends JFrame implements ActionListener
{
    Container container = getContentPane();
    JButton back = new JButton("Back to menu");
    JButton dhakaToRajshahi = new JButton("Dhaka to Rajshahi");
    JButton dhakaToShylet = new JButton("Dhaka to Shylet");
    JButton dhakaToKhulna = new JButton("Dhaka to Khulna");
    JButton dhakaToRangpur = new JButton("Dhaka to Rangpur");
    JButton dhakaToChattogram = new JButton("Dhaka to Chattogram");
//    JButton dhakaToBarishal = new JButton("Dhaka to Barishal");
    
    public BuyTickets()
    {
        this.setTitle("BTMS - Buy tickets");
        this.setBounds(500, 100, 612, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D://Java//background bus.jpg"));
        
        Initialize();
        addActionEvent();
    }
    
    public void Initialize()
    {
        container.setLayout(null);
        
        Font font = new Font("Nirmala UI", Font.PLAIN, 16);
        
        //back
        back.setBounds(0, 0, 150, 50);
        back.setForeground(Color.black);
        back.setFont(font);
        back.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(back);
        
        //dhakaToRajshahi
        dhakaToRajshahi.setBounds(200, 0, 200, 50);
        dhakaToRajshahi.setForeground(Color.black);
        dhakaToRajshahi.setFont(font);
        dhakaToRajshahi.setHorizontalAlignment(SwingConstants.EAST);
        container.add(dhakaToRajshahi);
        
        //dhakaToShylet
        dhakaToShylet.setBounds(200, 50, 200, 50);
        dhakaToShylet.setForeground(Color.black);
        dhakaToShylet.setFont(font);
        dhakaToShylet.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(dhakaToShylet);
        
        //dhakaToKhulna
        dhakaToKhulna.setBounds(200, 100, 200, 50);
        dhakaToKhulna.setForeground(Color.black);
        dhakaToKhulna.setFont(font);
        dhakaToKhulna.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(dhakaToKhulna);
        
        //dhakaToRangpur
        dhakaToRangpur.setBounds(200, 150, 200, 50);
        dhakaToRangpur.setForeground(Color.black);
        dhakaToRangpur.setFont(font);
        dhakaToRangpur.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(dhakaToRangpur);
        
        //dhakaToChattogram
        dhakaToChattogram.setBounds(200, 200, 200, 50);
        dhakaToChattogram.setForeground(Color.black);
        dhakaToChattogram.setFont(font);
        dhakaToChattogram.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(dhakaToChattogram);
        
        //dhakaToBarishal
//        dhakaToBarishal.setBounds(200, 250, 200, 50);
//        dhakaToBarishal.setForeground(Color.black);
//        dhakaToBarishal.setFont(font);
//        dhakaToBarishal.setHorizontalAlignment(SwingConstants.CENTER);
//        container.add(dhakaToBarishal);
    }

    private void addActionEvent()
    {
        back.addActionListener(this);
        dhakaToRajshahi.addActionListener(this);
        dhakaToChattogram.addActionListener(this);
        dhakaToKhulna.addActionListener(this);
        dhakaToRangpur.addActionListener(this);
        dhakaToShylet.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == back)
        {
            this.setVisible(false);
            Options o = new Options();
            o.setVisible(true);
        }
        if(event.getSource() == dhakaToRajshahi)
        {
            this.setVisible(false);
            
            ToRajshahi d = new ToRajshahi();
            d.setVisible(true);
        }
        if(event.getSource() == dhakaToShylet)
        {
            this.setVisible(false);
            
            ToShylet d = new ToShylet();
            d.setVisible(true);
        }
        if(event.getSource() == dhakaToKhulna)
        {
            this.setVisible(false);
            
            ToKhulna d = new ToKhulna();
            d.setVisible(true);
        }
        if(event.getSource() == dhakaToChattogram)
        {
            this.setVisible(false);
            
            ToChattogram c = new ToChattogram();
            c.setVisible(true);
        }
        if(event.getSource() == dhakaToRangpur)
        {
            this.setVisible(false);
            
            ToRangpur r = new ToRangpur();
            r.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        BuyTickets b = new BuyTickets();
        b.setVisible(true);
    }
}
