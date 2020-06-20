package verishko.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import verishko.sarafan.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
