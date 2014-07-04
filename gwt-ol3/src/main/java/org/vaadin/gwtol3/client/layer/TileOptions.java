package org.vaadin.gwtol3.client.layer;

/**
 * Created by mjhosio on 02/07/14.
 */
public class TileOptions extends LayerOptions {
    protected TileOptions() {
    }

    /**
     * Initializes Tile options. Basically a simple map wrapper that can be passed to TileLayer on initialization
     */
    public static native TileOptions create()
    /*-{
        return {};
    }-*/;

    public final native void setPreload(int numberOfTiles)/*-{
        this.preload=numberOfTiles;
    }-*/;

    public final native void setUseInterimTilesOnError(boolean enabled)/*-{
        this.useInterimTilesOnError = enabled;
    }-*/;
}
