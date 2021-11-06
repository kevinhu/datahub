
package com.linkedin.dataset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetUsageStatistics.pdl.")
public class DatasetFieldUsageCountsArray
    extends WrappingArrayTemplate<DatasetFieldUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**Records field-level usage counts for a given dataset*/record DatasetFieldUsageCounts{/**The name of the field.*/fieldPath:string/**Number of times the field has been used.*/@TimeseriesField={}count:int}}]", SchemaFormatType.PDL));

    public DatasetFieldUsageCountsArray() {
        this(new DataList());
    }

    public DatasetFieldUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetFieldUsageCountsArray(Collection<DatasetFieldUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetFieldUsageCountsArray(DataList data) {
        super(data, SCHEMA, DatasetFieldUsageCounts.class);
    }

    public DatasetFieldUsageCountsArray(DatasetFieldUsageCounts first, DatasetFieldUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DatasetFieldUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUsageCountsArray) super.clone());
    }

    @Override
    public DatasetFieldUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUsageCountsArray) super.copy());
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

        public com.linkedin.dataset.DatasetFieldUsageCounts.Fields items() {
            return new com.linkedin.dataset.DatasetFieldUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
