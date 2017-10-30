package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.LegemiddelA;

public class LegemiddelATest {
	LegemiddelA legemiddel;
		@Before
		public void setUp()
		{
	       legemiddel =new LegemiddelA("Morfin", 100.0, 1.0, 2);
		}

	@Test
	public void testCreate() {
		assertEquals(legemiddel.hentNavn(),"Morfin");
		assertEquals(legemiddel.hentPris(),100.0,0.01);
		assertEquals(legemiddel.hentVirkestoff(),1.0,0.01);
		assertEquals(legemiddel.hentNarkotiskStyrke(),2);
		
		
	}

}
