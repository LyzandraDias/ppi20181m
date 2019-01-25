package academia.models;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Pagamento {

	private int id;
	private Aluno aluno;
	private Treinos treino;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataPagamento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Treinos getTreino() {
		return treino;
	}
	public void setTreino(Treinos treino) {
		this.treino = treino;
	}
	public Calendar getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	

	


	
	
	
	
	
}
