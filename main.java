/**
*@author Omar
*@see scheda esercitazione
*/
public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        Squadra squadraA = new Squadra("Squadra A");
        Squadra squadraB = new Squadra("Squadra B");
        Squadra squadraC = new Squadra("Squadra C");
        Squadra squadraD = new Squadra("Squadra D");

        torneo.aggiungiSquadra(squadraA);
        torneo.aggiungiSquadra(squadraB);
        torneo.aggiungiSquadra(squadraC);
        torneo.aggiungiSquadra(squadraD);

        Arbitro arbitro = new Arbitro(torneo);

        arbitro.iniziaTorneo();

        try {
            for (Partita partita : torneo.getPartite()) {
                partita.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        arbitro.terminaTorneo();
    }
}
