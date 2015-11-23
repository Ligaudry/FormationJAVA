package com.Entities;

public class Item implements IItem{

	private int id;
	private String title;
	private double price;
	
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getPrice()
	 */
	@Override
	public double getPrice() {
		return price;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setPrice(double)
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
}
	
	

