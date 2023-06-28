package com.newOption;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encriptar {
    public static void main(String[] args) {
        var codigo = new BCryptPasswordEncoder();
        System.out.println("mauricio (123): "+codigo.encode("123"));
        System.out.println("valeria (456): "+codigo.encode("456"));
        System.out.println("armando (789): "+codigo.encode("789"));
        
    }
}
