package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Hotel;
import com.example.servise.HotelService;

/**
 * ホテルデータベースを操作する.
 * 
 * @author koichi.nagata
 *
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelService hotelService;

	/**
	 * ホテル検索を行う
	 * 
	 * @param inputPrice 入力された金額
	 * @param model      モデル
	 * @return 検索されたホテルの表示
	 */
	@RequestMapping("")
	public String searchByLessThanPric(Integer inputPrice, Model model) {
		List<Hotel> hotels = hotelService.searchByLessThanPrice(inputPrice);
		model.addAttribute("hotels", hotels);
		return "hotel";
	}
}
