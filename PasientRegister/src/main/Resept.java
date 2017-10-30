package main;

public abstract class Resept {
	private static int id = 0;
	private Lege lege;
	private Legemiddel legemiddel;
	private int pasientId;
	private int reit;
	private boolean brukt;
	public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit)
	 { 
		id =1;
		this.lege = utskrivendeLege;
		this.legemiddel = legemiddel;
	    this.reit = reit;
	    this.brukt = false; 
	 }

	public int hentId() { return id; }
    public Legemiddel hentLegemiddel() { return legemiddel; }
    public Lege hentLege() { return lege; }
    public int hentPasientId() { return 0; }
    public int hentReit() { return reit; }
    @Override
    
    public String toString()
    { 
    	Lege lege;
    	lege =hentLege();
    	Legemiddel legemiddel; 
    	legemiddel =  this.hentLegemiddel();
    			
    			
    	return hentId() + ";" + lege.hentNavn() + ";" + legemiddel.hentNavn()  + ";" + farge();
    }

    /**
     * Bruker resepten én gang. Returner false om resepten er
     * oppbrukt, ellers returnerer den true.
     * @return      om resepten kunne brukes
     
     * 
     */
    public boolean bruk() { 
    	if ( brukt == false)
    	 { brukt = true;
    	    return true; }
            else return false;
          }
    /**
     * Returnerer reseptens farge. Enten "blå" eller "hvit".
     * @return      reseptens farge
     */
    abstract public String farge();

    /**
     * Returnerer prisen pasienten maa betale.
     * @return      prisen pasienten maa betale
     */
    abstract public double prisAaBetale();

}
