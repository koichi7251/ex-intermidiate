package com.example.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Hotel;
import com.example.repository.HotelsRepository;

@Service
@Transactional
public class HotelService {
	@Autowired
	private HotelsRepository hotelRepository;

	/**
	 * リポジトリーのホテル検索メソッドを利用するクラス.
	 * 
	 * @param inputPrice 入力された金額
	 * @return 検索のかかったホテル情報
	 */
	public List<Hotel> searchByLessThanPrice(Integer inputPrice) {
		return hotelRepository.searchByLessThanPrice(inputPrice);
	}
}
