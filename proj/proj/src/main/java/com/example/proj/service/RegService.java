package com.example.proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj.model.Reg;
import com.example.proj.repository.RegRepo;
@Service
public class RegService {
    @Autowired
    RegRepo mr;
    public Reg create (Reg mm)
    {
        return mr.save(mm);
    }
    public List<Reg> getAll()
    {
        return mr.findAll();
    }
    public Reg getMe(int id)
    {
        return mr.findById(id).orElse(null);
    }
    public boolean updateDetails(int id,Reg mm)
        {
            if(this.getMe(id)==null)
            {
                return false;
            }
            try{
                mr.save(mm);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteProduct(int id)
        {
            if(this.getMe(id) == null)
            {
                return false;
            }
            mr.deleteById(id);
            return true;
        }

}