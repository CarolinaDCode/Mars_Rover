package academy.atl.mars_rover.repository;

import academy.atl.mars_rover.models.ObstaclesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObstaclesEntity extends JpaRepository<ObstaclesEntity, Long> {
}
