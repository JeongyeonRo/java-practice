package gmail.rgo0517.login.domain;

public class Boxer {
	private String userid;
	private String userpw;
	private String username;
	private String nickname;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "Boxer [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", nickname=" + nickname
				+ "]";
	}
	
	
}