package code.nithin.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity("user")
@NoArgsConstructor
public class User {

    @Id
    private ObjectId id;
    private String name;
    private ObjectId assetId;
    private ObjectId permissionId;

    public User(ObjectId assetId, ObjectId permissionId){
        this.assetId = assetId;
        this.permissionId = permissionId;
    }

    public ObjectId getId() {
        return id;
    }
}
