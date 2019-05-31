package com.example.domain;

/**
 * hotelsテーブルの要素のあるドメイン.
 * 
 * @author koichi.nagata
 *
 */
public class Hotel {
	/** ID(主キー) */
	private Integer id;
	/** エリア名 */
	private String areaName;
	/** ホテル名 */
	private String hotelName;
	/** 住所 */
	private String address;
	/** 最寄り駅 */
	private String nearestStation;
	/** 金額 */
	private Integer price;
	/** 駐車場有無 */
	private String parking;

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getAreaName() {
		return areaName;
	}

	public final void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public final String getHotelName() {
		return hotelName;
	}

	public final void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	public final String getNearestStation() {
		return nearestStation;
	}

	public final void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	public final Integer getPrice() {
		return price;
	}

	public final void setPrice(Integer price) {
		this.price = price;
	}

	public final String getParking() {
		return parking;
	}

	public final void setParking(String parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", areaName=" + areaName + ", hotelName=" + hotelName + ", address=" + address
				+ ", nearestStation=" + nearestStation + ", price=" + price + ", parking=" + parking + "]";
	}

}
