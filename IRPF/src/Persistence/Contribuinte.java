package Persistence;

public class Contribuinte {
	private String nome, cpf;
	private int idade, n_dependent;
	private double cont_prev_ofic;
	private double rendiment;

	public Contribuinte(String name, String c_f, int ida_d, int n_dep) {
		this.nome = name;
		this.cpf = c_f;
		this.idade = ida_d;
		this.n_dependent = n_dep;
	}
	public Contribuinte(String n_ome,  String c_pf) {
		this.nome = n_ome;
		this.cpf = c_pf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public int getN_dependent() {
		return n_dependent;
	}

	public void setN_dependent(int n_dependent) {
		this.n_dependent = n_dependent;
	}

	public void setCont_prev_ofic(double cont_prev_ofic) {
		this.cont_prev_ofic = cont_prev_ofic;
	}

	public void setRendiment(double rendiment) {
		this.rendiment = rendiment;
	}

	public double getCont_prev_ofic() {
		return cont_prev_ofic;
	}

	public double getRendiment() {
		return rendiment;
	}

	public String toString() {
		String msn = "";
		msn = msn + "Nome\t\t\t\tCPF\t\t\t\tIdade\t\tDependentes\t\tRendimentos\n" + nome + "\t\t" + cpf + "\t\t"
				+ idade + "\t\t" + n_dependent + "\t\t\t\t" + rendiment;

		return msn;
	}
}
