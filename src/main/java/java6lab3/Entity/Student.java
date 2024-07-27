package java6lab3.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String email;
    String fullname;
    Double marks;
    Boolean gender;
    String country;
}
