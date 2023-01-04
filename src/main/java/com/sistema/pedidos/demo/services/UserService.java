package com.sistema.pedidos.demo.services;

import com.sistema.pedidos.demo.security.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
