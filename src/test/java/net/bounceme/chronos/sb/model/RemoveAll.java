package net.bounceme.chronos.sb.model;

import static com.github.fabiomaffioletti.firebase.model.generatedkey.Constants.BASE_PATH;

import net.bounceme.chronos.sb.document.FirebaseDocument;
import net.bounceme.chronos.sb.document.FirebaseId;

@FirebaseDocument(BASE_PATH)
public class RemoveAll {

    @FirebaseId
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
