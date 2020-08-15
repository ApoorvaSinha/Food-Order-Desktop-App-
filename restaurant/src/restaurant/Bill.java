package restaurant;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class Bill extends Frame {
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;
	Button b1,b2;
	String p,q,r,s,t;
	int g,h,k,l,m;
	int total=0;
	public Bill()
	{
		setTitle("Bill");
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		l1=new Label("USER");l1.setBounds(50, 50, 50, 34);
		l2=new Label();l2.setBounds(380, 50, 100, 34);l2.setText(Login.user);
		l3=new Label("ITEM");l4=new Label("QUANTITY");l5=new Label("PRICE");
		l3.setBounds(50, 90, 100, 34);l4.setBounds(200, 90, 100, 34);l5.setBounds(380, 90, 100, 34);
		l6=new Label();l6.setBounds(50, 140, 110, 30);l6.setText(Menu.c1.getLabel());
		l7=new Label();l7.setBounds(50, 170, 110, 30);l7.setText(Menu.c2.getLabel());
		l8=new Label();l8.setBounds(50, 200, 110, 30);l8.setText(Menu.c3.getLabel());
		l9=new Label();l9.setBounds(50, 230, 110, 30);l9.setText(Menu.c4.getLabel());
		l10=new Label();l10.setBounds(50, 260, 110, 30);l10.setText(Menu.c5.getLabel());
		l11=new Label();l11.setBounds(200, 140, 110, 30);l11.setText(Menu.res);
		l12=new Label();l12.setBounds(200, 170, 110, 30);l12.setText(Menu.res3);
		l13=new Label();l13.setBounds(200, 200, 110, 30);l13.setText(Menu.res5);
		l14=new Label();l14.setBounds(200, 230, 110, 30);l14.setText(Menu.res7);
		l15=new Label();l15.setBounds(200, 260, 110, 30);l15.setText(Menu.res9);
		l16=new Label();l16.setBounds(380, 140, 110, 30);l16.setText(Menu.res1);
		g=Integer.parseInt(Menu.res1);
		l17=new Label();l17.setBounds(380, 170, 110, 30);l17.setText(Menu.res2);
		h=Integer.parseInt(Menu.res2);
		l18=new Label();l18.setBounds(380, 200, 110, 30);l18.setText(Menu.res4);
		k=Integer.parseInt(Menu.res4);
		l19=new Label();l19.setBounds(380, 230, 110, 30);l19.setText(Menu.res6);
		l=Integer.parseInt(Menu.res6);
		l20=new Label();l20.setBounds(380, 260, 110, 30);l20.setText(Menu.res8);
		m=Integer.parseInt(Menu.res8);
		total=g+h+k+l+m;
		l21=new Label("----------------------------------------------------------------------------------------------");
		l21.setBounds(40, 300, 430,10);
		l23=new Label("TOTAL");l23.setBounds(50, 315, 90, 30);
		l24=new Label();l24.setBounds(380, 315, 90, 30);l24.setText(String.valueOf(total));
		l22=new Label("-----------------------------------------------------------------------------------------------");
		l22.setBounds(40, 340, 430, 10);
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l10);
		add(l11);add(l11);add(l12);add(l13);add(l14);add(l15);add(l16);add(l17);add(l18);add(l19);add(l20);
		add(l21);add(l22);add(l23);add(l24);

	}

}
