package code.nithin.repository;

import code.nithin.entity.Asset;
import org.mongodb.morphia.Key;

public interface AssetRepository {
    public Key<Asset> save(Asset asset);
}
