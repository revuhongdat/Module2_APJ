package deploy_facade;

public class LinkedIn implements SocialShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("LinkedIn: " + this.message);
    }
}
