package com.qa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import com.qa.kolam.HitungKolam;

@RunWith(JUnitParamsRunner.class)

public class TestKolam {
	HitungKolam tes;

	@Before
	public void setUp() throws Exception {
		tes = new HitungKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/KelilingKolam.csv")
	public void testKelilingKolam(double panjang , double lebar, double tinggi, double keliling ) {
		assertEquals(keliling, tes.kelilingKolam(panjang, lebar, tinggi), 0.1);
	}
	
	@Test
	public void testBukanAngkaKolam() {
		assertEquals(keliling, tes.kelilingKolam("aaa", "bbb", "ccc"), 0.1);
	}
	
	@Test
	public void testAngkaNegatifKolam() {
		assertEquals(-82.0, tes.kelilingKolam(-5.5, -12.0, -3.0), 0.1);
	}
	
	@Test
	public void testKosongKolam() {
		assertEquals(0, tes.kelilingKolam(0, 0, 0), 0.1);
	}

	@Test
	@FileParameters("src/test/resources/VolumeKolam.csv")
	public void testVolumeKolam(double panjang , double lebar, double tinggi, double keliling ) {
		assertEquals(keliling, tes.volumeKolam(panjang, lebar, tinggi), 0.0);
	}
	
	@Test
	public void testBukanAngkaKolam2() {
		assertEquals(keliling, tes.volumeKolam("aaa", "bbb", "ccc"), 0.1);
	}
	
	@Test
	public void testAngkaNegatifKolam2() {
		assertEquals(-198.0, tes.volumeKolam(-5.5, -12.0, -3.0), 0.1);
	}
	
	@Test
	public void testKosongKolam2() {
		assertEquals(0, tes.volumeKolam(0, 0, 0), 0.1);
	}

}
