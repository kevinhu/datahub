
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
public class UserUsageCountsArray
    extends WrappingArrayTemplate<UserUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.usage/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}}]", SchemaFormatType.PDL));

    public UserUsageCountsArray() {
        this(new DataList());
    }

    public UserUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public UserUsageCountsArray(Collection<UserUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public UserUsageCountsArray(DataList data) {
        super(data, SCHEMA, UserUsageCounts.class);
    }

    public UserUsageCountsArray(UserUsageCounts first, UserUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public UserUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        return ((UserUsageCountsArray) super.clone());
    }

    @Override
    public UserUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        return ((UserUsageCountsArray) super.copy());
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

        public com.linkedin.usage.UserUsageCounts.Fields items() {
            return new com.linkedin.usage.UserUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
