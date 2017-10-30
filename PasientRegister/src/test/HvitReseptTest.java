package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.HvitResept;
import main.Lege;
import main.Legemiddel;
import main.LegemiddelA;

public class HvitReseptTest {
private HvitResept hvitresept;


@Before
public void setUp()
{
	
	hvitresept = new HvitResept(new LegemiddelA("Paracet",100.0, 0, 0),new Lege("Lage Lege"), 1, 2);
	
}
	
	@Test
	public void testCreate() {
		Lege lege;
		assertEquals(hvitresept.hentId(),1);
	
		lege = hvitresept.hentLege();
		assertEquals(lege.hentNavn(), "Lage Lege");
		assertEquals( hvitresept.farge(),"hvit");
		Legemiddel legemiddel = hvitresept.hentLegemiddel();
		assertEquals(legemiddel.hentNavn(),"Paracet");
		assertEquals(hvitresept.hentReit(),2);
		
		
	}
	@Test
	public void testBruk() {
		assertTrue(hvitresept.bruk());
		assertFalse(hvitresept.bruk());
		assertFalse(hvitresept.bruk());
		
		
	}
	
	@Test
	public void testPris()
	{
		assertEquals(hvitresept.prisAaBetale(),100.0,0.01);
	}
	
	@Test
	
	public void testToStrin()
	{
		assertEquals(hvitresept.toString(),"1;Lage Lege;Paracet;hvit");
	}
	

}
