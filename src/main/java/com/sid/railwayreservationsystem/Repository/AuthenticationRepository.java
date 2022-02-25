package com.sid.railwayreservationsystem.Repository;

import com.sid.railwayreservationsystem.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AuthenticationRepository extends MongoRepository<User, ObjectId> {


    Optional<User> findUserByEmail(String email);

    Optional<User> findUserByApiKey(String apiKey);
}
