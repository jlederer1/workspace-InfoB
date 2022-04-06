

/**
 * Diese Klasse führt die Standard-Ausgabefunktion System.print() 
 * und verwandte Methoden ein. Aller Output wird in der Konsole angezeigt
 * @author Lars Huning
 *
 */
public class Output {

    public static void main(String[] args) {
        //Ausgabe, danach eine neue Zeile anfangen
        System.out.println("hallo");
        
        //Ausgabe ohne danach eine neue Zeile anzufangen
        System.out.print("Hallo ");
        System.out.print("Welt");
        
        //Expliziter Zeilenumbruch im String mit \n
        System.out.print("\n");
        System.out.print("Ich stehe in einer eigenen Zeile");
        System.out.print("\nMehrere\nZeilenumbrueche\ngehen\nauch\n");
        
        /*
         * Explizite Formatangaben: Ein String mit Format, danach Parameter.
         * %-Zeichen wird als Platzhalter benutzt, der dann von Parametern ersetzt wird
         * Doku: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
         * 
         * Symbole:
         * %s String 
         * %d Dezimalzahl 
         * %f Fließkommazahl 
         * %n Zeilenumbruch 
         * Zahl soviel Zeichen rechtsbündig 
         * -Zahl soviel Zeichen linksbündig 
         * 0Zahl führende nullen 
         * .2 Zwei Zahlen nach dem Komma (analog .3, .4, etc.)
         */
        System.out.printf("Anzahl Studenten %d", 42);
        System.out.printf("|%3d|%-3d|%n", 2, 1);
        System.out.printf("|%.1f|%7.3f|%n", 2.1123, 1.22333);
        System.out.printf("|%03d|%04d|%n", 001, 2);
    }

}
