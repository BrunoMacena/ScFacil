package modelo;

import dao.ClienteDAO;
import dao.UsuarioDAO;
import to.ClienteTO;
import to.UsuarioTO;

public class Usuario {
	private int codigo;
	private String nome;
	private String senha;
	private boolean administrador;
	
	public Usuario() {
	}

	public Usuario(String nome, String senha, boolean administrador) {
		this.nome = nome;
		this.senha = senha;
		this.administrador = administrador;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	// validcoes
	private void valida(String campo, String nomeCampo) {
		if(campo == null) {
			throw new IllegalArgumentException(nomeCampo + " não pode ser nulo");
		}
		
		if(campo.isEmpty()){
			throw new IllegalArgumentException(nomeCampo + " não pode ser vazio");
		}
	}
	
	public void validaNome() {
		valida(nome, "Nome");
	}
	
	public void validaSenha() {
		valida(senha, "Senha");
	}
	public void criar() {
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioTO to = new UsuarioTO();
		to.setCodigo(codigo);
		to.setNome(nome);
		to.setSenha(senha);
		dao.incluir(to);
	}

	public void atualizar() {
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioTO to = new UsuarioTO();
		to.setCodigo(codigo);
		to.setNome(nome);
		to.setSenha(senha);
		dao.atualizar(to);
	}
	public void excluir() {
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioTO to = new UsuarioTO();
		to.setCodigo(codigo);
		dao.excluir(to);
	}
	public void carregar() {
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioTO to = dao.carregar(codigo);
		to.setNome(nome);
		to.setSenha(senha);
		dao.atualizar(to);
	}
}
