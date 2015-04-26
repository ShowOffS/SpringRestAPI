package in.showoffs.medstore.repo.user.login;

import in.showoffs.medstore.domain.user.login.Login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, String>{
 
}
