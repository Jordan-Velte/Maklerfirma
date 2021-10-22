/*UML
    Haus: int Preis, int Stockwerke, int Quadratmeter, tring Beschreibung, String Titel
    Wohnung: int Preis, int Quadratmeter, String Beschreibung, String Titel
    Makler: String Vorname, String Nachname
    Kaeufer: String Vorname, String Nachname
    Verkauf: Haus _haus, Wohnung, _wohnung, Makler _makler, Kaeufer _kaeufer, */


public class Verkauf {
    Haus _haus;
    Wohnung _wohnung;
    Kaeufer _kaeufer;
    Makler _makler;


    //Constructor für Haus
    public Verkauf(Haus haus, Kaeufer kaeufer, Makler makler){
        setHaus(haus);
        setKaeufer(kaeufer);
        setMakler(makler);
    }

    //Constructor für Wohnung
    public Verkauf(Wohnung wohnung, Kaeufer kaeufer, Makler makler){
        setWohnung(wohnung);
        setKaeufer(kaeufer);
        setMakler(makler);
    }

    public void setHaus(Haus haus) {
        this._haus = haus;
    }
    public void setKaeufer(Kaeufer kaeufer) {
        this._kaeufer = kaeufer;
    }
    public void setMakler(Makler makler) {
        this._makler = makler;
    }
    public void setWohnung(Wohnung wohnung) {
        this._wohnung = wohnung;
    }
    public Haus getHaus() {
        return _haus;
    }
    public Kaeufer getKaeufer() {
        return _kaeufer;
    }
    public Makler getMakler() {
        return _makler;
    }
    public Wohnung getWohnung() {
        return _wohnung;
    }
}
