/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.project.dao.testDao;
import test.project.entity.Sinhvien;

/**
 *
 * @author Thanh Hoai
 */
@Service
public class testServiceImpl implements testService{

    @Autowired
    private testDao t;
    
    @Override
    public List<Sinhvien> getAll() {
        return t.getALL();
    }
    
    
}
