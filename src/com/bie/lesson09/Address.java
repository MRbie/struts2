package com.bie.lesson09;
/** 
* @author  Author:������ 
* @date Date:2017��9��23�� ����5:20:46 
*
*
*/
public class Address {

	private String provice;
	private String city;
	public String getProvice() {
		return provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String provice, String city) {
		super();
		this.provice = provice;
		this.city = city;
	}
	public Address() {
		super();
	}
	
	
}
