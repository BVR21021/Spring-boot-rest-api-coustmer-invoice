package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coustmer {

	@Id
	private Integer cno;
	private String name;
	private long mobile_no;
	private String prod_Name;
	private double price;
	private int quantity;
	private double total;
	private double discount;
	private double gst_amt;
	private double invoice_bill;
	
	public Coustmer() {
		super();
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getProd_Name() {
		return prod_Name;
	}
	public void setProd_Name(String prod_Name) {
		this.prod_Name = prod_Name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst_amt() {
		return gst_amt;
	}
	public void setGst_amt(double gst_amt) {
		this.gst_amt = gst_amt;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}
	
	
}
