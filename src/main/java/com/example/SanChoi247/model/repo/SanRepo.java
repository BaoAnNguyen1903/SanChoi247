package com.example.SanChoi247.model.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SanRepo {
    @Autowired
    ChuSanRepo chuSanRepo;
}
