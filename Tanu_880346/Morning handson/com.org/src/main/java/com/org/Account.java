package com.org;

public class Account {

	private int accountNo;
	private String name;
	public Account(int accountNo, String name) {
		super();
		this.accountNo=accountNo;
		this.name=name;
	}
	public Account() {
		super();
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int hashCode() {
		return accountNo;
	}
	public boolean equals(Object object) {
		Account other=(Account) object;
		return this.accountNo==other.getAccountNo();
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + "]";
	}
	
}
