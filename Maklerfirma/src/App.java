public class App {
    
    /*
    Aufgabe 1)
    
    OOP steht für objektorientierte Programmierung. Das bedeutet, dass man versucht, die reale Welt bestmöglich in virtuellem Code abbzubilden. In unserem Beispiel nutzen wir eine Maklerfirma und bilden jene in unserem Java OOP Code ab. Es gibt sowohl Klassen, Objekte und Eigenschaften. Klassen sind sogenannte Baupläne für Objekte: d.h. z.B. anhand einer Klasse Makler werden bestimmte Eigenschaften, die jener haben muss, beziehungsweise kann (!) (vgl. mehrere Constructoren möglich) festgelegt (siehe Vorname, Nachname) --> jeder Makler muss in diesem Fall einen Vor- und Nachnamen haben. Aus diesen Klassen kann man unendlich viele Objekte (Instanzen) erzeugen. In diesem Fall werden die zuvor initialisierten Eigenschaften (Variablen) deklariert, also einen spezifischen Wert zugeordnet --> ein Makler kann zum Beispiel Franz Müller heißen. Dementsprechend sind Objekte Instanzen von Klassen. Die Eigenschaften können verschiedene Datentypen haben: Eine ganzzahlige Zahl hat z.B. den Datentyp Integer und eine Zeichenkette den Datentyp String (z.B. macht für die Variable Vorname der Klasse Makler der Datentyp String Sinn, da wir eine Zeichenkette vorfinden und wir nicht mit dieser in unserem Programm rechnen müssen --> nur Ausgabe nötig). Der Verkauf hat als Variablen die Eigenschaften der Klassen Haus, Wohnung, Makler, Kauefer --> entsprechend ein Verweis, um einzelne Objekte anderer Klasse in einem Element des Arrays Verkauf zu speichern!
    Konkret müssen folgende Klassen mit jenen Eigenschaftten erstellt werden: 

    Schema: 
    Klasse: Datentyp m Eigenschaft_n1, Datentyp n Eigenschaft_n2 

    Haus: int Preis, int Stockwerke, int Quadratmeter, String Beschreibung, String Titel
    Wohnung: int Preis, int Quadratmeter, String Beschreibung, String Titel
    Makler: String Vorname, String Nachname
    Kaeufer: String Vorname, String Nachname
    Verkauf: Haus _haus, Wohnung, _wohnung, Makler _makler, Kaeufer _kaeufer, 
    */
    

    //Aufgabe 3)
    static Haus[] _haus;
    static Kaeufer[] _kaeufer;
    static Wohnung[] _wohnung;
    static Makler[] _makler;
    static Verkauf[] _verkauf;
    
    public static void main(String[] args) throws Exception {
        _haus = new Haus[30];
        _kaeufer = new Kaeufer[30];
        _wohnung = new Wohnung[30];
        _makler = new Makler[30];
        _makler[0] = new Makler("Ferdinand", "Peters");
        _kaeufer[0] = new Kaeufer("Gustav", "Ganz");
        _kaeufer[1] = new Kaeufer("Gustaf", "Nichtganz");
        _haus[0] = new Haus(150000, 150, "Altbau in moderner Lage mit schönem Dach", "Altbau-Traum");
        _wohnung[0] = new Wohnung(5000000, 300, "Moderne Wohnung in bester Lage an der Alster", "Alster-Himmel");
        _verkauf = new Verkauf[30];
        _verkauf[0] = new Verkauf(_haus[0], _kaeufer[0], _makler[0]);
        _verkauf[1] = new Verkauf(_wohnung[0], _kaeufer[1], _makler[0]);

        //Aufgabe 4.2
        
        //Hier muss eigentlich das Array per Punktnotation an den Objekten aufgerufen werden :/
        //Reservierung
        //Haus
        System.out.println("Haus " + _haus[0].getTitel() + " reserviert von Makler " + _makler[0].getVorname() + " " + _makler[0].getNachname() + " für Käufer " + _kaeufer[0].getVorname() + " " + _kaeufer[0].getNachname() + ".");
        //Wohnung
        System.out.println("Wohnung " + _wohnung[0].getTitel() + " reserviert von Makler " + _makler[0].getVorname() + " " + _makler[0].getNachname() + " für Käufer " + _kaeufer[1].getVorname() + " " + _kaeufer[1].getNachname() + ".");
        
        
        //Verkauf
        //Haus
        System.out.println("Haus " + _verkauf[0]._haus.getTitel() + " verkauft von Makler " + _verkauf[1]._makler.getVorname() + " " + _verkauf[0]._makler.getNachname() + " an Käufer " + _verkauf[0]._kaeufer.getVorname() + " " + _verkauf[0]._kaeufer.getNachname() + ".");
        //Wohnung
        System.out.println("Wohnung " + _verkauf[1]._wohnung.getTitel() + " verkauft von Makler " + _verkauf[1]._makler.getVorname() + " " + _verkauf[1]._makler.getNachname() + " an Käufer " + _verkauf[1]._kaeufer.getVorname() + " " + _verkauf[1]._kaeufer.getNachname() + ".");

    }


    //Aufgabe 4.1
    /*
    Hier empfiehlt sich eine zusätzliche Deklaration einer Variable in der Klasse Wohnung/Haus. Diese sollte ein Array sein, um mehrere Objekte Kaeufer in einem Array zu bündeln (also dem Array zu übergeben). Die jeweiligen Eigenschaften der Elemente (sozusagen die Reservierungs-Liste) könnte man dann über die Getter-Methode an den jeweiligen Objekten der Klasse Haus/Wohnung ausgeben lassen. Auf der anderen Seite könnte man das obig beschreibene Prozedere aber auch über die Klasse Verkauf realisieren. Des Weiteren lässt sich über eine For-Each Schleife eine Variable i=0 initialisieren, welche dann mit der Bedingung dass die Elemente des Arrays nicht null sind, die Anzahl der Reservierungen innerhalb des jeweiligen Arrays ausgibt (i= der Index, welcher solange die Bedingung erfüllt ist, um eins erhöht wird --> i++;).
    Per If-Bedingung lässt sich dann prüfen ob es sich um eine Wohnung oder ein Haus handelt, sodass der Ausgabetext dann entsprechend für die Immobilie angepasst wird!
    Das Array sollte per Punktnotation an den Objekten der Klasse aufgerufen werden.
    */
}
