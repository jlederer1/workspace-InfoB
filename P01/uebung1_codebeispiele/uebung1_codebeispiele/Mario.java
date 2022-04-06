

/**
 * Repräsentiert die Spielerfigur in einem Mario-Spiel. 
 * Nutzt X- und Y-Koordinaten für die Figur, kartesisches Koordinatensystem:
 *  ^
 *  |
 *  |
 *  |
 * 0 ---------->
 *  0 
 * @author Lars Huning
 *
 */
public class Mario {
    
    /**
     * X-Position von Mario
     */
    private int x;
    
    /**
     * Y-Position von Mario
     */
    private int y;
    
    
    /**
     * Konstruktor, erstellt eine neue Mario-Instanz und setzt sie
     * in den Ursprung des Koordinatensystems. Beispielhafte Nutzung von Constructor Chaining
     */
    public Mario() {
        this(0,0);
    }
    
    /**
     * Konstruktor, erstellt eine neue Mario Instanz und setzt sie an die angegeben Koordinaten
     * @param x x-Koordinate der neuen Mario Instanz
     * @param y y-Koordinate der neuen Mario Instanz
     */
    public Mario(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Getter für Marios X-Position
     * @return Marios X-Position
     */
    public int getX() {
        return this.x;
    }

    /**
     * Getter für Marios Y-Position
     * @return Marios Y-Position
     */
    public int getY() {
        return this.y;
    }
    
    
    /**
     * Laesst Mario einen Schritt nach rechts im Koordinatensystem machen
     */
    public void rightStep() {
        this.x++;
    }

    
     /**
     * Laesst Mario einen Schritt nach rechts im Koordinatensystem machen.
     * Ohne Auswirkung am linken Rand des Koordinatensystems.
     */
    public void leftStep() {
        if(this.x > 0) {
            this.x--;
        }
    }
    
    /**
     * Mario wird im Koordinatensystem nach oben versetzt
     */
    public void jump() {
       this.y += 2; 
    }
    
    /**
     * Mario wird im Koordinatensystem nach unten versetzt. Mario kann nicht 
     * tiefer als der Boden (y = 0) fallen
     *
     */
    public void fall() {
        if(this.y >= 2) {
            this.y -= 2;
        }
	else {
            this.y = 0;
	}
    }
}
