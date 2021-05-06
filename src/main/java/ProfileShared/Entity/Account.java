package ProfileShared.Entity;

public class Account {
	private int id;
	private String username;
	private String password;
	private String displayName;
	private String gmail;
	private String phone;
	public Account(int id, String username, String password, String displayName, String gmail, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.displayName = displayName;
		this.gmail = gmail;
		this.phone = phone;
	}
	public Account() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
