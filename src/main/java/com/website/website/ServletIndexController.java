package com.website.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class ServletIndexController {  //Controller
    // @RequestMapping("index")
    // public ModelAndView Index(UserDetails ud){
    //     // HttpSession session=request.getSession();
    //     // String s=request.getParameter("name");
    //     ModelAndView mav=new ModelAndView();
    //     mav.addObject("details",ud);
    //     mav.setViewName("index");

    //     //session.setAttribute("username",userName);//Data or Model
    //     return mav;
    //     //return "index"; //View page
    // }
    @Autowired
    UserDAO userDAO;

    @RequestMapping("index")
    public String User(){
        return "index";
    }
    @RequestMapping("addUser")
    public String AddUser(UserDetails userDetails){
        userDAO.save(userDetails);
        return "index";
    }
    @RequestMapping("getUser")
    public ModelAndView ShowUser(@RequestParam int id){
        ModelAndView mav=new ModelAndView("showUser");
        UserDetails userDetails=userDAO.findById(id).orElse(new UserDetails());
        mav.addObject(userDetails);
        return mav;
    }
    @RequestMapping("deleteUser")
    public ModelAndView DeleteUser(@RequestParam int id){
        ModelAndView mav=new ModelAndView("deleteUser");
        UserDetails userDetails=userDAO.findById(id).orElse(new UserDetails());
        userDAO.deleteById(id);
        mav.addObject(userDetails);
        return mav;
    }
    @RequestMapping("updateUser")
    public ModelAndView UpdateUser(UserDetails userDetails){
        ModelAndView mav=new ModelAndView("updateUser");
        userDetails=userDAO.findById(userDetails.getId()).orElse(new UserDetails());
        userDAO.deleteById(userDetails.getId());
        mav.addObject(userDetails);
        return mav;
    }
}
