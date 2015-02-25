package br.ufpb.poo.projetoPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaQuiz {
	List<Exercicio> exercicios;
	List<Aluno> aluno;
	List<Professor>prof;

	public SistemaQuiz(){
		exercicios=new ArrayList<Exercicio>();
		aluno=new ArrayList<Aluno>();
		prof=new ArrayList<Professor>();
	}
	public void cadastraExercicio(Exercicio exer){
		this.exercicios.add(exer);
	}
	public Exercicio pesquisaExercicio(int codigo)throws ExercicioInexistente{
		for(Exercicio e:exercicios){
			if(e.getCod()==codigo){
				return e;
			}
		}
		throw new ExercicioInexistente("Inexistente Exercicio com o Codico Passado");
	} 
	
	public void atualizarExercicio(){
		
	}
	
	public String corrigirExercicio(int codigo) throws ExercicioInexistente{
		Exercicio e=this.pesquisaExercicio(codigo);
		String resultado="";
		
		
		return resultado;
	}
	
	public void sortearExercicio(){
		int num=this.exercicios.size();
		Random random=new Random();
		for(Aluno alun:aluno){
			int numSorteado=random.nextInt(num);
			alun.setExer(exercicios.get(numSorteado));
		}
	}
	
	public void cadastraAluno(Aluno aluno)throws AlunoJaCadastrado{
		for(Aluno a: this.aluno){
			if(a.getMatricula()==aluno.getMatricula()){
				throw new AlunoJaCadastrado("Aluno ja cadastrado");
			}
			this.aluno.add(a);
		}
	}
	
	public Aluno pesquisaAluno(int matricula)throws AlunoInexistente{
		for(Aluno a:aluno){
			if(a.getMatricula()==matricula){
				return a;
			}
		}
		throw new AlunoInexistente("Inexistente aluno com est� matricula");
	}
	
	public void cadastraProfessor(Professor prof)throws ProfessorJaCadastrado{
		for(Professor p: this.prof){
			if(p.getMatricula()==prof.getMatricula()){
				throw new ProfessorJaCadastrado("Professor ja cadastrado");
			}
			this.prof.add(p);
		}
	}
	
	public Professor pesquisaprofessor(int matricula)throws professorInexistente{
		for(Professor P:prof){
			if(P.getMatricula()==matricula){
				return P;
			}
		}
		throw new professorInexistente("Inexistente professor com est� matricula");
	}
	
	
}


/*	+ 10-Pesquisar exerc�cio
	+ 1-Cadastrar Exerc�cio
	+ 11-Sortear exerc�cio
	  12-Atualizar exerc�cio (editar o exerc�cio, alterando seu texto ou suas quest�es)
	  '13-Corrigir exerc�cio (verificar se as respostas do aluno est�o corretas)
	 * 9-Pesquisar quest�o de exerc�cio
	  remover Exercicio
	  */

