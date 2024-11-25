package com.sit.Controller;

import java.util.Scanner;

public class Product {
	
	private int pid;
	private String ptype;
	private String pname;
	private double pprice;
	private int pqty;
	
	//getter and setter methods
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	
	//parameterized constructor
	public Product(int pid, String ptype, String pname, double pprice, int pqty) {
		super();
		this.pid = pid;
		this.ptype = ptype;
		this.pname = pname;
		this.pprice = pprice;
		this.pqty = pqty;
	}
	
	//default constructor
	public Product() {
		super();
	}
	public void getProductDetails()
	{
		System.out.println("Product Id : "+pid);
		System.out.println("Product Type: "+ptype);
		System.out.println("Product Name: "+pname);
		System.out.println("Product Price: "+pprice);
		System.out.println("Product Quantity: "+pqty);
	}
	
	//public static Method to add new Product in the array
	public static void addProduct(Product[] arr, int index) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product id: ");
        int pid = sc.nextInt();

        // Check for duplicate id 
        for (int i = 0; i < index; i++) {
            if (arr[i] != null && arr[i].getPid() == pid) {
                System.out.println("Error:Product ID is already exists!");
                return;
            }
        }

        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter Product Type: ");
        String ptype = sc.nextLine();
        
        System.out.println("Enter Product Name: ");
        String pname = sc.nextLine();
        
        System.out.println("Enter Product Price: ");
        double pprice = sc.nextDouble();
        
        System.out.println("Enter Product Quantity: ");
        int pqty = sc.nextInt();

        

        arr[index] = new Product(pid, ptype, pname, pprice,pqty);
        System.out.println("Product added successfully!");
		
	}
	
	
	

	

}
