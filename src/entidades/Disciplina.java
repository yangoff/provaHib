package entidades;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Disciplina {
	@Id
	@GeneratedValue
	@Column(name="id_disciplina")
	private int codigo;
	private String pre_requisito;
	private String conteudo;
	private String nome;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPre_requisito() {
		return pre_requisito;
	}
	public void setPre_requisito(String pre_requisito) {
		this.pre_requisito = pre_requisito;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
