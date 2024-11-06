package br.com.loja.assistec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.view.LoginView;
import br.com.loja.assistec.view.PrincipalView;



public class PrincipalController {

	private LoginView loginView;
	private PrincipalView principalView;
	private Usuario user;

	public PrincipalController(Usuario user, PrincipalView principalView) {
		this.user = user;
		this.principalView = principalView;

		principalView.addPrincipalListener(new PrincipalListener());
	}

	class PrincipalListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			// Se o comando for a ação do botão Login
			if (command.equals("menuSairAction")) {
				int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção",
						JOptionPane.YES_NO_OPTION);
				if (sair == 0) {
					System.exit(0);
				}
			} else if (command.equals("menuUsuariosAction")) {
				/*
				 * try { listarUsuarios(); } catch (SQLException e1) { // TODO Auto-generated
				 * catch block e1.printStackTrace(); }
				 */
			} else if (command.equals("menuSobreAction")) {
				JOptionPane.showMessageDialog(null, "Sistema de gestão Assistec - Versão 1.0");

			}
		}

	}

}