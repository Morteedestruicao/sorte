package sorteador.sorte.Model;

public class M_sorte {
    private  int qtdNum;
    private  int numMin;
    private  int numMax;
    private  int[] resultado;

    public M_sorte(int[] resultado) {
        this.resultado = resultado;
    }

    public void setQtdNum(int qtdNum) {
        this.qtdNum = qtdNum;
    }

    public void setNumMin(int numMin) {
        this.numMin = numMin;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public void setResultado(int[] resultado) {
        this.resultado = resultado;
    }

    public int getQtdNum() {
        return qtdNum;
    }

    public int getNumMin() {
        return numMin;
    }

    public int getNumMax() {
        return numMax;
    }

    public int[] getResultado() {
        return resultado;
    }
}
