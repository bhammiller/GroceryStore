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

    Double cosmeticysum = 0.00;
    Double cleanysum = 0.00;
    Double snackysum=0.00;
    JBCStore jbcStore;

    // Starting Methods
    @GetMapping("/")
    public String startInventory(Model model){
        model.addAttribute("jbc", new JBCStore());
        return "storeinput";
    }

    @PostMapping("/process")
    public String processBegin(@Valid @ModelAttribute("jbc") JBCStore jbcStore1, BindingResult result){
        if (result.hasErrors()){
            return "storeinput";
        }
        jbcRepository.save(jbcStore1);
        return "redirect:/addcosmetics";
    }

    // Cosmetic Methods
    @GetMapping("/addcosmetics")
    public String cosmeticsForm(Model model){
        model.addAttribute("cosmetic", cosmeticsRepository.findAll());
        model.addAttribute("addcosmetics", new Cosmetics());
        return "cosmeticsinput";
    }

    @PostMapping("/addcosmetics")
    public String postedCosmetics(@Valid @ModelAttribute("addcosmetics") Model model){
        model.addAttribute("cosmetic", cosmeticsRepository.findAll());
        model.addAttribute("addcosmetics", new Cosmetics());
        return "cosmeticsinput";
    }

    @PostMapping("/processcosmetics")
    public String processCosmetics(@Valid @ModelAttribute("addcosmetics") Cosmetics cosmetics,BindingResult result){
        if (result.hasErrors()){
            return "cosmeticsinput";
        }
        Double x = cosmetics.getCosmeticsprice()*cosmetics.getCosmeticsquantity();
        cosmetics.setTotalprice(x);
        cosmeticysum=cosmeticysum+x;
        jbcStore.setCosmeticsum(cosmeticysum);
        jbcRepository.save(jbcStore);
        cosmeticsRepository.save(cosmetics);
        return "redirect:/addcosmetics";
    }

    // Cleaning Methods
    @GetMapping("/addcleaning")
    public String cleaningForm(Model model){
        model.addAttribute("cleaning", cleaningRepository.findAll());
        model.addAttribute("addcleaning", new CleaningItems());
        return "cleaninginput";
    }

    @PostMapping("/addcleaning")
    public String postedcleaning(@Valid @ModelAttribute("addcleaning") Model model){
        model.addAttribute("cleaning", cleaningRepository.findAll());
        model.addAttribute("addcleaning", new CleaningItems());
        return "cleaninginput";
    }

    @PostMapping("/processcleaning")
    public String processcleaning(@Valid @ModelAttribute("addcleaning") CleaningItems cleaningItems, BindingResult result){
        if (result.hasErrors()){
            return "cleaninginput";
        }
        Double x = cleaningItems.getCleaningprice()*cleaningItems.getCleaningquantities();
        cleaningItems.setTotalprice(x);
        cleanysum=cleanysum+x;
        jbcStore.setCleaningsum(cleanysum);
        jbcRepository.save(jbcStore);
        cleaningRepository.save(cleaningItems);
        return "redirect:/addcleaning";
    }

    // Snack Methods
    @GetMapping("/addsnacks")
    public String snacksForm(Model model){
        model.addAttribute("snack", snackRepository.findAll());
        model.addAttribute("addsnacks", new Snacks());
        return "snackinput";
    }

    @PostMapping("/addsnacks")
    public String postedSnacks(@Valid @ModelAttribute("addsnacks") Model model){
        model.addAttribute("snack", snackRepository.findAll());
        model.addAttribute("addsnacks", new Snacks());
        return "snackinput";
    }

    @PostMapping("/processsnacks")
    public String processSnacks(@Valid @ModelAttribute("addsnacks") Snacks snacks, BindingResult result){
        if (result.hasErrors()){
            return "snackinput";
        }
        Double x = snacks.getSnackprice()*snacks.getSnackquantity();
        snacks.setTotalprice(x);
        snackysum =snackysum + x;
        jbcStore.setSnacksum(snackysum);
        jbcRepository.save(jbcStore);
        return "redirect:/addsnacks";
    }

    // Completion Methods
    @RequestMapping("/inventorycompletion")
    public String listAddresses(Model model1, Model model2, Model model3, Model model4){
        model1.addAttribute("jbc", jbcRepository.findAll());
        model2.addAttribute("cosmetic", cosmeticsRepository.findAll());
        model3.addAttribute("cleaning", cleaningRepository.findAll());
        model4.addAttribute("snack", snackRepository.findAll());
        return "storeoutput";
    }
}
