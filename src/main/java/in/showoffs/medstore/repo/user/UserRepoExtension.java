package in.showoffs.medstore.repo.user;

import in.showoffs.medstore.domain.user.Users;

import java.util.List;

public interface UserRepoExtension {

	List<Users> extended(String userName);
}
