package ProfileShared.Entity;

public class UserLink {
	private int socialNetworkId;
	private int accountId;
	private String link;
	public UserLink(int socialNetworkId, int accountId, String link) {
		super();
		this.socialNetworkId = socialNetworkId;
		this.accountId = accountId;
		this.link = link;
	}
	public UserLink() {
		super();
	}
	public int getSocialNetworkId() {
		return socialNetworkId;
	}
	public void setSocialNetworkId(int socialNetworkId) {
		this.socialNetworkId = socialNetworkId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
	
}
