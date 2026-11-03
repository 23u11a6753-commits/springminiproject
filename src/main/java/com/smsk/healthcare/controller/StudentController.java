package com.smsk.healthcare.controller;

import com.smsk.healthcare.entity.student;
import com.smsk.healthcare.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor

public class StudentController {

    private final StudentService con;

    @GetMapping("/all")
    public List<student> getall(){
        return con.get();

    }
    @PostMapping("/add")
    public student add(@RequestBody student student_new)
    {
        return con.insert(student_new);
    }

    @PutMapping("/update/{id}")
    public student update(@PathVariable Long id,@RequestBody student new_student){
        return con.update(id,new_student);
    }

    @DeleteMapping("/delete/{id}")

    public void delete(@PathVariable Long id){
        con.delete(id);
    }
}
