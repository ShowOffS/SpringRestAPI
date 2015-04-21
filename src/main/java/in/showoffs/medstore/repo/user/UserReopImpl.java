package in.showoffs.medstore.repo.user;

import java.util.List;

import in.showoffs.medstore.domain.user.Users;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.repository.query.Param;

public class UserReopImpl implements UserRepoExtension {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Users> extended(@Param("userName") String userName) {
		String count = "Select s.userName,s.luckyNumber from Users s where s.userName='" + userName+ "'";
		return (List<Users>) em.createQuery(count).getResultList();
	}

}
