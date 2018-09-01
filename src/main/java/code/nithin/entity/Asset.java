package code.nithin.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity("asset")
@NoArgsConstructor
public class Asset {

    @Id
    private ObjectId id;
    private String URL;
    private long timeStamp;
    private int version;

    public Asset(int version, String URL) {
        this.version = version;
        this.URL = URL;
        this.timeStamp = System.currentTimeMillis();
    }

    public ObjectId getId() {
        return id;
    }

    public String getURL() {
        return URL;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public int getVersion() {
        return version;
    }

}
