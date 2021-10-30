/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ConfirmPurchase extends JFrame{

    
    ConfirmPurchase(){
        //font
        Font f =new Font("Nirmala UI", Font.BOLD, 30);
               
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));      
        heading.setBounds(0,0,900,100);
        JLabel name = new JLabel();
        name.setForeground(Color.YELLOW);
        name.setBounds(200,50,400,50);
        name.setFont(f);
        heading.add(name);
        this.setTitle("BTMS - Purchase");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D\\Java\\Bus.png"));
        

        JPanel purchase = new JPanel();
        purchase.setLayout(null);
        
        purchase.setSize(800, 650);
        purchase.setBackground(new Color(0,0,0,80));
        purchase.setBounds(450, 160, 400, 400);
                
        purchase.setLayout(null);
        Font font = new Font("NIrmala UI", Font.PLAIN, 15);
       
        JLabel writeLabel = new JLabel("Confirm Purchase?");
        writeLabel.setForeground(Color.WHITE);
        writeLabel.setFont(new Font("Nirmala UI",Font.BOLD,20));
        writeLabel.setBounds(120, 120, 350, 45);
        purchase.add(writeLabel);
 
        
        JButton positive = new JButton("YES");
        positive.setBounds(70, 220, 120, 55);
        positive.setFocusPainted(false);
        positive.setFont(font);
        positive.setForeground(Color.white);
        positive.setBackground(Color.GREEN);
        purchase.add(positive);
        
        JButton negative = new JButton("NO");
        negative.setBounds(220, 220, 120, 55);
        negative.setFocusPainted(false);
        negative.setFont(font);
        negative.setForeground(Color.white);
        negative.setBackground(Color.RED);
        purchase.add(negative);
        
        
        //frame
        setSize(900,700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //background
        ImageIcon background_image = new ImageIcon("D:\\Java\\bus.jpg");
        
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,600, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_image, JLabel.CENTER);
        
        background.add(purchase);
        background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ConfirmPurchase c = new ConfirmPurchase();
    }
}
