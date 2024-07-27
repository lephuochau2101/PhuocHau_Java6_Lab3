package java6lab3.Controller;

import jakarta.validation.Valid;
import java6lab3.Entity.Student2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidateController {
    @RequestMapping("validate/form")
    public String form(Model model){
        Student2 sv = new Student2();
        model.addAttribute("sv",sv);
        return "ValidateForm";
    }
    @PostMapping("validate/validate")
    public String save(Model model, @Valid @ModelAttribute("sv") Student2 sv, Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("message","Vui lòng sửa các lỗi sau");
            return "ValidateForm";
        }
        return "ValidateSuccess";
    }
}
