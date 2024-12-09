import java.util.Random;

public class Partita extends Thread {
    private Squadra squadra1;
    private Squadra squadra2;
    private long durata;

    public Partita(Squadra squadra1, Squadra squadra2) {
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
        this.durata = 0;
    }

    @Override
    public void run() {
        long inizio = System.currentTimeMillis();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            if (rand.nextInt(2) == 0) squadra1.incrementaGoal();
            if (rand.nextInt(2) == 0) squadra2.incrementaGoal();

            squadra1.incrementaPassaggio();
            squadra2.incrementaPassaggio();
        }

        long fine = System.currentTimeMillis();
        durata = fine - inizio;

        String vincitore;
        if (squadra1.getGoal() > squadra2.getGoal()) {
            vincitore = squadra1.getNome();
        } else if (squadra1.getGoal() < squadra2.getGoal()) {
            vincitore = squadra2.getNome();
        } else {
            vincitore = (squadra1.getPassaggi() > squadra2.getPassaggi()) ? squadra1.getNome() : squadra2.getNome();
        }

        System.out.println("La partita è finita. Durata: " + durata / 1000 + " secondi. Vincitore: " + vincitore);
    }

    public long getDurata() {
        return durata;
    }
}