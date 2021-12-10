package com.qa.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import com.qa.kolam.HitungSuhu;

@RunWith(JUnitParamsRunner.class)

public class TestSuhu {
	HitungSuhu cek;

	@Before
	public void setUp() throws Exception {
		cek = new HitungSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/HitungSuhu.csv")
	public void testRumusSuhu(double farenheit, double celsius) {
		assertEquals(celsius, cek.rumusSuhu(farenheit),0.1);
	}
	
	@Test
	public void testBukanAngkaSuhu() {
		assertEquals(celsius, cek.rumusSuhu("aaa"), 0.1);
	}
	
	@Test
	public void testAngkaNegatifSuhu() {
		assertEquals(-20.5555556, cek.rumusSuhu(-5), 0.1);
	}
	
	@Test
	public void testKosongSuhu() {
		assertEquals(0, cek.rumusSuhu(0), 0.1);
	}

}

