package com.example.servise;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * HotelServicrのテスト.
 * 
 * @author koichi.nagata
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelServiceTest {

	@Autowired
	private HotelService hotelService;

	/**
	 * 入力値(Price)によって、帰ってくる値のテスト.
	 */
	@Test
	public void testSearchByLessThanPrice() {
		assertThat("詳細が間違っています", hotelService.searchByLessThanPrice(20000).get(0).getPrice(), is(20000));
		assertThat("詳細が間違っています", hotelService.searchByLessThanPrice(20000).get(0).getHotelName(), is("パレスホテル東京"));
		assertThat("詳細が間違っています", hotelService.searchByLessThanPrice(19999).get(0).getHotelName(), is("東京ベイ舞浜ホテル"));
		assertThat("詳細が間違っています", hotelService.searchByLessThanPrice(null).get(4).getHotelName(), is("ホテルローズガーデン新宿"));
		assertThat("詳細が間違っています", hotelService.searchByLessThanPrice(-1).size(), is(0));
	}

}
