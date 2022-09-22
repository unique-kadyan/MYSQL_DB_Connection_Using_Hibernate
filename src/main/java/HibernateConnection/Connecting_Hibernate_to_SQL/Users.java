package HibernateConnection.Connecting_Hibernate_to_SQL;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity  
@Table(name= "hibernate") 
public class Users {
	private int id;
	private String userName;
	private String fname;
	private Date createDate;
	private String lname;
	private Date modifyDate;
	private String email;
	private String mob;
	
	@Column(name = "mobile")
	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Users(){
 
	}
 
	@Id
	@Column(name = "userid", unique = true, nullable = false)
	public int getSeq() {
		return id;
	}
 
	public void setSeq(int seq) {
		this.id = seq;
	}
 
	@Column(name = "username")
	public String getUserName() {
		return userName;}
	
 
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
	@Column(name = "firstname")
	public String getPassword() {
		return fname;
	}
 
	public void setPassword(String password) {
		this.fname = password;
	}
 
	@Column(name = "date")
	public Date getCreateDate() {
		return createDate;
	}
 
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
 
	@Column(name = "lastname")
	public String getCreateUser() {
		return lname;
	}
 
	public void setCreateUser(String createUser) {
		this.lname = createUser;
	}
 
	@Column(name = "MODIFY_DATE")
	public Date getModifyDate() {
		return modifyDate;
	}
 
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
 
	@Column(name = "email")
	public String getModifyUser() {
		return email;
	}
 
	public void setModifyUser(String modifyUser) {
		this.email = modifyUser;
	}
 
}