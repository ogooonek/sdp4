package t1;
import java.util.List;
import java.util.ArrayList;


class Order {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Статус заказа изменен на: " + status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}