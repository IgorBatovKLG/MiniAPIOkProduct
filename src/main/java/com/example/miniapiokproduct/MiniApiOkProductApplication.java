package com.example.miniapiokproduct;

import com.example.miniapiokproduct.dataBase.ReportFbOrderList;
import com.example.miniapiokproduct.models.ProductModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniApiOkProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniApiOkProductApplication.class, args);
        ReportFbOrderList list = new ReportFbOrderList();
    }

}
