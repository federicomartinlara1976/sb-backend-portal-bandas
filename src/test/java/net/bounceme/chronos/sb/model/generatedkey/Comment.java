package net.bounceme.chronos.sb.model.generatedkey;

import static net.bounceme.chronos.sb.model.generatedkey.Constants.BASE_PATH;

import net.bounceme.chronos.sb.document.FirebaseDocument;
import net.bounceme.chronos.sb.document.FirebaseId;

@FirebaseDocument(BASE_PATH + "/comments/{postId}")
public class Comment {

    @FirebaseId
    private String id;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
