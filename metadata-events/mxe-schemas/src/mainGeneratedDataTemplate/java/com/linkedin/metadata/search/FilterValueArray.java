
package com.linkedin.metadata.search;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/AggregationMetadata.pdl.")
public class FilterValueArray
    extends WrappingArrayTemplate<FilterValue>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search,record FilterValue{value:string,entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}facetCount:long}}]", SchemaFormatType.PDL));

    public FilterValueArray() {
        this(new DataList());
    }

    public FilterValueArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FilterValueArray(Collection<FilterValue> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FilterValueArray(DataList data) {
        super(data, SCHEMA, FilterValue.class);
    }

    public FilterValueArray(FilterValue first, FilterValue... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public FilterValueArray clone()
        throws CloneNotSupportedException
    {
        return ((FilterValueArray) super.clone());
    }

    @Override
    public FilterValueArray copy()
        throws CloneNotSupportedException
    {
        return ((FilterValueArray) super.copy());
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

        public com.linkedin.metadata.search.FilterValue.Fields items() {
            return new com.linkedin.metadata.search.FilterValue.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
