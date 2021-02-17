package atividades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AC1 {

	@Test
	void test() {
		
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
		assertEquals(510, a[8], "O menor deve ser 510");
		
		assertEquals(940, a[0], "O maior é 940");
		
		assertEquals(7540, a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9], "A soma é 7540");
		
	}

}
