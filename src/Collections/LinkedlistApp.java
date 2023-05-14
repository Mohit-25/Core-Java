package Collections;

import java.util.*;

public class LinkedlistApp {

	public static void main(String[] args) {
		boolean flag = true;
		LinkedList<Employee> list = new LinkedList<>();

		while (flag) {

			System.out.println("Enter NUmber ");
			System.out.println("Insert 1 ");
			System.out.println("Update 2 ");
			System.out.println("Display 3 ");
			System.out.println("Search 4 ");
			System.out.println("Break 5 ");

			Scanner sc = new Scanner(System.in);

			int value = sc.nextInt();
			EmployeeBean eb = new EmployeeBean();

			switch (value) {
			case 1:
				Employee e = eb.insert();
				list.add(e);
				break;
			case 2:
				System.out.println("Enter id");
				int id = sc.nextInt();
//				
//				list.forEach(i -> {
//					if (i.getId() == id) {
//						temp = true;
//						eb.update(id, i);
//
//					}
//
//					if (temp) {
//						System.out.println("Enter valid id");
//					}
//				});
				boolean temp = false;
				for (Employee i : list) {
					if (i.getId() == id) {
						temp = true;
						eb.update(id, i);

					}

					if (!temp) {
						System.out.println("Enter valid id");
					}
				}
				break;

			case 3:
				list.forEach(i -> {
					System.out.println(i);
				});
				break;

			case 4:
				boolean temp1 = false;
				System.out.println("Enter id");
				int id1 = sc.nextInt();
				for (Employee i : list) {

					if (i.getId() == id1) {
						temp1 = true;
						System.out.println(i);

					}

				}
				if (!temp1) {
					System.out.println("Enter valid id");
				}
				break;

			case 5:
				flag = false;
				break;
			default: System.out.println("Enter valid number");
			     break;

			}

		}
	}
}
