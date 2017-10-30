package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.HvitResept;
import main.Pasient;
import main.Resept;
import main.Stabel;

public class PasientTest {
Pasient pasient;
@Before
public void setUp()
{
	pasient =new Pasient("Stein Korsveien", 26076144574L, "Sørenkaia 61", 194);
}

	@Test
	public void testCreatePasient() {

		assertEquals("Stein Korsveien", pasient.hentNavn());
		assertEquals(26076144574L,pasient.hentFodselsnummer());
		assertEquals("Sørenkaia 61",pasient.hentGateadresse() );
		assertEquals(194,pasient.hentPostnummer());
		//assertEquals(1,pasient.hentId());
		
	}
	
	@Test
	public void testHentResept() {
		Resept resept = new HvitResept(null, null, 0, 0);
		pasient.leggTilResept(resept);
		Stabel<Resept> resepter = pasient.hentReseptliste();
		assertEquals(resept,resepter.fjern());
		
	}
	
	@Test
	public void testPasientID() {
		pasient =new Pasient("Oddmund Korsveien", 0103144574L, "Rykkin", 1194);
		//assertEquals(2,pasient.hentId());
	}
	

}
