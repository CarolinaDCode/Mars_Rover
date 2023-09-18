package academy.atl.mars_rover.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="obstacle")
public class ObstaclesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_obstacle", nullable = false)
    private Long id;

    @Column(name = "x", nullable = false)
    private int x;

    @Column(name = "y", nullable = false)
    private int y;

    /**
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }*/
}
