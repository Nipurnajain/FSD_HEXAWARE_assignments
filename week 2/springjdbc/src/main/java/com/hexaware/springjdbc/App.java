package com.hexaware.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.exceptions.NoProductFoundException;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.service.IProductService;
import com.hexaware.springjdbc.service.ProductServiceImp;

/**
 * database interacts with dao class, dao interacts with service class and service class interacts with main method
 *
 */
public class App {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IProductService service = context.getBean(ProductServiceImp.class); //because service class interacts with main class

		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME DMS ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Product product = readData();        //result from readData() is assigned to the product with returntype Product
				boolean isInserted = service.createProduct(product);
				if (isInserted) {
					System.out.println("record inserted successfully");
				} else {
					System.err.println("insert fail");
				}

				break;
			case 2:

				Product updatedProduct = readData();

				boolean isUpdated = service.updateProduct(updatedProduct);

				if (isUpdated) {
					System.out.println("Record Updated successfully...");
				} else {

					System.err.println("Update fail");
				}

				break;

			case 3:

				System.out.println("Enter Product Id");

				int pid = scanner.nextInt();

				boolean isDeleted = service.deleteProductById(pid);

				if (isDeleted) {
					System.out.println("Record Deleted successfully...");
				} else {

					System.err.println("Delete fail");
				}

				break;

			case 4:

				System.out.println("Enter Product Id");

				int pid1 = scanner.nextInt();

				try {
			        Product productFound = service.selectProductById(pid1);
			        System.out.println(productFound);
			    } catch (NoProductFoundException e) {
			        System.err.println("no such product found");
			        System.out.println(e);
			        
			    }

				break;

			case 5:

				List<Product> list = service.selectAllProducts();

				for (Product prod : list) {

					System.out.println(prod);

				}

				break;

			case 6:
				flag = false;
				break;
			default:
				break;
			}

		}

	}

	public static Product readData() {

		Product product = new Product();

		System.out.println("enter product id");
		product.setProductId(scanner.nextInt());
		System.out.println("enter product name");
		product.setProductName(scanner.next());
		System.out.println("enter product price");
		product.setPrice(scanner.nextDouble());

		return product;
	}
}
