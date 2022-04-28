package 自定义;

public interface ISubject {
    void registObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}