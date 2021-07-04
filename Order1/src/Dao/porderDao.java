package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.porder;

public class porderDao implements implDao {

	public static void main(String[] args) {
		    /*porder p=new porder("1",1,2,3);
		    new porderDao().add(p);*/
            new porderDao().delete(8);
	}

	@Override
	public void add(Object o) {
		porder p=(porder)o;
		Connection conn=implDao.getDb();
		String sql="insert into porder(desk,A,B,C,sum) values(?,?,?,?,?)";
		try
	{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,p.getDesk());
		ps.setInt(2,p.getA());
		ps.setInt(3,p.getB());
		ps.setInt(4,p.getC());
		ps.setInt(5,p.getSum());
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
		String sql="select * from porder";
		String show="";
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				show=show+"<tr><td>"+rs.getInt("id")+
						"<td>"+rs.getString("desk")+
						"<td>"+rs.getInt("A")+
						"<td>"+rs.getInt("B")+
						"<td>"+rs.getInt("C")+
						"<td>"+rs.getInt("sum");
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return show;
	}

	@Override
	public String querySum(int start, int end) {
		  Connection conn=implDao.getDb();
		  String sql="select * from porder where sum>=? and sum<=?";
		  String show="";
		  try
		  {
			  PreparedStatement ps=conn.prepareStatement(sql);
			  ps.setInt(1,start);
			  ps.setInt(2,end);
			  
			  ResultSet rs=ps.executeQuery();
			  while(rs.next())
			  {
				  show=show+"<tr><td>"+rs.getInt("id")+
							"<td>"+rs.getString("desk")+
							"<td>"+rs.getInt("A")+
							"<td>"+rs.getInt("B")+
							"<td>"+rs.getInt("C")+
							"<td>"+rs.getInt("sum");
			  }
		  }catch(SQLException e)
		  {
			  e.printStackTrace();
		  }
		  return show;
	}

	@Override
	public String queryId(int id) {
		 Connection conn=implDao.getDb();
		 String sql="select * from porder where id=?";
		 String show="";
		 try
		 {
			 PreparedStatement ps=conn.prepareStatement(sql);
			 ps.setInt(1,id);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next())
			 {
				 show=show+"<tr><td>"+rs.getInt("id")+
							"<td>"+rs.getString("desk")+
							"<td>"+rs.getInt("A")+
							"<td>"+rs.getInt("B")+
							"<td>"+rs.getInt("C")+
							"<td>"+rs.getInt("sum");
			 }
		 }catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		 return show;
	}

	@Override
	public void update(int id, Object o) {
		Connection conn=implDao.getDb();
		String sql="update porder set desk=?,A=?,B=?,C=?,sum=? where id=?";
		porder p=(porder)o;
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			ps.setInt(6, id);
			
			ps.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		Connection conn=implDao.getDb();
		String sql="delete from porder where id=?";
		try
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
