import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    Registration findByUserName(String userName);
    Registration findByEmail(String email);
    List<Registration> findByFirstNameAndLastName(String firstName, String lastName);
    List<Registration> findByCompanyAndUKPostalCode(String company, String ukPostalCode);
    List<Registration> findByTelephoneNo(String telephoneNo);
}