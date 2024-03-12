package BackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //this is hte line where creating a new table 'user'. dont know what happend to the upper letters !
@NoArgsConstructor
@AllArgsConstructor
@Data
//this is class near my DB. DB -> user entity
public class User{
    @Id
    private int id;
    private String name;
    private String address;


}
