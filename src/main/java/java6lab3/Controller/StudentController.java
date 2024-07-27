package java6lab3.Controller;


import java6lab3.Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/student/form")
    public String form(Model model){
        Student student = new Student();
        student.setFullname("Ngô Thành AN");
        student.setGender(true);
        student.setMarks(10.0);
        student.setEmail("anntps28579@fpt.edu.vn");
        model.addAttribute("sv",student);
        return "form";
    }
    @PostMapping("/student/save")
    public String save(@ModelAttribute("sv") Student form){
        return "success";
    }
}
