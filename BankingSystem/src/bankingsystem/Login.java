
package bankingsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.lang.String;
public class Login extends JFrame implements ActionListener{
    JLabel username,password,welcome;
    JTextField username_txt;
    JPasswordField password_txt;
    JButton login_btn,signup_btn,clear;
        Login(){      
            
        setTitle("STATE BANK OF INDIA Login");
        
  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgfolder/sbi.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(680, 10, 100, 100);
        add(l21); 
        
        welcome = new JLabel("STATE BANK OF INDIA");
        welcome.setFont(new Font("Osward", Font.BOLD, 40));
        welcome.setBounds(500,150,450,40);
        add(welcome);
        
        username = new JLabel("Account NO:");
        username.setFont(new Font("Raleway", Font.BOLD, 35));
        username.setBounds(415,270,375,40);
        add(username);
        
        username_txt = new JTextField(15);
        username_txt.setBounds(630,270,250,40);
       username_txt.setFont(new Font("Arial", Font.BOLD, 14));
        add(username_txt);
        
       password = new JLabel("Password:");
       password.setFont(new Font("Raleway", Font.BOLD, 35));
       password.setBounds(440,340,375,40);
        add(password);
        
        password_txt = new JPasswordField(15);
        password_txt.setFont(new Font("Arial", Font.BOLD, 14));
       password_txt.setBounds(630,340,250,40);
        add(password_txt);
                
        login_btn = new JButton("SIGN IN");
        login_btn.setBackground(Color.BLUE);
        login_btn.setForeground(Color.WHITE);
        login_btn.setFont(new Font("Arial", Font.BOLD, 14));
        login_btn.setBounds(630,420,100,30);
        login_btn.addActionListener(this);
        
        add(login_btn);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLUE);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(750,420,100,30);
        clear.addActionListener(this);
        add(clear);
        
        signup_btn = new JButton("Don't Have a Account");
        signup_btn.setBackground(Color.BLUE);
        signup_btn.setForeground(Color.WHITE);
        signup_btn.setFont(new Font("Arial", Font.BOLD, 14));
        signup_btn.setBounds(630,480,230,30);
        signup_btn.addActionListener(this);

        add(signup_btn);
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);  
        setSize(1400,800);
        setLocation(00,00);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent ae){
            try{        
            if(ae.getSource()==login_btn){
                Conn c1 = new Conn();
                String Accountnum  = username_txt.getText();
                String Pin  = password_txt.getText();
                String query  = "select* from login where Accountno= '"+Accountnum+"' and Pin= '"+Pin+"'";
                ResultSet rs = c1.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Home(Accountnum,Pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Account Number or PIN");
                }
            }else if(ae.getSource()==clear){
                username_txt.setText("");
                password_txt.setText("");
            }else if(ae.getSource()==signup_btn){
                setVisible(false);
                new Signup().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    public static void main(String[] args) {
        new Login().setVisible(true);
       
   
}
}
