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
import domain.Person;

public class login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		// ���ñ���
		req.setCharacterEncoding("UTF-8");
		// ����ҳ���ֵ
		if(req.getParameter("name")!=null){
		String name = req.getParameter("name");
		MessageDao md=new MessageDao(); 
		List<Person> all=md.queryList1();
		
		for(int i=0;i<all.size();i++){
			if(!all.get(i).getName().equals(name))
				req.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(req, resp);
			}
		}else
		
		req.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(req, resp);
		//req.setAttribute("command", command);
				//req.setAttribute("description", description);
				//QueryService listService = new QueryService();
				// ��ѯ��Ϣ�б�����ҳ��
				//listService.queryMessageList();
				// ��ҳ����ת
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		this.doGet(req, resp);
	}

}
