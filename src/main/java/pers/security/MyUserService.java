package pers.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class MyUserService implements UserDetailsService {
    @Autowired
    private IMyUserRepo userRepo;

    MyUser getUserByName(String usernm) {
        return userRepo.findByUsernm(usernm);
    }

    MyUser save(MyUser myUser) {
        return userRepo.save(myUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser myUser = userRepo.findByUsernm(username);
        return new User(myUser.getUsernm(), myUser.getPasswd(), Collections.emptyList());
    }
}
