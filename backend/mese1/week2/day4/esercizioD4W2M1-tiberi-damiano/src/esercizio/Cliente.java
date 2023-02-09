package esercizio;

public class Cliente {
	
	private Long id;
	private String nome;
	private Integer livello;
	
	public Cliente(Long id, String nome, Integer livello) {
		this.id = id;
		this.nome = nome;
		this.livello = livello;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getLivello() {
		return livello;
	}

	public void setLivello(Integer livello) {
		this.livello = livello;
	}

}
