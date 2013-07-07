package spongecake;

public abstract class Scene {
    public abstract void onCreate();
    public abstract void onResume();
    public abstract void onRender();
    public abstract void onResize();
    public abstract void onPause();
    public abstract void onDispose();
}
