package tacos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.model.Taco;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
