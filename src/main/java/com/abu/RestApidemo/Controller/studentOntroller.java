package com.abu.RestApidemo.ontroller;


import com.abu.RestApidemo.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentOntroller {

    @GetMapping("/std")
   public  Student getStudent(){
       Student student = new Student(1,"Abu","Sheik");

       return student;
   }

   @GetMapping("/stds")
   public List<Student> getStudents(){
        List<Student> stds = new ArrayList<>();
        stds.add(new Student(1,"Abu","Sheik"));
        stds.add(new Student(2,"Sheik","Sal"));
        stds.add(new Student(3,"Thasneem","Banu"));
        return stds;

   }

  @GetMapping("/std/{id}/{firstName}/{lastName}")
 public  Student pathVariablePra(@PathVariable  int id , @PathVariable String firstName, @PathVariable String lastName){
        return new Student(id,firstName,lastName);
 }
 //http://localhost:8080/std/query?id=1&firstName=Sheik&lastName=Abu
 @GetMapping("/std/query")
 public Student requestParam(@RequestParam int id , @RequestParam String firstName , @RequestParam String lastName){
        return  new Student(id,firstName,lastName);
 }

 @PostMapping("/std/new")
 @ResponseStatus(HttpStatus.CREATED)
 public Student newStudent(@RequestBody  Student std){
      System.out.println(std.getFirstName());
      System.out.println(std.getId());
       System.out.println( std.getLastName());
       return std;
 }



}

