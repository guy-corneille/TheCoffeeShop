package mpu.exam.thecoffeeshop.controller;

import mpu.exam.thecoffeeshop.service.CategoryService;
import mpu.exam.thecoffeeshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@Autowired
    CategoryService categoryService;
@Autowired
    ProductService productService;

    @GetMapping("/home")
    public String showClientForm(Model model) {

        return "index";
    }
    @GetMapping("/menu")
    public  String showMenu(Model model){
         model.addAttribute("categories", categoryService.getAllCategory());
         model.addAttribute("products", productService.getAllProduct());
         return "menu";
    }

}
