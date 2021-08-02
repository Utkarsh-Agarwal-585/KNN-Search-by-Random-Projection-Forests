import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.util.encoders.Base64;

public class AES {
	/* We need the Thid Party Jar file commons-codec-1.7.jar */

	private static final String ALGO = "AES";

	public static String encrypt(String Data, String keyWord) throws Exception {

		keyWord = keyWord.substring(0, 16);
		byte[] keyValue = keyWord.getBytes();
		System.out.println("Size : " + keyValue.length);
		Key key = new SecretKeySpec(keyValue, ALGO);
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		String encryptedValue = new String(Base64.encode(Data.getBytes()));
		return encryptedValue;
	}

	public static String decrypt(String encryptedData, String keyWord)
			throws Exception {

		keyWord = keyWord.substring(0, 16);
		byte[] keyValue = keyWord.getBytes();
		Key key = new SecretKeySpec(keyValue, ALGO);
		Cipher c = Cipher.getInstance(ALGO);
import java.sql.Connection;
import java.sql.DriverManager;


public class Dbcon 
{
	static Connection con;
	public Connection getConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj20","root","root");
		System.out.println("Connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}

}
