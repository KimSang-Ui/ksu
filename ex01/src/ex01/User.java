package ex01;

public class User {

	private String usename;
	private String password;
	private String remark;
	
	@Override
	public String toString() {
		return "User [usename=" + usename + ", password=" + password + ", remark=" + remark + "]";
	}
	
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
}
