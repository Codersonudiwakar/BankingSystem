
package bankingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;


public class Signup2 extends JFrame implements ActionListener{
    JLabel application_no,password,account_numder_12_digit,account_numder_example,account_type,Additonal_Details,Religion,Category,Income,Educational,Qualification,account_number;
    JRadioButton saving_account,currnet_account,salery_account,fixed_deposit;
    JComboBox combo_box1,combo_box2,combo_box3,combo_box4,combo_box5;
    JCheckBox combo_box11,combo_box12,combo_box13,combo_box14,combo_box15,combo_box17,combo_box16;
    JPasswordField pin;
    JButton submit_button;
     String formno;
  Signup2(String formno){ 
      this.formno=formno;
                setTitle("STATE BANK OF INDIA Signup");
        application_no = new JLabel("APPLICATION FORM NO. "+formno);
         application_no.setFont(new Font("Raleway", Font.BOLD, 38));
         application_no.setBounds(300,5,600,40);
         add(application_no);
        
         Additonal_Details = new JLabel("Page 2: Additonal Details");
        Additonal_Details.setFont(new Font("Raleway", Font.BOLD, 22));
         Additonal_Details.setBounds(300,60,600,40);
        add(Additonal_Details);
  
        account_type=new JLabel("Account Type");
        account_type.setFont(new Font("Raleway", Font.BOLD, 20));
        account_type.setBounds(100,150,375,30);
        add(account_type);
        
        
        saving_account = new JRadioButton("Saving Account");
        saving_account.setFont(new Font("Raleway", Font.BOLD, 14));
        saving_account.setBackground(Color.WHITE);
        saving_account.setBounds(275,150,200,30);
        add(saving_account);
        
        
        salery_account= new JRadioButton("Salery Account");
        salery_account.setFont(new Font("Raleway", Font.BOLD, 14));
        salery_account.setBackground(Color.WHITE);
        salery_account.setBounds(475,150,150,30);
        add(salery_account);
        
        
        currnet_account = new JRadioButton("Current Account");
        currnet_account.setFont(new Font("Raleway", Font.BOLD, 14));
        currnet_account.setBackground(Color.WHITE);
        currnet_account.setBounds(650,150,150,30);
        add(currnet_account);
        
       
        fixed_deposit = new JRadioButton("Fixed Deposit");
        fixed_deposit.setFont(new Font("Raleway", Font.BOLD, 14));
        fixed_deposit.setBackground(Color.WHITE);
        fixed_deposit.setBounds(850,150,150,30);
        add(fixed_deposit);
       
        ButtonGroup account_group=new ButtonGroup();
        account_group.add(saving_account);
        account_group.add(salery_account);
        account_group.add(currnet_account);
        account_group.add(fixed_deposit);
        
        Educational = new JLabel("Educational :");
        Educational.setFont(new Font("Raleway", Font.BOLD, 18));
        Educational.setBounds(100,200,375,30);
        Qualification = new JLabel("Qulification");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 18));
        Qualification.setBounds(100,220,375,30);
        add(Educational);
        add(Qualification);
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        combo_box1 = new JComboBox(education);
        combo_box1.setBackground(Color.WHITE);
        combo_box1.setFont(new Font("Raleway", Font.BOLD, 14));
        combo_box1.setBounds(275,200,375,30);
        add(combo_box1);
        
    
        Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway", Font.BOLD, 18));
        Religion.setBounds(100,250,375,30);
        add(Religion);
        
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        combo_box2 = new JComboBox(religion);
        combo_box2.setBackground(Color.WHITE);
        combo_box2.setFont(new Font("Raleway", Font.BOLD, 14));
        combo_box2.setBounds(275,250,375,30);
         add(combo_box2);
        
        Category = new JLabel("Category:");
        Category.setFont(new Font("Raleway", Font.BOLD, 18));
         Category.setBounds(100,300,375,30);
        add(Category);
        
        String category[] = {"General","OBC","SC","ST","Other"};
        combo_box3 = new JComboBox(category);
        combo_box3.setBackground(Color.WHITE);
        combo_box3.setFont(new Font("Raleway", Font.BOLD, 14));
        combo_box3.setBounds(275,300,375,30);
         add(combo_box3);
        
         Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 18));
        Income.setBounds(100,350,375,30);
        add(Income);
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        combo_box4 = new JComboBox(income);
        combo_box4.setBackground(Color.WHITE);
        combo_box4.setFont(new Font("Raleway", Font.BOLD, 14));
        combo_box4.setBounds(275,350,375,30);
        add(combo_box4);
        
        account_number= new JLabel("Account Number:");
        account_number.setFont(new Font("Raleway", Font.BOLD, 18));
        account_number.setBounds(100,400,375,30);
        add(account_number);
        
        account_numder_12_digit = new JLabel("(Your 16-digit Card number)");
        account_numder_12_digit.setFont(new Font("Raleway", Font.BOLD, 12));
        account_numder_12_digit.setBounds(100,420,200,20);
        add(account_numder_12_digit);
        
        account_numder_example = new JLabel("XXXX-XXXX-9568");
        account_numder_example.setFont(new Font("Raleway", Font.BOLD, 18));
        account_numder_example.setBounds(330,400,250,30);
        add(account_numder_example);
        
        password= new JLabel("Set Pin No:");
        password.setFont(new Font("Raleway", Font.BOLD, 18));
        password.setBounds(100,450,375,30);
        add(password);
        
        pin=new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(275,450,375,30);
        add(pin);
         
        combo_box11 = new JCheckBox("ATM CARD");
        combo_box11.setBackground(Color.WHITE);
        combo_box11.setFont(new Font("Raleway", Font.BOLD, 16));
        combo_box11.setBounds(100,500,200,30);
        add(combo_box11);
        
        combo_box12 = new JCheckBox("Internet Banking");
        combo_box12.setBackground(Color.WHITE);
        combo_box12.setFont(new Font("Raleway", Font.BOLD, 16));
           combo_box12.setBounds(350,500,200,30);
        add(combo_box12);
        
        
        combo_box13 = new JCheckBox("Mobile Banking");
        combo_box13.setBackground(Color.WHITE);
        combo_box13.setFont(new Font("Raleway", Font.BOLD, 16));
           combo_box13.setBounds(100,530,200,30);
        add(combo_box13);
        
        combo_box14 = new JCheckBox("EMAIL Alerts");
        combo_box14.setBackground(Color.WHITE);
        combo_box14.setFont(new Font("Raleway", Font.BOLD, 16));
         combo_box14.setBounds(350,530,200,30);
        add(combo_box14);
        
        combo_box15 = new JCheckBox("Cheque Book");
        combo_box15.setBackground(Color.WHITE);
        combo_box15.setFont(new Font("Raleway", Font.BOLD, 16));
        combo_box15.setBounds(100,560,200,30);
        add(combo_box15);
        
        
        combo_box16 = new JCheckBox("E-Statement");
        combo_box16.setBackground(Color.WHITE);
        combo_box16.setFont(new Font("Raleway", Font.BOLD, 16));
        combo_box16.setBounds(350,560,200,30);
        add(combo_box16);
        
        combo_box17 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        combo_box17.setBackground(Color.WHITE);
        combo_box17.setFont(new Font("Raleway", Font.BOLD, 12));
        combo_box17.setBounds(100,590,600,20);
        add(combo_box17);
      
        submit_button=new JButton("Submit");
        submit_button.setBackground(Color.BLUE);
        submit_button.setForeground(Color.white);
        submit_button.setFont(new Font("Raleway", Font.BOLD, 30));
        submit_button.setBounds(100,640,200,40);
        submit_button.addActionListener(this);
        
        add(submit_button);
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);  
       setSize(1400,800);
        setLocation(00,00);
        setVisible(true);
           
    }
    
    
    
    public void actionPerformed(ActionEvent ae){
        String Accounttype = null;
        if(saving_account.isSelected()){ 
            Accounttype = "Saving Account";
        }
        else if(salery_account.isSelected()){ 
            Accounttype = "Fixed Deposit Account";
        }
        else if(currnet_account.isSelected()){ 
            Accounttype = "Current Account";
        }else if(fixed_deposit.isSelected()){ 
            Accounttype = "Recurring Deposit Account";
        }
        
         String education = (String)combo_box1.getSelectedItem();
         String religion = (String)combo_box2.getSelectedItem(); 
        String category = (String)combo_box3.getSelectedItem();
        String income = (String)combo_box4.getSelectedItem();
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String Accountno = "" + Math.abs(first7);
        String Pin=pin.getText();
        
        String facility = "";
        if(combo_box11.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(combo_box12.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(combo_box13.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(combo_box14.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(combo_box15.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(combo_box16.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{    
                if(Accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn con1 = new Conn();
                    String q1 = "insert into signup2 values('"+formno+"','"+Accounttype+"','"+education+"','"+religion+"','"+category+"','"+income+"','"+Accountno+"','"+Pin+"','"+facility+"')";
                    String q2 = "insert into login values('"+Accountno+"','"+Pin+"')";
                    con1.s.executeUpdate(q1);
                    con1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Account NO IS: " + Accountno);
                        setVisible(false);
                    new Login().setVisible(true);
                
                }
            
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
       new Signup2("").setVisible(true);
    }
    
}
