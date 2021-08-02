import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class DataServer implements ActionListener {
	JFrame jf;
	Container c;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JPanel p1, p2;
	JButton b2, b3, b4;
	JScrollPane sp;
	JTextArea ta;
	JTextField t1;
	MenuBar mbr;
	Menu file;
	MenuItem  assign,item2, users,csfile,kdc,server,trans,audit,aud,key,exit;
	Border b11, b22, b33;
	JScrollPane pane;
	String Scheme1;
	String f1 = "", f2 = "", f3 = "", f4 = "", f5 = "", f6 = "", f7 = "",f8 = "";
	int count = 0;
	Timer timer;
	double cc=0;
	String dt="";
	public Font f = new Font("Times new roman", Font.BOLD, 15);
	public Font font = new Font("Times new roman", Font.BOLD, 18);
	public Font f11 = new Font("Times new roman", Font.BOLD, 15);
	
	JLabel mg1, mg2, mg3, mg4, mg5, mg6, mg7, mg8, mg9, mg10, g11, g22, g33,
			g44, g55, g66, g77;
	

	
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	ImageIcon one,two,three,four,five,six,seven,eight,arrow1,arrow2,arrow3,arrow4,arrow5,arrow6,arrow7,arrow8,end,end1;
	JLabel onel,twol,threel,fourl,fivel,sixl,sevenl,eightl,arrow1l,arrow2l,arrow3l,arrow4l,arrow5l,arrow6l,arrow7l,arrow8l,endl,end1l;
	JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11;
	
	
	DataServer() {
		jf = new JFrame("Data Server :: k-Nearest Neighbor Classification over Semantically Secure Encrypted Relational Data");
		c = jf.getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		timer = new Timer(0, null);
		one = new ImageIcon(this.getClass().getResource("DataServer.jpg"));
		onel=new JLabel();
		onel.setIcon(one);
		onel.setBounds(400, 20, 300, 200);
		c.add(onel);
		
		two = new ImageIcon(this.getClass().getResource("DataOwner.jpg"));
		twol=new JLabel();
		twol.setIcon(two);
		twol.setBounds(150, 310, 300, 200);
		c.add(twol);
//		
		three = new ImageIcon(this.getClass().getResource("EndUser.jpg"));
		threel=new JLabel();
		threel.setIcon(three);
		threel.setBounds(630, 310, 300, 200);
		c.add(threel);


		arrow1 = new ImageIcon(this.getClass().getResource("arrow1.png"));
		arrow1l=new JLabel();
		arrow1l.setIcon(arrow1);
		arrow1l.setBounds(400, 290, 300, 200);
		c.add(arrow1l);
//		
		arrow2 = new ImageIcon(this.getClass().getResource("arrow2.png"));
		arrow2l=new JLabel();
		arrow2l.setIcon(arrow2);
		arrow2l.setBounds(380, 310, 300, 200);
		c.add(arrow2l);
		
		arrow3 = new ImageIcon(this.getClass().getResource("arrow3.png"));
		arrow3l=new JLabel();
		arrow3l.setIcon(arrow3);
		arrow3l.setBounds(230, 150, 300, 200);
		c.add(arrow3l);
		
		arrow4 = new ImageIcon(this.getClass().getResource("arrow4.png"));
		arrow4l=new JLabel();
		arrow4l.setIcon(arrow4);
		arrow4l.setBounds(235, 175, 300, 200);
		c.add(arrow4l);
//		
		arrow5 = new ImageIcon(this.getClass().getResource("arrow5.png"));
		arrow5l=new JLabel();
		arrow5l.setIcon(arrow5);
		arrow5l.setBounds(540, 170, 300, 200);
		c.add(arrow5l);
		
		arrow6 = new ImageIcon(this.getClass().getResource("arrow6.png"));
		arrow6l=new JLabel();
		arrow6l.setIcon(arrow6);
		arrow6l.setBounds(520, 160, 300, 200);
		c.add(arrow6l);
		
		lab1 = new JLabel("LOGIN");
		lab1.setFont(f);
		lab1.setBounds(430, 200, 300, 200);
		lab1.setVisible(false);
		c.add(lab1);
		
		lab2 = new JLabel("DOWNLOAD");
		lab2.setFont(f);
		lab2.setBounds(420, 200, 300, 200);
		lab2.setVisible(false);
		c.add(lab2);
		
		lab3 = new JLabel("K-NEAREST SEARCH");
		lab3.setFont(f);
		lab3.setBounds(390, 200, 300, 200);
		lab3.setVisible(false);
		c.add(lab3);

		lab4 = new JLabel("K-NEAREST SEARCH");
		lab4.setFont(f);
		lab4.setBounds(390, 200, 300, 200);
		c.add(lab4);
		lab4.setVisible(false);
		
		lab5 = new JLabel("CONTENT MATCHING");
		lab5.setFont(f);
		lab5.setBounds(390, 200, 300, 200);
		c.add(lab5);
		lab5.setVisible(false);
		
		lab6 = new JLabel("");
		lab6.setFont(f);
		lab6.setBounds(510, 0, 500, 200);
		c.add(lab6);
	//	lab6.setVisible(false);
		
		mbr = new MenuBar();
//		csfile = new MenuItem("Schedule Key Exchange");
		file = new Menu("Data Server's File");
		kdc = new MenuItem("View Server Files");
		assign= new MenuItem("View Attackers");
		item2 = new MenuItem("View Transaction");
		
		users = new MenuItem("View End Users");
		
		server= new MenuItem("View Data Owners");
		
		exit = new MenuItem("Exit");
		
		assign.addActionListener(this);
		kdc.addActionListener(this);
		item2.addActionListener(this);
		users.addActionListener(this);

		server.addActionListener(this);
		
		

		file.add(kdc);
		file.add(assign);
		file.add(item2);
		file.add(users);
	
		file.add(server);

		
		file.add(exit);
		mbr.add(file);
		jf.setMenuBar(mbr);

//		c.add(l2);
		
//		c.add(title);
//		c.add(b1);
		jf.setBounds(40, 0, 900	,600);
		jf.show();

		int[] ports = new int[] {1234,4646,9988,1444,1555,5090,6090,2555,3423,5757,7373,3090,4090};
		
		for (int i = 0; i < 13; i++) {
			Thread t2 = new Thread(new PortListener(ports[i]));
			t2.start();
		}
	}

	public static void main(String args[])
	{
//		new CloudServer();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DataServer();

				
			}

		});
	}
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		if (o == assign) {
			
			try
			{

				ViewAttackers v =new ViewAttackers();
				v.setSize(900, 600);
				v.setVisible(true);
				
			}catch(Exception es){System.out.println(es);}
			
		}
			
		if (o == kdc) {
			
			ViewServerFiles v = new ViewServerFiles();
			v.setSize(900, 600);
			v.setVisible(true);
			
		}
		
		if (o == item2) {
			
			ViewTransaction v = new ViewTransaction();
			v.setSize(900, 600);
			v.setVisible(true);
			
		}
		if (o == users) {
			
			ViewEndUsers v1 = new ViewEndUsers();
			v1.setSize(900, 600);
			v1.setVisible(true);
		}
		if (o == aud) {
			
//			ViewAuditDate v =new ViewAuditDate();
//			v.setSize(150, 200);
//			v.setVisible(true);
		}
		if (o == key) {
	
//			ViewKeyUpdateDate v =new ViewKeyUpdateDate();
//			v.setSize(270, 200);
//			v.setVisible(true);
		}
		if (o == csfile) {
			
			try
			{
				String name = JOptionPane.showInputDialog("Schedule Date (dd/mm/yyyy)");
				
				Socket s = new Socket("localhost",3789);
				DataOutputStream dout = new  DataOutputStream(s.getOutputStream());
				dout.writeUTF(name);
				
				DataInputStream din = new DataInputStream(s.getInputStream());
				String msg = din.readUTF();
				System.out.println(msg);
				
				JOptionPane.showMessageDialog(null, "Date "+msg);
				
			}catch (Exception e4) {
				// TODO: handle exception
			}
			
		}
		if (o == server) {
	
			ViewDataOwners v11 = new ViewDataOwners();
			v11.setSize(900, 600);
			v11.setVisible(true);
		}
		if (o == trans) {
			
//			ViewBackUp d = new ViewBackUp();
//			d.setSize(580, 400);
//			d.setVisible(true);
		}
		if (o == audit) {
			
//			ViewAuditResult d = new ViewAuditResult();
//			d.setSize(580, 400);
//			d.setVisible(true);
		}
		if(o == exit)
		{
			System.exit(0);
		}
	}

