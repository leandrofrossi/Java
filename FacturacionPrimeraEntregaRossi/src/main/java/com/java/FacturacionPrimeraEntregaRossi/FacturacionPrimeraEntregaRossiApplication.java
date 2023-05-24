package com.java.FacturacionPrimeraEntregaRossi;

import com.java.FacturacionPrimeraEntregaRossi.model.Client;
import com.java.FacturacionPrimeraEntregaRossi.model.Product;
import com.java.FacturacionPrimeraEntregaRossi.repository.ClientRepository;
import com.java.FacturacionPrimeraEntregaRossi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class FacturacionPrimeraEntregaRossiApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository prodRepository;

	@Autowired
	private ClientRepository clientsRepository;

	public static void main(String[] args) {
		SpringApplication.run(FacturacionPrimeraEntregaRossiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("http://localhost:8888/h2-console");

		try {
			//Creacion de los productos y guardado
			Product burger = new Product();
			burger.setCode("burg5863");
			burger.setDescription("Hamburguesa doble con cheddar y panceta");
			burger.setPrice(2000);
			burger.setStock(1200);
			this.prodRepository.save(burger);

			Product pizza = new Product();
			pizza.setCode("pizz4582");
			pizza.setDescription("Pizza grande con muzzarella, jamón y morrones");
			pizza.setPrice(2500);
			pizza.setStock(1600);
			this.prodRepository.save(pizza);

			Product hotDog = new Product();
			hotDog.setCode("hotd6913");
			hotDog.setDescription("Super pancho estilo aleman con salsa a elección");
			hotDog.setPrice(1300);
			hotDog.setStock(900);
			this.prodRepository.save(hotDog);

			Product beer = new Product();
			beer.setCode("beer3694");
			beer.setDescription("Pinta de cerveza artesanal");
			beer.setPrice(850);
			beer.setStock(2500);
			this.prodRepository.save(beer);

			Product coke = new Product();
			coke.setCode("coke5237");
			coke.setDescription("Coca-cola de 500ml");
			coke.setPrice(600);
			coke.setStock(1800);
			this.prodRepository.save(coke);

			//Creacion de los clientes y guardado
			Client client1 = new Client();
			client1.setName("Agustin");
			client1.setLastname("Hernandez");
			client1.setDocnumber("47276351");
			this.clientsRepository.save(client1);

			Client client2 = new Client();
			client2.setName("Dario");
			client2.setLastname("Gutierrez");
			client2.setDocnumber("25763098");
			this.clientsRepository.save(client2);

			Client client3 = new Client();
			client3.setName("Daniela");
			client3.setLastname("Rodriguez");
			client3.setDocnumber("36459730");
			this.clientsRepository.save(client3);

			Client client4 = new Client();
			client4.setName("Ana");
			client4.setLastname("Garcia");
			client4.setDocnumber("18753942");
			this.clientsRepository.save(client4);

			Client client5 = new Client();
			client5.setName("Jorge");
			client5.setLastname("Perez");
			client5.setDocnumber("16649432");
			this.clientsRepository.save(client5);


			//Obtencion e impresion en consola de los productos y clientes
			Optional<Product> producto1 = this.prodRepository.findById(1);
			Optional<Product> producto2 = this.prodRepository.findById(2);
			Optional<Product> producto3 = this.prodRepository.findById(3);
			Optional<Product> producto4 = this.prodRepository.findById(4);
			Optional<Product> producto5 = this.prodRepository.findById(5);

			Optional<Client> cliente1 = this.clientsRepository.findById(1);
			Optional<Client> cliente2 = this.clientsRepository.findById(2);
			Optional<Client> cliente3 = this.clientsRepository.findById(3);
			Optional<Client> cliente4 = this.clientsRepository.findById(4);
			Optional<Client> cliente5 = this.clientsRepository.findById(5);

			System.out.println("Lista de productos: ");
			System.out.println(producto1);
			System.out.println(producto2);
			System.out.println(producto3);
			System.out.println(producto4);
			System.out.println(producto5);

			System.out.println("Lista de clientes: ");
			System.out.println(cliente1);
			System.out.println(cliente2);
			System.out.println(cliente3);
			System.out.println(cliente4);
			System.out.println(cliente5);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
