package com.sid.VoterClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.sid.controller.VoterController;
import com.sid.entity.Address;
import com.sid.entity.Person;
import com.sid.entity.VotingCard;

public class VoterClient {

	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		VoterController vc = new VoterController();
		int choice = 0;
		int viewchoice = 0;
		int excount = 0;

		do {

			System.out.println("Menu");
			System.out.printf("|%-15s|\n", "1. Registeration");
			System.out.println("----------------");
			System.out.printf("|%-15s|\n", "2. View");
			System.out.println("----------------");
			System.out.printf("|%-15s|\n", "3. Update");
			System.out.println("----------------");
			System.out.printf("|%-15s|\n", "4. Delete");
			System.out.println("----------------");

			if (excount > 0) {
				System.out.printf("|%-15s|\n", "5. Exit");
				System.out.println("----------------");

			}

			System.out.println("Enter choice");

			choice = sc.nextInt();
			switch (choice) {
			// Register any new person
			case 1: {

				try {

					System.out.println("Enter adharid");
					int adhar = sc.nextInt();
					System.out.println("Enter name ");
					String name = bf.readLine();
					System.out.println("Enter voter id");
					String voterid = bf.readLine();
					System.out.println("Enter constituency ");
					String constituency = bf.readLine();
					System.out.println("Enter house no ");
					int houseno = sc.nextInt();
					System.out.println("Enter city");
					String city = bf.readLine();
					System.out.println("Enter pin");
					int pin = sc.nextInt();

					vc.addPerson(adhar, name, voterid, constituency, houseno, city, pin);

				} catch (IOException e) {

					e.printStackTrace();
				}

				break;

			}

			// view person by specific condition //
			case 2: {

				do {

					System.out.println(" View Menu");
					System.out.println("1. View All Person");
					System.out.println("2. View Person by constituency ");
					System.out.println("3. View Person by city");
					System.out.println("4. View Person by pin");
					System.out.println("5. Exit");
					System.out.println();
					System.out.println("Enter choice");
					viewchoice = sc.nextInt();

					switch (viewchoice) {
					// view all person
					case 1: {

						List<Person> ls = vc.viewAllPerson();
						for (Person person : ls) {
							System.out.println(person);

						}
						break;
					}
					// view person by constituency
					case 2: {

						try {

							System.out.println("Enter Constituency");
							String constituency = bf.readLine();
							List<Person> ls = vc.viewPersonByConstituency(constituency);
							for (Person person : ls) {
								System.out.println(person);

								constituency = bf.readLine();
							}
						} catch (Exception e) {
							e.printStackTrace();
						}

						break;

					}

					// view person by city
					case 3: {

						try {
							System.out.println("Enter City Name");
							String city = bf.readLine();
							List<Person> candidatebycity = vc.viewPersonByCity(city);
							for (Person person : candidatebycity) {
								System.out.println(person);
							}

						} catch (IOException e) {
							e.printStackTrace();
						}

						break;
					}

					// view person by pin
					case 4: {

						try {
							System.out.println("Enter pin");
							int pin = sc.nextInt();
							List<Person> candidatebypin = vc.viewPersonByPin(pin);
							for (Person person : candidatebypin) {
								System.out.println(person);
							}

						} catch (Exception e) {
							e.printStackTrace();
						}

						break;
					}

					default:
						break;
					}
				} while (viewchoice == 5);

				break;

			}

			// update any existing person
			case 3: {

				try {

					System.out.println("Enter Adhar no");
					int adharno = sc.nextInt();
					boolean res = vc.checkAdharPresent(adharno);

					if (res == true) {

						System.out.println("Enter updated name ");
						String uname = bf.readLine();
						System.out.println("Enter updated constituency ");
						String uconstituency = bf.readLine();
						System.out.println("Enter updated city");
						String ucity = bf.readLine();
						System.out.println("Enter updated pin");
						int upin = sc.nextInt();

						String result = vc.updatePerson(adharno, uname, uconstituency, ucity, upin);
						System.out.println(result);

					}
				}

				catch (Exception e) {
					e.printStackTrace();
				}

				break;

			}
			// delete any existing person
			case 4: {

				System.out.println("Enter Adhar no");
				int adharno = sc.nextInt();
				String res = vc.deletePerson(adharno);
				System.out.println(res);

				break;

			}

			// close the application
			case 5: {

				break;

			}

			default:
				System.out.println("Please Inter Valid Choice");

				break;
			}

			if (choice == 5) {
				break;

			}
		} while (true);

	}
}
