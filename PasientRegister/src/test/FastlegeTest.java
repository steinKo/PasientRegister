package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Fastlege;

public class FastlegeTest {
	
Fastlege lege;
	@Before
	public void setUp ()
	{
		lege = new Fastlege(null,12);
	
	}
	@Test
	public void testAvtanummer() {
		assertEquals(lege.hentAvtalenummer(),12);
	}

}
