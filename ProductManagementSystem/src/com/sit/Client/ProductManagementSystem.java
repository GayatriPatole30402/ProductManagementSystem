package com.sit.Client;

import java.util.Scanner;

import com.sit.Controller.Product;

public class ProductManagementSystem {

	public static void main(String[] args) {

		int maxproducts = 10, index = 0;
		Product[] arr = new Product[maxproducts];

		Scanner sc = new Scanner(System.in);

		System.out.println("----------Product Management System----------------\n");

		while (true) {
			System.out.println(
					"1. Add New Product \n2. Display all Product Details \n3. Find Product by Product Name \n4. Filter all Products having price less than 500"
							+ "\n5. Filter all Products having price more than 100 \n6. Find Product by ProductType \n7. Find Product by ProductId "
							+ "\n8. Filter all products whoes Product QTY is less than 2 \n9. Delete Product by ID \n10. Exit");
			System.out.println("\nEnter your choice from menu:-");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				// Add New Product
				if (index < maxproducts) {
					Product.addProduct(arr, index);
					index++;
				} else {
					System.out.println("Product array storage is full!");
				}
				break;

			case 2:
				// Display Product Details
				boolean foundAny = false; // Flag to check if we found any product
				for (int i = 0; i < index; i++) {
					if (arr[i] != null) {
						arr[i].getProductDetails();
						System.out.println("________________________________________");
						foundAny = true;
					}
				}
				if (!foundAny) {
					System.out.println("No products found.");
				}
				break;

			case 3:
				// Find Product by name
				System.out.println("Enter Product Name: ");
				String pname = sc.next();
				boolean found2 = false;
				for (int i = 0; i < index; i++) {
					if (arr[i] != null && arr[i].getPname().equalsIgnoreCase(pname)) {
						arr[i].getProductDetails();
						found2 = true;
						break;
					}
				}
				if (!found2) {
					System.out.println("Invalid Name !!!");
				}
				break;

			case 4:
				// Filter all Products having price less than 500
				boolean found3 = false;
				for (int i = 0; i < index; i++) {
					if (arr[i] != null && arr[i].getPprice() < 500) {
						arr[i].getProductDetails();
						found3 = true;
						break;
					}
				}
				if (!found3) {
					System.out.println("Empty Set !!!");
				}
				break;

			case 5:
				// Filter all Products having price more than 100
				boolean found4 = false;
				for (int i = 0; i < index; i++) {
					if (arr[i] != null && arr[i].getPprice() > 100) {
						arr[i].getProductDetails();
						found4 = true;
						break;
					}
				}

				if (!found4) {
					System.out.println("Empty Set");

				}
				break;

			case 6:
				// Find Product by ProductType
				System.out.println("Enter Product Type: ");
				String ptype = sc.next();
				boolean found5 = false;

				for (int i = 0; i < index; i++) {
					if (arr[i] != null && arr[i].getPtype().equalsIgnoreCase(ptype)) {
						arr[i].getProductDetails();
						found5 = true;
						break;
					}
				}

				if (!found5) {
					System.out.println("Invalid Type");
				}
				break;

			case 7:
				// Find Product by ProductId
				System.out.println("Enter Id: ");
				int pid1 = sc.nextInt();
				boolean found6 = false;

				for (int i = 0; i < index; i++) {
					if (arr[i] != null && arr[i].getPid() == pid1) {
						arr[i].getProductDetails();
						found6 = true;
						break;
					}
				}
				if (!found6) {
					System.out.println("Product associated to given ID is not present :( !!!");
				}
				break;

			case 8:
				// Filter all products whoes Product QTY is less than 2
				boolean found7 = false;
				for (int i = 0; i < index; i++) {
					if (arr[i] != null && arr[i].getPqty() < 2) {
						arr[i].getProductDetails();
						found7 = true;
						break;
					}
				}

				if (!found7) {
					System.out.println("Empty Set");

				}
				break;

			case 9:
				// Delete Product by ID
				System.out.println("Enter Specific Product ID to delete that Product: ");
				int deletePid = sc.nextInt();
				boolean deleted = false;

				for (int i = 0; i < index; i++) {
					if (arr[i] != null && arr[i].getPid() == deletePid) {
						// shift elements to delete the product
						for (int j = i; j < index - 1; j++) {
							// Move the next product to the current position
							arr[j] = arr[j + 1];
						}
						arr[index - 1] = null; // Clear the last element
						index--; // Decrease the index
						System.out.println("Product with ID " + deletePid + " has been deleted.");
						deleted = true;
						break;
					}
				}
				if (!deleted) {
					System.out.println("Product with ID " + deletePid + " not found!");
				}
				break;

			case 10:
				// Exit
				System.out.println("Thank you for using this application !!\nsee you next time :)");
				System.exit(0);

			default:
				System.out.println("Invalid Choice :(");

			}

		}

	}

}
