package com.rays.pro4.Bean;



import java.util.Date;

public class StockBean extends BaseBean {
	private int Quantity;
	private double purchasePrice;
	private Date purchaseDate;
	private int orderType;

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	@Override
	public String getkey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}


