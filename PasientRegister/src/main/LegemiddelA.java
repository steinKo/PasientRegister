package main;

public class LegemiddelA extends Legemiddel {
	int styrke;
	public LegemiddelA(String navn, double pris, double virkestoff, int styrke) {
		super(navn,pris,virkestoff);
		this.styrke = styrke;

	}

	public int hentNarkotiskStyrke() { return styrke; }
}
