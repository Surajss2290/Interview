package org.example.interview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {


    @GetMapping("/employee")
    public ArrayList<HashMap<Integer, Employee>> getemployee() {

        ArrayList<HashMap<Integer, Employee>> list = new ArrayList<>();

        HashMap<Integer, Employee> details = new HashMap<>();

        details.put(1, new Employee("suraj", 700000));

        details.put(2, new Employee("raj", 800000));

        details.put(3, new Employee("karan", 800000));

        list.add(details);

        return  list;
    }


    @GetMapping("/emp")
//    public List<Map<Integer, Object>> getem(){
            public  String getem(){
        List<Map<Integer, Object>> list=new ArrayList<>();

        Map<Integer, Object> mapp=new HashMap<>();




        Map<String,Object> map=new HashMap<>();
        map.put("emp_1",1);
        map.put("name_1","suraj");
        map.put("salary_1",2000000);

        Map<String,Object> map2=new HashMap<>();
        map2.put("emp_2",2);
        map2.put("name_2","sumit");
        map.put("salary_2",1000000);

        Map<String,Object> map3=new HashMap<>();
        map3.put("emp_3",3);
        map3.put("name_3","rohit");
        map3.put("salary_3",300000);


        mapp.put(1,map);
        mapp.put(2,map2);
        mapp.put(3,map3);

        list.add(mapp);
//        list.add(map2);
//        list.add(map3);

       // System.out.println("MAP"+map);

       return "HEllo";

    }
    }