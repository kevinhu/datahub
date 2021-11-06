
package com.linkedin.usage;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageAggregationMetrics.pdl.")
public class FieldUsageCountsArray
    extends WrappingArrayTemplate<FieldUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.usage/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}}]", SchemaFormatType.PDL));

    public FieldUsageCountsArray() {
        this(new DataList());
    }

    public FieldUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FieldUsageCountsArray(Collection<FieldUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FieldUsageCountsArray(DataList data) {
        super(data, SCHEMA, FieldUsageCounts.class);
    }

    public FieldUsageCountsArray(FieldUsageCounts first, FieldUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public FieldUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        return ((FieldUsageCountsArray) super.clone());
    }

    @Override
    public FieldUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        return ((FieldUsageCountsArray) super.copy());
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

        public com.linkedin.usage.FieldUsageCounts.Fields items() {
            return new com.linkedin.usage.FieldUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
