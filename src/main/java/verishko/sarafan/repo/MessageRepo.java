package verishko.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import verishko.sarafan.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
