import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        GuardaVolumes guardaVolumes = new GuardaVolumes();

        // Criando 1a peça
        List<Peca> lista1 = new ArrayList<>();
        Peca peca1 = new Peca();
        peca1.setMarca("Hering");
        peca1.setModelo("Camiseta");

        // Criando 2a peça
        Peca peca2 = new Peca();
        peca2.setMarca("Hering");
        peca2.setModelo("Bermuda");

        // Criando 3a peça
        List<Peca> lista2 = new ArrayList<>();
        Peca peca3 = new Peca();
        peca3.setMarca("Hering");
        peca3.setModelo("Top");

        // Criando 2a peça
        Peca peca4 = new Peca();
        peca4.setMarca("Hering");
        peca4.setModelo("Saia");

        lista1.add(peca1);
        lista1.add(peca2);

        lista2.add(peca3);
        lista2.add(peca4);


        Integer chave1 = guardaVolumes.guardarPecas(lista1);
        Integer chave2 = guardaVolumes.guardarPecas(lista2);
        System.out.println("Chave: " + chave1);
        System.out.println("Chave: " + chave2);

        guardaVolumes.mostrarPecas();
        guardaVolumes.mostrarPecas(1);
        guardaVolumes.mostrarPecas(2);

        System.out.println("Removendo peças...");
        guardaVolumes.devolverPecas(1);
        System.out.println("Mostrando as peças ainda armazenadas:");
        guardaVolumes.mostrarPecas();




    }
}
