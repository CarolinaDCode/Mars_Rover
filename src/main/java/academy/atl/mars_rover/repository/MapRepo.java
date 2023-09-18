package academy.atl.mars_rover.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class MapRepo {
    @PersistenceContext
    EntityManager dataBase;

    @Transactional
    public void saveMap(int x, int y){
        try {
            String consultaSql = "INSERT INTO map (x, y) VALUES (:xParam, :yParam)";

            dataBase.createNativeQuery(consultaSql)
                    .setParameter("xParam", x)
                    .setParameter("yParam", y)
                    .executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
