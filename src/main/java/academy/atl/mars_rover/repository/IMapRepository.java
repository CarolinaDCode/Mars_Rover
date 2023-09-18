package academy.atl.mars_rover.repository;

import academy.atl.mars_rover.models.MapEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IMapRepository extends JpaRepository<MapEntity, Long>{
}
