/*
 * Cynthia C.
 * 16th March 2020
 * runs Inventory
 */
package arrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		int userChoice, stockNum = 1000, stockAmount, getStockNum[], y;
		String itemName;
		getStockNum = new int[2];
		
		ArrayList<Inventory> obj = new ArrayList<Inventory>();	
		
		//will loop until user chooses to exit(5)
		do {
			y = 0;
			System.out.println("\nChoose from the following options: ");
			System.out.println("1.add new item\n2.discontinue item\n3.display amount in stock for item\n4.add stock to item\n5.exit");
			System.out.print("\nEnter your choice: ");
			userChoice = inputInt.nextInt();
			
			//loops until user enters a valid choice
			while(userChoice > 5 || userChoice < 1) {
				System.out.print("Please enter a valid option: ");
				userChoice = inputInt.nextInt();
			}
			System.out.println();
			
			//will choose which action depending on userChoice
			if(userChoice == 1) {
				System.out.print("What is the name of the item? ");
				itemName = inputString.nextLine();
				
				System.out.print("How many of that item? ");
				stockAmount = inputInt.nextInt();
				
				obj.add(new Inventory(itemName, stockAmount, stockNum));
				System.out.println(stockAmount + " " + itemName + " have been added");
				System.out.println(itemName + "'s item number is: " + stockNum);
				stockNum+=1;
			}else if(userChoice > 1 && userChoice < 5) {
				System.out.print("What is the item number? ");
				getStockNum[0] = inputInt.nextInt();
				
				//will loop until the stockNum and the stock number the user entered match
				do{
					getStockNum[1] = obj.get(y).returnStockNum();
					y++;
					//will inturupt the loop if the user has entered a value that does not exist in any part of the array
					if(y >= obj.size()) {
						System.out.print("Please enter a valid item number: ");
						getStockNum[0] = inputInt.nextInt();
						y = 0;
					}
				}while(getStockNum[0] != getStockNum[1]);
				
			}else {
				System.out.print("\nBye-Bye");
			}
			
			//will finish the actions depending on userChoice
			if(userChoice == 2) {
				System.out.println(obj.get(getStockNum[0] - 1000).returnItemName() + " has been discontinued");
				obj.get(getStockNum[0] - 1000).discontinueItem();
			}else if(userChoice == 3) {
				System.out.println("There are " + obj.get(getStockNum[0] - 1000).returnStockAmount() + " " + obj.get(getStockNum[0] - 1000).returnItemName());
			}else if(userChoice == 4) {
				System.out.print("How many are you adding? ");
				obj.get(getStockNum[0] - 1000).changeStockAmount(inputInt.nextInt());
				System.out.println("There are " + obj.get(getStockNum[0] - 1000).returnStockAmount() + " " + obj.get(getStockNum[0] - 1000).returnItemName());
			}else {
				System.out.print("");
			}
			
		}while(userChoice != 5);
	}
}
