package pg;

// Classe Main per testare i personaggi
public class MainPg {

    public static void main(String[] args) {
        Pg BlackMage = new Pg("Pier", 1600, 40);
        Pg WhiteMage = new Pg("Haku", 400, 20);

        BlackMage.Danno(3000); // infligge danno al BlackMage
        WhiteMage.Cura(600);   // cura il WhiteMage
    }
}
