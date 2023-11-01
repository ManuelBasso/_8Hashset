public class Articolo {
    private int prezzo;
    private String nome;

    public Articolo(int prezzo, String nome) {
        this.prezzo = prezzo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "prezzo=" + prezzo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
