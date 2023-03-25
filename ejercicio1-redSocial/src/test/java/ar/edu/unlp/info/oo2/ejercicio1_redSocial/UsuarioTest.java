package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {

	private Usuario user;
	String invText;
	String vacio;
	Tweet t1;
	
	@BeforeEach
	void setUp() {
		user = new Usuario("hola123");
		invText = "ohr6eST8gidyLPJL6ydqKoaUpPYGg8bvXk1X4DVo2e1kSo8fAjBZlMTqvwsPCEE5hJpO5hgzbE6kWmoKpxLYSXl2VmCKyzQFM6axJ1FS7go3BWvtTVQkzd45UphkXIztS6VLFmIs2kTUkgkxBDUuh1CwnnRK8PNnLmQbGrvUhVGHiK4V6eCkYUoCNUtKAwUt01sX4ZI0kuVDJscWbgeuETRWK1NqHDNsvqsAvGij5qjqH0J4gXVYf6VmmueGSpIWeWkP6WUAtqPglqXVC5AsTrKtQ";
		vacio="";
		t1 = new Tweet ("Mi primer tweet");
	}
	@Test
	void testAgregarTweet() {
		assertEquals(0, user.getTweets().size());
		user.agregarTweet(vacio);
		assertEquals(0, user.getTweets().size());
		user.agregarTweet(invText);
		assertEquals(0, user.getTweets().size());
		user.agregarTweet("Mi primer tweet");
		assertEquals(1, user.getTweets().size());
	}
	
	void testRetweet() {
		user.retweetear(invText, t1);
		assertEquals(0, user.getTweets().size());
		user.retweetear(vacio, t1);
		assertEquals(0, user.getTweets().size());
		user.retweetear("Rt mi tweet", t1) ;
		assertEquals(1, user.getTweets().size());
		
	}

}
