


import javax.swing.*;

import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.net.*;

public class ViewDataOwners extends JFrame implements ActionListener
{
 JButton property,Reset;
 JPanel panel;
 JLabel label1;
  JTextField  text1;
  Vector data;
Vector heading;

JButton view;
JScrollPane pane;
JTable table;
int v,h;
String s,d,call,dt;
Container c;

JLabel imglabel;
ViewDataOwners() 
 {

setTitle("Data Owners :: k-Nearest Neighbor Classification over Semantically Secure Encrypted Relational Data");
c= getContentPane();
c.setLayout (null);
c.setBackground(new Color(244,254,131));

label1 = new JLabel();
label1.setText("Enter Username");

 text1 = new JTextField(20);
   property=new JButton("View Property");

   property.addActionListener(this);



try {
	 Vector heading = new Vector();
	 
	 
		heading.addElement("Owner Name");
		heading.addElement("Password");
		heading.addElement("EMail");
		heading.addElement("Mobile");
		heading.addElement("Address");
		
	
	 
	 
			  Vector data=new Vector();
			  Dbcon db = new Dbcon();
				 Connection con = db.getConnection();
	             Statement stmt = con.createStatement();
	             
	             String ut="Data Owner";
	             
	             String query = "SELECT * From register where user='"+ut+"'";
	             ResultSet rs = stmt.executeQuery(query);



	    


	ResultSetMetaData rsm=rs.getMetaData();
	int col=rsm.getColumnCount();



	            while(rs.next())
	             {
	Vector row = new Vector();
	  for(int i = 1; i <=col; i++){
	                   row.addElement(rs.getObject(i));

	             }

	data.addElement(row);
	             }
			  
			JTable table = new JTable(data,heading);
			  
			  pane = new JScrollPane(table);
			 
			  pane.setBounds(20,50,830,450);
			  c.add(pane);
			 // c.add(image);
	 } 
	 catch(Exception ex) {
		 ex.printStackTrace();
		 } 

  }


public void actionPerformed(ActionEvent ae)
{

Object o=ae.getSource();

if(o==property)
{
		
}

}

}