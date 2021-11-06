
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dashboard/DashboardInfo.pdl.")
public class ChartUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.ChartUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"chart\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Chart\",\"doc\":\"Standardized chart identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dashboardTool\",\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"chartId\",\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":236}typeref ChartUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.ChartUrn.class);
    }

    public ChartUrnArray() {
        this(new DataList());
    }

    public ChartUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ChartUrnArray(Collection<com.linkedin.common.urn.ChartUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ChartUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.ChartUrn.class, String.class);
    }

    public ChartUrnArray(com.linkedin.common.urn.ChartUrn first, com.linkedin.common.urn.ChartUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public ChartUrnArray clone()
        throws CloneNotSupportedException
    {
        return ((ChartUrnArray) super.clone());
    }

    @Override
    public ChartUrnArray copy()
        throws CloneNotSupportedException
    {
        return ((ChartUrnArray) super.copy());
    }

}
