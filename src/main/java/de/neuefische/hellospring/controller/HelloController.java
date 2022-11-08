package de.neuefische.hellospring.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class HelloController {
/*
    @GetMapping
    public String halloWorld(){
        return "Hallo World!";
    }*/

/*
    @GetMapping("/{string}")
    public String halloWorld(@PathVariable String string){
        return "Hallo " + " " + string;
    }
*/

    @GetMapping

    public String halloName(@RequestParam("name") Optional<String> name){
        return "Hallo " + " " + name.orElseGet(() -> "User");
    }

    @GetMapping("/{name}")
    public String halloNameToo(@PathVariable("name") Optional<String> name){
        return "Hallo " + " " + name.orElseGet(() -> "User");
    }


/*    @PostMapping
    public String acceptHallo(@RequestBody String request){
        return "Hi, deine Anfrage war: " + request;
    }*/

    @PostMapping
    public String textLength(@RequestBody String text){
        return "Die Anzahl der Zeichne im Text ist " + text.length();
    }



}
