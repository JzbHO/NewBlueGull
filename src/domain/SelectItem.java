package domain;

public class SelectItem {
	private String type;
	private String answer;
	private String score;
	private String career;
	private String analyze;
	private String item;
	private String options;
	public SelectItem(){
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getAnalyze() {
		return analyze;
	}
	public void setAnalyze(String analyze) {
		this.analyze = analyze;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public SelectItem(String type, String answer, String score, String career,
			String analyze, String item, String options) {
		super();
		this.type = type;
		this.answer = answer;
		this.score = score;
		this.career = career;
		this.analyze = analyze;
		this.item = item;
		this.options = options;
	}
	
	
	

}
