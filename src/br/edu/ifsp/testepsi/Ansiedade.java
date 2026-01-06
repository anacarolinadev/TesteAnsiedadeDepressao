package br.edu.ifsp.testepsi;


	public class Ansiedade extends TestePsicologico {
	    public Ansiedade(int[] respostas) {
	        super("Ansiedade", respostas);
	    }

	    @Override
	    public String interpetarResultado() {
	        int total = super.somarPontos();
	        if (total >= 30) return "ALTERAÇÕES SIGNIFICATIVAS DETECTADAS (recomenda-se tratamento)";
	        else if (total >= 15) return "ALTERAÇÕES DETECTADAS (recomenda-se investigação)";
	        else return "ALTERAÇÕES NÃO DETECTADAS";
	    }
	}
