

/**
 * Eine Testklasse fuer jede Klasse im eigentlichen Programm. Was innerhalb einer Klasse 
 * getestet wird ist letztendlich Entscheidung des Programmierers. 
 * public Methoden sollten 
 * i.d.R. getestet werden, insbesondere deren Grenzfaelle. Zudem empfiehlt
 * es sich alle Verzweigungen von if-Statements explizit zu testen
 *
 *
 * @author Lars Huning
 *
 */
public class TestMario {
    /**
     * Enthaelt die Anzahl der Fehler ueber alle Tests die durchgefuehrt
     * wurden
     */
    private int anzahlFehler;
    
    /**
     * main Methode zum durchfuehren der Tests.
     * Startet alle Tests und gibt die Gesamtanzahl der gefundenen Fehler aus
     * @param args Nicht beruecksichtigt
     */
    public static void main(String[] args) {
        System.out.println("Starte Tests");
        TestMario test = new TestMario();
        test.testAll();
        
        System.out.println(test.getAnzahlFehler() + " Fehler in den Tests");
        System.out.println("Tests abgeschlossen");
    }
    
    
    /**
     * Konstruktor, initialisiert die Anzahl der Fehler mit 0
     */
    public TestMario() {
        this.anzahlFehler = 0;
    }
    
    /**
     * Testet einen booleschen Ausdruck und gibt eine Fehlermeldung aus, 
     * falls dieser nicht gilt. Erhoeht zusaetzlich den Counter fuer die Anzahl
     * der festgestellten Fehler.
     * Convenience-Methode, die es erspart fuer jede Ueberpruefung eine extra 
     * if-Abfrage  schreiben zu müssen. Ähnliche Methoden waeren denkbar 
     * zum Vergleichen von Strings, Integern, Doubles,...
     * Der Name deutet bereits auf Kapitel 4.2 der Vorlesung, 
     * Assertions/Zuweisungen hin. Dort lernen wir noch andere Methoden 
     * zum Testen kennen, die bereits standardmaessig in Java integriert sind
     * 
     * @param statement Der Ausdruck der ueberprueft werden soll
     * @param errorMsg Die Fehlermeldung
     */
    private void assertBool(boolean statement, String errorMsg) {
        if(!statement) {
            this.anzahlFehler++;
            System.out.println(errorMsg);
        }
    }
    
    
    /**
     * 
     * @return Gibt die Anzahl der Fehler die bei den Tests festgestellt
     * wurden zurueck
     */
    public int getAnzahlFehler() {
        return this.anzahlFehler;
    }

    
     /**
     * Methode zum buendeln aller Testfaelle. Haelt die main-Methode
     * uebersichtlicher
     */
    private void testAll() {
        this.testRightStep();
        this.testLeftStep();
    }
    
    /**
     * Einfacher Test. Ueblich: 
     * Methodenname = "test" + Name der Methode die getestet wird
     */
    private void testRightStep() {
        Mario mario = new Mario();
        int start = mario.getX();
        mario.rightStep();
        mario.rightStep();
        assertBool(mario.getX() == start + 2, "Fehler in stepRight()");
    }
    
    /**
     * Test abhaengig vom Kontext
     * Mario startet am linken Bildschirmrand bei x = 0
     * --> stepLeft darf dort nicht funktionieren
     */
    private void testLeftStep() {
        Mario mario = new Mario();
        mario.leftStep();

	//Teste nicht ausgeschriebenen "else" Fall vom if
        assertBool(mario.getX() >= 0, "Mario laueft aus dem linken Bildschirmrand");

	//Teste den anderen Teil vom if
	mario.rightStep();
	mario.rightStep();
	mario.leftStep();
	assertBool(mario.getX() == 1, "Fehler in testLeftStep()");
        
    }
    
    
    
    /**
     * Weitere Tests fuer jump(), fall()... --> Achtung z.B. bei den Ausnahmefaellen von fall()!
     * Mario darf nicht in den negativen Y-Bereich des Koordinatensystems fallen!
     */
   
    
    
}
