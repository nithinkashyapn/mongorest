package code.nithin.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity("permission")
@NoArgsConstructor
public class Permission {

    @Id
    private ObjectId id;
    private List<ObjectId> owners = new ArrayList<ObjectId>();

    public Permission(ObjectId creator){
        this.owners.add(creator);
    }

    public ObjectId getId() {
        return id;
    }

    public List<ObjectId> getOwners() {
        return owners;
    }
}
