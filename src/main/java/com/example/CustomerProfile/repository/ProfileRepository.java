package com.example.CustomerProfile.repository;

import com.example.CustomerProfile.model.Profile;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends ReactiveCrudRepository<Profile,Integer> {
}
