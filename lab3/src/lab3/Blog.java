package lab3;

import java.util.ArrayList;

import base.*;


public class Blog {

	private User user;
	private ArrayList<Post> allPosts;
	
	public Blog(User user) {
		
		this.user=user;
		this.allPosts= new ArrayList<Post>();
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Post> getAllPosts() {
		return allPosts;
	}

	public void setAllPosts(ArrayList<Post> allPosts) {
		this.allPosts = allPosts;
	}

	public void post(Post p){
		allPosts.add(p);
		
		if(allPosts.contains(p)){
			System.out.println("post is succeed");
		}
	}
	
	public void list(){
		for(int i=0; i< allPosts.size() ; i++){
			
			Post message= allPosts.get(i);
			System.out.println(message);
		}
	}
		
	public void delete(int index){
		
		if(index<0 || index > allPosts.size() ){
			System.out.println("index is NOT legal!");
		}
		
		else{
			allPosts.remove(index);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Blog [user=" + user + ", allPosts=" + allPosts + "]";
	}

	
	
}
