package data;

public class UserCreated extends User {
    private String id;
    private String createdAt;

    public UserCreated() {
        super();
    }

    public UserCreated(String name, String job, String id, String createdAt) {
        super(name, job);
        this.id = id;
        this.createdAt = createdAt;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName(){
        return super.getName();
    }

    public String getJob(){
        return super.getJob();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setJob(String job) {
        super.setJob(job);
    }
}
