package restaurant;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Login extends Frame {
	static Register obj1;
	Label l1,l2,l3,l4;
	TextField f1,f2;
	Button b1,b2;
	public static String user;
	
	 Connection con;
	 PreparedStatement pst;
	 ResultSet rs;
	 
	 public Boolean checkLogin(String uname,String pwd)
	    {

	 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
	 pst=con.prepareStatement("select * from registration where user_id=? and password=?");
	             
	           }
	 catch (Exception e) 
     {
         System.out.println(e);
     }
	 
	 try {
         
         pst.setString(1, uname);
          //this replaces the 1st  "?" in the query for username
          pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
          //executes the prepared statement
          rs=pst.executeQuery();
          if(rs.next())
          {
              //TRUE iff the query founds any corresponding data
              return true;
          }
          else
          {
              return false;
          }
          
	 } catch (Exception e) {
         System.out.println("error while validating"+e);
         return false;
     }
}
	 
	public Login()
	{
		setTitle("login");
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		l1=new Label("LOGIN");
		l1.setBounds(200, 70, 130, 34);
		l2=new Label("Enter User");
		l2.setBounds(80, 130, 130, 34);
		f1=new TextField();
		f1.setBounds(250, 130, 130, 30);
		l3=new Label("Enter Pass");
		l3.setBounds(80, 170, 130, 34);
		f2=new TextField();
		f2.setBounds(250, 170, 130, 30);
		b1=new Button("login");b1.setBackground(Color.cyan);
		b1.setBounds(190, 250, 130, 34);
		l4=new Label("If not reg,click here->");
		l4.setBounds(120, 300, 180, 30);
		b2=new Button("Reg");b2.setBackground(Color.cyan);
		b2.setBounds(300, 300, 70, 30);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				user=f1.getText().toString();
				f2.getText().toString();
				if(f1.getText().length()==0 || f2.getText().length()==0)
				{
					f1.setText("enter user id");
					f2.setText("enter password");
				}
				else
				{
					f1.setText(null);
					f2.setText(null);
				   Restaurant.obj4=new Menu();
				   Restaurant.obj4.setVisible(true);
				   Restaurant.obj.setVisible(false);
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				obj1=new Register();
				obj1.setVisible(true);
				Restaurant.obj.setVisible(false);
			}
		});
		
		add(l1);add(l2);add(f1);add(l3);add(f2);add(b1);add(l4);add(b2);

	}
}
