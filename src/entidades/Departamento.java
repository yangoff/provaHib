package entidades;

import java.util.Calendar;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private int identificacao;
	private String sigla;
	private String descricao;
	
	@OneToMany
	private Collection<Disciplina> discp;
	
	@Temporal(TemporalType.DATE)
	private Calendar data_criacao;

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<Disciplina> getDiscp() {
		return discp;
	}

	public void setDiscp(Collection<Disciplina> discp) {
		this.discp = discp;
	}

	public Calendar getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Calendar data_criacao) {
		this.data_criacao = data_criacao;
	}
	
	
	
}
