package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {


	public static void main(String[] args) {

		//Interface i = new ClaseQueImplementa();
		
		//Orador newOrador = new Orador("pedro", "Suarez", "123email@gmail.com", "JS", LocalDate.now());
		// repository.save(newOrador);
		
		//obtener un orador de la DB
		//Orador newOrador = repository.getById(1L);
		
		//fIND ALL
		
		//System.out.println(orador);
		OradorRepository repository = new MySqlOradorRepository();
		
		//repository.save(new Orador("elena", "schmidt", "elena@gmail.com", "TypeScript", LocalDate.now()));
		
		//repository.delete(12L);
		
		Orador pedro =repository.getById(11L);
		
		pedro.setApellido("Firpo");
		pedro.setNombre("Andres");
		pedro.setTema("JS");
		
		repository.update(pedro);
		
		//pedro.setMail("pedroprueba@yahoo.com.ar");
		
		System.out.println(repository.findAll());
		
		
	}
}