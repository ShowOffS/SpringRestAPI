package in.showoffs.medstore.repo.store;

import in.showoffs.medstore.domain.store.StoreInformation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "store", path = "store")
public interface StoreRepo extends JpaRepository<StoreInformation, Integer>,StoreExtension{

}
