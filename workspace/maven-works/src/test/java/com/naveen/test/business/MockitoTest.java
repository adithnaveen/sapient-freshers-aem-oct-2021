package com.naveen.test.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.naveen.testing.IRestaurant;

class MockitoTest {

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	@DisplayName("This is for testing to show display name")
	void mockTest() {
		List<String> list = mock(List.class); 
		
		when(list.size()).thenReturn(4);
		assertEquals(4, list.size());
				
	}
	
	@Test
	void multipleMockTest() {
		List<String> list = mock(List.class); 
		when(list.size()).thenReturn(2).thenReturn(3).thenReturn(4); 
		assertEquals(2, list.size());
		assertEquals(3, list.size());
		assertEquals(4, list.size());
		
	}
	
	@Test
	void mockWithException() {
		List<String> list = mock(List.class); 
		when(list.get(2)).thenThrow(new RuntimeException("Some Exception")); 
		assertThrows(RuntimeException.class, () -> list.get(2));
	}
	@Test
	@DisplayName("testing to insert restaurant valid case")
	void mockTestForInsertRestaturant() {
		IRestaurant mockRestaurant = mock(IRestaurant.class);
		String hotelName = "Hotel Ashoka"; 
		when(mockRestaurant.insertRestaurant(hotelName)).thenReturn(true);
		
		assertTrue(mockRestaurant.insertRestaurant(hotelName)); 
	}

	@Mock
	private IRestaurant mockRestaurant1;

	@Test
	@DisplayName("testing to insert restaurant invalid case")
	void mockTestForInsertRestaturant1() {
		String hotelName = "asok"; 
		when(mockRestaurant1.insertRestaurant(hotelName)).thenReturn(false);
		
		assertFalse(mockRestaurant1.insertRestaurant(hotelName)); 
		
	}
}















