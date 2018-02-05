package com.example.demo;

import com.example.demo.Classes.*;
import com.example.demo.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    CosmeticsRepository cosmeticsRepository;
    @Autowired
    CleaningRepository cleaningRepository;
    @Autowired
    SnackRepository snackRepository;
    @Autowired
    JBCRepository jbcRepository;

    // Starting Methods
    @GetMapping("/")
    public String startResumeBuilder(Model model){
        model.addAttribute("jbc", new JBCStore());
        return "storebuilder";
    }

    @PostMapping("/process")
    public String processBegin(@Valid @ModelAttribute("jbc") JBCStore jbcStore1, BindingResult result){
        if (result.hasErrors()){
            return "storebuilder";
        }
        jbcRepository.save(jbcStore1);
        return "redirect:/addeducation";
    }

    // Cosmetic Methods


    // Cleaning Methods


    // Snack Methods


    // Completion Methods
}
