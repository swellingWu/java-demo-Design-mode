package 使用Java自带;

public interface ISubject {
    void registObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}