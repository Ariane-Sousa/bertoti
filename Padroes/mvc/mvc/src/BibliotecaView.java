import java.util.ArrayList;
import java.util.List;

public class BibliotecaView implements Observer {
    private DescontoStrategy descontoStrategy;
    private List<Livro> listaLivros = new ArrayList<>();

    public void calcularDesconto() {
        double total = 0;
        for (Livro livro : listaLivros) {
            total += livro.getPreco();
        }

        double desconto = descontoStrategy.calcularDesconto(total);
        System.out.println("Desconto calculado: " + desconto);
    }

    @Override
    public void update(List items) {
        listaLivros = items;
        calcularDesconto();
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }
}

