package com.example.CustomerProfile.Controller;


import com.example.CustomerProfile.model.Profile;
import com.example.CustomerProfile.service.ProfileService;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Controller
public class ProfileController {
    Logger l = Logger.getLogger(getClass().getName());

    public final ProfileService service;

    public ProfileController(ProfileService service) {
        this.service = service;
    }

    @MessageMapping("profiles.{customerId}")
    public Mono<Profile> getProfile(@DestinationVariable Integer customerId){
        //l.info(customerId.toString());
        return service.getProfile(customerId);
    }

    //testing purpose
//    @GetMapping("/all")
//    public Flux<Profile> getAll(){
//        return service.getAllProfile();
//    }
}
