package com.codingChallenges;

class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}

class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
}

class InsufficientBankBalance extends Exception{
	public InsufficientBankBalance(String message) {
		super(message);
	}
}

class ItemOutOfStockException extends Exception{

	public ItemOutOfStockException(String message) {
		super(message);
	}
}
	
public class ShoppingWebsite {
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBankBalance{
		if(!i.isInStock) {
			throw new ItemOutOfStockException("Item is out if stock");
		}
		if(c.walletBalance < i.price) {
			throw new InsufficientBankBalance("Customer wallet balance is not sufficient");
		}
		return "Order Successful";
	}
	
	public static void main(String[] args) {
		Customer cusDet = new Customer(927392, "Steve", 5000.0, "India");
		Item itemDet = new Item(27292, "T-Shirt","US polo", 800, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out;
		try {
			out = obj.purchaseItem(itemDet, cusDet);
			System.out.println(out);
		} catch (ItemOutOfStockException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBankBalance e) {
			System.out.println(e.getMessage());
		}
	}
}
