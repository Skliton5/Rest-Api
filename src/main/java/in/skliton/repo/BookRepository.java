package in.skliton.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.skliton.enitity.Book;
@RepositoryRestResource(path = "books")
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	public List<Book> findByNameContaining(@Param ("name") String name);
	
	
	
	}
