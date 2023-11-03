package resources;

public class Guest {
    private String name;
    private String email;
    private int numeroQuarto;

    public Guest(String name, String email, int numeroQuarto) {
        this.name = name;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    @Override
    public String toString() {
        return getNumeroQuarto() + ": " + getName() + ", " + getEmail();
    }
}
