/*
 * Cynthia C.
 * 16th March 2020
 */
package arrayList2;

public class Inventory {
	private String itemName;
	private int stockAmount, stockNum;
	
	public Inventory(String name, int amount, int num) {
		itemName = name;
		stockAmount = amount;
		stockNum = num;
	}
	
	public void discontinueItem() {
		itemName = "discontinued";
		stockAmount = 0;
	}
	
	public void changeStockAmount(int amount) {
		stockAmount = amount;
	}
	
	public int returnStockAmount() {
		return stockAmount;
	}
	
	public int returnStockNum() {
		return stockNum;
	}
	
	public String returnItemName() {
		return itemName;
	}

}
