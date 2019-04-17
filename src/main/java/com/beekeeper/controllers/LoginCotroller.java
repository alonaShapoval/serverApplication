package com.beekeeper.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import java.io.IOException;

//@RestController
//@RequestMapping(value = "/login")
//@Path("/home")
//@Component
public class LoginCotroller {
//    @POST
//    @Path("/login")
//    @Consumes({"application/json"})
//    @Produces({"application/json"})
//    public String check() throws ServletException, IOException {
//        String role;
//        String redirect = "redirect:";
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//        role = user.getAuthorities().iterator().next().getAuthority();
//
//        if (role.equals("ROLE_ADMIN")) {
//            redirect += "/admin/main";
//        } else {
//            redirect += "/user/main";
//        }
//
//        return redirect;
//    }
//
//
//    @POST
//    @Path("/login")
//    @Consumes({"application/json"})
//    @Produces({"application/json"})
//    public String login( String error, String logout) {
//        if (error != null) {
////            model.addAttribute("error", "Username or password is incorrect.");
//        }
//
//
//        return "login";
//    }
//
//    @RequestMapping(value="/logout", method = RequestMethod.GET)
//    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//
//        if (auth != null){
//            new SecurityContextLogoutHandler().logout(request, response, auth);
//        }
//        return "redirect:/login?logout";
//    }
}
