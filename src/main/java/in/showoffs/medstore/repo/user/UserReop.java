package in.showoffs.medstore.repo.user;

import in.showoffs.medstore.domain.user.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserReop extends JpaRepository<Users, Integer>, UserRepoExtension {
	List<Users> findByUserNameLike(@Param("userName") String userName);
	
	List<Users> findByFirstName(@Param("firstName") String firstName);
	
	@Query("Select s from Users s")
	List<Users> tellMe(String g);
}
