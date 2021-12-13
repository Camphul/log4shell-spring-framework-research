package com.example.testwebapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:luca@camphuisen.com">Luca Camphuisen</a>
 * @since 13 December, 2021
 */
@RestController
public class RestControlllerr {

    @GetMapping("/private")
    public ResponseEntity<?> endpointPrivate() {
        return ResponseEntity.ok("private endpoint reached" + System.currentTimeMillis());
    }

    @GetMapping("/escalated")
    public ResponseEntity<?> endpointEscalated() {
        return ResponseEntity.ok("private endpoint reached" + System.currentTimeMillis());
    }

    @GetMapping("/public")
    public ResponseEntity<?> endpointPublic() {
        return ResponseEntity.ok("public endpoint reached" + System.currentTimeMillis());
    }
}
