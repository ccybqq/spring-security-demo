package pers.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IMyUserRepo extends JpaRepository<MyUser, Integer> {
    MyUser findByUsernm(String username);
}
