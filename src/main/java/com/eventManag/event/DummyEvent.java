package com.eventManag.event;

public class DummyEvent {
	private String eventName,eveType,city;
	private int price,tickets_avail;
	public String getEventName() {
		return eventName;
	}
	public DummyEvent(String eventName, String eveType, String city, int price, int tickets_avail) {
		super();
		this.eventName = eventName;
		this.eveType = eveType;
		this.city = city;
		this.price = price;
		this.tickets_avail = tickets_avail;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEveType() {
		return eveType;
	}
	public void setEveType(String eveType) {
		this.eveType = eveType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTickets_avail() {
		return tickets_avail;
	}
	public void setTickets_avail(int tickets_avail) {
		this.tickets_avail = tickets_avail;
	}
	

}
