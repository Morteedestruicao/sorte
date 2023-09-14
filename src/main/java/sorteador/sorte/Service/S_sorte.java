package sorteador.sorte.Service;

import sorteador.sorte.Model.M_sorte;

public class S_sorte {

    public static M_sorte Sortear(int qtdNum,
                                  int numMin,
                                  int numMax) {
        int[] resultado = new int[qtdNum];
        for (int i = 0; i < qtdNum; i++) {
            resultado[i] = (int) Math.floor(Math.random() * ((numMax + 1) - numMin) + numMin);
        }
        M_sorte m_sorte = new M_sorte(resultado);

        return m_sorte;
    }
}
