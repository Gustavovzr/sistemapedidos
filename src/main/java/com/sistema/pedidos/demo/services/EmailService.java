package com.sistema.pedidos.demo.services;


import com.sistema.pedidos.demo.domain.Cliente;
import com.sistema.pedidos.demo.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
