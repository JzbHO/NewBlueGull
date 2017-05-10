package service;

import java.io.IOException;
import java.util.List;





import dao.MessageDao;
import domain.Person;



public class QueryService {
	public List<Person> queryMessageList() throws IOException {
		MessageDao messageDao = new MessageDao();
		return messageDao.queryList1();
	}
}
