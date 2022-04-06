/**
 * Repraesentiert einen Studenten
 * und erlaeutert einige Java-Grundlagen.
 *
 * In Java gibt es nicht die strikte Trennung zwischen Spezifizierungs- und
 * Implementierungsdateien wie in C++ (.h und .cpp). Es gibt nur eine 
 * .java Datei in der die Methoden deklariert und gleichzeitig implementiert
 * werden.
 * 
 * Alternativ gibt es in Java das Konzept von Interfaces zur Spezifikation
 * und Austauschbarkeit von Klassen. Diese lernen wir spaeter in der 
 * Veranstaltung kennen
 */
public class Student {
	
	/**
	 * Instanzvariable: Existiert fuer jedes erstellte Objekt einmal
	 *
	 * Anmerkung 1: Die Worte Instanz und Objekt sind im Rahmen dieser
	 * Veranstaltung bedeutungsgleich. Siehe auch Skript S.15
	 *
	 * Anmerkung 2: Im Gegensatz zu C++ sind Strings in Java von Beginn
	 * an eingebaute Datentypen
	 *
	 * Anmerkung 3: Die Sichtbarkeiten von Instanzvariablen werden in Java
	 * immer direkt an die Variable geschrieben. Es gibt keine Scopes wie
	 * bei C++. Fehlt die Angabe der Sichtbarkeit, so verwendet der Compiler
	 * die Sichtbarkeit protected (sichtbar fuer: Klassen im selben Package
	 * und erbenden Klassen auch in anderen Packages. Auf Packages in Java
	 * wird noch spaeter in der VL/Uebung eingegangen)
	 * Die Angabe der Sichtbarkeit wird auch als Modifier bezeichnet
	 *
	 * Anmerkung 4: Als Faustregel sollte der Sichtbarkeitsbereich von 
	 * Variablen so eng wie moeglich sein, um unerwartete und unsachgemaesse
	 * Aenderungen an der Variable zu verhindern. Das ist in den 
	 * meisten Faellen die Sichtbarkeit "private"
	 *
	 */
	private String name;

	/**
	 * Instanzvariable, mit final als Konstante (unveraenderlich)
	 * gekennzeichnet.
	 *
	 * Anmerkung: final ist ebenso wie private, public, etc. ein Modifier
	 */
	private final int matrikelnummer;

	/**
	 * Klassenvariable (statische Variable). Existiert genau ein einziges
	 * Mal, unabhaengig von der Anzahl der Instanzen der Klasse die
	 * erstellt wurden
	 */
	private static int hoechsteMatrikelnummer;

	
	/**
	 * Geld des Studenten
	 */
	private int geld;
	
	/**
	 * Der beste Freund des Studenten. 
	 * Instanzvariable auf einen abstrakten Datentyp/ein Objekt
	 */
	private Student besterFreund;
	
	/**
	 * Namen der Kurse die der Student belegt.
	 *
	 * Dies ist ein Array in Java als Instanzvariable. Hier muss noch
	 * keine Array-Groesse angegeben werden, dies geschieht spater in
	 * der Initialisierung im Konstruktor
	 */
	private String[] kurse;
	
