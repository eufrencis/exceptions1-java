package Principal;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Assistente.Cliente_W;

import Assistente.OrderItem_W;
import Assistente.Order_W;
import Assistente.Product_W;
import Enum.OrderStatus_W;

public class Program_W {
    public static void main(String[] args)  {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birth = LocalDate.parse(sc.nextLine(), dtf); // treinar isso

        Cliente_W client = new Cliente_W(name, email, birth);
       
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus_W status = OrderStatus_W.valueOf(sc.nextLine().toUpperCase()); // treinar isso

        Order_W order = new Order_W(LocalDateTime.now(), status, client) ;  //treinar isso

        System.out.print("How many items to this order? ");
        int n = sc. nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i ++){
            System.out.printf("Enter #%d item data: \n", i);
            System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
            sc.nextLine();

            Product_W product = new Product_W(productName, productPrice);
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem_W orderItem = new OrderItem_W(quantity, product.getPrice(), product);
            order.addItem(orderItem);

        }
        System.out.println("ORDER SUMMARY");
        System.out.println(order);


    sc.close();
}
}