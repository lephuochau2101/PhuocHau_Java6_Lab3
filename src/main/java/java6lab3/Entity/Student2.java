package java6lab3.Entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student2 {
    @NotBlank(message = "Không được để trống email")
    @Email(message = "Vui lòng nhập đúng định dang email")
    String email;
    @NotBlank(message = "Không được để trống Họ và Tên")
    String fullname;
    @NotNull(message = "Không được để trống")
    @PositiveOrZero(message = "Điểm phải lớn hơn hoặc bằng không")
    @Max(value = 10, message = "điểm phải nhỏ hơn hoặc bằng 10")
    Double marks;
    @NotNull(message = "Vui lòng chọn giới tính")
    Boolean gender;
    @NotBlank(message = "Vui lòng chọn quốc gia")
    String country;
}
