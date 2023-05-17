package devsuperior1.com.desafio1;

import devsuperior1.com.desafio1.entity.Order;
import devsuperior1.com.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
        @Autowired
		OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var order1 = new Order(1034,150.0,20.0);
		var order2 = new Order(2282,800.0,10.0);
		var order3= new Order(1309,95.90,0.0);
		var total1=	orderService.total(order1);
		System.out.println("---------------------");
		System.out.println("Pedido código: "+order1.getCode());
		System.out.println("Valor total: " + "R$ " + total1);
		var total2=	orderService.total(order2);
		System.out.println("---------------------");
		System.out.println("Pedido código: "+order2.getCode());
		System.out.println("Valor total: " + "R$ " + total2);
		var total3=	orderService.total(order3);
		System.out.println("---------------------");
		System.out.println("Pedido código: "+order3.getCode());
		System.out.println("Valor total: " + "R$ " + total3);

	}
}
