package model;
import java.util.*;

public class User{
    private int id;
	private String name;
	private String email;
	private String password;
	private ArrayList<Course> courses;

    public User(int id, String name, String email, String password){
        this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
    }

    public int getId() {
		return id;
	}                                                                                          

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
}