package questao03;

public class DVD {
	
	private boolean estado; //receberá	o	valor	true	quando	o	DVD	estiver	ligado,	e	false	em	caso	contrário.	Defina,	na	classe	DVD,	duas  constantes	booleanas:	LIGADO	=	true	e	DESLIGADO	=	false.
	private String operacaoEmExecucao; //	receberá	um	dos	valores	prédefinidos	(ver	tabela	abaixo)	de	acordo	com	a	operação	que	estiver	sendo	realizada	pelo	DVD
	private static final String PARADO = "PARADO";
	private static final String REPRODUZINDO = "REPRODUZINDO O DVD...";
	private static final String EM_PAUSA = "REPRODUÇÃO DO DVD EM PAUSA...";
	private static final String VOLTANDO = "VOLTANDO O DVD...";
	private static final String AVANCANDO = "AVANÇANDO O DVD...";
	
	public DVD() {
		super();
		this.estado = false;
		this.operacaoEmExecucao = this.PARADO;
	}

	public boolean isEstado() {
		return estado;
	}

	public String getOperacaoEmExecucao() {
		return operacaoEmExecucao;
	}

	public static String getParado() {
		return PARADO;
	}

	public static String getReproduzindo() {
		return REPRODUZINDO;
	}

	public static String getEmPausa() {
		return EM_PAUSA;
	}

	public static String getVoltando() {
		return VOLTANDO;
	}

	public static String getAvancando() {
		return AVANCANDO;
	}
	
	public void ligar() {
		this.estado = true;
		this.operacaoEmExecucao = this.getParado();
	}
	
	public void desliga() {
		this.estado = false;
		this.operacaoEmExecucao = this.getParado();
	}
	
    public void play() {
    	if(this.estado == true) {
    		this.operacaoEmExecucao = this.getReproduzindo();
    	}
    }
    
    public void stop() {
    	if(this.estado == true) {
    		this.operacaoEmExecucao = this.getParado();
    	}
    }
	
    public void pause() {
    	if(this.estado == true) {
    		this.operacaoEmExecucao = this.getEmPausa();
    	}
    }
    
    public void volta() {
    	if(this.estado == true) {
    		this.operacaoEmExecucao = this.getVoltando();
    	}
    }
    
    public void avanca() {
    	if(this.estado == true) {
    		this.operacaoEmExecucao = this.getAvancando();
    	}
    }
}
