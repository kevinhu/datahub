
package com.linkedin.metadata.search;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * The model for the search result
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchResultMetadata.pdl.")
public class SearchResultMetadata
    extends RecordTemplate
{

    private final static SearchResultMetadata.Fields _fields = new SearchResultMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for the search result*/record SearchResultMetadata{/**A list of search result metadata such as aggregations*/aggregations:array[record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}facetCount:long}]}]=[]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");

    public SearchResultMetadata() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public SearchResultMetadata(DataMap data) {
        super(data, SCHEMA);
    }

    public static SearchResultMetadata.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    public boolean hasAggregations() {
        return contains(FIELD_Aggregations);
    }

    /**
     * Remover for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    public void removeAggregations() {
        remove(FIELD_Aggregations);
    }

    /**
     * Getter for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    public AggregationMetadataArray getAggregations(GetMode mode) {
        return obtainWrapped(FIELD_Aggregations, AggregationMetadataArray.class, mode);
    }

    /**
     * Getter for aggregations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResultMetadata.Fields#aggregations
     */
    @Nonnull
    public AggregationMetadataArray getAggregations() {
        return obtainWrapped(FIELD_Aggregations, AggregationMetadataArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    public SearchResultMetadata setAggregations(AggregationMetadataArray value, SetMode mode) {
        putWrapped(FIELD_Aggregations, AggregationMetadataArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aggregations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResultMetadata.Fields#aggregations
     */
    public SearchResultMetadata setAggregations(
        @Nonnull
        AggregationMetadataArray value) {
        putWrapped(FIELD_Aggregations, AggregationMetadataArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SearchResultMetadata clone()
        throws CloneNotSupportedException
    {
        return ((SearchResultMetadata) super.clone());
    }

    @Override
    public SearchResultMetadata copy()
        throws CloneNotSupportedException
    {
        return ((SearchResultMetadata) super.copy());
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

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public com.linkedin.metadata.search.AggregationMetadataArray.Fields aggregations() {
            return new com.linkedin.metadata.search.AggregationMetadataArray.Fields(getPathComponents(), "aggregations");
        }

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public PathSpec aggregations(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aggregations");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
