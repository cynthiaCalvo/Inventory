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
		
		do {
			y = 0;
			System.out.println("Choose from the following options: ");
			System.out.println("1.add new item\n2.discontinue item\n3.display amount in stock for item\n4.add stock to item\n5.exit");
			System.out.print("\nEnter your choice: ");
			userChoice = inputInt.nextInt();
			System.out.println();
			
			if(userChoice == 1) {
				System.out.print("What is the name of the item? ");
				itemName = inputString.nextLine();
				
				System.out.print("How many of that item? ");
				stockAmount = inputInt.nextInt();
				
				obj.add(new Inventory(itemName, stockAmount, stockNum));
				//print out how many were added & item #
				stockNum+=1;
			}else if(userChoice > 1 && userChoice < 5) {
				System.out.print("What is the item number? ");
				getStockNum[0] = inputInt.nextInt();
				
				do{
					y++;
					getStockNum[1] = obj.get(y).returnStockNum();
				}while(getStockNum[0] != getStockNum[1]);
				
			}else {
				System.out.print("\nBye-Bye");
			}
			
			if(userChoice == 2) {
				System.out.println(obj.get(y).returnItemName() + " has been discontinued");
				//how to get discontinuedItem method????
			}else if(userChoice == 3) {
				System.out.println("There are " + obj.get(y).returnStockAmount() + " " + obj.get(y).returnItemName());
			}else if(userChoice == 4) {
				
			}else {
				System.out.print("");
			}
			
		}while(userChoice != 5);
	
	}

}
