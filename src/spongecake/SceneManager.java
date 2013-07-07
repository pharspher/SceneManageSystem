package spongecake;

import java.util.ArrayList;

public class SceneManager {
    private static SceneManager mManager = new SceneManager();

    private ArrayList<Scene> mScenes;

    public static SceneManager getManager() {
        return mManager;
    }

    public void pushScene(Scene scene) {
        mScenes.add(scene);
        getCurrentScene().onCreate();
        getCurrentScene().onResume();
    }

    public void popScene() {
        getCurrentScene().onPause();
        getCurrentScene().onDispose();
        mScenes.remove(mScenes.size() - 1);
    }

    private Scene getCurrentScene() {
        return mScenes.get(mScenes.size() - 1);
    }

    public void resume() {
        getCurrentScene().onResume();
    }

    public void render() {
        getCurrentScene().onRender();
    }

    public void resize() {
        getCurrentScene().onResize();
    }

    public void pause() {
        getCurrentScene().onPause();
    }

    public void dispose() {
        getCurrentScene().onDispose();
    }

    private SceneManager() {
    }
}
