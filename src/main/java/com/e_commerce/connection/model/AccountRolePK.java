package com.e_commerce.connection.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountRolePK implements Serializable{

	private static final long serialVersionUID = -8208363926004600421L;	
	private long role;
	private long account;
	
	public AccountRolePK() {
		super();
	}
	public AccountRolePK(long role, long account) {
		super();
		this.role = role;
		this.account = account;
	}
	public long getRole() {
		return role;
	}
	public void setRole(long role) {
		this.role = role;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (account ^ (account >>> 32));
		result = prime * result + (int) (role ^ (role >>> 32));
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
		AccountRolePK other = (AccountRolePK) obj;
		if (account != other.account)
			return false;
		if (role != other.role)
			return false;
		return true;
	}
	
	
	
}
