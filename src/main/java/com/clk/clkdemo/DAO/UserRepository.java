package com.clk.clkdemo.DAO;

import com.clk.clkdemo.model.entitis.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
