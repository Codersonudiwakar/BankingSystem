package bankingsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class BalanceEquiry extends JFrame implements ActionListener{
   
    JButton deposit,transfer,mini_statement,ement,pin_change,balance_enquiry,exit,back_button;
    
    JLabel service,amount;
      String Pin,Accountnum;
        BalanceEquiry(String Accountnum,String Pin){  
                    setTitle("STATE BANK OF INDIA Enquiry");

       this.Pin=Pin;
       this.Accountnum=Accountnum;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgfolder/sbi_banner.png"));
        Image i2 = i1.getImage().getScaledInstance(1224, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(50, -20, 1200, 300);
        add(l21);
     
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("imgfolder/hmlogo.png"));
        Image i12 = i11.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel home_banner = new JLabel(i13);
        home_banner.setBounds(500, 250, 300, 100);
        add(home_banner);
  
        
        
        
        ImageIcon squre1 = new ImageIcon(ClassLoader.getSystemResource("imgfolder/squre.jpg"));
        Image squre2 = squre1.getImage().getScaledInstance(600, 250, Image.SCALE_DEFAULT);
        ImageIcon squre3 = new ImageIcon(squre2);
        JLabel home_squre = new JLabel(squre3);
        home_squre.setBounds(350, 340, 600, 250);
        add(home_squre);
        
        
        amount = new JLabel();
        amount.setForeground(Color.WHITE);
        amount.setFont(new Font("System", Font.BOLD, 19));
        amount.setBounds(100,50,400,100);
        home_squre.add(amount);
        
        
        back_button = new JButton("BACK");
        back_button.setBounds(150,150,100,50);
        back_button.addActionListener(this);
        home_squre.add(back_button);
        
  int balance = 0;
        try{
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from Trnsdata where Account= '"+Accountnum+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("Credit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){}
        
        amount.setText("Your Current Account Balance is Rs "+balance);
        
        
       /* 
         ImageIcon rignt_bann1 = new ImageIcon(ClassLoader.getSystemResource("imgfolder/left_banner.jpg"));
        Image rignt_bann2 = rignt_bann1.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        ImageIcon rignt_bann3 = new ImageIcon(rignt_bann2);
        JLabel rignt_bann = new JLabel(rignt_bann3);
        rignt_bann.setBounds(1050, 330, 300, 300);
        add(rignt_bann);
        */
        
        
       
        service = new JLabel("Service");
        service.setFont(new Font("Raleway", Font.BOLD, 50));
        service.setBounds(50,250,375,100);
        service.setBackground(Color.magenta);
        add(service);
              
        deposit = new JButton("Deposit");
        deposit.setBackground(Color.BLUE);
        deposit.setForeground(Color.WHITE);
        deposit.setFont(new Font("Arial", Font.BOLD, 14));
        deposit.setBounds(50,350,200,30);
        deposit.addActionListener(this); 
        add(deposit); 
        
         transfer = new JButton("Transfer");
        transfer.setBackground(Color.BLUE);
        transfer.setForeground(Color.WHITE);
        transfer.setFont(new Font("Arial", Font.BOLD, 14));
        transfer.setBounds(50,400,200,30);
        transfer.addActionListener(this); 
        add(transfer); 
        
         balance_enquiry = new JButton("Check Balance");
        balance_enquiry.setBackground(Color.BLUE);
        balance_enquiry.setForeground(Color.WHITE);
        balance_enquiry.setFont(new Font("Arial", Font.BOLD, 14));
        balance_enquiry.setBounds(50,450,200,30);
        balance_enquiry.addActionListener(this); 
        add(balance_enquiry); 
        
         mini_statement = new JButton("Mini Statement");
        mini_statement.setBackground(Color.BLUE);
        mini_statement.setForeground(Color.WHITE);
        mini_statement.setFont(new Font("Arial", Font.BOLD, 14));
        mini_statement.setBounds(50,500,200,30);
        mini_statement.addActionListener(this); 
        add(mini_statement); 
        
         exit = new JButton("Exit");
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Arial", Font.BOLD, 14));
        exit.setBounds(50,550,200,30);
        exit.addActionListener(this); 
        add(exit); 
       
            
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);  
        setSize(1400,800);
        setLocation(00,00);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent ae){
               try{        
 
            if(ae.getSource()==deposit){
                     setVisible(false);
                     new Deposit(Accountnum, Pin).setVisible(true);
             
            }
            else if(ae.getSource()==transfer){ 
                setVisible(false);
                new Transfer(Accountnum, Pin).setVisible(true);
                
            }else if(ae.getSource()==balance_enquiry){ 
                setVisible(false);
                new BalanceEquiry(Accountnum, Pin).setVisible(true);
            }
            else if(ae.getSource()==mini_statement){ 
              
                new MiniStatement(Accountnum, Pin).setVisible(true);
                
            }else if(ae.getSource()==exit){ 
                setVisible(false);
            }
            else if(ae.getSource()==back_button){ 
                setVisible(false);
                new Home(Accountnum, Pin).setVisible(true);
            }
               
        }catch(Exception e){
            e.printStackTrace();
        }
         
        }
    public static void main(String[] args) {
        new BalanceEquiry("","").setVisible(true);
       
   
}
}
