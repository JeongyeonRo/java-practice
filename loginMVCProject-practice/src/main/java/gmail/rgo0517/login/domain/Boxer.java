package gmail.rgo0517.login.domain;

public class Boxer {
	private String id;
	private String pw;
	private String username;
	private String nickname;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
		return "Boxer [id=" + id + ", pw=" + pw + ", username=" + username + ", nickname=" + nickname + "]";
	}
}
