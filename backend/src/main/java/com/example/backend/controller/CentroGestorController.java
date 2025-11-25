package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.sqlserver2.repository.CentroGestor;

@RestController
@RequestMapping("/api/centrogestor")
public class CentroGestorController {
    
    @Autowired
    private CentroGestor centrogestor;

    @GetMapping("/percod/{percod}/ent/{ent}/eje/{eje}")
    public List<Object[]> getcentrogestor(
        @PathVariable String percod,
        @PathVariable Integer ent,
        @PathVariable String eje) {
            return centrogestor.findDepartmentsByUserAndEntity(percod, ent, eje);
        }
}
