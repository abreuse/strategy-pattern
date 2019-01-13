package alexis.breuse;

public class Client {
    Livret livret;

    public Client(Livret livret) {
        this.livret = livret;
    }

    public void setLivret(Livret livret) {
        this.livret = livret;
    }

    public double simulateInterest(double amount) {
        return livret.calculateInterest(amount);
    }
}
