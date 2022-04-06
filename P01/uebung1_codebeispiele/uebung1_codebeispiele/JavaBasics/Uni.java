/*
 * Am Anfang einer .java Datei koennen "import" Statements stehen,
 * die im Wesentlichen die Funktion von include Statements erfuellen
 */


/**
 * Zeigt einige Java-Grundlagen.
 * Beherbergt zudem die main-Methode, d.h. die Methode die Java am Anfang
 * eines Programmstarts ausfuehrt
 *
 * Zum Ausfuehren:
 * javac Student.java
 * javac Uni.java
 * java Uni
 *
 * Nacheinander auf der Konsole eingeben. Die javac Befehle zum Kompilieren
 * koennen auch kombiniert werden: javac Student.java Uni.java
 */
public class Uni{

	/*
	 * Dies ist die main-Methode in Java.
	 * Das Array args enthaelt Kommandozeilenparameter, sofern diese
	 * beim Start mit uebergeben wurden. Im Gegensatz zu C++ ist 
	 * args[0] nicht der Programmname, sondern bereits der erste
	 * Parameter. D.h. args kann auch die Laenge 0 haben
	 */
	public static void main(String[] args){

		/*
		 * Erzeugung eines neuen Objektes mit dem new-Operator.
		 * Achtung! Im Gegensatz zu C++ hat Java kein delete Statement.
		 * Stattdessen hat Java eine "intelligente" Speicherverwaltung,
		 * die dafuer sorgt das der Speicher von nicht mehr benoetigten
		 * Objekten automatisch freigegeben wird. Ein Objekt wird u.a.
		 * als nicht mehr benoetigt angesehen, wenn der Scope in dem
		 * das Objekt angelegt wurde verlassen worden ist (und auch 
		 * keine Referenz auf das Objekt nach aussen gegeben wurde). 
		 * Eine weitere Moeglichkeit besteht darin, dass die Referenz 
		 * des Objekts auf null gesetzt wird. 
		 *
		 * Naeheres hierzu nehmen wir im Rahmen des Garbage Collectors
		 * auf dem zweiten Uebungsblatt durch
		 */
		Student student1 = new Student("Student1");
		Student student2 = new Student("Student2");
		
		/*
		 * Gibt die Matrikelnummern der Studenten auf der Konsole aus.
		 * In Java erfolgen alle Methodenaufrufe mit einem dot (.)
		 * Einen Pfeil (->) wie in C++ gibt es nicht.
		 *
		 * Zahlen oder Variablen koennen uber den "+" Operator an einen
		 * String angefuegt werden
		 */
		System.out.println("Matrikelnummer " + student1.getName() + 
				": "+ student1.getMatrikelnummer());
		System.out.println("Matrikelnummer " + student2.getName() + 
				": "+ student2.getMatrikelnummer());

	}



}
