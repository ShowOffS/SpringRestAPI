package in.showoffs.medstore.domain;


/*@Entity
@Table(name = "users")*/
public class Users{
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)*/
	int id;
	
	String userName;
	
	String firstName;
	String lastName;
	String designation;
	String luckyNumber;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLuckyNumber() {
		return luckyNumber;
	}

	public void setLuckyNumber(String luckyNumber) {
		this.luckyNumber = luckyNumber;
	}
	

}
