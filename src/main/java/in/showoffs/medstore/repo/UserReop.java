package in.showoffs.medstore.repo;

import in.showoffs.medstore.domain.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserReop extends JpaRepository<Users, Integer> {
	List<Users> findByUserNameLike(@Param("userName") String userName);
	
	@Query("Select s from Users s where s.userName=:userName")
	List<Users> tellMe(@Param("userName") String userName);
}
