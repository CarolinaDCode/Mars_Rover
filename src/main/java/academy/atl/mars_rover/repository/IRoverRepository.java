package academy.atl.mars_rover.repository;

import academy.atl.mars_rover.models.RoverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoverRepository extends JpaRepository<RoverEntity, Long> {
}
