package domain;

public class Person {
	private String name;
	private String password;
	private String career;
	private int id;
	public Person(){
		
	}
	public Person(Integer id,String name, String password, String career) {
		super();
		this.name = name;
		this.password = password;
		this.career = career;
		this.id = id;
	}
	public Person(String name, String password, String career) {
		super();
		this.name = name;
		this.password = password;
		this.career = career;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}

	
	
	
	
	

}
