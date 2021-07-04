package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.mysql.fabric.xmlrpc.base.Member;

import Model.member;

public class memberDao implements implDao {

	public static void main(String[] args) {
		member m=new member("Allen","root","1234");
		new memberDao().add(m);

	}
    public static Integer queryUser(String username,String password)
    {
    	EntityManager em=implDao.getDb();
    	String JPQL="select m from member m where m.username=?1 and m.password=?2";
    	Query q=em.createQuery(JPQL,Member.class);
    	q.setParameter(1,username);
    	q.setParameter(2,password);
    	
    	List<member> l=q.getResultList();
    	return l.size();
    }
	@Override
	public void add(Object o) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(o);
		t.commit();
		em.close();
	}
	@Override
	public Object queryId(int id) {
		EntityManager em=implDao.getDb();
		member m=em.find(member.class,id);
		return m;
	}
	@Override
	public void update(Object o) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.merge(o);
		t.commit();
		em.close();
	}
	@Override
	public void delete(int id) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		member m=em.find(member.class,id);
		t.begin();
		em.remove(m);
		t.commit();
		em.close();
		
	}
}
