package dao;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import db.DBAccess;
import domain.Manager;
import domain.Person;
import domain.SelectItem;
import org.apache.commons.dbcp2.BasicDataSource;
@Repository
public class MessageDao {
	//private static SqlSession sqlSession;
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<Person> queryList1() throws IOException{
		//DBAccess me=new DBAccess();
		//SqlSession sqlSession=DBAccess.getSqlSession();
		//return sqlSession.selectList("SQL.findall"); 
		System.out.print(sqlSession==null);
		return null;
	}
	
	
	public void addPerson(String name,String password,String career) throws IOException{
	//	SqlSession sqlSession=DBAccess.getSqlSession();
		Person pe=new Person(name,password,career);
		sqlSession.insert("SQL.insertOne",pe);
		sqlSession.commit();
	}
	public List<Manager> queryListManager() throws IOException{
		//SqlSession sqlSession=DBAccess.getSqlSession();
		return sqlSession.selectList("SQL.findManager"); 
	}
	
	public void addSelectItem(String [] item) throws IOException{
	//	SqlSession sqlSession=DBAccess.getSqlSession();
		SelectItem selectitem=new SelectItem(item[0],item[1],item[2],item[3],
				item[4],item[5],item[6]);
		sqlSession.insert("SQL.insertSelectItem",selectitem);
		sqlSession.commit();
	}
	public static void main(String []args) throws IOException{
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext-mybatis.xml");
	}
	
	
}
