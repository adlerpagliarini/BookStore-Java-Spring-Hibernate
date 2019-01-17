package com.bookstore.bookstore.domain.security;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
	@Id
	private int RoleId;
	private String Name;
	
	@OneToMany(mappedBy = "Role", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<UserRole> UserRoles = new HashSet<>();

	public int getRoleId() {
		return RoleId;
	}

	public void setRoleId(int roleId) {
		RoleId = roleId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Set<UserRole> getUserRoles() {
		return UserRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		UserRoles = userRoles;
	}
}
