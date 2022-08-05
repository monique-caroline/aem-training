package com.adobe.aem.guides.wknd.spa.angular.core.models.aforce;

import com.adobe.aem.guides.wknd.spa.angular.core.models.HelloWorldModel;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, adapters = { BannerModel.class,
        ComponentExporter.class }, resourceType = BannerModel.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class BannerModel {

    static final String RESOURCE_TYPE = "wknd-spa-angular/components/aforce-components/banner";

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String titleSize;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String image;


    public String getTitle() {
        return title;
    }

    public String getTitleSize() {
        return titleSize;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getExportedType(){
        return RESOURCE_TYPE;
    }
}
