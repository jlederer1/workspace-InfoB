

/**
 * Diese Klasse zeigt wie man Input in Form von Kommandozeilen-
 * Parametern verarbeitet. Dieser liegt zunächst als String-Array vor. 
 * Eingaben anderer Datentypen muessen anschliessend erst mit den passenden
 * Funktionen geparsed werden.
 * 
 * Zusaetzlich wird die Fehlerbehandlung bzgl. der Anzahl der Argumente 
 * demonstriert.
 * @author Lars Huning
 *
 */
public class Input {

    public static void main(String[] args) {
        
        //Ueberpruefe richtige Anzahl Argumente
        //Fehlerbehandlung je nach Laenge auch in eine Funktion auslagerbar
        if(args.length != 4) {
            //Fehlermeldung
            System.out.println("Ungueltige Anzahl Eingabeparameter");
            
            //Anleitung fuer den Nutzer
            System.out.print("Aufruf mit: ");
            
            //<Wort> ist Platzhalter. Hier ist der erwartete Datentyp genutzt
            //worden, es kann aber auch die semantische Bedeutung sein
            //(Bsp. <Summand1> <Summand2>
            System.out.println("java Input "
                    + "<String> <int> <double> <boolean>");
            
            System.out.println("Beende Programm vorzeitig");
            
            //Terminieren des Programms, da keine sinnvolle Weiterverarbeitung
            //moeglich ist
            System.exit(-1); //-1 ist Standard-Fehlercode
        }
        
        //Umwandeln der Datentypen der Parameter
        String s = args[0];
        int a = Integer.parseInt(args[1]);
        double b = Double.parseDouble(args[2]);
        boolean c = Boolean.parseBoolean(args[3]);
        
    }

}
