package com.example.demo.model;

import java.util.Collection;

public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Collection<Role> roles;
}
