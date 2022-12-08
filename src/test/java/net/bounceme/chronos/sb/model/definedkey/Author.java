package net.bounceme.chronos.sb.model.definedkey;

import static net.bounceme.chronos.sb.model.generatedkey.Constants.BASE_PATH;

import net.bounceme.chronos.sb.document.FirebaseDocument;
import net.bounceme.chronos.sb.document.FirebaseId;

@FirebaseDocument(BASE_PATH + "/authors")
public class Author {

    @FirebaseId
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
