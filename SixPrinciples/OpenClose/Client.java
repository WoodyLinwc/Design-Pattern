public class Client {
    public static void main(String[] args) {
        SougoInput input = new SougoInput();

        DefaultSkin skin = new DefaultSkin();

        input.setSkin(skin);

        input.display();
    }
}
