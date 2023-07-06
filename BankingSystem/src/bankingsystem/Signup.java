package bankingsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.*;


public class Signup extends JFrame implements ActionListener{
    JLabel application_no,personal_details,user_Ocupation,user_Name,user_fname,user_DOB,user_mname,user_gender,user_Phone,user_Email,user_aadhaar,user_pan,user_address,user_home_village,user_post_office,user_City,user_State,user_zip_code,user_Country;
    JTextField Ocupation,Name,fname,DOB,mname,Phone,Email,aadhaar_number,pan_number,address,home_village,post_office,City,State,zip_code,Country;
    JButton next_btn;
    JRadioButton gender,gender_male,gender_female,gender_other,radio_button,radio_button2;
    JComboBox com_box1;
    
    
      Random ran = new Random();
    long firstf4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(firstf4);

    Signup(){
              
        
        setTitle("STATE BANK OF INDIA Signup");
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgfolder/sbi.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(70, 10, 100, 100);
        add(l21); 
        personal_details = new JLabel("Personal Details");
        personal_details.setFont(new Font("Osward", Font.BOLD, 30));
        personal_details.setBounds(375,50,275,100);
        add(personal_details);
        
         application_no = new JLabel("APPLICATION FORM NO. "+first);
         application_no.setFont(new Font("Raleway", Font.BOLD, 38));
         application_no.setBounds(300,5,600,40);
         add(application_no);
        
        user_Name = new JLabel("Name:");
        user_Name.setFont(new Font("Raleway", Font.BOLD, 20));
        user_Name.setBounds(100,150,375,30);
        add(user_Name);
        
        Name = new JTextField(15);
        Name.setBounds(275,150,230,30);
        Name.setFont(new Font("Arial", Font.BOLD, 14));
        add(Name);
        
        user_fname= new JLabel("Father Name:");
        user_fname.setFont(new Font("Raleway", Font.BOLD, 20));
        user_fname.setBounds(100,200,375,30);
        add(user_fname);
        
        fname= new JTextField(15);
        fname.setBounds(275,200,230,30);
       fname.setFont(new Font("Arial", Font.BOLD, 14));
        add(fname);
        
        user_mname = new JLabel("Mother Name:");
        user_mname.setFont(new Font("Raleway", Font.BOLD, 20));
        user_mname.setBounds(550,150,375,30);
        add(user_mname);
        
        mname = new JTextField(15);
        mname.setBounds(700,150,230,30);
       mname.setFont(new Font("Arial", Font.BOLD, 14));
        add(mname);
        user_DOB = new JLabel("Date Of Birth:");
        user_DOB.setFont(new Font("Raleway", Font.BOLD, 20));
       user_DOB.setBounds(550,200,375,30);
        add(user_DOB);
        
        DOB = new JTextField(15);
       DOB.setBounds(700,200,230,30);
       DOB.setFont(new Font("Arial", Font.BOLD, 14));
        add(DOB);
        
        user_gender = new JLabel("Gender:");
        user_gender.setFont(new Font("Raleway", Font.BOLD, 20));
       user_gender.setBounds(550,250,375,30);
        add(user_gender);
        
      
      
        gender_male = new JRadioButton("Male");
        gender_male.setFont(new Font("Raleway", Font.BOLD, 14));
        gender_male.setBackground(Color.WHITE);
        gender_male.setBounds(700,250,60,30);
        add(gender_male);
        
        gender_female = new JRadioButton("Female");
        gender_female.setFont(new Font("Raleway", Font.BOLD, 14));
       gender_female.setBackground(Color.WHITE);
        gender_female.setBounds(760,250,100,30);
        add(gender_female);
        
        gender_other = new JRadioButton("Others");
       gender_other.setFont(new Font("Raleway", Font.BOLD, 14));
       gender_other.setBackground(Color.WHITE);
      gender_other.setBounds(860,250,140,30);
        add(gender_other);
        
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(gender_male);
        groupgender.add(gender_female);
        groupgender.add(gender_other);
        
       
        user_Phone = new JLabel("Phone:");
        user_Phone.setFont(new Font("Raleway", Font.BOLD, 20));
        user_Phone.setBounds(100,250,375,30);
        add(user_Phone);
        
        Phone = new JTextField(10);
        Phone.setBounds(275,250,230,30);
       Phone.setFont(new Font("Arial", Font.BOLD, 14));
        add(Phone);
        user_Email = new JLabel("Email:");
       user_Email.setFont(new Font("Raleway", Font.BOLD, 20));
       user_Email.setBounds(100,300,375,30);
        add(user_Email);
        
        Email = new JTextField(25);
        Email.setBounds(275,300,230,30);
       Email.setFont(new Font("Arial", Font.BOLD, 14));
        add(Email);
        
         user_aadhaar = new JLabel("Aadhaar Number:");
        user_aadhaar.setFont(new Font("Raleway", Font.BOLD, 20));
       user_aadhaar.setBounds(100,350,375,30);
        add(user_aadhaar);
        
       aadhaar_number = new JTextField(12);
        aadhaar_number.setBounds(275,350,230,30);
       aadhaar_number.setFont(new Font("Arial", Font.BOLD, 14));
        add(aadhaar_number);
        
        user_Ocupation = new JLabel("Ocupation:");
       user_Ocupation.setFont(new Font("Raleway", Font.BOLD, 20));
      user_Ocupation.setBounds(550,350,375,30);
        add(user_Ocupation);
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        com_box1 = new JComboBox(occupation);
        com_box1.setBackground(Color.WHITE);
        com_box1.setFont(new Font("Raleway", Font.BOLD, 14));
        com_box1.setBounds(700,350,230,30);
        add(com_box1);
       
   
        user_pan = new JLabel("Pan Number:");
       user_pan.setFont(new Font("Raleway", Font.BOLD, 20));
        user_pan.setBounds(550,300,375,30);
        add(user_pan);
        
        pan_number = new JTextField(10);
        pan_number.setBounds(700,300,230,30);
       pan_number.setFont(new Font("Arial", Font.BOLD, 14));
        add(pan_number);
        
        user_home_village = new JLabel("Home No/Village:");
        user_home_village.setFont(new Font("Raleway", Font.BOLD, 20));
        user_home_village.setBounds(100,400,375,30);
        add(user_home_village);
        
        home_village = new JTextField(15);
        home_village.setBounds(275,400,230,30);
        home_village.setFont(new Font("Arial", Font.BOLD, 14));
        add(home_village);
        
        user_post_office = new JLabel("Post Office:");
        user_post_office.setFont(new Font("Raleway", Font.BOLD, 20));
        user_post_office.setBounds(550,400,375,30);
        add(user_post_office);
        
        post_office = new JTextField(15);
        post_office.setBounds(700,400,230,30);
        post_office.setFont(new Font("Arial", Font.BOLD, 14));
        add(post_office);
        
        user_City = new JLabel("City:");
       user_City.setFont(new Font("Raleway", Font.BOLD, 20));
       user_City.setBounds(100,450,375,30);
        add(user_City);
        
        City = new JTextField(25);
        City.setBounds(275,450,230,30);
       City.setFont(new Font("Arial", Font.BOLD, 14));
        add(City);
        
        user_State = new JLabel("State:");
        user_State.setFont(new Font("Raleway", Font.BOLD, 20));
        user_State.setBounds(550,450,375,30);
        add(user_State);
        
        State = new JTextField(15);
        State = new JTextField(15);
        State.setBounds(700,450,230,30);
        State.setFont(new Font("Arial", Font.BOLD, 14));
        add(State);
        
      
        
        user_zip_code = new JLabel("Zip Code:");
        user_zip_code.setFont(new Font("Raleway", Font.BOLD, 20));
        user_zip_code.setBounds(100,500,375,30);
        add(user_zip_code);
        
        zip_code = new JTextField(6);
        zip_code.setBounds(275,500,230,30);
        zip_code.setFont(new Font("Arial", Font.BOLD, 14));
        add(zip_code);
        
          user_Country = new JLabel("Country:");
        user_Country.setFont(new Font("Raleway", Font.BOLD, 20));
        user_Country.setBounds(550,500,375,30);
        add(user_Country);
        
        Country = new JTextField(15);
        Country = new JTextField(15);
        Country.setBounds(700,500,230,30);
        Country.setFont(new Font("Arial", Font.BOLD, 14));
        add(Country);
        
        
        next_btn = new JButton("Next");
        next_btn.setBackground(Color.BLUE);
        next_btn.setForeground(Color.WHITE);
        next_btn.setFont(new Font("Arial", Font.BOLD, 14));
        next_btn.setBounds(700,570,200,40);
        next_btn.addActionListener(this);
        add(next_btn);
        
      
         setLayout(null);
        getContentPane().setBackground(Color.WHITE);  
        setSize(1400,800);
        setLocation(00,00);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        
        String formno = first;
        String name = Name.getText();
        String fatherName = fname.getText();
        String motherName=mname.getText();
        String dob = DOB.getText();
        String phone=Phone.getText();
        String email =Email.getText();
        String gender = null;
        if(gender_male.isSelected()){ 
            gender = "Male";
        }else if(gender_male.isSelected()){ 
            gender = "Female";
        }else if(gender_other.isSelected()){ 
            gender = "Others";
        }
        String aadhaar = aadhaar_number.getText();
        String pan = pan_number.getText();
        String occupation = (String)com_box1.getSelectedItem();
        String village=home_village.getText();
        String postoffice=post_office.getText();
        String city = City.getText();
        String zipcode = zip_code.getText();
        String state = State.getText();
        String country=Country.getText();
        

        try{
            
            if(Name.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fatherName+"','"+motherName+"','"+dob+"','"+phone+"','"+email+"','"+gender+"','"+aadhaar+"','"+pan+"','"+occupation+"','"+village+"','"+postoffice+"','"+city+"','"+zipcode+"','"+state+"','"+country+"')";
                c1.s.executeUpdate(q1);    
                
               setVisible(false);
               new Signup2(formno).setVisible(true);
            }
           
        }catch(Exception e){
             e.printStackTrace();
        }
        
   
        }



    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
    
}
