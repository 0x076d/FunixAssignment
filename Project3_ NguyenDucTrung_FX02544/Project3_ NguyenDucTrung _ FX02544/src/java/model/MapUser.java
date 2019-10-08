package model;

import java.util.HashMap;
import java.util.Map;

public class MapUser extends BaseModel {

    private static final Map<String, Account> mapUser = new HashMap<String, Account>();

    public MapUser() {

    }

    public static Map<String, Account> getMap() {
        return mapUser;
    }
}
