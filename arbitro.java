public class Arbitro {
    private Torneo torneo;

    public Arbitro(Torneo torneo) {
        this.torneo = torneo;
    }

    public void iniziaTorneo() {
        System.out.println("output C");
        System.out.println("Il torneo sta iniziando");
        torneo.inizia();
    }

    public void terminaTorneo() {
        System.out.println("Il torneo è terminato");
        torneo.termina();
    }
}