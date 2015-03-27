package base;

public class User implements Comparable <User>{

	private int userID;
	private String userName;
	private String userEmail;
	
	
	public User(int userID, String userName, String userEmail) {
		
		this.userID=userID;
		this.userName=userName;
		this.userEmail=userEmail;
		
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userID;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userID != other.userID)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName
				+ ", userEmail=" + userEmail + "]";
	}


	@Override
	public int compareTo(User u) {
		if(this.userID>u.userID){
			return 1;
		}
		
		else if(this.userID<u.userID){
			return -1;
		}
		
		else
			return 0;
		
		
	}

}
