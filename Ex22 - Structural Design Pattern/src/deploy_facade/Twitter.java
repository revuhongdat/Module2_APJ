package deploy_facade;

public class Twitter implements SocialShare {
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public void share() {
        System.out.println("Twitter : " + this.message);
    }
}
