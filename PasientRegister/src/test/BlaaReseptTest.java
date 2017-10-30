package test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.BlaaResept;
import main.Lege;
import main.LegemiddelA;

public class BlaaReseptTest {
BlaaResept resept;
@Before
public void setUp()
{
	LegemiddelA Legemiddel = new LegemiddelA(null, 100-0, 0, 0);
	resept = new BlaaResept(Legemiddel, null, 0, 0);
}
	@Test
	public void testPris() {
		assertEquals(resept.prisAaBetale(),25.0,0.01);
		
	}
	
	@Test
	public void testFarge() {
		Lege lege;
		
		assertEquals( resept.farge(),"blå");
	}	

}
