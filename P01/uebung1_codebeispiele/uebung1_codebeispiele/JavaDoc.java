

/**
 * Diese Klasse demonstriert die Verwendung von JavaDoc. JavaDoc-Kommentare 
 * sollten vor jeder Klasse, jedem Attribut und jeder Methode stehen. Lokale
 * Variabeln benoetigen kein JavaDoc.
 * Erzeugung von Dokumentation mit javadoc -d <outputDir> <inputDir>
 * @author Lars Huning
 *
 */
public class JavaDoc {

	
	/**
	 * Beispiel JavaDoc für ein Attribut. Hier wird beschrieben was die Variable
	 * repräsentiert / wozu sie im Programm genutzt wird
	 */
	private int eineZahl;
	
	
	/**
	 * Beispiel JavaDoc für eine Methode. Hier wird generelles zur Methode
	 * geschrieben,  was sie tun soll, etc. Anschließend werden die Parameter
	 * näher erläutert, sowie was die Funktion zurückliefert.
	 * 
	 * Funktion der Methode: Addiert das Attribut zahl mit einem Parameter
	 * und liefert das berechnete Ergebnis zurueck
	 * 
	 * @param andereZahl Die Zahl die zum Attribut eineZahl addiert werden soll
	 * @return Die Summe von this.eineZahl und dem Parameter andereZahl
	 */
	public int doSomething(int andereZahl) {
		return this.eineZahl + andereZahl;
	}
}
