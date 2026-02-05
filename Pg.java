package pg;

// Classe che rappresenta un personaggio (Pg)
public class Pg {
    private final String nome;   // nome del personaggio
    private int hp;              // punti vita
    private final int livello;   // livello del personaggio

    // Costruttore
    public Pg(final String nome, final int hp, final int livello) {
        this.nome = nome;
        this.livello = livello;
        this.hp = hp;
    }

    // Getter per hp
    public int getHp() {
        return hp;
    }

    // Getter per livello
    public int getLivello() {
        return livello;
    }

    // Metodo per subire danni
    public void Danno(int danno) {
        if (danno > 0) {
            hp = hp - danno;

            if (hp > 0) {
                System.out.println("Hai subito " + danno + " danni!, ora i tuoi Hp sono:" + hp);
            } else {
                hp = 0;
                System.out.println("Sei morto!");
            }

        } else {
            danno = 0;
            System.out.println("Non hai subito danni!");
        }
    }

    // Metodo per curare il personaggio
    public void Cura(int cura) {
        if (hp > 0) {
            cura = + (hp / 4);
            final int newhp = hp + cura;
            System.out.println("Sei stato curato, hai ottenuto " + cura + " hp!, ora i tuoi hp sono : " + newhp);
        } else {
            System.out.println("Non hai hp per curarti, sei morto");
        }
    }
}
