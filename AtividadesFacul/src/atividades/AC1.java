package atividades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AC1 {

	@Test
	void test() {
		
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
		assertEquals(510, a[8], "O menor deve ser 510");
		
		
	}

}
