package DataAccess;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.connection.Connection;
import org.bson.Document;
import web.ReadConfigFile;

import java.io.IOException;

/**
 * Created by vikas on 01/03/2017.
 */
public class MongoDbConn {

    private static Connection conn = null;
    private static String url;
    private static String port;
    private static String dbName;
    static MongoClient mongoClient;
    static MongoDatabase mongoDatabase;
    static MongoIterable<String> collections;
    static MongoCollection<Document> documents;

    private static void getConnectionVariables() throws IOException {
        url = ReadConfigFile.getPropertyValue("mongo.host");
        port = ReadConfigFile.getPropertyValue("mongo.port");
        dbName = ReadConfigFile.getPropertyValue("mongo.dbName");
    }

    public static void  setUpMongoDbConnection() throws IOException {
        getConnectionVariables();
        mongoClient = new MongoClient(url,Integer.parseInt(port));
        mongoDatabase = mongoClient.getDatabase(dbName);
    }

    public static MongoIterable<String> getCollections()
    {
        collections = mongoDatabase.listCollectionNames();
        return collections;
    }

    public static void removeDocuments(String collectionName)
    {
        mongoDatabase.getCollection(collectionName).deleteMany(new Document());
    }

}
