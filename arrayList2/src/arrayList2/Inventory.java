/*
 * Cynthia C.
 * 16th March 2020
 */
package arrayList2;

public class Inventory {
	private String itemName;
	private int stockAmount, stockNum;
	
	/**
	 * will set the class variables from what the user entered
	 * @param name
	 * @param amount
	 * @param num
	 */
	public Inventory(String name, int amount, int num) {
		itemName = name;
		stockAmount = amount;
		stockNum = num;
	}
	
	/**
	 * can be called to discontinue an item
	 */
	public void discontinueItem() {
		itemName = "discontinued";
		stockAmount = 0;
	}
	
	/**
	 * can be called to change the amount of an item in stock
	 * @param amount
	 */
	public void changeStockAmount(int amount) {
		stockAmount += amount;
	}
	
	/**
	 * will return the amount of stock for a specific item
	 * @return
	 */
	public int returnStockAmount() {
		return stockAmount;
	}
	
	/**
	 * will return the stock number of an item
	 * @return
	 */
	public int returnStockNum() {
		return stockNum;
	}
	
	/**
	 * will return the name of the item
	 * @return
	 */
	public String returnItemName() {
		return itemName;
	}

}
