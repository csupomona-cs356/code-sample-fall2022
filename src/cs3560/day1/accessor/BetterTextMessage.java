package cs3560.day1.accessor;

public class BetterTextMessage {

	private String body;
	private String desNum;
	private String srcNum;
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getDesNum() {
		
		return desNum;
	}
	
	public void setDesNum(String desNum) {
		System.out.println("");
		this.desNum = desNum;
	}
	
	public String getSrcNum() {
		return srcNum;
	}
	
	public void setSrcNum(String srcNum) {
		this.srcNum = srcNum;
	}
	
}
