package com.groupeisi.web;

import com.groupeisi.domain.Etudiant;
import com.groupeisi.repository.EtudiantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EtudiantController {

    @Autowired
    EtudiantRepository repo;

    @GetMapping("/students")
    public List<Etudiant> getAllStudents() {
        List<Etudiant> students = repo.findAll();
        return students;
    }

    @GetMapping("/students/{id}")
    public Etudiant getStudent(@PathVariable int id) {
        Etudiant student = repo.findById(id).get();

        return student;
    }

    @PostMapping("/student/add")
    public ResponseEntity<Etudiant> createStudent(@RequestBody Etudiant student) {
        Etudiant newStudent = repo.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    @PutMapping("/student/update/{id}")
    public Etudiant updateStudents(@PathVariable int id) {
        Etudiant student = repo.findById(id).get();
        student.setName("fatima");
        student.setEmail("fatimaniang208@gmail.com");
        repo.save(student);
        return student;
    }

    @DeleteMapping("/student/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void removeStudent(@PathVariable int id) {
        Etudiant student = repo.findById(id).get();
        repo.delete(student);
    }
}
