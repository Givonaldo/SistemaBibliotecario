package br.com.ifpb.main;

import br.com.ifpb.modelo.dao.ExemplarDao;
import br.com.ifpb.modelo.entities.Exemplar;
import br.com.ifpb.modelo.entities.Livro;

public class TesteSistemaBibliotecario {

	public static void main(String[] args) throws Exception {
		//Autor autor = new Autor();
		//autor.setId(1L);
		//autor.setNome("Machado de Assis");
		
		//Editora editora = new Editora();
		//editora.setId(1);
		//editora.setNome("�tica");
		
		//Disciplina disciplina = new Disciplina();
		//disciplina.setId(1);
		//disciplina.setNome("Literatura");
		

		Livro livro = new Livro();
		livro.setId(1);
//		livro.setTitulo("A cabana");
//		livro.setAno("2001");
//		livro.setIsbn("12345678-01");
//		livro.setEditora(editora);
//		livro.setAutor(autor);
//		livro.setDisciplina(disciplina);
//		
//		LivroDao dao  = new LivroDao();
//		dao.add(livro);
		
		Exemplar exemplar = new Exemplar();
//		exemplar.setId(1);
		exemplar.setQuantidade(10);
		exemplar.setLivro(livro);
		
		ExemplarDao exemplarDao = new ExemplarDao();
		exemplarDao.add(exemplar);
		

		
//		EditoraDao editoraDao = new EditoraDao();
//		editoraDao.add(editora);
//		AutorDao autorDao = new AutorDao();
//		autorDao.add(autor);
//		DisciplinaDao discDao = new DisciplinaDao();
//		discDao.add(disciplina);
		
//		Telefone telefone = new Telefone();
//		telefone.setTelefone("83 9654-7901");
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Fulano");
//		cliente.setCpf("054.630.324-24");
//		cliente.setDataNascimento();
//		cliente.seteMail("fulado@teste.com");
//		cliente.setTelefones(telefones);
//		
//		TelefoneDao telDao = new TelefoneDao();
//		telDao.add(telefone);
		
	}

}
