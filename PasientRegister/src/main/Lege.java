package main;
import main.Koe;

public class Lege implements Comparable<Lege>{
   
	String navn;
	Koe<Resept> reseptliste;
	public Lege(String navn) 
	{
		    reseptliste = new Koe<Resept>();
		    this.navn = navn;
	 }
	
	
	public String hentNavn()
	{ 
		   return navn;
	 }
	
	
    public int compareTo(Lege annenLege)  
     { 
    	   if (this.navn.equals(annenLege.hentNavn()))
    		return 0; 
          else
        	return 1;
     }
    
    
    public void leggTilResept(Resept resept) 
     { 
    	    reseptliste.settInn(resept);
     }
    
    
    public Koe<Resept> hentReseptliste() 
     { 
    	return reseptliste;
     }
    
    
    public String toString()  
       {
    	    return hentNavn(); 
       }


}
