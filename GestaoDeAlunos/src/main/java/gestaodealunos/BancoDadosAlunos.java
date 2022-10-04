package gestaodealunos;

import java.util.LinkedList;
import java.util.List;

public class BancoDadosAlunos implements BancoDados{
	
	List<Usuario> bancoDadosAlunos =  new LinkedList<>();
	
	public void inserirUsuario(Usuario usuario) {
		bancoDadosAlunos.add(usuario);
		// implemente a inserção de usuário
	}

	public Usuario buscaUsuarioPorNome(String nome) {
		for(Usuario usuario : bancoDadosAlunos) {
			
			if(usuario.getNome().equalsIgnoreCase(nome)) {
				return usuario;
			}
		}
		return null;
	}
	// implemente a busca por nome, deve retornar null se não encontrar nada

	public void excluirUsuario(Usuario usuario) {
		bancoDadosAlunos.remove(usuario);
		// implemente a exclusão de um usuário
	}

	public List<Usuario> buscaTodosUsuarios() {
		return bancoDadosAlunos;
		// implemente a busca que retorna todos os usuarios
	}

	public List<Usuario> buscaUsuariosMaioresIdade() {
		List<Usuario> alunosDeMaior = new LinkedList<>();
		
		for(Usuario usuario : bancoDadosAlunos) {
			if(usuario.getIdade() >= 18) {
				alunosDeMaior.add(usuario);
			}
		}
		return alunosDeMaior;
		// implemente a busca que retorna apenas os usuarios com idade maior ou igual a
		// 18 anos
	}

}
