
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchResultMetadata.pdl.")
public class AggregationMetadataArray
    extends WrappingArrayTemplate<AggregationMetadata>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search,record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}facetCount:long}]}}]", SchemaFormatType.PDL));

    public AggregationMetadataArray() {
        this(new DataList());
    }

    public AggregationMetadataArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AggregationMetadataArray(Collection<AggregationMetadata> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AggregationMetadataArray(DataList data) {
        super(data, SCHEMA, AggregationMetadata.class);
    }

    public AggregationMetadataArray(AggregationMetadata first, AggregationMetadata... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public AggregationMetadataArray clone()
        throws CloneNotSupportedException
    {
        return ((AggregationMetadataArray) super.clone());
    }

    @Override
    public AggregationMetadataArray copy()
        throws CloneNotSupportedException
    {
        return ((AggregationMetadataArray) super.copy());
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

        public com.linkedin.metadata.search.AggregationMetadata.Fields items() {
            return new com.linkedin.metadata.search.AggregationMetadata.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
