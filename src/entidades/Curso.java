package entidades;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name="curso")
@SecondaryTable(name="disc_curso")
public class Curso {
	
	@Id
	@GeneratedValue
	@Column(name="id_curso")
	private int codigo;
	@Column(name="nome")
	private String nome;
	@Column(name="cargar_h")
	private int carga_horaria;
	@Column(name="qtde_a")
	private int qtde_alunos;
	
	@Column(table="disc_curso",name="dt_cad")
	private Calendar data_cadastro;
	
	@Column(table="disc_curso",name="resp_cur")
	private String responsavel;
	
	
	@ManyToMany
	@JoinTable(name="disc_p_curso", joinColumns={@JoinColumn(name="id_curso")}, inverseJoinColumns={@JoinColumn(name="id_disciplina")})
	private Collection<Disciplina> dis;


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCarga_horaria() {
		return carga_horaria;
	}


	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}


	public int getQtde_alunos() {
		return qtde_alunos;
	}


	public void setQtde_alunos(int qtde_alunos) {
		this.qtde_alunos = qtde_alunos;
	}


	public Calendar getData_cadastro() {
		return data_cadastro;
	}


	public void setData_cadastro(Calendar data_cadastro) {
		this.data_cadastro = data_cadastro;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public Collection<Disciplina> getDis() {
		return dis;
	}


	public void setDis(Collection<Disciplina> dis) {
		this.dis = dis;
	}

	
	
	
}
