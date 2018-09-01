package code.nithin.controller;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import code.nithin.entity.Asset;
import code.nithin.repository.AssetRepository;

@Repository
public class AssetController implements AssetRepository{
    @Autowired
    private Datastore datastore;

    @Override
    public Key<Asset> save(Asset asset){
        return datastore.save(asset);
    }

}
