package net.bounceme.chronos.sb.model.definedkey;

import static net.bounceme.chronos.sb.model.generatedkey.Constants.BASE_PATH;

import net.bounceme.chronos.sb.document.FirebaseDocument;
import net.bounceme.chronos.sb.document.FirebaseId;

@FirebaseDocument(BASE_PATH + "/books")
public class Book {

    @FirebaseId
    private Integer id;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
