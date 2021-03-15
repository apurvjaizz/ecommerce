package entities;

import java.util.UUID;

public class User 
{
	String name;
	
	String email;
	short age;
	Gender gender;
	String address;
	String password;
	UUID userid;
	String phnno;

	public static class Builder
	{
		private String  name;
		String email;
		short age;
		Gender gender;
		String address;
		String password;
		private String phnno;
		private UUID userid;
		public Builder name(String name)
		{
			this.name=name;
			return this;
		}
		public Builder email(String email)
		{
			this.email=email;
			return this;
		}
		public Builder phnno(String phnno)
		{
			this.phnno=phnno;
			return this;
		}
		public Builder age(short age)
		{
			this.age=age;
			return this;
		}
		public Builder gender(Gender gender)
		{
			this.gender=gender;
			return this;
		}
		public Builder address(String address)
		{
			this.address=address;
			return this;
		}
		public Builder password(String phnno)
		{
			this.phnno=phnno;
			return this;
		}
		public Builder userid()
		{
			this.userid=UUID.randomUUID();
			return this;
		}
		public User build()
		{
			return new User(this);
		}
		
	}
	private User(Builder params)
	{
		this.name=params.name;
		this.phnno=params.phnno;
		this.email=params.email;
		this.age=params.age;
		this.gender=params.gender;
		this.address=params.address;
		this.password=params.password;
		this.userid=params.userid;
	}
	public static Builder builder()
	{
		return new Builder();
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
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UUID getUserid() {
		return userid;
	}
	public void setUserid(UUID userid) {
		this.userid = userid;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
}
