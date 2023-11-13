import java.util.ArrayList;
import java.util.List;

class Pasta implements ComponenteArquivo {
    private String nome;
    private List<ComponenteArquivo> componentes;

    public Pasta(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public void adicionarComponente(ComponenteArquivo componente) {
        componentes.add(componente);
    }

    public void removerComponente(ComponenteArquivo componente) {
        componentes.remove(componente);
    }

    public void imprimir() {
        System.out.println("Pasta: " + nome);
        System.out.println("Conteúdo da pasta:");
        for (ComponenteArquivo componente : componentes) {
            componente.imprimir();
        }
    }
}