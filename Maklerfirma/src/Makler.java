/*UML
    Haus: int Preis, int Stockwerke, int Quadratmeter, tring Beschreibung, String Titel
    Wohnung: int Preis, int Quadratmeter, String Beschreibung, String Titel
    Makler: String Vorname, String Nachname
    Kaeufer: String Vorname, String Nachname
    Verkauf: Haus _haus, Wohnung, _wohnung, Makler _makler, Kaeufer _kaeufer, */


public class Makler {
    String _vorname;
    String _nachname;

    public Makler(String vorname, String nachname){
        setNachname(nachname);
        setVorname(vorname);
    }

    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getVorname() {
        return _vorname;
    }
}
