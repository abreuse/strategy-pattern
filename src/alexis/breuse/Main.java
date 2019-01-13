package alexis.breuse;

public class Main {

    public static void main(String[] args) {
        final double LIVRET_A_INTEREST = 0.75;
        final double LIVRET_JEUNE_INTEREST = 1.50;

	    Livret livretA = n -> n * LIVRET_A_INTEREST / 100;
	    Livret livretJeune = n -> n * LIVRET_JEUNE_INTEREST / 100;

	    Client client = new Client(livretA);
        System.out.println(client.simulateInterest(100));

	    client.setLivret(livretJeune);
        System.out.println(client.simulateInterest(100));
    }
}
