package t1;

class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Клиент " + name + " получил уведомление: " + message);
    }
}