import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Voter extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l,lz,lp;//lz=lzone ,lp=lparty
 JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tfo;
 JButton b1,b2,b3,b4,b5,b6;
 JPanel p1,p2,p3,p4,p5,p6;
 JComboBox cb,cb1;
 String zone[]={"select","Delhi","Hyderabad","UP","MP"};
 String party[]={"select","BJP","AAP","CONGRESS"};
 Voter()
 {
  setSize(800,800);
  setTitle("ONLINE VOTING");
  setLayout(null);
//labels 
//i created a frame and i m adding a panel to it
	p1=new JPanel();
	p1.setSize(800,800);
	p1.setLayout(null);
//buttons in panel1
	b1=new JButton("register");
	b2=new JButton("login");
	 b3=new JButton("submit:");
	b1.setBounds(300,300,150,50);
	b2.setBounds(300,350,80,30);
//adding of buttons to panel
	p1.add(b1);
	//p1.add(b2);
	//adding of panel to frame
	add(p1);
	b1.addActionListener(this);
	b2.addActionListener(this);
   b3.addActionListener(this);
//for register creations
//creating another panel
          p2=new JPanel();
		  
          p2.setSize(800,800);
          p2.setLayout(null);
         	//adding components to another panel p2	  
              //labels 
  l1=new JLabel("Aadhar_id*");l1.setBounds(100,100,80,30);
  l2=new JLabel("voter_id*");l2.setBounds(100,150,80,30);
  l3=new JLabel("First_name");l3.setBounds(100,200,80,30);
  l4=new JLabel("last_name");l4.setBounds(100,250,80,30);
  l5=new JLabel("Father_name");l5.setBounds(100,300,80,30);
  l6=new JLabel("Contact no*");l6.setBounds(100,350,80,30);
  l7=new JLabel("address");l7.setBounds(100,400,50,30);
  l8=new JLabel("pincode");l8.setBounds(100,450,50,30);
  l9=new JLabel("email");l9.setBounds(100,500,80,30);
  l10=new JLabel("USER NAME*");l10.setBounds(100,550,80,30);
  l11=new JLabel("PASSWORD*");l11.setBounds(100,600,80,30);
  //l=new JLabel("user name password mandatory");l.setBounds(50,50,200,30);
  //lz
  lz=new JLabel("select zone");lz.setBounds(32,98,80,50);
  lp=new JLabel("select party");lp.setBounds(32,178,80,50);
  //button 
  //b1=new JButton("register");
  //text fields
  tf1=new JTextField(20);tf1.setBounds(180,100,200,30);
  tf2=new JTextField(20);tf2.setBounds(180,150,200,30);
  tf3=new JTextField(20);tf3.setBounds(180,200,200,30);
  tf4=new JTextField(20);tf4.setBounds(180,250,200,30);
  tf5=new JTextField(20);tf5.setBounds(180,300,200,30);
  tf6=new JTextField(20);tf6.setBounds(180,350,200,30);
  tf7=new JTextField(20);tf7.setBounds(180,400,500,30);
  tf8=new JTextField(20);tf8.setBounds(180,450,200,30);
  tf9=new JTextField(20);tf9.setBounds(180,500,150,30);
  tf10=new JTextField(20);tf10.setBounds(180,550,200,30);
  tf11=new JTextField(20);tf11.setBounds(180,600,200,30);
  //button
 // b3=new JButton("submit:");
 b3.setBounds(400,620,80,30);
  
 //adding

 p2.add(l1);p2.add(tf1);
  p2.add(l2);p2.add(tf2);p2.add(l3);p2.add(tf3);p2.add(l4);p2.add(tf4);p2.add(l5);p2.add(tf5);p2.add(l6);p2.add(tf6);
  p2.add(l7);p2.add(tf7);p2.add(l8);p2.add(tf8);p2.add(l9);p2.add(tf9);p2.add(l10);p2.add(tf10);p2.add(l11);p2.add(tf11);
 p2.add(b3);
 //
//login
 //creating one more panel p3
	 //
	 p3=new JPanel();
	 p3.setSize(800,800);
	 p3.setLayout(null);
	 l=new JLabel("enter the registred username and password");l.setBounds(50,50,300,30);
  
	 l12=new JLabel("username");l12.setBounds(100,100,80,30);
	 l13=new JLabel("password");l13.setBounds(100,150,80,30);
	 tf12=new JTextField(20);tf12.setBounds(180,100,200,30);
	 tf13=new JTextField(20);tf13.setBounds(180,150,200,30);
	 b4=new JButton("LOGIN");b4.setBounds(300,300,80,30);
	//
	 p3.add(l);
	 //
	 p3.add(l12);
	 p3.add(l13);
	 p3.add(tf12);
	 p3.add(tf13);
	 p3.add(b4);
	//
	p1.setBackground(Color.yellow);
	p2.setBackground(Color.white);
	p3.setBackground(Color.yellow);
	b4.addActionListener(this);
	setVisible(true);
	p1.setVisible(true);
	//creating panel for otp
	 p5=new JPanel();
	 p5.setSize(600,600);
	 p5.setLayout(null);
	 l14=new JLabel("ENTER OTP");l14.setBounds(100,100,80,30);
	 l15=new JLabel("CHECK OTP from textfield ");l15.setBounds(400,50,230,30);
	 tf14=new JTextField(20);tf14.setBounds(180,100,80,30);
	 b5=new JButton("NEXT");b5.setBounds(300,300,80,50);
	 //text filed for otp
	 tfo=new JTextField(20);tfo.setBounds(400,100,80,50);
	 b5.addActionListener(this);
	 p5.add(l14);
	 p5.add(tf14);
	 p5.add(b5);
	 p5.add(l15);
	 //adding text fields tfo
	 p5.add(tfo);
	 //panel after entering correct otp
	 p6=new JPanel();
	 p6.setSize(800,800);
	 p6.setLayout(null);//adding the combobox 
	 //adding label lzone
	 p6.add(lz);
	 p6.add(lp);
	 cb=new JComboBox(zone);
	 p6.add(cb);
	 cb.setBounds(100,100,100,50);	
    cb1=new JComboBox(party);
     p6.add(cb1);
     cb1.setBounds(100,180,100,50);	
     //button for panel p6
	 //b6(vote)
	 b6=new JButton("VOTE");
	 b6.addActionListener(this);
	 p6.add(b6);
	 b6.setBounds(400,400,80,50);
      	 
	}
	public void actionPerformed(ActionEvent ae)
	{
	   String a=ae.getActionCommand();
        //if(a.equals("register")) or use getsource method
			if(ae.getSource()==b1)
        {
			
			
          add(p2);
		  
        p2.setVisible(true);
         p1.setVisible(false);
         
		}
 if(ae.getSource()==b3)
   {
	   String z=tf10.getText();
	   String y=tf11.getText();
	   if((z.equals(""))&&(y.equals("")))
			{
			}
		else
		{
	   add(p3);
	//setVisible(false);
	 p3.setVisible(true);
	 p2.setVisible(false);
	 p1.setVisible(false);
			}
   }
	 if(ae.getSource()==b4)
	 {
           String b=tf10.getText();
		  String c=tf12.getText();
		  String d=tf11.getText();
		  String e=tf13.getText();
		  if((b.equals(c))&&(d.equals(e)))
		  {
			 System.out.println("GENETRe otp");
			String numbers = "0123456789"; 
  
        // Using random method  for otp genetration
       Random rndm_method = new Random(); 
  
        //char[] otp = new char[4]; 
		String otp="";
        for (int i = 0; i <4; i++) 
        { 
            // Use of charAt() method : to get character value 
            //  we genrally Use of nextInt() as it is scanning the value as int 
            otp=otp+numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
					System.out.println(otp);
						tfo.setText(otp);
		  }
		  else
		  {
			  System.out.println("not valid");
		  }
	 }
	 
	
 if(a.equals("login"))
 {
	 add(p3);
	 //added
	 //set visibles
	 p3.setVisible(true);
	 p1.setVisible(false);	 
 }
  if(ae.getSource()==b4)
  {
	  add(p5);
	  p5.setVisible(true);
	  p2.setVisible(false);
	  p3.setVisible(false);
	  p1.setVisible(false);
  }
  if(ae.getSource()==b5)
  {
	   String t=tf14.getText();
	   String t1=tfo.getText();
	  if(t.equals(t1))
	  {
	  add(p6);
	  
	  p6.setVisible(true);
	  p5.setVisible(false);
	  p3.setVisible(false);
	  p2.setVisible(false);
	  p1.setVisible(false);
	  }
	  }
	  if(ae.getSource()==b6)
	  {
		   int s=JOptionPane.showConfirmDialog(p6,"Are you sure?"); 
				if(s==JOptionPane.YES_OPTION){	
                 JOptionPane.showMessageDialog(p6,"voted succesfully");
}
	  }
		
	
}	   
		  	
 public static void main(String[] args)
 {
  new Voter();
  }
  }