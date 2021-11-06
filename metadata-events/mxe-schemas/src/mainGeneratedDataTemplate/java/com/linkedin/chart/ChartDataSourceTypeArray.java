
package com.linkedin.chart;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartInfo.pdl.")
public class ChartDataSourceTypeArray
    extends WrappingArrayTemplate<ChartDataSourceType>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]]", SchemaFormatType.PDL));

    public ChartDataSourceTypeArray() {
        this(new DataList());
    }

    public ChartDataSourceTypeArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ChartDataSourceTypeArray(Collection<ChartDataSourceType> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ChartDataSourceTypeArray(DataList data) {
        super(data, SCHEMA, ChartDataSourceType.class);
    }

    public ChartDataSourceTypeArray(ChartDataSourceType first, ChartDataSourceType... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public ChartDataSourceTypeArray clone()
        throws CloneNotSupportedException
    {
        return ((ChartDataSourceTypeArray) super.clone());
    }

    @Override
    public ChartDataSourceTypeArray copy()
        throws CloneNotSupportedException
    {
        return ((ChartDataSourceTypeArray) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public com.linkedin.chart.ChartDataSourceType.Fields items() {
            return new com.linkedin.chart.ChartDataSourceType.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
