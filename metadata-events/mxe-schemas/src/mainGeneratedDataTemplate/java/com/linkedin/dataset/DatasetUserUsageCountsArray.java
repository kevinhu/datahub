
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
public class DatasetUserUsageCountsArray
    extends WrappingArrayTemplate<DatasetUserUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**Records a single user's usage counts for a given resource*/record DatasetUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of times the dataset has been used by the user.*/@TimeseriesField={}count:int/**If user_email is set, we attempt to resolve the user's urn upon ingest*/@TimeseriesField={}userEmail:optional string}}]", SchemaFormatType.PDL));

    public DatasetUserUsageCountsArray() {
        this(new DataList());
    }

    public DatasetUserUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetUserUsageCountsArray(Collection<DatasetUserUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetUserUsageCountsArray(DataList data) {
        super(data, SCHEMA, DatasetUserUsageCounts.class);
    }

    public DatasetUserUsageCountsArray(DatasetUserUsageCounts first, DatasetUserUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DatasetUserUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        return ((DatasetUserUsageCountsArray) super.clone());
    }

    @Override
    public DatasetUserUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        return ((DatasetUserUsageCountsArray) super.copy());
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

        public com.linkedin.dataset.DatasetUserUsageCounts.Fields items() {
            return new com.linkedin.dataset.DatasetUserUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
