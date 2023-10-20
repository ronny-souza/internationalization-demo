package br.com.demo.model;

import jakarta.validation.constraints.NotBlank;

public record FooDTO(@NotBlank(message = "{name.not.null.or.blank}") String name) {

}
