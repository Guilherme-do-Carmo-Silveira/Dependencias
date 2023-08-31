
public class Processador {
	
	double velocidade;
	double frequencia;
	String socket;
	

	public Processador() {
		this.velocidade = 3.4;
		this.frequencia = 8.0;
		this.socket = "LGA";
	}
	
	public Processador(double velocidade, double frequencia, String socket) {
		this.velocidade = velocidade;
		this.frequencia = frequencia;
		this.socket = socket;
	}

}
