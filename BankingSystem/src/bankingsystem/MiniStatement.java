package bankingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener{
   
    JButton deposit,transfer,mini_statement,ement,pin_change,balance_enquiry,exit;
    
    JLabel Ministmt,account_no;
      String Pin,Accountnum;
        MiniStatement(String Accountnum,String Pin){  
                    setTitle("STATE BANK OF INDIA Statement");

       this.Pin=Pin;
       this.Accountnum=Accountnum;
        
     
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("imgfolder/hmlogo.png"));
        Image i12 = i11.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel home_banner = new JLabel(i13);
        home_banner.setBounds(500, 10, 300, 100);
        add(home_banner);
  
      
        
        
        account_no = new JLabel("Account No :"+""+""+Accountnum);
        account_no.setForeground(Color.BLACK);
        account_no.setFont(new Font("System", Font.BOLD, 25));
        account_no.setBounds(150,100,600,40);
        add(account_no);
        
        Ministmt = new JLabel();
        Ministmt.setForeground(Color.BLACK);
        Ministmt.setFont(new Font("System", Font.BOLD, 15));
        Ministmt.setBounds(150,100,600,400);
        add(Ministmt);
        
        
        
      try{
    
            Conn c1  = new Conn();
            ResultSet rs =c1.s.executeQuery("SELECT * FROM Trnsdata where Account = '"+Accountnum+"'");
            while(rs.next()){
                Ministmt.setText(Ministmt.getText() + "<html>"+rs.getString("TR_ID")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                  
     
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
       
      
            
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);  
        setSize(1000,700);
        setLocation(10,10);
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
               
        }catch(Exception e){
            e.printStackTrace();
        }
         
        }
    public static void main(String[] args) {
        new MiniStatement("","").setVisible(true);
       
   
}
}
