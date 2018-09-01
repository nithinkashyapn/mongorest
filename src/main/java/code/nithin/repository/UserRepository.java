package code.nithin.repository;

import code.nithin.entity.User;
import org.mongodb.morphia.Key;

public interface UserRepository {
    public Key<User> save(User user);
}
