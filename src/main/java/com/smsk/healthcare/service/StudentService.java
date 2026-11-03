package com.smsk.healthcare.service;

import com.smsk.healthcare.entity.student;
import com.smsk.healthcare.repository.studentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final studentRepository service;

    public List<student> get(){
        return service.findAll();
    }

    public student insert(student new_student){

        return service.save(new_student);
    }

    public student update(Long id, student new_student){

        student oldid=service.findById(id).orElseThrow(()->new RuntimeException("id not found"));

        oldid.setName(new_student.getName());
        oldid.setAge(new_student.getAge());

        return service.save(oldid);
    }

    public String delete(Long id) {

        service.deleteById(id);
        return "id deleted";

    }
}
