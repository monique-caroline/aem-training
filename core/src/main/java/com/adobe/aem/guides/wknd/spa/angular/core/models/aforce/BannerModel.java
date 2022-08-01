package com.adobe.aem.guides.wknd.spa.angular.core.models.aforce;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
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
