package com.example.proj.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proj.model.Reg;
public interface RegRepo extends JpaRepository<Reg,Integer>{
    
}