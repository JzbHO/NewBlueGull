package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;







import service.QueryService;
import dao.MessageDao;
import db.DBAccess;
import domain.Manager;
import domain.Person;

public class login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		// 设置编码
		req.setCharacterEncoding("UTF-8");
		// 接受页面的值
		if(req.getParameter("category").equals("管理员"))
		{
			System.out.print(req.getParameter("category"));
			if(req.getParameter("name")!=null){
				String name = req.getParameter("name");
				String password = req.getParameter("password");
				MessageDao md=new MessageDao(); 
				List<Manager> all=md.queryListManager();
				
				for(int i=0;i<all.size();i++){
					if(all.get(i).getName().equals(name)&&all.get(i).getPassword().equals(password))
					{
						req.getRequestDispatcher("/WEB-INF/jsp/Manager/manager.jsp").forward(req, resp);
						break;
					}
					else{
						req.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(req, resp);
						break;
					}
					}
				}else
					req.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(req, resp);
			
		}
		else{
			if(req.getParameter("name")!=null){
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			MessageDao md=new MessageDao(); 
			List<Person> all=md.queryList1();
			
			for(int i=0;i<all.size();i++){
				if(all.get(i).getName().equals(name)&&all.get(i).getPassword().equals(password))
				{
					req.getRequestDispatcher("/WEB-INF/jsp/Client/list.jsp").forward(req, resp);
					break;
				}
				else{
					req.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(req, resp);
					break;
				}
				}
			
			}else
				req.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(req, resp);

		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		this.doGet(req, resp);
	}

}
