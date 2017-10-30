package test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.HvitResept;
import main.Lege;
import main.Resept;
import main.Koe;


public class LegeTest {
	Lege lege;
	
	@Before
	public void setUp()
	{
		lege = new Lege("Lage Lege");
	}

	@Test
	public void testhentNavn() {
		assertEquals(lege.hentNavn(),"Lage Lege" );
		
	}
	
	@Test 
	public void testtoString()
	{
		assertEquals(lege.toString(),"Lage Lege");
	}
	
	@Test 
	public void testCompareEqual()
	{
	  Lege lege1;
	  lege1 = new Lege("Lage Lege");
	
		assertEquals(lege.compareTo(lege1),0);
	}
	
	@Test 
	public void testLeggTilRespet()
	{
		Resept resept = new HvitResept(null, lege, 0, 0);
		lege.leggTilResept(resept);
		Koe<Resept> reseptListe =lege.hentReseptliste();
		Resept resept1 ;
		resept1 = reseptListe.fjern();
		assertEquals(resept,resept1);
	
	}	
			

}
