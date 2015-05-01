package br.com.ifpb.main;

import br.com.ifpb.modelo.dao.EditoraDao;
import br.com.ifpb.modelo.dao.LivroDao;
import br.com.ifpb.modelo.entities.Editora;
import br.com.ifpb.modelo.entities.Livro;


public class TesteSistemaBibliotecario {

	public static void main(String[] args) throws Exception {
//		Editora editora = new Editora();
//		editora.setId(1);
		//editora.setNome("Abril");
		
//		Livro livro = new Livro();
//		livro.setId(1);
//		livro.setTitulo("A cabana");
//		livro.setAno("2001");
//		livro.setIsbn("12345678-01");
//		livro.setEditora(editora);
		
		
		//editora.setLivros(livro);
		
//		LivroDao dao  = new LivroDao();
//		dao.add(livro);
//		System.out.println(dao.read(livro.getId()));
		//dao.remove(livro);
		//dao.upDate(livro, 2);
		
		EditoraDao editoraDao = new EditoraDao();
//		editoraDao.add(editora);
		System.out.println(editoraDao.read(1).getLivros());
	}

}