class PortListener implements Runnable {
		
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		public void run() {
			try{
			Class.forName("com.mysql.jdbc.Driver");
			Dbcon db=new Dbcon();
			Connection connect=db.getConnection();
			Socket s;
		
			if(this.port==3090)
			{
				try {
						ServerSocket sc =new ServerSocket(3090);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String name = din.readUTF();
						String pass = din.readUTF();
						String email = din.readUTF();
						String mob = din.readUTF();
						String address = din.readUTF();
						String dataowner="Data Owner";
						

						connect.createStatement().executeUpdate("insert into Register(name,pass,email,mobile,address,user) values('"+name+"','"+pass+"','"+email+"','"+mob+"','"+address+"','"+dataowner+"')");
						
						DataOutputStream dout =new DataOutputStream(s.getOutputStream());
						dout.writeUTF("success");
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}
			if (this.port == 4090) {
				 
				try {
					
						ServerSocket sc =new ServerSocket(4090);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						String name = din.readUTF();
						String pass = din.readUTF();
						
						Thread.sleep(1000);
						twol.setVisible(false);
						Thread.sleep(500);
						twol.setVisible(true);
						Thread.sleep(500);
						twol.setVisible(false);
						Thread.sleep(500);
						twol.setVisible(true);
						
						Thread.sleep(1000);
						arrow3 = new ImageIcon(this.getClass().getResource("arrow3g.png"));
						arrow3l.setIcon(arrow3);
						
						Thread.sleep(1000);
						lab1.setVisible(true);
						Thread.sleep(200);
						lab1.setVisible(false);
						Thread.sleep(200);
						lab1.setVisible(true);
						Thread.sleep(200);
						lab1.setVisible(false);
						Thread.sleep(200);
						lab1.setVisible(true);
						
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(500);
						onel.setVisible(true);
						Thread.sleep(500);
						onel.setVisible(false);
						Thread.sleep(500);
						onel.setVisible(true);
						
						Thread.sleep(1000);
						arrow4 = new ImageIcon(this.getClass().getResource("arrow4g.png"));
						arrow4l.setIcon(arrow4);
						
						Thread.sleep(1000);
						twol.setVisible(false);
						Thread.sleep(500);
						twol.setVisible(true);
						Thread.sleep(500);
						twol.setVisible(false);
						Thread.sleep(500);
						twol.setVisible(true);
						
						clear();
						
						String user="Data Owner";
						ResultSet rs=connect.createStatement().executeQuery("select * from Register where name='"+name+"' and pass='"+pass+"' and user='"+user+"'");
						if(rs.next()==true)
						{
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("yes");
						}
						else
						{
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("no");
						}
						
					}
				}	
						catch (Exception e) {
						e.printStackTrace();
					}
						
						
				}
			if(this.port==7373)
			{
				try {
						ServerSocket sc =new ServerSocket(7373);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						String name = din.readUTF();
						String pass = din.readUTF();

						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(500);
						threel.setVisible(true);
						Thread.sleep(500);
						threel.setVisible(false);
						Thread.sleep(500);
						threel.setVisible(true);
						
						Thread.sleep(1000);
						arrow6 = new ImageIcon(this.getClass().getResource("arrow6g.png"));
						arrow6l.setIcon(arrow6);
						
						Thread.sleep(1000);
						lab1.setVisible(true);
						Thread.sleep(200);
						lab1.setVisible(false);
						Thread.sleep(200);
						lab1.setVisible(true);
						Thread.sleep(200);
						lab1.setVisible(false);
						Thread.sleep(200);
						lab1.setVisible(true);
						
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(500);
						onel.setVisible(true);
						Thread.sleep(500);
						onel.setVisible(false);
						Thread.sleep(500);
						onel.setVisible(true);
						
						Thread.sleep(1000);
						arrow5 = new ImageIcon(this.getClass().getResource("arrow5g.png"));
						arrow5l.setIcon(arrow5);
						
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(500);
						threel.setVisible(true);
						Thread.sleep(500);
						threel.setVisible(false);
						Thread.sleep(500);
						threel.setVisible(true);
						
						clear();
						
						String data="End User";
						ResultSet rs=connect.createStatement().executeQuery("select * from Register where name='"+name+"' and pass='"+pass+"' and user='"+data+"'");
						if(rs.next()==true)
						{
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("yes");
						}
						else
						{
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("no");
						}
						
					}
				}	
						catch (Exception e) {
						e.printStackTrace();
					}
						
			}
			if (this.port == 5757) {
				 
				try {
					
						ServerSocket sc =new ServerSocket(5757);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						
						String name = din.readUTF();
						String pass = din.readUTF();
						String email = din.readUTF();
						String mob = din.readUTF();
						String address = din.readUTF();
						String enduser="End User";
						
//						
						connect.createStatement().executeUpdate("insert into Register(name,pass,email,mobile,address,user) values('"+name+"','"+pass+"','"+email+"','"+mob+"','"+address+"','"+enduser+"')");
						
						DataOutputStream dout =new DataOutputStream(s.getOutputStream());
						dout.writeUTF("success");
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				} 
			
			if(this.port==1234)
			{
				try {
						ServerSocket sc =new ServerSocket(1234);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String owner = din.readUTF();
						String fname = din.readUTF();
						String sk = din.readUTF();
						String keyword = din.readUTF();
						String content = din.readUTF();
						String dt= din.readUTF();
/*						
						Thread.sleep(2000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						
						Thread.sleep(2000);
						arrow1 = new ImageIcon(this.getClass().getResource("arrow1g.png"));
						arrow1l.setIcon(arrow1);
						
						Thread.sleep(1000);
						lab1.setVisible(true);
						Thread.sleep(200);
						lab1.setVisible(false);
						Thread.sleep(200);
						lab1.setVisible(true);
						Thread.sleep(200);
						lab1.setVisible(false);
						Thread.sleep(200);
						lab1.setVisible(true);
						Thread.sleep(200);
						lab1.setVisible(false);
						Thread.sleep(200);
						lab1.setVisible(true);
						
						Thread.sleep(2000);
						twol.setVisible(false);
						Thread.sleep(1000);
						twol.setVisible(true);
						Thread.sleep(1000);
						twol.setVisible(false);
						Thread.sleep(1000);
						twol.setVisible(true);
						
						Thread.sleep(2000);
						arrow2 = new ImageIcon(this.getClass().getResource("arrow2g.png"));
						arrow2l.setIcon(arrow2);
						
						Thread.sleep(2000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						
						clear();

*/						String rank="0";
						connect.createStatement().executeUpdate("insert into DataServer values('"+owner+"','"+fname+"','"+sk+"','"+keyword+"','"+content+"','"+rank+"','"+dt+"')");
						
						DataOutputStream dout =new DataOutputStream(s.getOutputStream());
						dout.writeUTF("success");
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}
			if(this.port==5090)
			{
				try {
						ServerSocket sc =new ServerSocket(5090);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String msg = din.readUTF();
						System.out.println(msg);
/*						
						Thread.sleep(2000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						
						Thread.sleep(2000);
						arrow8 = new ImageIcon(this.getClass().getResource("arrow3g.png"));
						arrow8l.setIcon(arrow8);
						
						Thread.sleep(1000);
						lab2.setVisible(true);
						Thread.sleep(200);
						lab2.setVisible(false);
						Thread.sleep(200);
						lab2.setVisible(true);
						Thread.sleep(200);
						lab2.setVisible(false);
						Thread.sleep(200);
						lab2.setVisible(true);
						Thread.sleep(200);
						lab2.setVisible(false);
						Thread.sleep(200);
						lab2.setVisible(true);
						
						Thread.sleep(2000);
						fourl.setVisible(false);
						Thread.sleep(1000);
						fourl.setVisible(true);
						Thread.sleep(1000);
						fourl.setVisible(false);
						Thread.sleep(1000);
						fourl.setVisible(true);
						
						Thread.sleep(2000);
						arrow7 = new ImageIcon(this.getClass().getResource("arrow4g.png"));
						arrow7l.setIcon(arrow7);
						
						Thread.sleep(2000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						
						clear();
*/
						DataOutputStream dout =new DataOutputStream(s.getOutputStream());
						dout.writeUTF("success");
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}
			
			if(this.port==6090)
			{
				try {
						ServerSocket sc =new ServerSocket(6090);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String msg = din.readUTF();
						System.out.println(msg);
/*						
						Thread.sleep(2000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						
						Thread.sleep(2000);
						arrow5 = new ImageIcon(this.getClass().getResource("arrow2g.png"));
						arrow5l.setIcon(arrow5);
						
						Thread.sleep(1000);
						lab2.setVisible(true);
						Thread.sleep(200);
						lab2.setVisible(false);
						Thread.sleep(200);
						lab2.setVisible(true);
						Thread.sleep(200);
						lab2.setVisible(false);
						Thread.sleep(200);
						lab2.setVisible(true);
						Thread.sleep(200);
						lab2.setVisible(false);
						Thread.sleep(200);
						lab2.setVisible(true);
						
						Thread.sleep(2000);
						fourl.setVisible(false);
						Thread.sleep(1000);
						fourl.setVisible(true);
						Thread.sleep(1000);
						fourl.setVisible(false);
						Thread.sleep(1000);
						fourl.setVisible(true);
						
						Thread.sleep(2000);
						arrow6 = new ImageIcon(this.getClass().getResource("arrow1g.png"));
						arrow6l.setIcon(arrow6);
						
						Thread.sleep(2000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
				
						
						clear();
*/
						DataOutputStream dout =new DataOutputStream(s.getOutputStream());
						dout.writeUTF("success");
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}
			
			if (this.port == 4646)
			{

				
				try
				{
					ServerSocket server909 = new ServerSocket(4646);
					Socket con777;

					while (true) 
					{
						
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
				
					
					String file	= dis.readUTF();
					
					ResultSet r1=connect.createStatement().executeQuery("select * from DataServer where fname='"+file+"'");
					
					if(r1.next()==true)
					{
						String k= r1.getString("sk");
						
						DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
						
						dos1.writeUTF("key");
						dos1.writeUTF(k);
							
					}
					if(r1.next()==false)
					{
						DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
						dos1.writeUTF("no");
						dos1.writeUTF("no");
							
					}
					
					}
					
					}catch (Exception e) {
					
				}
			
			}
			
			if (this.port == 9988)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(9988);
					Socket con777;

					while (true) 
					{
						
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					String user	= dis.readUTF();
					String file	= dis.readUTF();
					String sk	= dis.readUTF();
					
					long  start = System.currentTimeMillis();
				
					Thread.sleep(1000);
					threel.setVisible(false);
					Thread.sleep(500);
					threel.setVisible(true);
					Thread.sleep(500);
					threel.setVisible(false);
					Thread.sleep(500);
					threel.setVisible(true);
					
					Thread.sleep(1000);
					arrow6 = new ImageIcon(this.getClass().getResource("arrow6g.png"));
					arrow6l.setIcon(arrow6);
					
					Thread.sleep(1000);
					lab2.setVisible(true);
					Thread.sleep(200);
					lab2.setVisible(false);
					Thread.sleep(200);
					lab2.setVisible(true);
					Thread.sleep(200);
					lab2.setVisible(false);
					Thread.sleep(200);
					lab2.setVisible(true);
					
					Thread.sleep(1000);
					onel.setVisible(false);
					Thread.sleep(500);
					onel.setVisible(true);
					Thread.sleep(500);
					onel.setVisible(false);
					Thread.sleep(500);
					onel.setVisible(true);
					
					Thread.sleep(1000);
					arrow5 = new ImageIcon(this.getClass().getResource("arrow5g.png"));
					arrow5l.setIcon(arrow5);
					
					Thread.sleep(1000);
					threel.setVisible(false);
					Thread.sleep(500);
					threel.setVisible(true);
					Thread.sleep(500);
					threel.setVisible(false);
					Thread.sleep(500);
					threel.setVisible(true);
					
					clear();
				

					SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");	
					Date d = new Date();	
					dt = sd.format(d);

						ResultSet r3=connect.createStatement().executeQuery("select * from attacker where user='"+user+"'");
						
						if(r3.next()==true)
						{
							DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
							dos1.writeUTF("block");
							dos1.writeUTF("block");
						}
						else
						{ 
							ResultSet r1=connect.createStatement().executeQuery("select * from dataserver where fname='"+file+"'");
						
							if(r1.next()==true)
							{
								ResultSet r2=connect.createStatement().executeQuery("select * from dataserver where fname='"+file+"' and sk='"+sk+"'");
								
								if(r2.next()==true)
								{
									long  end = System.currentTimeMillis();
									String cpu = Long.toString(end-start);
									
									String val=r2.getString(6);
									int increment=Integer.parseInt(val)+1;
									String content = r2.getString(5);
									connect.createStatement().executeUpdate("update dataserver set ranking='"+increment+"' where fname='"+file+"'");
									String task="Download";
									connect.createStatement().executeUpdate("insert into transaction values ('"+user+"','"+file+"','"+task+"','"+cpu+"','"+dt+"')");
									
									DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
									AES a = new AES();
									dos1.writeUTF("success");
									dos1.writeUTF(a.decrypt(content, keyWord));
								}
								else
								{
									connect.createStatement().executeUpdate("insert into Attacker values ('"+user+"','"+file+"','"+sk+"','"+dt+"')");
									
									DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
									dos1.writeUTF("failure");
									dos1.writeUTF("failure");
									
								}
									
							}
							if(r1.next()!=true)
								{
								
								DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
								dos1.writeUTF("nofile");
								dos1.writeUTF("nofile");
								
									
								}
						}
					
					}
					
					}catch (Exception e) {
					
				}
		}
			 if (this.port == 1444)
				{

					try
					{
						ServerSocket server909 = new ServerSocket(1444);
						Socket con777;
						
						while (true) 
						{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						String user=in3.readObject().toString();
						String pattern=in3.readObject().toString();
					//	String fname=in3.readObject().toString();
						
						long  start = System.currentTimeMillis();
						
						String search=AES.encrypt(pattern, keyWord);
						
						Vector data = new Vector();
						
						ResultSet rs=connect.createStatement().executeQuery("select count(fname) as coun from dataserver");
						
						int total=0;
						while(rs.next()==true)
						{
							total = rs.getInt("coun");
							System.out.println("Number of files = "+cc);
						}
						
						ResultSet r1=connect.createStatement().executeQuery("select * from dataserver");// where content like '%"+search+"%'");

						ResultSetMetaData rsm=r1.getMetaData();
						int col=rsm.getColumnCount();
						
						AES dec=new AES();
						while(r1.next()==true)
						{
							
							String ct=r1.getString(5);
							
							String ct1=dec.decrypt(ct, keyWord);
							
							if(ct1.indexOf(pattern)>0)
							{
							
							Vector row = new Vector();
			            	for(int i = 1; i <=col; i++){
			                row.addElement(r1.getObject(i));		                
			                cc++;
			            	}
			            	
			            	data.addElement(row);
			             }	
						}
						System.out.println("Found"+cc);
		
						System.out.println("Found"+cc);
						System.out.println("Total"+total);
						
						float ans =(float) ((cc/total)*100);
						System.out.println(ans);
						
						Thread.sleep(2000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						
						Thread.sleep(2000);
						arrow6 = new ImageIcon(this.getClass().getResource("arrow6g.png"));
						arrow6l.setIcon(arrow6);
						
						lab6.setText("K-Nearest Search ="+search);
						Thread.sleep(1000);
						lab6.setVisible(true);
						Thread.sleep(2000);
						lab6.setVisible(false);
						Thread.sleep(200);
						lab6.setVisible(true);
						Thread.sleep(2000);
						lab6.setVisible(false);
						
						Thread.sleep(2000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						
						Thread.sleep(1000);
						lab4.setVisible(true);
						Thread.sleep(200);
						lab4.setVisible(false);
						Thread.sleep(200);
						lab4.setVisible(true);
						Thread.sleep(200);
						lab4.setVisible(false);
						Thread.sleep(200);
						lab4.setVisible(true);
						Thread.sleep(200);
						lab4.setVisible(false);
						Thread.sleep(200);
						lab4.setVisible(true);
						
						Thread.sleep(2000);
						arrow5 = new ImageIcon(this.getClass().getResource("arrow5g.png"));
						arrow5l.setIcon(arrow5);
						
						Thread.sleep(2000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						
						lab6.setVisible(true);
						
						lab6.setText("Total File Found ="+total);
						Thread.sleep(1000);
						lab6.setVisible(true);
						Thread.sleep(200);
						lab6.setVisible(false);
						Thread.sleep(200);
						lab6.setVisible(true);
						Thread.sleep(200);
						lab6.setText("Total Content Found ="+cc);
						lab6.setVisible(false);
						Thread.sleep(200);
						lab6.setVisible(true);
						Thread.sleep(200);
						lab6.setVisible(false);
						Thread.sleep(200);
						lab6.setVisible(true);
						
						clear();
						
						long  end = System.currentTimeMillis();
						String cpu = Long.toString(end-start);
						
						SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");	
						Date d = new Date();	
						String dt = sd.format(d);
						
						String task="K-Nearest Search";
						connect.createStatement().executeUpdate("insert into transaction values ('"+user+"','"+pattern+"','"+task+"','"+cpu+"','"+dt+"')");
						
						ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
						dout.writeObject(data);
						
						}
					}catch (Exception e) {
						e.printStackTrace();
					}
				
				
				}
		
			 Socket con777;
			if (this.port == 1555)
				{

					try
					{
						ServerSocket server909 = new ServerSocket(1555);
					//	Socket con777;
						
						while (true) 
						{
							
						con777 = server909.accept();
						
						DataInputStream in3=new DataInputStream(con777.getInputStream());
						String user=in3.readUTF();
						String file1=in3.readUTF();
						String file2=in3.readUTF();
						
						long  start = System.currentTimeMillis();
						
						AES a = new AES();
						String str1="";
						String str2="";
						String s1="";
						String s2="";
						
						ResultSet res=connect.createStatement().executeQuery("select * from dataserver where fname='"+file1+"'");
						if(res.next()==true)
						{
							str1 = res.getString(5);
							str1=a.decrypt(str1, keyWord);
						//	System.out.println("File 1 Contents = "+str1);
						}
						else
						{
							DataOutputStream dout = new DataOutputStream(con777.getOutputStream());
							dout.writeUTF("no");
							dout.writeInt(1);
						}

						ResultSet res1=connect.createStatement().executeQuery("select * from dataserver where fname='"+file2+"'");
						if(res1.next()==true)
						{
							str2 = res1.getString(5);
							str2=a.decrypt(str2, keyWord);
						//	System.out.println("File 2 Contents = "+str2);
						}
						else
						{
							DataOutputStream dout = new DataOutputStream(con777.getOutputStream());
							dout.writeUTF("no");
							dout.writeInt(1);
						}
						
						float count=0;
						float count1=0;
						float per=0;
						String st[] ;
						String st11[] ;
						
						st=str1.split(" ");
						st11=str2.split(" ");
						
						HashSet h1 = new HashSet(); 
						HashSet h2 = new HashSet();
						
						for(String  s23 : st)
						{
							if(s23.equalsIgnoreCase(" "))
							{
								System.out.println("");
							}
							else
							{
								h1.add(s23);
							}
							
						}
						for(Object ss  : h1)
						{
						//	System.out.println(ss);
						}
						st=h1.toString().split(",");
						
						for(String  s123 : st11)
						{
							if(s123.equalsIgnoreCase(" "))
							{
								System.out.println("");
							}
							else
							{
								h2.add(s123);
							}
							
						}
						
						for(Object sss  : h2)
						{
						//	System.out.println(sss);
						}
						st11=h2.toString().split(",");
						
//						System.out.println(st.length);
//						System.out.println(st11.length);
						
						if(st.length>st11.length)
						{
							for(int i=0;i<st.length;i++)
							{
								//System.out.println(st[i]);
								
							for(int j=0;j<st11.length;j++)
								{
									 if(st[i].equalsIgnoreCase(st11[j]))
									{
										if(st[i].isEmpty())
										{
											System.out.println("");
										}
										if(!st[i].isEmpty())
										{
											//System.out.println("Matched = "+st[i]+" , "+st11[i]);
											count++;
										}
										
									}
								}count1++;
							}
							System.out.println("Match = "+count);
							System.out.println("Total = "+count1);
							per=(count/count1)*100;
							System.out.println(per);
					//		System.out.println(e);
						//	calc(count,count1);
						}
						else
						{
							for(int i=0;i<st11.length;i++)
							{
						//		System.out.println(st11[i]);
								
								for(int j=0;j<st.length;j++)
								{
									if(st11[i].equalsIgnoreCase(st[j]))
									{
										if(st11[i].isEmpty())
										{
											System.out.println("");
										}
										if(!st11[i].isEmpty())
										{
											//System.out.println("Matched = "+st[i]+" , "+st11[i]);
											count++;
										}
									}
								}count1++;
							}
							System.out.println("Match"+count);
							System.out.println("Total"+count1);
							per=(count/count1)*100;
							System.out.println(per);
						//	calc(count,count1);
						}
						
					
						

					
						
						
						
						
						Thread.sleep(2000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						
						Thread.sleep(2000);
						arrow6 = new ImageIcon(this.getClass().getResource("arrow6g.png"));
						arrow6l.setIcon(arrow6);
						
//						lab6.setText("K-Nearest Search ="+search);
//						Thread.sleep(1000);
//						lab6.setVisible(true);
//						Thread.sleep(2000);
//						lab6.setVisible(false);
//						Thread.sleep(200);
//						lab6.setVisible(true);
//						Thread.sleep(2000);
//						lab6.setVisible(false);
						
						Thread.sleep(2000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						
						Thread.sleep(1000);
						lab5.setVisible(true);
						Thread.sleep(200);
						lab5.setVisible(false);
						Thread.sleep(200);
						lab5.setVisible(true);
						Thread.sleep(200);
						lab5.setVisible(false);
						Thread.sleep(200);
						lab5.setVisible(true);
						Thread.sleep(200);
						lab5.setVisible(false);
						Thread.sleep(200);
						lab5.setVisible(true);
						
						Thread.sleep(2000);
						arrow5 = new ImageIcon(this.getClass().getResource("arrow5g.png"));
						arrow5l.setIcon(arrow5);
						
						Thread.sleep(2000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						
						lab6.setVisible(true);
						
						lab6.setText("K-Nearest Search Ratio="+per);
						Thread.sleep(1000);
						lab6.setVisible(true);
						Thread.sleep(200);
						lab6.setVisible(false);
						Thread.sleep(200);
						lab6.setVisible(true);
						Thread.sleep(200);
						lab6.setVisible(false);
						Thread.sleep(200);
						lab6.setVisible(true);
						Thread.sleep(200);
						lab6.setVisible(false);
						Thread.sleep(200);
						lab6.setVisible(true);
						
						clear();
						
						long  end = System.currentTimeMillis();
						String cpu = Long.toString(end-start);
						
						SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");	
						Date d = new Date();	
						String dt = sd.format(d);
						
						String task="Content Matching";
						connect.createStatement().executeUpdate("insert into transaction values ('"+user+"','"+file1+","+file2+"','"+task+"','"+cpu+"','"+dt+"')");
						
						
						DataOutputStream dout = new DataOutputStream(con777.getOutputStream());
						dout.writeUTF("yes");
						dout.writeDouble(per);
						}
					}catch (Exception e) {
						e.printStackTrace();
					}
				
				
				}
			 
			 if (this.port == 2555)
				{

					try
					{
						ServerSocket server909 = new ServerSocket(2555);
				//		Socket con777;
						
						while (true) 
						{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String fname=in3.readObject().toString();
						
						Vector data = new Vector();
						
						ResultSet r1=connect.createStatement().executeQuery("select * from attacker");

						ResultSetMetaData rsm=r1.getMetaData();
						int col=rsm.getColumnCount();
				
						while(r1.next()==true)
						{
							Vector row = new Vector();
			            	for(int i = 1; i <=col; i++){
			                row.addElement(r1.getObject(i));

			             }
			            	data.addElement(row);
						}	

						ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
						dout.writeObject(data);
						
						}
					}catch (Exception e) {
						e.printStackTrace();
					}
				
				}
			 if (this.port == 3423)
				{
					try
					{
						ServerSocket server909 = new ServerSocket(3423);
				//		Socket con777;

						while (true) 
						{
							
						con777 = server909.accept();
						
						DataInputStream dis = new DataInputStream(con777.getInputStream());
						String user	= dis.readUTF();
						
						int i=connect.createStatement().executeUpdate("delete from attacker where user='"+user+"'");
						
						if(i==1)
						{
							DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
							dos1.writeUTF("yes");
								
						}
						if(i==0)
						{
							DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
							dos1.writeUTF("no");
								
						}
						
						}
						
						}catch (Exception e) {
						
					}
				
				}
			 
			}catch (Exception e) {
			// TODO: handle exception
		}
		}


		void clear() throws InterruptedException {

				Thread.sleep(2000);
			 	
			 	arrow1 = new ImageIcon(this.getClass().getResource("arrow1.png"));
				arrow1l.setIcon(arrow1);
//				
				arrow2 = new ImageIcon(this.getClass().getResource("arrow2.png"));
				arrow2l.setIcon(arrow2);
				
				arrow3 = new ImageIcon(this.getClass().getResource("arrow3.png"));
				arrow3l.setIcon(arrow3);
				
				arrow4 = new ImageIcon(this.getClass().getResource("arrow4.png"));
				arrow4l.setIcon(arrow4);
//				
				arrow5 = new ImageIcon(this.getClass().getResource("arrow5.png"));
				arrow5l.setIcon(arrow5);
				
				arrow6 = new ImageIcon(this.getClass().getResource("arrow6.png"));
				arrow6l.setIcon(arrow6);
				
				lab1.setVisible(false);
				lab2.setVisible(false);
				lab3.setVisible(false);	
				lab4.setVisible(false);	
				lab5.setVisible(false);	
				lab6.setVisible(false);	
		 
		 }

}
}