package main;
import main.ListeIterator;
import main.OrdnetLenkeliste;

public	class Legeliste extends OrdnetLenkeliste<Lege> {
	   private static Legeliste instance = new Legeliste();
	   
	   public static Legeliste getInstance()
	   {
		   return instance;
	   }
	   
	public Lege finnLege(String navn) 
	{
		boolean notFound;
		ListeIterator<Lege> iterator;
		Lege lege;
		lege = null;
		notFound = true;
		iterator = listeIterator();
		
		while (iterator.hasNext() && notFound)
		 {
			
	       lege= iterator.next();
		
		   if (navn.equals(lege.hentNavn()))
			   notFound =false;
		  }
		if (!notFound)
		    return lege;
		else
			return null;
	 }

	
	 public String[] stringArrayMedNavn() 
	 {
	          ListeIterator<Lege> iterator;
	          String [] stringArray;
	          int index;
	         
	          index = 0;
	          stringArray = new String[this.storrelse()];
	          iterator = listeIterator();
	          
	          while (iterator.hasNext())
	    		 {	
	        	  stringArray[index] = iterator.next().hentNavn();
	        	  index++;
	    		 }
	          return stringArray;
	   }
	}
	

