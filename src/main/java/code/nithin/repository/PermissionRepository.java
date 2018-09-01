package code.nithin.repository;

import code.nithin.entity.Permission;
import org.mongodb.morphia.Key;

public interface PermissionRepository {
    public Key<Permission> save(Permission permission);
}
