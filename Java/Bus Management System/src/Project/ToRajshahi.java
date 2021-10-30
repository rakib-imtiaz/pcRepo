/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;



import Project.Options;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class ToRajshahi extends JFrame implements ActionListener
{
    Container container = getContentPane();
    JButton[] seat = new JButton[48];
    JLabel header = new JLabel("Choose seat");
    JButton back = new JButton("Back");
    JButton purchase = new JButton("Purchase");
    int[] universalCounter = new int[48];
    String[] seatStatus = new String[48];
    
    public ToRajshahi()
    {
        this.setTitle("BTMS - Choose seat(Dhaka to Rajshahi)");
        this.setBounds(300, 80, 870, 850);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D://Java//icon bus image.png"));
        
        Initialize();
        addActionEvent();
    }
    public void Initialize()
    {
        container.setLayout(null);
        
        Font font = new Font("Noto Sans", Font.PLAIN, 15);
        Font headerFont = new Font("Noto Sans", Font.BOLD, 20);
        
        header.setBounds(350, 10, 140, 50);
        header.setFont(headerFont);
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setHorizontalTextPosition(SwingConstants.CENTER);
        container.add(this.header);
        
        back.setToolTipText("Back to options");
        back.setFocusPainted(false);
        back.setFont(font);
        back.setBounds(150, 10, 100, 50);
        container.add(this.back);
        
        purchase.setToolTipText("Purchase the ticket(s)");
        purchase.setFocusPainted(false);
        purchase.setFont(font);
        purchase.setBounds(620, 10, 100, 50);
        container.add(this.purchase);
        
        for (int start = 0; start < 48; start++)
        {
            seat[start] = new JButton("Seat no. " + (start + 1));
            seat[start].setToolTipText("Seat no. " + (start + 1));
            seat[start].setFocusPainted(false);
            seat[start].setBackground(Color.white);
            seat[start].setFont(font);
        }
        int seatSerial = 0;
        for (int outerLoop = 2; outerLoop <= 13 ; outerLoop++)
        {
            for (int innerLoop = 1; innerLoop <= 4; innerLoop++)
            {
                seat[seatSerial].setBounds( 150 * innerLoop, 55 * outerLoop, 120, 40);
                container.add(this.seat[seatSerial]);
                seatSerial++;
            }
        }
        for (int start = 0; start < 48; start++)
        {
            universalCounter[start] = 0;
        }
        File file = new File("D://Java//DhakaToRajshahi.txt");
        // Next programming block is complete. Nothing to do here.
        if(!file.exists())
        {
            try
            {
                file.createNewFile();
                FileWriter writer = new FileWriter("D://Java//DhakaToRajshahi.txt", false);
                for (int start = 0; start < 48; start++)
                {
                    writer.write("notBooked ");
                }
                writer.close();
            } 
            catch (Exception ex)
            {
                System.out.println("Can\'t create seat information file.");
            }
        }
        else
        {
            try
            {
                BufferedReader br = new BufferedReader(new FileReader("D://Java//DhakaToRajshahi.txt"));
                String readLine = br.readLine();
                for(int start = 0; start < seat.length; start++)
                {
                    seatStatus[start] = readLine.split(" ")[start];
                    if (seatStatus[start].equalsIgnoreCase("notBooked"))
                    {
                        seat[start].setBackground(Color.white);
                    }
                    if (seatStatus[start].equalsIgnoreCase("booked"))
                    {
                        seat[start].setBackground(Color.red);
                    }
                    container.add(seat[start]);
                }
            } 
            catch (Exception ex)
            {
                System.out.println("Can\'t read the seat information file.");
            }
        }
    }

    private void addActionEvent()
    {
        for (int start = 0; start < 48; start++)
        {
            seat[start].addActionListener(this);
        }
        back.addActionListener(this);
        purchase.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource() == back)
        {
            this.setVisible(false);
            
            BuyTickets o = new BuyTickets();
            o.setVisible(true);
        }
        for (int start = 0; start < 48; start++)
        {
            if(e.getSource() == seat[start])
            {
                if (seatStatus[start].equalsIgnoreCase("booked"))
                {
                    JOptionPane.showMessageDialog(null, "That seat is already booked", "Not available", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    universalCounter[start]++;
                    if(universalCounter[start] % 2 == 1)
                    {
                        seat[start].setBackground(Color.yellow);
                        seatStatus[start] = "pending";
                    }
                    else
                    {
                        seat[start].setBackground(Color.white);
                        seatStatus[start] = "notBooked";
                    }
                }
                container.add(seat[start]);
            }
        }
        if (e.getSource() == purchase)
        {
            try
            {
                FileWriter writer = new FileWriter("D://Java//DhakaToRajshahi.txt", false);
                for (int start = 0; start < 48; start++)
                {
                    if (seatStatus[start].equalsIgnoreCase("booked") || seatStatus[start].equalsIgnoreCase("pending"))
                    {
                        writer.write("booked ");
                    }
                    else
                    {
                        writer.write("notBooked ");
                    }
                }
                writer.close();
                JOptionPane.showInternalMessageDialog(null, "Ticket purchased successfully", "Successfull", JOptionPane.DEFAULT_OPTION);
                this.setVisible(false);
                ToRajshahi d = new ToRajshahi();
                d.setVisible(true);
            } 
            catch (Exception ex)
            {
                System.out.println("Unable to re-write the database.");
            }
        }
    }
    
    public static void main(String[] args)
    {
        ToRajshahi c = new ToRajshahi();
        c.setVisible(true);
    }

}
