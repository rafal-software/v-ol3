package org.vaadin.addon.vol3.demoandtestapp;

import com.vaadin.ui.AbstractLayout;
import com.vaadin.ui.Button;
import org.vaadin.addon.vol3.OLMap;
import org.vaadin.addon.vol3.client.OLCoordinate;
import org.vaadin.addon.vol3.feature.OLFeature;
import org.vaadin.addon.vol3.feature.OLLineString;
import org.vaadin.addon.vol3.feature.OLPoint;
import org.vaadin.addon.vol3.layer.OLVectorLayer;
import org.vaadin.addon.vol3.source.OLVectorSource;
import org.vaadin.addon.vol3.source.OLVectorSourceOptions;

/**
 * Map for testing vector layer
 */
public class VectorLayerMap extends BasicMap{

    protected OLVectorLayer vectorLayer;

    @Override
    protected OLMap createMap() {
        OLMap map=super.createMap();
        OLVectorSourceOptions vectorOptions=new OLVectorSourceOptions();
        OLVectorSource vectorSource=new OLVectorSource(vectorOptions);
        for(int i=0;i<=5;i++){
            int coordinate=i*10;
            vectorSource.addFeature(createPointFeature("feature-a-"+i,coordinate,coordinate));
            vectorSource.addFeature(createPointFeature("feature-b-"+i,-coordinate,coordinate));
        }
        vectorSource.addFeature(createRectangleFeature("rect",-50,0,100,50));
        vectorLayer=new OLVectorLayer(vectorSource);
        vectorLayer.setLayerVisible(true);
        map.addLayer(vectorLayer);
        return map;
    }

    private OLFeature createPointFeature(String id, double x, double y){
        OLFeature testFeature=new OLFeature(id);
        testFeature.setGeometry(new OLPoint(x,y));
        return testFeature;
    }

    private OLFeature createRectangleFeature(String id, double x, double y, double width, double height){
        OLFeature testFeature=new OLFeature(id);
        OLLineString lineString=new OLLineString();
        lineString.add(new OLCoordinate(x,y));
        lineString.add(new OLCoordinate(x+width,y));
        lineString.add(new OLCoordinate(x+width,y+height));
        lineString.add(new OLCoordinate(x,y+height));
        lineString.add(new OLCoordinate(x,y));
        testFeature.setGeometry(lineString);
        return testFeature;
    }

    @Override
    protected AbstractLayout createControls() {
        AbstractLayout controls= super.createControls();
        Button toggleVectorLayerVisibility=new Button("Toggle vector layer");
        toggleVectorLayerVisibility.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                vectorLayer.setLayerVisible(!vectorLayer.isLayerVisible().booleanValue());
            }
        });
        controls.addComponent(toggleVectorLayerVisibility);
        return controls;
    }
}
