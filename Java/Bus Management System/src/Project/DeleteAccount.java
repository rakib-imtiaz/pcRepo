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

public class DeleteAccount extends JFrame implements ActionListener{
    
    JButton yes = new JButton("YES");
    JButton no = new JButton("NO");

    public DeleteAccount(){
        
        this.setTitle("BTMS - Delete Account");
        this.setBounds(500, 100, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java\\Bus.png"));
        
        addActionEvent();
        
        Font f =new Font("Nirmala UI", Font.BOLD, 30);

        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));      
        heading.setBounds(0,0,900,100);
        JLabel name = new JLabel();
        name.setForeground(Color.YELLOW);
        name.setBounds(200,50,400,50);
        name.setFont(f);
        heading.add(name);
        

        JPanel delete = new JPanel();
        delete.setLayout(null);
        
        delete.setSize(800, 650);
        delete.setBackground(new Color(0,0,0,80));
        delete.setBounds(450, 160, 400, 400);
                
              
        JLabel confirm = new JLabel("Confirm Delete?");
        confirm.setForeground(Color.WHITE);
        confirm.setFont(new Font("Nirmala UI",Font.BOLD,20));
        confirm.setBounds(125, 120, 350, 45);
        delete.add(confirm);
 
        
        yes.setBounds(70, 220, 120, 55);
        yes.setFocusPainted(false);
        yes.setForeground(Color.white);
        yes.setBackground(Color.red);
        delete.add(yes);
        
        no.setBounds(220, 220, 120, 55);
        no.setFocusPainted(false);
        no.setForeground(Color.white);
        no.setBackground(Color.GREEN);
        delete.add(no);
        
        
        setSize(900,700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //background
        ImageIcon background_image = new ImageIcon("D:\\Java\\bus.jpg");
        
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(900,600, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_image, JLabel.CENTER);
        
        background.add(delete);
        background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        
    }
    
  @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == no)
        {
            this.setVisible(false);
            
            Options o = new Options();
            o.setVisible(true);
        }
        
    }

    private void addActionEvent()
    {
        yes.addActionListener(this);
        no.addActionListener(this);
    }
    
    public static void main(String[] args)
    {
        DeleteAccount s = new DeleteAccount();
        s.setVisible(true);
    }
}
