package com.beekeeper.service.implementations;

import com.beekeeper.modules.dao.interfaces.RoleDao;
import com.beekeeper.modules.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Service
public class ServletUtilService {
    private static final Logger LOG = LogManager.getLogger(ServletUtilService.class);
    @Autowired
    private FindService findService;
    @Autowired
    private RoleDao roleDao;


    public User setUser(HttpServletRequest req) {
        User user = new User();


        String id = req.getParameter("id");
        String first_name = req.getParameter("first_name");
        String last_name = req.getParameter("last_name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String passport = req.getParameter("passport");
        String roleName = req.getParameter("role");


        if (!id.equals("")) {
            user.setId(Long.parseLong(id));
        }
        user.setFirstName(first_name);
        user.setLastName(last_name);
        user.setPassport(passport);
        user.setEmail(email);
        user.setPassword(password);

        user.setRole(roleDao.findByName(roleName));

        return user;
    }

    public void setRequestListForUser(Model model) throws IOException {
        model.addAttribute("roles", findService.getListRole());
    }

}
