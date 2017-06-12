package luis.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RainRepository extends JpaRepository<Rain, Long> {

    Page<Rain> findAll(Pageable pageable);

    Rain findByNameAndLocalAllIgnoringCase(String name, String local);

}