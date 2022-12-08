package net.bounceme.chronos.sb.model.generatedkey;

import java.util.List;

import net.bounceme.chronos.sb.document.FirebaseDocument;
import net.bounceme.chronos.sb.document.FirebaseId;

@FirebaseDocument(Constants.BASE_PATH + "/posts")
public class Post {

    @FirebaseId
    private String id;

    private String title;

    private String body;

    private List<Tag> tags;

    private String[] categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }
}
