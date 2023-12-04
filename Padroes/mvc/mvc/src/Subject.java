import java.util.ArrayList;
import java.util.List;

interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(List encontrados);
}