package bankingsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class Home extends JFrame implements ActionListener{
   
    JButton deposit,transfer,mini_statement,ement,pin_change,balance_enquiry,exit;
    
    JLabel service,account_info,nameL,dobL,mobileL,emailL,genderL,villageL,cityL;
      String Pin,Accountnum,NAME,DOB,Mobile_no,Email_no,Gender,Village,City,formno;
        Home(String Accountnum,String Pin){ 
                    setTitle("STATE BANK OF INDIA Home");

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
        
        
        account_info = new JLabel("Account No :"+Accountnum);
        account_info.setForeground(Color.BLACK);
        account_info.setFont(new Font("System", Font.BOLD, 15));
        account_info.setBounds(170,0,400,40);
        home_squre.add(account_info);
        
         try{
            Conn c1 = new Conn();
            ResultSet rs=c1.s.executeQuery("select * from signup2 where Accountno= '"+Accountnum+"'");
            while (rs.next()) {
               String Fno= rs.getString("formno");
               this.formno=Fno;
               String Ac_type= rs.getString("");
               ResultSet rs2=c1.s.executeQuery("select * from signup where formno= '"+Fno+"'");
               while(rs2.next()){
               String NAME= rs2.getString("name");
               this.NAME=NAME;
               String DOB= rs2.getString("dob");
               this.DOB=DOB;
               String Mobile_no= rs2.getString("phone");
               this.Mobile_no=Mobile_no;
               String Email_no=rs2.getString("email");
               this.Email_no=Email_no;
               String Gender= rs2.getString("gender");
               this.Gender=Gender;
               String Village= rs2.getString("village");
               this.Village=Village;
               String City= rs2.getString("city");
               this.City=City;
               
               }
            }
        }catch(Exception e){}
         
          try{
            Conn c1 = new Conn();
               ResultSet rs2=c1.s.executeQuery("select * from signup where formno= '"+formno+"'");
               while(rs2.next()){
               String NAME= rs2.getString("name");
               this.NAME=NAME;
               String DOB= rs2.getString("dob");
               this.DOB=DOB;
               String Mobile_no= rs2.getString("phone");
               this.Mobile_no=Mobile_no;
               String Email_no=rs2.getString("email");
               this.Email_no=Email_no;
               String Gender= rs2.getString("gender");
               this.Gender=Gender;
               String Village= rs2.getString("village");
               this.Village=Village;
               String City= rs2.getString("city");
               this.City=City;
            }
        }catch(Exception e){}
         
        
         
        
         
        nameL = new JLabel("Name :-"+NAME);
        nameL.setForeground(Color.BLACK);
        nameL.setFont(new Font("System", Font.BOLD, 15));
        nameL.setBounds(50,30,400,30);
        home_squre.add(nameL);
        
        genderL= new JLabel("Gender :"+Gender);
        genderL.setForeground(Color.BLACK);
        genderL.setFont(new Font("System", Font.BOLD, 15));
        genderL.setBounds(50,60,400,30);
        home_squre.add(genderL);
        
        dobL = new JLabel("Date of Birth :-"+DOB);
        dobL.setForeground(Color.BLACK);
        dobL.setFont(new Font("System", Font.BOLD, 15));
        dobL.setBounds(50,90,400,30);
        home_squre.add(dobL);
        
        mobileL = new JLabel("Mobile No :-"+Mobile_no);
        mobileL.setForeground(Color.BLACK);
        mobileL.setFont(new Font("System", Font.BOLD, 15));
        mobileL.setBounds(50,120,400,30);
        home_squre.add(mobileL);
        
        emailL = new JLabel("Email  :-"+Email_no);
        emailL.setForeground(Color.BLACK);
        emailL.setFont(new Font("System", Font.BOLD, 15));
        emailL.setBounds(50,150,400,30);
        home_squre.add(emailL);
        
        villageL = new JLabel("Village  :-"+Village);
        villageL.setForeground(Color.BLACK);
        villageL.setFont(new Font("System", Font.BOLD, 15));
        villageL.setBounds(50,180,400,30);
        home_squre.add(villageL);
        
        cityL = new JLabel("City :-"+City);
        cityL.setForeground(Color.BLACK);
        cityL.setFont(new Font("System", Font.BOLD, 15));
        cityL.setBounds(50,210,400,30);
        home_squre.add(cityL);
        
        
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
               
        }catch(Exception e){
            e.printStackTrace();
        }
         
        }
    public static void main(String[] args) {
        new Home("","").setVisible(true);
       
   
}
}
