package com.app.test;

import java.util.List;
import java.util.Scanner;

import com.app.dao.AdminLoginDao;
import com.app.dao.AdminRegisterDao;
import com.app.dao.UserLoginDao;
import com.app.dao.UserRegisterDao;
import com.app.dto.AdminDtologin;
import com.app.dto.AdminProfile;
import com.app.dto.AdminRequestDto;
import com.app.dto.UserDtologin;
import com.app.dto.UserProfile;
import com.app.dto.UserRequestDto;
import com.app.factory.BankInfoFactory;

import com.app.factory.PetsFactory;
import com.app.model.Admin;
import com.app.model.BankInfo;

import com.app.model.Pets;
import com.app.model.User;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		AdminRequestDto adminrequest = new AdminRequestDto();
		UserRequestDto userrequest = new UserRequestDto();
		com.app.dao.PetsDao ptDao = PetsFactory.getPetsDao();// PetsFactory.getPetsDao();
		
		com.app.dao.BankInfoDao bDao = BankInfoFactory.getBankInfoDao();
		String choice = "";
		String ch = "";
		do {
			System.out.println("-------------------------------------------");
			System.out.println("Welcome to My Pets Application");
			System.out.println("-------------------------------------------");
			List<Pets> list1 = ptDao.listPets();
			if (list1 != null) {
				for (Pets p : list1) {
					System.out.println(
							p.getPetName() + "\t" + p.getPetBreede() + "\t" + p.getPetFood() + "\t" + p.getPetFood());
				}
			} else {
				System.out.println("something went wrong..!");
			}

			System.out.println("-------------------------------------------");
			System.out.println("press 1. Admin Login");
			System.out.println("press 2. User Register");
			System.out.println("press 3. User Login");
			System.out.println("-------------------------------------------");
			System.out.println("Enter your choice");
			System.out.println("-------------------------------------------");
			int key = sn.nextInt();

			switch (key) {
			case 1:
				AdminDtologin dto = adminrequest.loginRequest();
				AdminLoginDao adminlogindao = new AdminLoginDao();
				AdminProfile profile = adminlogindao.adminlogin(dto);
				if (profile != null) {

					String conti;
					do {
						System.out.println("------------Pets Operation----------");
						System.out.println("press 1. Admin Register");
						System.out.println("press 2. Insert  pets");
						System.out.println("press 3. update pets");
						System.out.println("press 4. delete pets");
						System.out.println("press 5. get all pets");
						System.out.println("press 6. get one pets");
						System.out.println("------------End----------");
						System.out.println("Enter your choice-");
						int che = sn.nextInt();

						switch (che) {
						case 1:
							Admin admin = adminrequest.adminregisteRequest();
							AdminRegisterDao dao = new AdminRegisterDao();
							int i = dao.register(admin);
							if (i == 1) {
								System.out.println("User Register successfully..!");
							} else {
								System.out.println("Sorry user not register..!");
							}
							break;
						case 2:
							System.out.println("Enter your petid:");
							int id = sn.nextInt();

							System.out.println("Enter your petname:");
							String name = sn.next();

							System.out.println("Enter your petbreede:");
							String breede = sn.next();

							System.out.println("Enter your petfood:");
							String food = sn.next();

							System.out.println("Enter your petprice:");
							double price = sn.nextDouble();

							Pets pt = new Pets(id, name, breede, food, price);
							int i1 = ptDao.insertData(pt);
							if (i1 == 1) {
								System.out.println("Data inserted successfully");

							} else {

								System.out.println("Data inserted something wrong");
							}
							break;

						case 3:
							System.out.println("Enter your petid:");
							int id1 = sn.nextInt();

							System.out.println("Enter your petname:");
							String name1 = sn.next();

							System.out.println("Enter your petbreede:");
							String breede1 = sn.next();

							System.out.println("Enter your petfood:");
							String food1 = sn.next();

							System.out.println("Enter your petprice:");
							double price1 = sn.nextDouble();

							Pets pt5 = new Pets(id1, name1, breede1, food1, price1);
							int i2 = ptDao.updateData(pt5);
							if (i2 == 1) {
								System.out.println("Data update successfully.");
							} else {
								System.out.println("Data Not Inserted something went wrong..!");
							}
							break;

						case 4:
							System.out.println("Enter your id:");
							int id2 = sn.nextInt();

							int row = ptDao.deleteData(id2);
							if (row == 1) {
								System.out.println("Data deleted successfully.");
							} else {
								System.out.println("Data Not Inserted something went wrong..!");
							}
							break;

						case 5:
							List<Pets> list = ptDao.listPets();
							if (list != null) {
								for (Pets p : list) {
									System.out.println(p.getPetId() + "\t" + p.getPetName() + "\t" + p.getPetBreede()
											+ "\t" + p.getPetFood() + "\t" + p.getPetFood() + "\t" + p.getPetPrice());
								}
							} else {
								System.out.println("something went wrong..!");
							}
							break;

						case 6:
							System.out.println("Enter your id:");
							int ptId = sn.nextInt();

							List<Pets> pt6 = ptDao.getPets(ptId);
							if (pt6 != null) {
								for (Pets pi : pt6) {
									System.out.println(pi.getPetId() + "\t" + pi.getPetName() + "\t" + pi.getPetBreede()
											+ "\t" + pi.getPetFood() + "\t" + pi.getPetPrice());
								}
							} else {
								System.out.println("Data Not Inserted something went wrong..!");
							}
							break;

						default:
							break;
						}

						System.out.println("do you want to continue---");
						conti = sn.next();
					} while (conti.equalsIgnoreCase("y"));
				}

				break;
			case 2:
				User user = userrequest.userregisteRequest();
				UserRegisterDao dao2 = new UserRegisterDao();
				int a = dao2.userregister(user);
				if (a == 1) {
					System.out.println("Data Register successfully..!");
				} else {
					System.out.println("Sorry user not register..!");
				}
				break;
			case 3:
				UserDtologin udl = userrequest.loginRequest();
				UserLoginDao userlogindao = new UserLoginDao();
				UserProfile profile1 = userlogindao.userlogin(udl);
				if (profile1 != null) {
					List<Pets> list = ptDao.listPets();
					if (list != null) {
						for (Pets p : list) {
							System.out.println(p.getPetId() + "\t" + p.getPetName() + "\t" + p.getPetBreede() + "\t"
									+ p.getPetFood() + "\t" + p.getPetFood() + "\t" + p.getPetPrice());
						}
					} else {
						System.out.println("something went wrong..!");
					}

					String conti2;
					do {

						System.out.println("*******************************************");
						System.out.println(" Buy Pets Press 1");
						System.out.println("*******************************************");
						System.out.println("Enter your choice- Here");
						int che2 = sn.nextInt();

						switch (che2) {

						case 1:
							System.out.println("Enter  petid:");
							int id9 = sn.nextInt();

							System.out.println("Your Pet Order :");
							List<Pets> pt6 = ptDao.getPets(id9);
							if (pt6 != null) {
								for (Pets pi : pt6) {
									System.out.println(pi.getPetId() + "\t" + pi.getPetName() + "\t" + pi.getPetBreede()
											+ "\t" + pi.getPetFood() + "\t" + pi.getPetPrice());
								}
							} else {
								System.out.println("Data Not Inserted something went wrong..!");
							}
							System.out.println("Do you want to Buy If yes to Prees 'k':");

							String conti5 = sn.next();

							if (conti5.equalsIgnoreCase("k"))
								; {
							System.out.println("Enter your Account Number:");
							long account_Number = sn.nextLong();

							System.out.println("Enter your Bank Name:");
							String bank_Name = sn.next();

							System.out.println("Enter your IFSC:");
							long ifsc = sn.nextLong();

							System.out.println("Enter your Account User Name:");
							String user_Name = sn.next();

							System.out.println("Enter your Mobile Number:");
							double mob = sn.nextDouble();

							BankInfo b = new BankInfo(account_Number, bank_Name, ifsc, user_Name, mob);
							int i0 = bDao.insertBankData(b);
							if (i0 == 1) {
								System.out.println("Done");

							} else {

								System.out.println("something wrong");
							}
						}
							break;

					

						}

						System.out.println("do you want to continue---");
						conti2 = sn.next();
					} while (conti2.equalsIgnoreCase("y"));

				}

				break;

			default:
				System.out.println("Invalid Request");
				break;
			}
			System.out.println("Go to Home Page..!");
			choice = sn.next();
		} while (choice.equalsIgnoreCase("y"));

	}

}
