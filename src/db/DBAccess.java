package db;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import dao.MessageDao;

public class DBAccess {
	
	
	
	
	public SqlSession getSqlSession() throws IOException {
		// ͨ�������ļ���ȡ���ݿ�������Ϣ
		Reader reader = Resources.getResourceAsReader("config/MybatisConfig.xml");
		// ͨ��������Ϣ����һ��SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		// ͨ��sqlSessionFactory��һ�����ݿ�Ự
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
	public static void main(String []args) throws IOException{
		Reader reader = Resources.getResourceAsReader("config/MybatisConfig.xml");
		// ͨ��������Ϣ����һ��SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		// ͨ��sqlSessionFactory��һ�����ݿ�Ự
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
	}
//	private static SqlSession instance=null;
//	
//	private DBAccess(){
//		
//	}
//	
//	public static SqlSession getSqlSession() throws IOException{
//				//����ģʽ
//				//�쳣�׸�DAO��
//				//����·����/��������srcΪ��ǰ��Ŀ¼,����				  main/java/config/MybatisConfig.xml
//				//Reader reader =Resources.getResourceAsReader("/MybatisConfig.xml");
////		if(instance==null){
////			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
////			InputStream reader = classloader.getResourceAsStream("MybatisConfig.xml");
////			//Reader reader =Resources.getResourceAsReader("config/MybatisConfig.xml");
////	        if(reader==null){
////	        	System.out.print("ok");
////	        }
////	        
////			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
////			SqlSession sqlSession=sqlSessionFactory.openSession();
////			instance=sqlSessionFactory.openSession();
////		}
////		return instance;
//		
//	}
	
	
	
//	public static SqlSession getSqlSession() throws IOException{
//		 
//		
////		ClassLoader classLoader = MessageDao.class.getClassLoader();  
////        URL resource = classLoader.getResource("MybatisConfig.xml");  
////        String path = resource.getPath();  
////        System.out.println(path);  
////        InputStream resourceAsStream = classLoader.getResourceAsStream("MybatisConfig.xml");
////        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
////        InputStream resourceAsStream = classloader.getResourceAsStream("MybatisConfig.xml");
////		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
////		SqlSession sqlSession=sqlSessionFactory.openSession();
//		
//		Reader reader=Resources.getResourceAsReader("config/MybatisConfig.xml");
//		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
//		SqlSession sqlSession=sqlSessionFactory.openSession();
//		return sqlSession;
//	}

}
