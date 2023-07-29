public class Client {
    public static void main(String[] args) {
        // 1 create input object
        SougoInput input = new SougoInput();
        // 2 create skin object
        // DefaultSkin skin = new DefaultSkin();
        AnotherSkin skin = new AnotherSkin();

        // 3 put skin into input object
        input.setSkin(skin);

        // 4 display the skin
        input.display();
    }
}
