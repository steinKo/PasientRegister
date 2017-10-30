package main;
import main.Stabel;

public class Pasient {
	private static int id =0;
	private String navn;
	private long fodselsnummer;
	private String adresse;
	private int postnummer;
	Stabel<Resept> reseptliste;

	public Pasient(String navn, long fodselsnummer, String adresse, int postnummer) {
		this.navn = navn;
		this.fodselsnummer =fodselsnummer;
		this.adresse = adresse;
		this.postnummer = postnummer;
		reseptliste = new Stabel<Resept>();
		id = id +1;
	}
		    public int hentId() { return id;}
		    public String hentNavn() { return this.navn; }
		    public long hentFodselsnummer() { return fodselsnummer;}
		    public String hentGateadresse() { return adresse; }
		    public int hentPostnummer() { return postnummer; }
		    public void leggTilResept(Resept resept) { reseptliste.settInn(resept);}
		    public Stabel<Resept> hentReseptliste() { return reseptliste; }
		    @Override
		    public String toString() { return this.hentNavn(); }
		    

	}


