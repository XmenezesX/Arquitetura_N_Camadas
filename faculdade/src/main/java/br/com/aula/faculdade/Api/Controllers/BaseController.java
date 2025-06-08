package br.com.aula.faculdade.Api.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface BaseController<T> {
    @PostMapping
    public Integer Create(@RequestBody T entity);

    @PutMapping
    public Integer Update(@RequestBody T entity);

    @DeleteMapping("/{id}")
    public String Delete(@PathVariable Integer id);
    
    @GetMapping("/{id}")
    public ResponseEntity<T> GetEntityById(@PathVariable Integer id);

    @GetMapping
    public List<T> GetAllEntitys();
}