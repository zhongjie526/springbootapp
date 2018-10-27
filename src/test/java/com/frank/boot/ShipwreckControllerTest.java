package com.frank.boot;

import static org.junit.Assert.assertEquals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.frank.boot.controller.ShipwreckController;
import com.frank.boot.model.Shipwreck;
import com.frank.boot.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;

	@Mock
	private ShipwreckRepository sr;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testShipwreckGet() {
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		when(sr.findOne(1L)).thenReturn(sw);

		Shipwreck result = sc.get(1L);

		verify(sr).findOne(1L);
		//assertEquals(1L, result.getId().longValue());
		assertThat(result.getId(),is(1L));
	}

}
