
public class MemoriaRam {
	
	int velocidade;
	String tipo;

	public MemoriaRam() {
		this.velocidade = 4600;
		this.tipo = "DDR4";
	}
	
	public MemoriaRam(int velocidade, String tipo) {
		this.velocidade = velocidade;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "MemoriaRam [velocidade=" + velocidade + ", tipo=" + tipo + "]";
	}

}
