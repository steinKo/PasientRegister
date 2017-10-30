package main;

public abstract class  Legemiddel {
	private String navn;
	private static int id= 0;
	private double pris;
	private double virkestoff;
	
	
	public Legemiddel(String navn, double pris, double virkestoff)
    {
	   this.navn = navn;
	   this.pris = pris;
	   id = id +1;
	   this.virkestoff= virkestoff;
	}
	
	
	public int hentId() 
	{ 
		return id; 
	}
	
	
    public String hentNavn() 
    { 
    	return navn; 
    }
    
    
    public double hentPris() 
    { 
    	return pris; 
    }
    
    
    public double hentVirkestoff() 
    { 
    	return virkestoff; 
    }
    
    
    @Override
    public String toString() 
    { 
    	return hentNavn();  
    }

}
