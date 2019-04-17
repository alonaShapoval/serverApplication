package com.beekeeper.service.implementations;

import com.beekeeper.modules.dao.interfaces.UserDao;
import com.beekeeper.modules.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {
    @Autowired
    private UserDao userDao;
    private static final Logger LOG = LogManager.getLogger(UserDetailsServiceImplementation.class);



    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOG.debug("it is loadUserByUsername method " + username);
        User user = userDao.findByLogin(username);
        LOG.debug("it is password " + user.getPassword());

        Set<GrantedAuthority> grantedAuthoritySet = new HashSet<GrantedAuthority>();
        if(user.getRole().getName().equals("admin")){
            grantedAuthoritySet.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }else{
            grantedAuthoritySet.add(new SimpleGrantedAuthority("ROLE_USER"));
        }

        for(GrantedAuthority grantedAuthority : grantedAuthoritySet){
            LOG.debug("grant user " + grantedAuthority);
        }

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantedAuthoritySet);
    }


}
