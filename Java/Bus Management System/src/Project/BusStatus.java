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

public class BusStatus extends JFrame implements ActionListener{
    
    
    JButton ac = new JButton("AC");
    JButton non = new JButton("NON-AC");
    
    public BusStatus(){
        
        this.setTitle("BTMS - Bus Status");
        this.setBounds(500, 100, 400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\SwinGUI\\SwinGUI\\src\\swingui\\Bus.png"));
        
        addActionEvent();
        
        
        Font f =new Font("Nirmala UI", Font.PLAIN, 15);
               
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
        
        JPanel select = new JPanel();
        select.setLayout(null);
        
        select.setSize(800, 650);
        select.setBackground(new Color(0,0,0,80));
        select.setBounds(450, 160, 400, 400);
   
       
        JLabel writeLabel = new JLabel("Bus Status?");
        writeLabel.setForeground(Color.WHITE);
        writeLabel.setFont(new Font("Nirmala UI",Font.BOLD,20));
        writeLabel.setBounds(150, 120, 350, 45);
        select.add(writeLabel);
 

        ac.setBounds(70, 220, 120, 55);
        ac.setFocusPainted(false);
        ac.setForeground(Color.BLACK);
        ac.setBackground(Color.GREEN);
        select.add(ac);
        
        non.setBounds(220, 220, 120, 55);
        non.setFocusPainted(false);
        non.setForeground(Color.BLACK);
        non.setBackground(Color.GREEN);
        select.add(non);
        
        
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
        
        background.add(select);
        background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        
    }
    
 @Override
    public void actionPerformed(ActionEvent e)
    {
	 
        
    }

    private void addActionEvent()
    {
        
    }
    
    public static void main(String[] args)
    {
        BusStatus s = new BusStatus();
        s.setVisible(true);
    }
}



