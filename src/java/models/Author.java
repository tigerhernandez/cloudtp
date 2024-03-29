package models;

import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;

/**
 * Javadoc comment example
 * 
 * /
 
 */
/**
 *
 * @author <ENTER YOUR NAME HERE>
 */
public class Author {

    private int id;
    private String name;
    private String nationality;

    //Step 2
    public Author() {
    }
    //Step 3
    public Author(int id, String name, String nationality) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
    }
    //Step 4
    public Author(JsonObject json) {
        this.id = json.getInt("id",0);
        this.name = json.getString("name", "");
        this.nationality = json.getString("nationality", "");
    }
     //Step 5
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    // Step 6 
    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("id", id)
                .add("name", name)
                .add("nationality", nationality)
                .build();
    }
    
}
