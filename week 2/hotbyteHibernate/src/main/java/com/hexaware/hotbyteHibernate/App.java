package com.hexaware.hotbyteHibernate;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.hotbyteHibernate.dao.IUserDao;
import com.hexaware.hotbyteHibernate.dao.UserDaoImp;
import com.hexaware.hotbyteHibernate.entity.Users;
import com.hexaware.hotbyteHibernate.service.IUserService;
import com.hexaware.hotbyteHibernate.service.UserServiceImp;

public class App {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		IUserDao dao = new UserDaoImp();
		IUserService service = new UserServiceImp(dao);

		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME TO HOTBYTE ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE BY USERNAME");
			System.out.println("4. SELECT BY USERNAME");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Users user = readData(); // result from readData() is assigned to the product with returntype Product
				
				Serializable userId = service.insertUsers(user);
				
				if (userId != null) {
					System.out.println("record inserted successfully");
				} else {
					System.err.println("insert fail");
				}

				break;
			case 2:

				Users updatedUser = readData();
				
				boolean isUpdated = service.updateUsers(updatedUser);

				if (isUpdated) {
					System.out.println("Record Updated successfully...");
				} else {

					System.err.println("Update fail");
				}

				break;

			case 3:

				System.out.println("Enter username");

				String username = scanner.next();

				boolean isDeleted = service.deleteUserByUsername(username);

				if (isDeleted) {
					System.out.println("Record Deleted successfully...");
				} else {

					System.err.println("Delete fail");
				}

				break;

			case 4:

				System.out.println("Enter username");

				String username1 = scanner.next();

				Users userfound = service.selectUserByUsername(username1);
				System.out.println(userfound);

				break;

			case 5:

				List<Users> list = service.selectAllUsers();

				for (Users user2 : list) {

					System.out.println(user2);

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

	public static Users readData() {

		Users user = new Users();

		System.out.println("enter id");
		user.setUserID(scanner.nextInt());

		System.out.println("enter username");
		user.setUserName(scanner.next());
		scanner.nextLine();

		System.out.println("enter password");
		user.setPassword(scanner.next());
		scanner.nextLine();

		System.out.println("enter Name");
		user.setName(scanner.next());
		scanner.nextLine();

		System.out.println("enter gender");
		user.setGender(scanner.next());
		scanner.nextLine();

		System.out.println("enter contact number");
		user.setContactNumber(scanner.next());
		scanner.nextLine();

		System.out.println("enter email");
		user.setEmail(scanner.next());
		scanner.nextLine();

		System.out.println("enter address");
		user.setAddress(scanner.next());
		scanner.nextLine();

		return user;
	}
}
