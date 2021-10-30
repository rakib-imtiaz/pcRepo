/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Project.BuyTickets;

public class Options extends JFrame implements ActionListener{

    JButton buyTickets = new JButton("Buy Tickets");
    JButton deleteAccount = new JButton("Delete Account");
    JButton seatAvailability = new JButton("Seat Availability");
    JButton busStatus = new JButton("Bus Status");
    JButton busRoutes = new JButton("Bus Routes");
    JButton returnTicket = new JButton("Return Ticket");
    JButton signOut = new JButton("Sign Out");
    
    public Options(){
      
        this.setTitle("BTMS - Menu");
        this.setBounds(500, 100, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Java\\icon bus image.png"));
        
        addActionEvent();
        
        Font font =new Font("Nirmala UI", Font.PLAIN, 15);
               
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));      
        heading.setBounds(0,0,900,100);
        JLabel name = new JLabel();
        name.setForeground(Color.YELLOW);
        name.setBounds(200,50,400,50);
        name.setFont(font);
        heading.add(name);
        
        
        JPanel option = new JPanel();
        option.setLayout(null);
        
        option.setSize(800, 650);
        option.setBackground(new Color(0,0,0,80));
        option.setBounds(450, 160, 400, 420);
                
       
        // buyTickets
        buyTickets.setBounds(50, 80, 300, 35);
        buyTickets.setFont(font);
        buyTickets.setFocusPainted(false);
        option.add(buyTickets);
        
        // seatAvailability
//        seatAvailability.setBounds(50, 120, 300, 35);
//        seatAvailability.setFocusPainted(false);
//        seatAvailability.setFont(font);
//        option.add(seatAvailability);
        
        // busStatus
//        busStatus.setBounds(50, 160, 300, 35);
//        busStatus.setFocusPainted(false);
//        busStatus.setFont(font);
//        option.add(busStatus);
        
        // busRoutes
        busRoutes.setBounds(50, 200, 300, 35);
        busRoutes.setFocusPainted(false);
        busRoutes.setFont(font);
        option.add(busRoutes);
        
        signOut.setBounds(50, 340, 300, 35);
        signOut.setFocusPainted(false);
        signOut.setFont(font);
        option.add(signOut);
      
        
        setSize(900,700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //background
        ImageIcon background_image = new ImageIcon("D:\\Java\\background bus.jpg");
        
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,600, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_image, JLabel.CENTER);
        
        background.add(option);
        background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);

    }
    
 @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == deleteAccount)
        {
            this.setVisible(false);
            DeleteAccount d = new DeleteAccount();
            d.setVisible(true);
        }
        if (e.getSource() == buyTickets)
        {
            this.setVisible(false);
            BuyTickets b = new BuyTickets();
            b.setVisible(true);
        }
        if (e.getSource() == signOut)
        {
            this.setVisible(false);
            
            SignInPage l = new SignInPage();
            l.setVisible(true);
        }
//        if (e.getSource() == busStatus)
//        {
//            this.setVisible(false);
//            
//            BusStatus b = new BusStatus();
//            b.setVisible(true);
//        }
        if (e.getSource() == busRoutes)
        {
            this.setVisible(false);
            
            BusRoute b = new BusRoute();
            b.setVisible(true);
        }
    }

    private void addActionEvent()
    {
        buyTickets.addActionListener(this);
        deleteAccount.addActionListener(this);
        seatAvailability.addActionListener(this);
        busStatus.addActionListener(this);
        busRoutes.addActionListener(this);
        returnTicket.addActionListener(this);
        signOut.addActionListener(this);
    }
    
    public static void main(String[] args)
    {
        Options s = new Options();
        s.setVisible(true);
    }
}
