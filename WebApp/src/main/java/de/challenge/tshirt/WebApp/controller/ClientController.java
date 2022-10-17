package de.challenge.tshirt.WebApp.controller;

import de.challenge.tshirt.WebApp.dto.ClientDto;
import de.challenge.tshirt.WebApp.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@RequestMapping("/client")
@RestController
public class ClientController {
    // private final ClientService clientService;
    @GetMapping("/client")
    public ResponseEntity<ClientDto> getClient(){
         ClientDto mockedClt = new ClientDto("1", "Roman", "Horielov", "Wiesbaden", "roman@gmail.com", "X", "GREEN");
         return new ResponseEntity<>(mockedClt, HttpStatus.OK);
     }

//@GetMapping("/client")
//    public String helloWorld(){
//        return "Hello World";
//}

}
