package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface implDao {
     
	
	public static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	//新增
	void add(Object o);
	//查詢
	String queryAll();
	String querySum(int strat,int end);
	String queryId(int id);
	//修改
	void update(int id,Object o);
	//刪除
	void delete(int id);
}
