package app.JustRed23.TestApp;

import dev.JustRed23.App.App;

public class TestApp extends App {

    public void onLoad() {
        getLogger().info("TestApp loaded");
    }

    public void onEnable() {
        getLogger().warn("TestApp enabled");
    }

    public void onDisable() {
        getLogger().warn("TestApp disabled");
    }
}
