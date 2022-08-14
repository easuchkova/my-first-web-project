package com.example.myfirstwebproject;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // для final полей

public class StringController {
    private final StringService service;

    @GetMapping("/returnString")
    public String returnString() {
        return service.returnString();
    }
    @GetMapping("/chooseString")
    @ResponseBody
    public String chooseString(@RequestParam int number){
        return service.chooseString(number);
    }

}

// в браузере указать какую-то цифру и получить эту цифру в контрллер и вернуть строку с этой цифрой
// service // component // rest controller // repository