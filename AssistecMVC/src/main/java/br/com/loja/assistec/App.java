package br.com.loja.assistec;

import br.com.loja.assistec.controller.LoginController;
import br.com.loja.assistec.model.LoginDAO;
import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.view.LoginView;


public class App {

	public static void main(String[] args) {
		LoginView view = new LoginView();
		Usuario user = new Usuario();
		@SuppressWarnings("unused")
		LoginController lc = new LoginController(user, view);
	}

}