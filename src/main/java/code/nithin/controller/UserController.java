package code.nithin.controller;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import code.nithin.entity.User;
import code.nithin.repository.UserRepository;

@Repository
public class UserController implements UserRepository{
    @Autowired
    private Datastore datastore;

    @Override
    public Key<User> save(User user){
        return datastore.save(user);
    }
}
