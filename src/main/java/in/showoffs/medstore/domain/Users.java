package in.showoffs.medstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users{
	
	@Id
	@GeneratedValue
	int id;

}
