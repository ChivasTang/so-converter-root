package jp.co.nttcom.business.converter.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ModelAndView index(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Model model, Locale locale){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("message","Hello World...");
        return mv;
    }
}
