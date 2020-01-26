package com.example.springmvconlineshop.controller;

import com.example.springmvconlineshop.domain.Category;
import com.example.springmvconlineshop.service.CategoryServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    private final CategoryServices categoryServices;

    public CategoryController(CategoryServices categoryServices) {
        this.categoryServices = categoryServices;
    }

    @GetMapping("/category")
    public String create(Model model){
        model.addAttribute("category" , new Category());
        return "admin/adminForm";
    }

    @PostMapping("/category")
    public String process(Category category , BindingResult result){
        if(result.hasErrors()){
            return "admin/adminForm";
        }
        categoryServices.create(category);
        return "redirect:/categories";
    }
}
