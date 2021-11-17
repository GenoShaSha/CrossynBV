package Backend.Classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Getter
    @Setter
    @Id
    private String id;
    @Getter
    @Setter
    private String brand;
    @Getter
    @Setter
    private String lplate;
    @Getter
    @Setter
    private String color;

    public Vehicle(String id, String brand, String lplate, String color) {
        this.id = id;
        this.brand = brand;
        this.lplate = lplate;
        this.color = color;
    }
}
