package in.showoffs.medstore.repo;

import in.showoffs.medstore.domain.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserReop extends JpaRepository<Users, Long> {
	List<Users> findByFirstNameLike(@Param("userName") String userName);
}
