package com.aradhyagupta25.SpringBootWeb1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.lang.model.element.NestingKind;

@Controller
public class HomeController  {

    @RequestMapping("/")
     public String home() {
         System.out.println("Home Method Called!");
         // by default, spring boot doesn't support JSP, we have to convert it into a servlet to be compactible with the tomcat server. need to add dependency to work.
         return "index";        // with the help of prefix and suffix in the application props, we can just write the file name.
     }

//     @RequestMapping("/add")
//     // Servlet Way:
//     public String add(HttpServletRequest request, HttpSession session) {
//         System.out.println("Add Method Called!");
//
//         int num1 = Integer.parseInt(request.getParameter("num1"));
//         int num2 = Integer.parseInt(request.getParameter("num2"));
//         int result = num1 + num2;
//         //System.out.println(result);
//
//         // we will set the Attribute which we want to return to the client. spring will handle the object creation for the ref "session". we will fetch the attribute in the result.jsp file.
//         session.setAttribute("result", result);
//         return "result.jsp";
//     }

//    @RequestMapping("/add")
//    // Spring way: here we can directly pass the parameters from the url. for custom name of the parameter, we have to use @RequestParam .
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
//        System.out.println("Add Method Called!");
//
//        int result = num + num2 + 1;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    // In MVC, M is Model. we can use model to store data in the form of Object instead of creating a session.
//    public String add(@RequestParam("num1") int num, int num2, Model model) {
//        System.out.println("Add Method Called!");
//        int result = num + num2 + 2;
//
//        model.addAttribute("result", result);   // model
//        return "result";    //view
//    }

    @RequestMapping("/add")
    // here, we are storing the result and the page in the ModelAndView Object and return the object directly.
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv){
        System.out.println("Add Method Called!");
        int result = num + num2 + 3;

        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    // using the @ModelAttribute, we can directly store the values in the object with the need to set them manually. also, we can set the name of the ref var in the annotation. it's optional to use only when we want some different name for the ref variable.
    public String addAlien(@ModelAttribute("alien1") Alien alien, ModelAndView mv) {
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");

        return "result";
    }

    @ModelAttribute("course")
    public String course(){
        return "Java";
    }


}
