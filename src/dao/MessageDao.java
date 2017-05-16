package dao;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import db.DBAccess;
import domain.Manager;
import domain.Person;

public class MessageDao {

	
	public List<Person> queryList1() throws IOException{
		//DBAccess me=new DBAccess();
		SqlSession sqlSession=DBAccess.getSqlSession();
		return sqlSession.selectList("SQL.findall"); 
	}
	
	
	public void addPerson(String name,String password,String career) throws IOException{
		SqlSession sqlSession=DBAccess.getSqlSession();
		Person pe=new Person(name,password,career);
		sqlSession.insert("SQL.insertOne",pe);
		sqlSession.commit();
	}
	public List<Manager> queryListManager() throws IOException{
		SqlSession sqlSession=DBAccess.getSqlSession();
		return sqlSession.selectList("SQL.findManager"); 
	}
	
	
	
	
}
