package Carrello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarrelloTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testCarrello() {
		Carrello carrello = new Carrello();
		int expected = 0;
		assertEquals(expected, carrello.getAmount());
	}

	@Test
	void testGetAmount() {
		fail("Not yet implemented");
	}

	@Test
	void testInsertOneProduct() {
		Carrello carrello = new Carrello();
		int expected = 3;
		carrello.InsertOneProduct();
		carrello.InsertOneProduct();
		carrello.InsertOneProduct();
		assertEquals(expected, carrello.getAmount());	
	}

	@Test
	void testRemoveOneProduct() {
		Carrello carrello = new Carrello();
		int expected = 1;
		carrello.InsertOneProduct();
		carrello.InsertOneProduct();
		carrello.removeOneProduct();
		assertEquals(expected, carrello.getAmount());
	}

}
