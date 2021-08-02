
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Results_KNearest_Neighbor_Search {
    public static void main(String[] args) {
        
    

  int count=0;
  int count1=0;
 
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;
  
  String fname=null,fname1=null,fname2=null,fname3=null,fname4=null,fname5=null,fname6=null,fname7=null,fname8=null;
  
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj15","root","root");
    		System.out.println("Connected");
    		Statement st=con.createStatement();
    		
    		String knn="K-Nearest Search";
    		ResultSet rs=st.executeQuery("select * from transaction where task='"+knn+"' ");
    		
    		while(rs.next()==true)
    		{
    			count++;
    			if(count==1)
    			{
    				fname=rs.getString("fname");
    				c1=Double.valueOf(rs.getInt("time"));
    			}
    			
    			if(count==2)
    			{
    			fname1=rs.getString("fname");
    			c2=Double.valueOf(rs.getInt("time"));
    			}
    			if(count==3)
    			{
    				fname2=rs.getString("fname");
    				c3=Double.valueOf(rs.getInt("time"));
    			}
    			if(count==4)
    			{
    				fname3=rs.getString("fname");
    				c4=Double.valueOf(rs.getInt("time"));
    			}
    			if(count==5)
    			{
    				fname4=rs.getString("fname");
    				c5=Double.valueOf(rs.getInt("time"));
    			}
    			if(count==6)
    			{
    				fname5=rs.getString("fname");
    				c6=Double.valueOf(rs.getInt("time"));
    			}
    			if(count==7)
    			{
    				fname6=rs.getString("fname");
    				c7=Double.valueOf(rs.getInt("time"));
    			}
    			if(count==8)
    			{
    				fname7=rs.getString("fname");
    				c8=Double.valueOf(rs.getInt("time"));
    			}	
    		}
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "D1", "D1:"+fname);
    	        dataSet.setValue(c2, "D2", "D2:"+fname1);
    	        dataSet.setValue(c3, "D3", "D3:"+fname2);
    	        dataSet.setValue(c4, "D4", "D4:"+fname3);
    	     
    	 
    	        JFreeChart chart = ChartFactory.createBarChart3D(
    	                "k-Nearest Neighbor Classification over Semantically Secure Encrypted Relational Data", "KNN Search Delay Time(MS) ", "Total Delay (MS)",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	        ChartFrame chartFrame=new ChartFrame("K Nearest Neighbor Search --- Different Transaction Search Delay Details",chart);
    	        chartFrame.setVisible(true);
    	     
    	        chartFrame.setSize(800,500);
    	        
        
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}