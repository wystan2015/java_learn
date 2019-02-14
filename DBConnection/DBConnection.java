
public class DBConnection

{

	public DBConnection()

	{

		try

		{

			//加载JDBC驱动程序

			Class.forName("oracle.jdbc.driver.OracleDriver");

			//建立与数据库的连接


		}

		catch (ClassNotFoundException e)

		{

			//错误输出

			e.printStackTrace();
		}

	}



	public static void main(String[] args)

	{

		DBConnection DBConnection1 = new DBConnection();

	}

}


