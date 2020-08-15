package restaurant;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Menu extends Frame{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	static Checkbox c1,c2,c3,c4,c5;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	static int x,u,v,y,z,a,b,c,d,f;
	static String res,res1,res2,res3,res4,res5,res6,res7,res8,res9;
	
	 public void reset(){
         c1.setState(false);
         c2.setState(false);;
         c3.setState(false);
         c4.setState(false);
     }
	public Menu()
	{
		setTitle("Menu");
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		l1=new Label("ITEM");l14=new Label();
		l1.setBounds(50, 70, 100, 34);
		l2=new Label("QUANTITY");
		l2.setBounds(200, 70, 70, 34);
		l3=new Label("PRICE");
		l3.setBounds(380, 70, 100, 34);
		c1=new Checkbox("Chicken");
		c1.setBounds(50, 110, 70, 30);
		c2=new Checkbox("Chicken Kebab");
		c2.setBounds(50, 140, 100, 30);
		c3=new Checkbox("Chicken Tikka");
		c3.setBounds(50, 170, 100, 30);
		c4=new Checkbox("Kadhai Chicken");
		c4.setBounds(50, 200, 110, 30);
		c5=new Checkbox("Mutton Chap");
		c5.setBounds(50, 230, 100, 30);
		b3=new Button("-");l4=new Label("01");b8=new Button("+");l9=new Label("130");
		b3.setBounds(200, 110, 10, 10);l4.setBounds(215, 110, 20, 10);b8.setBounds(235, 110, 10, 10);l9.setBounds(380, 110, 100, 34);
		b4=new Button("-");l5=new Label("01");b9=new Button("+");l10=new Label("140");
		b4.setBounds(200, 140, 10, 10);l5.setBounds(215, 140, 20, 10);b9.setBounds(235, 140, 10, 10);l10.setBounds(380, 140, 100, 34);
		b5=new Button("-");l6=new Label("01");b10=new Button("+");l11=new Label("150");
		b5.setBounds(200, 170, 10, 10);l6.setBounds(215, 170, 20, 10);b10.setBounds(235, 170, 10, 10);l11.setBounds(380, 170, 100, 34);
		b6=new Button("-");l7=new Label("01");b11=new Button("+");l12=new Label("100");
		b6.setBounds(200, 200, 10, 10);l7.setBounds(215, 200, 20, 10);b11.setBounds(235, 200, 10, 10);l12.setBounds(380, 200, 100, 34);
		b7=new Button("-");l8=new Label("01");b12=new Button("+");l13=new Label("200");
		b7.setBounds(200, 230, 10, 10);l8.setBounds(215, 230, 20, 10);b12.setBounds(235, 230, 10, 10);l13.setBounds(380, 230, 100, 34);
		b1=new Button("Confirm");
		b1.setBounds(50, 280, 70, 34);b1.setBackground(Color.cyan);
		b2=new Button("Cancel");
		b2.setBounds(380, 280, 70, 34);b2.setBackground(Color.cyan);
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);
		add(c1);add(c2);add(c3);add(c4);add(c5);
		b2.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Restaurant.obj4.setVisible(false);
						Restaurant.obj.setVisible(true);
					}
				});
		b1.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						Restaurant.obj3=new Bill();
						Restaurant.obj3.setVisible(true);
						Restaurant.obj4.setVisible(false);
					}
				});
		c1.addItemListener(new ItemListener(){
					public void itemStateChanged(ItemEvent t)
					{
						if(t.getStateChange()==1) {
						b8.addActionListener(new ActionListener(){
							int i=1;int j=130;
							public void actionPerformed(ActionEvent e)
							{
								  i++;
								  	res=String.valueOf(i);
									l4.setText(res);
									j=j+130;
									res1=String.valueOf(j);
									l9.setText(res1);
									x=Integer.parseInt(res);
									a=Integer.parseInt(res1);
									b3.addActionListener(new ActionListener(){
										int i=x;int j=a;
										public void actionPerformed(ActionEvent e)
										{
											if(j>0) {
												  j=j-130;
												  i--;  
											  }
											  else
											  {
												  j=0;
												  i=0;
											  }
												res=String.valueOf(i);
												l4.setText(res);
												res1=String.valueOf(j);
												l9.setText(res1);
												
										}
									});
									
							}
							
						});}
						
					}
				});
		c2.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent t)
					{
						if(t.getStateChange()==1) {
						b9.addActionListener(new ActionListener(){
							int i=1;int j=140;
							public void actionPerformed(ActionEvent e)
							{
								  i++;
								  j=j+140;
									res2=String.valueOf(j);
									l10.setText(res2);
									res3=String.valueOf(i);
									l5.setText(res3);
									u=Integer.parseInt(res3);
									b=Integer.parseInt(res2);
									b4.addActionListener(new ActionListener(){
										int i=u;int j=b;
										public void actionPerformed(ActionEvent e)
										{
											if(j>0) {
												  j=j-140;
												  i--;  
											  }
											  else
											  {
												  j=0;
												  i=0;
											  }
												res3=String.valueOf(i);
												l5.setText(res3);
												res2=String.valueOf(j);
												l10.setText(res2);
										}
									});
							}
						});}
						
					}
				});
		c3.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent t)
					{
						if(t.getStateChange()==1) {
						b10.addActionListener(new ActionListener(){
							int i=1;int j=150;
							public void actionPerformed(ActionEvent e)
							{
								  i++;
								  j=j+150;
									res4=String.valueOf(j);
									l11.setText(res4);
									res5=String.valueOf(i);
									l6.setText(res5);
									v=Integer.parseInt(res5);
									c=Integer.parseInt(res4);
									b5.addActionListener(new ActionListener(){
										int i=v;int j=c;
										public void actionPerformed(ActionEvent e)
										{
											if(j>0) {
												  j=j-150;
												  i--;  
											  }
											  else
											  {
												  j=0;
												  i=0;
											  }
												res5=String.valueOf(i);
												l6.setText(res5);
												res4=String.valueOf(j);
												l11.setText(res4);
										}
									});
							}
						});}
						
						
					}
				});
		c4.addItemListener(
				new ItemListener()
				{
					public void itemStateChanged(ItemEvent t)
					{
						if(t.getStateChange()==1) {
						b11.addActionListener(new ActionListener(){
							int i=1;int j=100;
							public void actionPerformed(ActionEvent e)
							{
								  i++;
								  j=j+100;
									res6=String.valueOf(j);
									l12.setText(res6);
									res7=String.valueOf(i);
									l7.setText(res7);
									y=Integer.parseInt(res7);
									d=Integer.parseInt(res6);
									b6.addActionListener(new ActionListener(){
										int i=y;int j=d;
										public void actionPerformed(ActionEvent e)
										{
											  if(j>0) {
												  j=j-100;
												  i--;  
											  }
											  else
											  {
												  j=0;
												  i=0;
											  }
												res7=String.valueOf(i);
												l7.setText(res7);
												res6=String.valueOf(j);
												l12.setText(res6);
										}
									});
							}
							
						});}
					}
				}
				);
		c5.addItemListener(
				new ItemListener()
				{
					public void itemStateChanged(ItemEvent t)
					{
						if(t.getStateChange()==1) {
						b12.addActionListener(new ActionListener(){
							int i=1;int j=200;
							public void actionPerformed(ActionEvent e)
							{
								  i++;
								  j=j+200;
									res8=String.valueOf(j);
									l13.setText(res8);
									res9=String.valueOf(i);
									l8.setText(res9);
									z=Integer.parseInt(res9);
									f=Integer.parseInt(res8);
									b7.addActionListener(new ActionListener(){
										int i=z;int j=f;
										public void actionPerformed(ActionEvent e)
										{
											if(j>0) {
												  j=j-200;
												  i--;  
											  }
											  else
											  {
												  j=0;
												  i=0;
											  }
												res9=String.valueOf(i);
												l8.setText(res9);
												res8=String.valueOf(j);
												l13.setText(res8);
										}
									});
							}
						});}
						
					}
				});
		
	}
		
}

