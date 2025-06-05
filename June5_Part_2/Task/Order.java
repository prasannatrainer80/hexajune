package com.hexaware.prod;

public class Order {

	private int orderId;
	private int qtyOrd;
	private Product product;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getQtyOrd() {
		return qtyOrd;
	}
	public void setQtyOrd(int qtyOrd) {
		this.qtyOrd = qtyOrd;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", qtyOrd=" + qtyOrd + ", product=" + product + "]";
	}
}
