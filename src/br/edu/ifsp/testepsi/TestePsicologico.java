package br.edu.ifsp.testepsi;


public abstract class TestePsicologico {
    private String nomeTeste;
    private int[] respostas;

    public TestePsicologico(String nomeTeste, int[] respostas) {
        this.nomeTeste = nomeTeste;
        this.respostas = new int[respostas.length];
        System.arraycopy(respostas, 0, this.respostas, 0, respostas.length);
    }

    public String getNomeTeste() { return nomeTeste; }
    public void setNomeTeste(String nomeTeste) { this.nomeTeste = nomeTeste; }

    public int[] getRespostas() {
        int[] copia = new int[this.respostas.length];
        System.arraycopy(this.respostas, 0, copia, 0, this.respostas.length);
        return copia;
    }

    public void setRespostas(int[] respostas) {
        this.respostas = new int[respostas.length];
        System.arraycopy(respostas, 0, this.respostas, 0, respostas.length);
    }

    protected int somarPontos() {
        int total = 0;
        for (int v : respostas) total += v;
        return total;
    }

    public String resumo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do teste: ").append(nomeTeste).append("\n");
        sb.append("Respostas (pontos): ").append(java.util.Arrays.toString(respostas)).append("\n");
        sb.append("Soma pontos: ").append(somarPontos()).append("\n");
        sb.append("Interpretação (polimórfica): ").append(interpetarResultado()).append("\n");
        return sb.toString();
    }

    public abstract String interpetarResultado();
}


