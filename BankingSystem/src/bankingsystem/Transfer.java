package bankingsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Random;
public class Transfer extends JFrame implements ActionListener{
   
    JButton deposit,transfer,mini_statement,ement,pin_change,balance_enquiry,exit,Transfer_button,back_button;
    
    JLabel service,enter_transfer_details,amount_level,account_level,account_info;
    JTextField amount,Transfer_account;
    String Accountnum,Pin;
    
     Random ran = new Random();
    long firstf4 = (ran.nextLong() % 9000L) + 1000L;
    String Trns_id = "" + Math.abs(firstf4);

        Transfer(String Account_num,String Pin){  
                    setTitle("STATE BANK OF INDIA Transfer");

            this.Accountnum=Account_num;
            this.Pin=Pin;
       
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
        
         account_info = new JLabel("Account No :"+Accountnum);
        account_info.setForeground(Color.BLACK);
        account_info.setFont(new Font("System", Font.BOLD, 15));
        account_info.setBounds(150,0,400,40);
        home_squre.add(account_info);
        
        enter_transfer_details = new JLabel("ENTER ALL THE DETAILS HERE");
        enter_transfer_details.setForeground(Color.BLACK);
        enter_transfer_details.setFont(new Font("System", Font.BOLD, 15));
        enter_transfer_details.setBounds(200,30,400,50);
        home_squre.add(enter_transfer_details);
        
        amount_level=new JLabel("Amount");
        amount_level.setBounds(50,80,400,40);
        amount_level.setFont(new Font("Raleway", Font.BOLD, 22));
        home_squre.add(amount_level);
        
        amount = new JTextField(15);
        amount.setBounds(200,80,300,40);
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        home_squre.add(amount);
        
        account_level=new JLabel("Account No");
        account_level.setBounds(50,130,400,40);
        account_level.setFont(new Font("Raleway", Font.BOLD, 22));
        home_squre.add(account_level);
        
        
        Transfer_account = new JTextField(15);
        Transfer_account.setBounds(200,130,300,40);
        Transfer_account.setFont(new Font("Raleway", Font.BOLD, 22));
        home_squre.add(Transfer_account);
        
        Transfer_button = new JButton("TRANSFER");
        Transfer_button.setBounds(210,190,100,40);
        home_squre.add(Transfer_button);
        Transfer_button.addActionListener(this);
       
        back_button = new JButton("BACK");
        back_button.setBounds(390,190,100,40);
        home_squre.add(back_button);
        back_button.addActionListener(this);
       
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
             Date date = new Date();
             Conn c1 = new Conn();
                String TR_ID=Trns_id;
                 String Cfrom="Transfer";
               
                String Account  = Transfer_account.getText();
                String Amount = amount.getText();
               
           
                if(ae.getSource()==Transfer_button){
                    
                     if(amount.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }
                    
                String query  = "select* from signup2 where Accountno= '"+Account+"'";
                ResultSet rs = c1.s.executeQuery(query);
                if(rs.next()){
                        
                         
                     c1.s.executeUpdate("insert into Trnsdata values('"+TR_ID+"','"+Accountnum+"','"+Cfrom+"', '"+date+"','"+Amount+"','Debit')");
                    c1.s.executeUpdate("insert into Trnsdata values('"+TR_ID+"','"+Account+"','"+Cfrom+"', '"+date+"', '"+Amount+"','Credit')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Transferd");
                     setVisible(false);
                    new Home(this.Accountnum, Pin).setVisible(true);
                                      
                
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Account Number");
                
                }
                    
                   
                
            }else if(ae.getSource()==back_button){ 
                setVisible(false);
                new Home(Accountnum, Pin).setVisible(true);
            }
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
            
            
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    public static void main(String[] args) {
        new Transfer("","").setVisible(true);
        
       
   
}
}
