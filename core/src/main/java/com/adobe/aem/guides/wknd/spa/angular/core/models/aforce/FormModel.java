package com.adobe.aem.guides.wknd.spa.angular.core.models.aforce;


import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import org.apache.sling.api.resource.Resource;
import java.util.List;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = {ComponentExporter.class},
        resourceType = FormModel.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class FormModel implements ComponentExporter {

    /**
     *
     */
    static final String RESOURCE_TYPE = "wknd-spa-angular/components/aforce-components/form";

    @ChildResource
    private List<Resource> items;

    public List<Resource> getItems() {
        return items;
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
