package restaurant;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Register extends Frame {
	Label l1,l2,l3,l4,l5;
	TextField f1,f2,f3,f4;
	Button b1,b2,b3;
	public Register()
	{
		setTitle("Register");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		l1=new Label("Enter name");
		l1.setBounds(80, 70, 130, 34);
		f1=new TextField();
		f1.setBounds(250, 70, 130, 30);
		l2=new Label("Enter mob");
		l2.setBounds(80, 130, 130, 34);
		f2=new TextField();
		f2.setBounds(250, 130, 130, 30);
		l3=new Label("Enter userId");
		l3.setBounds(80, 190, 130, 34);
		f3=new TextField();
		f3.setBounds(250, 190, 130, 30);
		l4=new Label("Enter pass");
		l4.setBounds(80, 250, 130, 34);
		f4=new TextField();
		f4.setBounds(250, 250, 130, 30);
		b1=new Button("Register");b1.setBackground(Color.cyan);
		b1.setBounds(80, 310, 130, 34);
		b2=new Button("Cancel");b2.setBackground(Color.cyan);
		b2.setBounds(250, 310, 130, 30);
		l5=new Label();
		l5.setBounds(200,360,200,34);
		b3=new Button("Login");
		b3.setBounds(200, 400, 100, 34);b3.setBackground(Color.cyan);
		add(l1);add(f1);add(l2);add(f2);add(l3);add(f3);add(l4);add(f4);add(b1);add(b2);add(l5);add(b3);
		b1.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String res1=f1.getText().toString();
						String res2=f2.getText().toString();
						String res3=f3.getText().toString();
						String res4=f4.getText().toString();
						if(res1.length()==0||res2.length()==0||res3.length()==0||res4.length()==0)
						{
							f1.setText("enter data");
							f2.setText("enter data");
							f3.setText("enter data");
							f4.setText("enter data");
							
						}
						else
						{
							l5.setText("Registered!!");
						}
					}
				});
		b2.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						f1.setText(null);
						f2.setText(null);
						f3.setText(null);
						f4.setText(null);
						l5.setText(null);
					}
				});
		b3.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Login.obj1.setVisible(false);
						Restaurant.obj.setVisible(true);
						
					}
				});

	}
	

}
