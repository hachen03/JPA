package Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import Model.member;

public class memberDao implements implDao {

	public static void main(String[] args) {
		  member m=new member("1","2","3","4","5");
		  new memberDao().add(m);
	}

	@Override
	public void add(Object o) {
		member m=(member)o;
		String sql="insert into member(name,username,password,phone,address)"+
		   "values(?,?,?,?,?)";
		Connection conn=implDao.getDb();
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setString(2,m.getUsername());
			ps.setString(3,m.getPassword());
			ps.setString(4,m.getPhone());
			ps.setString(5,m.getAddress());
			
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String queryAll() {
		Connection conn=implDao.getDb();
		String sql="select * from member";
		String show="";
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				show=show+"<tr><td>"+rs.getString("name")+
						  "<td>"+rs.getString("username")+
						  "<td>"+rs.getString("password")+
						  "<td>"+rs.getString("phone")+
						  "<td>"+rs.getString("address");
			}
		}
			catch(SQLException e)
			{
				e.printStackTrace();
		}
			return show;
	}

	@Override
	public String querySum(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object queryId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Object o){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