	/**
	 * Konstruktor fuer die Klasse mit einem Parameter
	 *
	 * @param name Der Name des Studenten
	 */
	public Student(String name){
		/*
		 * Scoping: Zugriff auf die Instanzvariable "name" durch
		 * Verwendung des Schluesselwortes "this". Mit this wird 
		 * sich immer auf das aktuelle Objekt bezogen an dem die 
		 * Methode (bzw. in diesem Fall der Konstruktor) aufgerufen
		 * wird.
		 * name = name; wuerde zwar valides Java sein, allerdings 
		 * wuerend sich beide Verwendungen von name auf den 
		 * Methodenparameter beziehen
		 */
		this.name = name;

		/*
		 * Zugriff auf Instanzvariable matrikelnummer 
		 * ohne this, da in diesem Fall
		 * keine Überdeckung mit einem Methodenparameter vorliegt.
		 * "this" wird in diesem Fall implizt vom Compiler ergaenzt.
		 * Es kann allerdings auch explizit ausgeschrieben werden, um
		 * den Bezug zur Instanzvariablen deutlich zu machen. Dies
		 * ist eher eine Geschmacksfrage, welche der beiden Varianten
		 * des Codes ein Entwickler besser zu lesen empfindet 
		 * (Kuerze fuer Uebersichtlichkeit vs Explizites Ausschreiben 
		 * um die Bezuege der Variablen deutlicher darzustellen
		 *
		 * Die Klassenvariable hoechsteMatrikelnummer kann direkt 
		 * verwendet werden. Alternative: Klassenname.Klassenvariable,
		 * also in diesem Fall Student.hoechsteMatrikelnummer
		 * */
		matrikelnummer = hoechsteMatrikelnummer;
		Student.hoechsteMatrikelnummer++;

		/*
		 * Initial hat ein neu erstellter Student keinen besten Freund,
		 * deswegen setzen wir diese Referenz explizit auf null
		 */
		this.besterFreund = null;

		this.geld = 0;

		/*
		 * Initialisierung des Arrays Kurse mit einer Groesse von 3
		 * und anschliessender Zuweisung von drei Werten. Falls die
		 * Werte am Anfang bekannt sind, funktioniert auch die 
		 * Schreibweise 
		 * "this.kurse = new String[] {"InfoA", "InfoB", "InfoC"};",
		 * wobei die Laenge dann automatisch bestimmt wird
		 *
		 */
		this.kurse = new String[3];
		this.kurse[0] = "InfoA";
		this.kurse[1] = "InfoB";
		this.kurse[2] = "InfoC";
	}

	
	/**
	 * Beispiel fuer eine Getter-Methode, die dem Caller den Wert einer
	 * Instanzvariablen zurueckgibt
	 *
	 * Die Syntax fuer Methoden in Java ist: 
	 * Modifikatoren + Rueckgabetyp + Signatur
	 *
	 * Die Signatur setzt sich aus dem Namen der Methode und den Methoden-
	 * parametern zusammen
	 *
	 * Der Methodenrumpf sind die tatsaechlichen Anweisungen innerhalb der
	 * Methode ("return this.name") in diesem Beispiel
	 *
	 * Kein Rueckgabetyp: Return-Typ void angeben, z.B.
	 * public void test(){}
	 * @return Den Namen des Studenten
	 *
	 */
	public String getName(){
		return this.name;
	}
	

	/**
	 * @return Die Matrikelnummer des Studenten
	 */
	public int getMatrikelnummer(){
		return this.matrikelnummer;
	}

	
	/**
	 * @return Das Geld des Studenten
	 */
	public int getGeld(){
		return this.geld;
	}
	
	
	/**
	 * Student verdient Geld.
	 * 
	 * Beispiel fuer eine Methode mit einem primitiven Datentyp als 
	 * Methodenparameter. Primitive Datentypen in Java sind:
	 * boolean, byte, char, short, int, long, float, double.
	 * Der Datentyp "String" kann aufgrund seiner immutable Eigenschaft
	 * in den meisten Faellen auch wie ein primitiver Datentyp bei der
	 * Uebergabe von Methodenparametern verwendet werden. Dies werden
	 * wir auf einem der nachfolgenden Aufgabenblaetter noch naeher 
	 * untersuchen
	 *
	 * Primitive Datentypen koennen in Java als Methodenparameter ohne
	 * Seiteneffekte verwendet werden. D.h. Aenderungen am Parameter menge,
	 * wie z.B. "menge+=10;" haben keine Auswirkungen ausserhalb dieser
	 * Methode. (Klassisches call-by-value, bei dem der Methodenparameter
	 * kopiert wird)
	 *
	 *
	 * @param menge Die Menge um die sich das Geld des Studenten erhoehen
	 * soll
	 */
	public void geldVerdienen(int menge){
		this.geld += menge;
	}


