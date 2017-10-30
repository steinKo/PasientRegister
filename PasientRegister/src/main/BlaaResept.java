package main;

public class BlaaResept extends Resept {

	public BlaaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit)
	{
		super(legemiddel, utskrivendeLege, reit, reit);
	}

	@Override
	public String farge() 
	{
		return "blå";
	 }

	@Override
	public double prisAaBetale() 
	{
		Legemiddel legemiddel;
		legemiddel = this.hentLegemiddel();
		return legemiddel.hentPris()*0.25;
	}

}
