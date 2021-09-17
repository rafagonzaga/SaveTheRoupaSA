import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    private Map<Integer, List<Peca>> secoes = new HashMap<>();
    private Integer identificadorAtual = 0;

    public Integer guardarPecas(List<Peca> listaDePecas) {
        identificadorAtual += 1;
        secoes.put(identificadorAtual , listaDePecas);
        return identificadorAtual;
    }

    public void mostrarPecas(){
        for(Integer chave : secoes.keySet()){
            mostrarPecas(chave);
        }
    }

    // Sobrecarca do método que estava definido acima.
    public void mostrarPecas(Integer chave) {
        List<Peca> pecas = secoes.get(chave);
        System.out.println("Chave: " + chave);
        for(Peca peca : pecas) {
            System.out.println(peca);
        }
    }

    public void devolverPecas(Integer chave) {
        secoes.remove(chave);
    }

    public Integer getIdentificadorAtual() {
        return identificadorAtual;
    }

    public void setIdentificadorAtual(Integer identificadorAtual) {
        this.identificadorAtual = identificadorAtual;
    }
}