	/**
	 * Student gibt Geld aus.
	 * @param menge Die Menge um die sich das Geld des Studenten verringern
	 * soll
	 */
	public void geldAusgeben(int menge){
		this.geld -= menge;
	}

	
	/**
	 * Gibt den besten Freund zureck
	 * @return Den besten Freund
	 */
	public Student getBesterFreund(){
		return this.besterFreund;
	}
	
	/**
	 * Setzt den besten Freund
	 * 
	 * Beispiel fuer eine Methode mit einem Objekt als Methodenparameter.
	 * Objekte als Methodenparameter sind in Java von Seiteneffekten 
	 * betroffen. D.h. alle Aenderungen an dem Objekt besterFreund innerhalb
	 * dieser Methode, wie z.B. "neuerBesterFreund.geldBezahlen(100);"
	 * betreffen das Objekt auch ausserhalb dieser Methode.
	 *
	 * Eigentlich nennt man dieses Konzept call-by-reference. Java setzt
	 * jedoch auch hier call-by-value um, allerdings auf eine etwas
	 * kompliziertete Art und Weise. Und zwar wird nicht das Objekt das als
	 * Methodenparameter uebergeben wird kopiert, sondern lediglich die
	 * Referenz auf das Objekt wird kopiert. Dies fuehrt dazu, dass man
	 * innerhalb der Methode "neuerBesterFreund = new Student();" 
	 * seiteneffektfrei aufrufen kann, da die Referenz auf neuerBesterFreund
	 * und die Referenz vom Methodenaufrufer unabhaengig voneinander sind.
	 * Aenderungen am Objekt, wie z.B.
	 * "neuerBesterFreund.geldBezahlen(100);" betreffen aber auch das 
	 * Objekt vom Methodenaufrufer, da die originale Referenz und die 
	 * kopierte Referenz innerhalb der Methode auf dieselbe Speicheradresse
	 * zeigen
	 *
	 * @param neuerBesterFreund Der Student, welcher der neue beste 
	 * Freund sein soll
	 */
	public void setBesterFreund(Student neuerBesterFreund){
		this.besterFreund = neuerBesterFreund;	
	}

	
	/**
	 * Beispiel getter fuer ein Array
	 * @return Die Kurse des Studenten
	 */	
	public String[] getKurse(){
		return this.kurse;
	}
	
	/**
	 * Vergleicht die Kurse des Studenten mit den Kursen von jemand anderem
	 * 
	 * Beispiel fuer eine Methode mit einem Array als Methodenparameter.
	 * Arrays als Methodenparameter sind von Seiteneffekten betroffen,
	 * aehnlich wie Objekte. D.h. 
	 * kurseVonJemandAnderem[0] = "geaendert";
	 * wuerde auch den ersten Eintrag im Array des Aufrufers veraendern
	 *
	 *
	 *
	 * @param kurseVonJemandAnderem Die Kurse des anderen Studenten
	 * @return True falls beide Studenten exakt die selben Kurse belegen
	 */
	public boolean vergleicheKurse(String[] kurseVonJemandAnderem){
		/*
		 * Beispiel Syntax fuer ein if-Statement.
		 * Mit .length hinter einem Array bekommt man die Groesse
		 * eines Arrays
		 */
		if(this.kurse.length != kurseVonJemandAnderem.length){
			return false;
		}	

		/*
		 * Beispiel fuer eine for-Schleife zum Durchlaufen eines Arrays.
		 */
		for(int i = 0; i < kurseVonJemandAnderem.length; i++){
			if(this.kurse[i] != kurseVonJemandAnderem[i]){
				return false;
			}
		}	
		return true;
	}


}
