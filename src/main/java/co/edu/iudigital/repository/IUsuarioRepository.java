package co.edu.iudigital.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.model.Usuario;

@Repository
public interface IUsuarioRepository 
	extends CrudRepository<Usuario, Long>{
	
	Usuario findByUsername(String username);
}
