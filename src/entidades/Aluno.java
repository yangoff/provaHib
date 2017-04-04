package entidades;

import java.util.Collection;
import javax.persistence.*;
import java.util.Calendar;

@Entity
@SecondaryTable(name="mat_al")
public class Aluno {
	@Id
	@GeneratedValue
	private int matricula;
	private String nome;
	private int rg;
	@Temporal(TemporalType.DATE)
	private Calendar data_nasc;
	private int cpf;
	
	
	private Curso c;
	
	@Column(table="mat_al")
	private Calendar data_matricula;
	
	@OneToOne
	private Endereco en;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public Calendar getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Calendar data_nasc) {
		this.data_nasc = data_nasc;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Curso getC() {
		return c;
	}

	public void setC(Curso c) {
		this.c = c;
	}

	public Calendar getData_matricula() {
		return data_matricula;
	}

	public void setData_matricula(Calendar data_matricula) {
		this.data_matricula = data_matricula;
	}

	public Endereco getEn() {
		return en;
	}

	public void setEn(Endereco en) {
		this.en = en;
	}
	
}
