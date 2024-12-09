import java.util.*;

public class Torneo {
    private List<Squadra> squadre;
    private List<Partita> partite;

    public Torneo() {
        this.squadre = new ArrayList<>();
        this.partite = new ArrayList<>();
    }

    public void aggiungiSquadra(Squadra squadra) {
        squadre.add(squadra);
    }

    public void inizia() {
        for (int i = 0; i < squadre.size(); i += 2) {
            if (i + 1 < squadre.size()) {
                Partita partita = new Partita(squadre.get(i), squadre.get(i + 1));
                partite.add(partita);
                partita.start();
            }
        }
    }

    public void termina() {
        System.out.println("Classifica finale:");
        squadre.sort((s1, s2) -> {
            if (s2.getGoal() != s1.getGoal()) {
                return Integer.compare(s2.getGoal(), s1.getGoal());
            }
            return Integer.compare(s2.getPassaggi(), s1.getPassaggi());
        });
        for (Squadra squadra : squadre) {
            System.out.println(squadra);
        }
    }

    public List<Squadra> getSquadre() {
        return squadre;
    }

    public List<Partita> getPartite() {
        return partite;
    }
}