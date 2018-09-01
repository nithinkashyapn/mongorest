package code.nithin.controller;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import code.nithin.entity.Permission;
import code.nithin.repository.PermissionRepository;

@Repository
public class PermissionController implements PermissionRepository{
    @Autowired
    private Datastore datastore;

    @Override
    public Key<Permission> save(Permission permission){
        return datastore.save(permission);
    }

}
