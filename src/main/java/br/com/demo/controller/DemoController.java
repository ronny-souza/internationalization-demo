package br.com.demo.controller;

import br.com.demo.model.FooDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @PostMapping
    public ResponseEntity<Void> foo(@RequestBody @Valid FooDTO body) {
        return ResponseEntity.ok().build();
    }
}
