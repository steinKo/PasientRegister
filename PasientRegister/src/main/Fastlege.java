package main;

public class Fastlege extends Lege{

	private int avtalenummer;

	public Fastlege(String navn, int avtalenummer) 
	{
		super(navn);
		this.avtalenummer= avtalenummer;
		
	}

	public int hentAvtalenummer() 
	{
		return avtalenummer;
	}

}
