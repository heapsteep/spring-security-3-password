package com.heapsteep.service;

import com.heapsteep.entity.User;
import com.heapsteep.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUserName(username);
        List authorities=new ArrayList();
        authorities.add(new SimpleGrantedAuthority(user.getRoles()));
        return new org.springframework.security.core.userdetails.User
                (user.getUserName(), user.getPassword(), authorities);
    }
}
