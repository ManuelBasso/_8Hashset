import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();

        Articolo art1 = new Articolo(10, "Vino");
        Articolo art2 = new Articolo(1, "Acqua");
        Articolo art3 = new Articolo(3, "Pane");

        //Funzione che restituisce Hashset riempito
        add(lista, art1, art2, art3);
        System.out.println(lista);

        //Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        Articolo art4 = new Articolo(10, "Vino");
        Articolo art5 = art1;

        //Verificare che l' elemento sia parte del Set e stampare il risultato
        System.out.println("Art4 è contenuto in lista? " + lista.contains(art4));
        System.out.println("Art5 è contenuto in lista? " + lista.contains(art5));


        System.out.println("----------------------");
        Set<Integer> lista2 = new HashSet<Integer>(Arrays.asList(3,4,5,6));
        System.out.println(lista2);
        Integer check = 3;
        System.out.println("E' presente " + check + " nella lista? " + lista2.contains(check));

    }

    static void add(Set list, Articolo a, Articolo b, Articolo c) {
        list.add(a);
        list.add(b);
        list.add(c);
    }
}