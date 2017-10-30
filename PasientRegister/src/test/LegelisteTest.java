package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Lege;
import main.Legeliste;

public class LegelisteTest {
      private static Legeliste legeliste;
      
      @BeforeClass
      public static void setUp()
      {
    	  legeliste=	legeliste.getInstance(); 
      }

	@Test
	public void testFinnLege() {
    legeliste.settInn(new Lege("Lage Lege"));
	assertEquals(legeliste.finnLege("Lage Lege").hentNavn(),"Lage Lege");
	}
	
	@Test
	public void testFinnLegeNotFound() {
    legeliste .settInn(new Lege("Lage Lege"));
	assertNull(legeliste.finnLege("Lage ikke Lege"));
		
	}
	@Test
	public void teststringArray() {
		;
		 legeliste .settInn(new Lege("Otto Lege"));
		 assertArrayEquals(legeliste.stringArrayMedNavn(),new String[]{"Otto Lege","Lage Lege" });
	}
	
}
