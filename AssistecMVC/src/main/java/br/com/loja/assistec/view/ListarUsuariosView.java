package br.com.loja.assistec.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

import br.com.loja.assistec.model.Usuario;
import br.com.loja.assistec.model.UsuarioTableModel;

public class ListarUsuariosView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtLocalizar;
	private JButton btnCadastrar;
	private JButton btnFechar;
	private JTable tabela;
	private TableRowSorter<UsuarioTableModel> rowSorter;
	private UsuarioTableModel usuarioTableModel;
	private JScrollPane scrollPane;
	

	
	public ListarUsuariosView() {
		
		inicializarComponentes();
		configurarJanela();
		
		
	}
	public void inicializarComponentes() {
	
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(39, 34, 103, 33);
		btnCadastrar.setActionCommand("BotaoCadastrarAction");
		
		txtLocalizar = new JTextField();
		txtLocalizar.setBounds(154, 34, 416, 33);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBounds(269, 337, 89, 33);
		btnFechar.setActionCommand("BotaoFecharAction");
		
		tabela = new JTable();
		scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(39,95,530,215);
		
		setLayout(null);
		add(btnCadastrar);
		add(btnFechar);
		add(txtLocalizar);
		add(scrollPane);
		
	}
	
	public void configurarJanela() {
		
		setTitle("Listagem de usuários");
		setBounds(100, 100, 650, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void addListarUsuariosListener(ActionListener listener) {
		
		btnCadastrar.addActionListener(listener);
		btnFechar.addActionListener(listener);
		
	}
}