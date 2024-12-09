public class Squadra {
    private String nome;
    private int goal;
    private int passaggi;

    public Squadra(String nome) {
        this.nome = nome;
        this.goal = 0;
        this.passaggi = 0;
    }

    public void incrementaGoal() {
        goal++;
    }

    public void incrementaPassaggio() {
        passaggi++;
    }

    public String getNome() {
        return nome;
    }

    public int getGoal() {
        return goal;
    }

    public int getPassaggi() {
        return passaggi;
    }

    @Override
    public String toString() {
        return nome + " - Goal: " + goal + ", Passaggi: " + passaggi;
    }
}