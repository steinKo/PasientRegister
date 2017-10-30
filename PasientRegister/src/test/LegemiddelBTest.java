package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.LegemiddelB;

public class LegemiddelBTest {
   private LegemiddelB legemidell;
   @Before
   public void setUp()
   {legemidell = new LegemiddelB(null, 0, 0, 2);
	   
   }

	
	@Test
	public void testvanedannendStyrke() {
		assertEquals(legemidell.hentVanedannendeStyrke(),2);
	}

}
