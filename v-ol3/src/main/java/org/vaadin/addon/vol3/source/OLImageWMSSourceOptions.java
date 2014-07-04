package org.vaadin.addon.vol3.source;

import org.vaadin.addon.vol3.client.OLExtent;

import java.util.Map;

/**
 * Options passed to OLImageWMSSource on construction
 * Created by mjhosio on 04/07/14.
 */
public class OLImageWMSSourceOptions {
    private String [] attributions;
    private String crossOriginPolicy;
    private OLExtent extent;
    // crs name of the projection
    private String projection;
    //Use the Map.pixelRatio value when requesting the image from the remote server
    private Boolean hidpi;
    // The type of the remote WMS server: mapserver, geoserver or qgis
    private String serverType;
    private String logo;
    //Ratio. 1 means image requests are the size of the map viewport, 2 means twice the size of the map viewport, and so on. Default is 1.5.
    private Double ratio;
    // Resolutions. If specified, requests will be made for these resolutions only.
    private double [] resolutions;
    // WMS service url
    private String url;
    // WMS request parameters. At least a LAYERS param is required. STYLES is '' by default. VERSION is 1.3.0 by default. WIDTH, HEIGHT, BBOX and CRS (SRS for WMS version < 1.3.0) will be set dynamically.
    private Map<String,String> params;

    public String[] getAttributions() {
        return attributions;
    }

    public void setAttributions(String[] attributions) {
        this.attributions = attributions;
    }

    public String getCrossOriginPolicy() {
        return crossOriginPolicy;
    }

    public void setCrossOriginPolicy(String crossOriginPolicy) {
        this.crossOriginPolicy = crossOriginPolicy;
    }

    public OLExtent getExtent() {
        return extent;
    }

    public void setExtent(OLExtent extent) {
        this.extent = extent;
    }

    public String getProjection() {
        return projection;
    }

    /** Sets the csr name of the used projection
     *
     * @param projection
     */
    public void setProjection(String projection) {
        this.projection = projection;
    }

    public Boolean getHidpi() {
        return hidpi;
    }

    /** Use the Map.pixelRatio value when requesting the image from the remote server
     *
     * @param hidpi
     */
     public void setHidpi(Boolean hidpi) {
        this.hidpi = hidpi;
    }

    public String getServerType() {
        return serverType;
    }

    /** The type of the remote WMS server: mapserver, geoserver or qgis
     *
     * @param serverType
     */
    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Double getRatio() {
        return ratio;
    }

    /**
     * Ratio. 1 means image requests are the size of the map viewport, 2 means twice the size of the map viewport, and so on. Default is 1.5.
     * @param ratio
     */
     public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public double[] getResolutions() {
        return resolutions;
    }

    /** Resolutions. If specified, requests will be made for these resolutions only.
     *
     * @param resolutions
     */
     public void setResolutions(double[] resolutions) {
        this.resolutions = resolutions;
    }

    public String getUrl() {
        return url;
    }

    /** WMS service url
     *
     * @param url
     */
     public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getParams() {
        return params;
    }

    /** WMS request parameters. At least a LAYERS param is required. STYLES is '' by default. VERSION is 1.3.0 by default. WIDTH, HEIGHT, BBOX and CRS (SRS for WMS version < 1.3.0) will be set dynamically.
     *
     * @param params
     */
     public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
