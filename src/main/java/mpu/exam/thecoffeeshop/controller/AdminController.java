package mpu.exam.thecoffeeshop.controller;

import jdk.jfr.Category;
import mpu.exam.thecoffeeshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }
    @GetMapping("/admin/category")
    public String getCat(){
        return "category";

    }
    @GetMapping("/admin/category/add")
    public String getCatAdd(){
        return "categoryAdd";

    }
    @PostMapping("/admin/category/add")
    public String postCatAtt(@ModelAttribute("category") Category category){
        categoryService.addCategory(category);
        return "redirect:/admin/category";
    }
}
