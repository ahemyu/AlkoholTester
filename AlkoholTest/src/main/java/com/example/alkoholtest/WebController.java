package com.example.alkoholtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class WebController {

    @GetMapping("/")
    public String showForm(Model m){
        m.addAttribute("alkoholform", new AlkoholForm());
        return "form"  ;
    }


    @PostMapping("form")
    public String sendForm(@Valid @ModelAttribute AlkoholForm alkoholForm, Model m, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "form";
        }
        m.addAttribute("geschlecht", alkoholForm.getGeschlecht());
        System.out.println(alkoholForm.getGeschlecht());
        m.addAttribute("gewicht", alkoholForm.getGewicht());
        m.addAttribute("bierMenge", alkoholForm.getBierMenge());
        m.addAttribute("weinMenge", alkoholForm.getWeinMenge());
        m.addAttribute("kornMenge", alkoholForm.getKornMenge());
        m.addAttribute("vodkaMenge", alkoholForm.getVodkaMenge());
        m.addAttribute("whiskeyMenge", alkoholForm.getWhiskeyMenge());
        return "form";
    }




}
