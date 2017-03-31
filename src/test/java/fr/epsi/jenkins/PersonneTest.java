package fr.epsi.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class PersonneTest {

	@Test
	public void test() {
		Personne p1 = new Personne("Alex", "Medina");
		
		Assert.assertEquals("Alex", p1.getPrenom());
		Assert.assertEquals("Medina", p1.getNom());
		Assert.assertEquals("Medina Alex", p1.getNomPrenom());
		Assert.assertNotNull(p1.getV_env());
		
	}

}
