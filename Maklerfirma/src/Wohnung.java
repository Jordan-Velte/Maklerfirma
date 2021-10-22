/*UML
    Haus: int Preis, int Stockwerke, int Quadratmeter, tring Beschreibung, String Titel
    Wohnung: int Preis, int Quadratmeter, String Beschreibung, String Titel
    Makler: String Vorname, String Nachname
    Kaeufer: String Vorname, String Nachname
    Verkauf: Haus _haus, Wohnung, _wohnung, Makler _makler, Kaeufer _kaeufer, */


public class Wohnung {
    int _preis;
    int _quadratmeter;
    String _beschreibung;
    String _titel;
    String[] _reservierung;

    public Wohnung(int preis, int quadratmeter, String beschreibung, String titel){
        setBeschreibung(beschreibung);
        setPreis(preis);
        setQuadratmeter(quadratmeter);
        setTitel(titel);
    }
    //Constructor mit Reservierung
    public Wohnung(int preis, int quadratmeter, String beschreibung, String titel, String[] reservierung){
        setBeschreibung(beschreibung);
        setPreis(preis);
        setQuadratmeter(quadratmeter);
        setTitel(titel);
        setReservierung(reservierung);
    }

    //Setter
    public void setBeschreibung(String beschreibung) {
        this._beschreibung = beschreibung;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }
    public void setQuadratmeter(int quadratmeter) {
        this._quadratmeter = quadratmeter;
    }
    public void setTitel(String titel) {
        this._titel = titel;
    }
    public void setReservierung(String[] reservierung) {
        this._reservierung = reservierung;
    }
    //Getter
    public String getBeschreibung() {
        return _beschreibung;
    }
    public int getPreis() {
        return _preis;
    }
    public int getQuadratmeter() {
        return _quadratmeter;
    }
    public String getTitel() {
        return _titel;
    } 
    public String[] getReservierung() {
        return _reservierung;
    }
}
