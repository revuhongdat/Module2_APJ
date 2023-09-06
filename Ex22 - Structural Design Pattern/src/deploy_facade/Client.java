package deploy_facade;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("hê sờ lô");
    }
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}