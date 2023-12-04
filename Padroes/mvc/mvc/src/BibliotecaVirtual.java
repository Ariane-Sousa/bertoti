import java.util.ArrayList;
import java.util.List;

public class BibliotecaVirtual implements Subject {
    private List<Livro> livros = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List encontrados) {
        for (Observer observer : observers) {
            observer.update(encontrados);
        }
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        notifyObservers(livros);
    }

    public void buscarLivro(Livro livro) {
        // Lógica da busca de livro
        List<Livro> encontrados = new ArrayList<>();
        for (Livro l : livros) {
            if (l.matches(livro)) {
                encontrados.add(l);
            }
        }
        notifyObservers(encontrados);
    }
}