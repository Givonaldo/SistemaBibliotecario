package br.com.ifpb.main;

import java.util.Calendar;
import java.util.Date;

import br.com.ifpb.modelo.dao.SingleDao;
import br.com.ifpb.modelo.entidades.Curso;
import br.com.ifpb.modelo.entidades.Endereco;
import br.com.ifpb.modelo.entidades.Fone;
import br.com.ifpb.modelo.entidades.SituacaoAluno;
import br.com.ifpb.modelo.entidades.single_table.Aluno_SingleTable;
import br.com.ifpb.modelo.entidades.single_table.Professor_SingleTable;
import br.com.ifpb.modelo.entidades.single_table.TecnicoAdm_SingleTable;

public class TesteHeranca {

    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setDescricao("ADS");
        
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        
        Fone fone = new Fone();
        fone.setTelefone("(83)1122-3344");
        fone.setCelular("(83)9988-7766");
        
        Endereco endereco = new Endereco();
        endereco.setRua("Rua da Alegria");
        endereco.setNumero("007");
        endereco.setBairro("Centro");
        endereco.setCep("58550-000");
        endereco.setCidade("Monteiro");
        endereco.setUf("PB");
        
        //Aluno_Joined aluno = new Aluno_Joined();       
        Aluno_SingleTable aluno = new Aluno_SingleTable();
        //Aluno_Per_Class aluno = new Aluno_Per_Class();
        
        //aluno.setId(1);
        aluno.setNome("Alexandre Azevedo Rodrigues");
        aluno.setMatricula(20150001);
        aluno.setCurso(curso);
        aluno.setSituacao(SituacaoAluno.MATRICULADO);
        aluno.setEndereco(endereco);
        aluno.setFone(fone);

        //Professor_Joined professor = new Professor_Joined();
        Professor_SingleTable professor = new Professor_SingleTable();
        //Professor_Per_Class  professor = new Professor_Per_Class();
        
        //professor.setId(2);
        professor.setNome("Ivo Morais Gomes");
        professor.setMatricula(20151001);
        professor.setAreaDeAtuacao("Cordenação");
        professor.setDataAdmissao(data);
        professor.setEndereco(endereco);
        professor.setFone(fone);

        //TecnicoAdm_Joined tecAdm = new TecnicoAdm_Joined();
        TecnicoAdm_SingleTable tecAdm = new TecnicoAdm_SingleTable();
        //TecnicoAdm_Per_Class tecAdm = new TecnicoAdm_Per_Class();
        
        //tecAdm.setId(3);
        tecAdm.setNome("Bruno Soares Jobs");
        tecAdm.setMatricula(20159001);
        tecAdm.setCargo("Secretário");
        tecAdm.setDataAdmissao(data);
        tecAdm.setEndereco(endereco);
        tecAdm.setFone(fone);

        //JoinedDao dao1 = new JoinedDao();
    	SingleDao dao1 = new SingleDao(); 
        //PerClassDao dao1 = new PerClassDao();  
        //dao1.add(aluno);
        //System.out.println(dao1.read(aluno.getId()));
    	
        //JoinedDao dao2 = new JoinedDao(); 
        SingleDao dao2 = new SingleDao();
        //PerClassDao dao2 = new PerClassDao();  
        dao2.add(professor);
        //System.out.println(dao2.read(professor.getId()));
       
    	//JoinedDao dao3 = new JoinedDao();
    	SingleDao dao3 = new SingleDao(); 
        //PerClassDao dao3 = new PerClassDao();          
        //dao3.add(tecAdm);
        //System.out.println(dao3.read(tecAdm.getId()));
    	
    	
    	    	
        //TecnicoAdm_Per_Class pessoa = new TecnicoAdm_Per_Class();
        //pessoa.setId(3);
//        pessoa.setNome("Fulanos de Talls");
//        pessoa.setMatricula(20150005); 
        
        //PerClassDao dao = new PerClassDao();
        //dao.upDate(pessoa);
        
        //System.out.println(dao.read(pessoa.getId()));

    }
}
