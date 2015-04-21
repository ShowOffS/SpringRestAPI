package in.showoffs.medstore.repo;

import in.showoffs.medstore.domain.Users;

import java.util.List;

public interface UserRepoExtension {

	List<Users> extended(String userName);
}
