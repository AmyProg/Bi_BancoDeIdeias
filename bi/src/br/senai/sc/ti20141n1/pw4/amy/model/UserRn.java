package br.senai.sc.ti20141n1.pw4.amy.model;

import java.util.List;

import br.senai.sc.ti20141n1.pw4.amy.bi.dao.UserDao;
import br.senai.sc.ti20141n1.pw4.amy.bi.dominio.User;

public class UserRn {
	
	private UserDao dao;
	
	public UserRn() {
		dao = new UserDao();
	}

	public void salvar(User user) throws Exception {
		if (user.getNome().trim().isEmpty()) {
			throw new Exception("O nome � obrigat�rio!");
		}

		if (user.getEmail().trim().isEmpty()) {
			throw new Exception("O E-mail � obrigat�rio!");
		}
		
		dao.salvar(user);
	}

	public List<User> listar() {
		return dao.listarTodos();
	}

	public User buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}

	public void excluir(Long id) throws Exception {
		dao.excluir(id);
	}

}

