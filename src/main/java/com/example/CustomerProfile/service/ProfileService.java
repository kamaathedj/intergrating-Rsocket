package com.example.CustomerProfile.service;

import com.example.CustomerProfile.model.Profile;
import com.example.CustomerProfile.repository.ProfileRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class ProfileService {

    public final ProfileRepository repository;
    public final Map<Integer,Profile> profileMap;

    public ProfileService(ProfileRepository repository, Map<Integer, Profile> profileMap) {
        this.repository = repository;
        this.profileMap = profileMap;
        getData();
    }

    public Mono<Profile> getProfile(int id){
        return repository.findById(id);
    }

    public Flux<Profile> getAllProfile() {
        return repository.findAll();
    }

    /**
     * what
     * is
     * this
     **/
    public void getData(){
        System.out.println(profileMap.get(1));
    }

}
