package BackEnd.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//transfer object data from controller. usercontroller -> userDTO pass
//we can pass cuz we modify tht dt in usercontroller using Reqbody
public class UserDTO {
    private int id;
    private String name;
    private String address;
}
