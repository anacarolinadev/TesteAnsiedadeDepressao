package br.edu.ifsp.testepsi;


	public class Depressao extends TestePsicologico {
	    public Depressao(int[] respostas) {
	        super("Depressao", respostas);
	    }

	    @Override
	    public String interpetarResultado() {
	        int total = super.somarPontos();
	        if (total >= 30) return "ALTERAÇÕES SIGNIFICATIVAS DETECTADAS (recomenda-se tratamento)";
	        else if (total >= 15) return "ALTERAÇÕES DETECTADAS (recomenda-se investigação)";
	        else return "ALTERAÇÕES NÃO DETECTADAS";
	    }
	}

