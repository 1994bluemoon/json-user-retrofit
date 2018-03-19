package vinova.henry.com.jsonuserretrofit.models.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by dminh on 1/31/2018.
 */

public class User {
    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
