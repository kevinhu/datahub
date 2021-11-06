
package com.linkedin.metadata.search;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.LongMap;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/AggregationMetadata.pdl.")
public class AggregationMetadata
    extends RecordTemplate
{

    private final static AggregationMetadata.Fields _fields = new AggregationMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search,record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}facetCount:long}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");
    private final static RecordDataSchema.Field FIELD_FilterValues = SCHEMA.getField("filterValues");

    public AggregationMetadata() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
    }

    public AggregationMetadata(DataMap data) {
        super(data, SCHEMA);
    }

    public static AggregationMetadata.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationMetadata.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    public AggregationMetadata setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#name
     */
    public AggregationMetadata setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    public boolean hasDisplayName() {
        return contains(FIELD_DisplayName);
    }

    /**
     * Remover for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    public void removeDisplayName() {
        remove(FIELD_DisplayName);
    }

    /**
     * Getter for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    public String getDisplayName(GetMode mode) {
        return obtainDirect(FIELD_DisplayName, String.class, mode);
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AggregationMetadata.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        return obtainDirect(FIELD_DisplayName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    public AggregationMetadata setDisplayName(String value, SetMode mode) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#displayName
     */
    public AggregationMetadata setDisplayName(
        @Nonnull
        String value) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    public boolean hasAggregations() {
        return contains(FIELD_Aggregations);
    }

    /**
     * Remover for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    public void removeAggregations() {
        remove(FIELD_Aggregations);
    }

    /**
     * Getter for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    public LongMap getAggregations(GetMode mode) {
        return obtainWrapped(FIELD_Aggregations, LongMap.class, mode);
    }

    /**
     * Getter for aggregations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationMetadata.Fields#aggregations
     */
    @Nonnull
    public LongMap getAggregations() {
        return obtainWrapped(FIELD_Aggregations, LongMap.class, GetMode.STRICT);
    }

    /**
     * Setter for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    public AggregationMetadata setAggregations(LongMap value, SetMode mode) {
        putWrapped(FIELD_Aggregations, LongMap.class, value, mode);
        return this;
    }

    /**
     * Setter for aggregations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#aggregations
     */
    public AggregationMetadata setAggregations(
        @Nonnull
        LongMap value) {
        putWrapped(FIELD_Aggregations, LongMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    public boolean hasFilterValues() {
        return contains(FIELD_FilterValues);
    }

    /**
     * Remover for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    public void removeFilterValues() {
        remove(FIELD_FilterValues);
    }

    /**
     * Getter for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    public FilterValueArray getFilterValues(GetMode mode) {
        return obtainWrapped(FIELD_FilterValues, FilterValueArray.class, mode);
    }

    /**
     * Getter for filterValues
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationMetadata.Fields#filterValues
     */
    @Nonnull
    public FilterValueArray getFilterValues() {
        return obtainWrapped(FIELD_FilterValues, FilterValueArray.class, GetMode.STRICT);
    }

    /**
     * Setter for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    public AggregationMetadata setFilterValues(FilterValueArray value, SetMode mode) {
        putWrapped(FIELD_FilterValues, FilterValueArray.class, value, mode);
        return this;
    }

    /**
     * Setter for filterValues
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#filterValues
     */
    public AggregationMetadata setFilterValues(
        @Nonnull
        FilterValueArray value) {
        putWrapped(FIELD_FilterValues, FilterValueArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public AggregationMetadata clone()
        throws CloneNotSupportedException
    {
        return ((AggregationMetadata) super.clone());
    }

    @Override
    public AggregationMetadata copy()
        throws CloneNotSupportedException
    {
        return ((AggregationMetadata) super.copy());
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
         * The name of the aggregation, e.g, platform, origin
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Name of the filter to be displayed in the UI
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc
         * 
         */
        public PathSpec aggregations() {
            return new PathSpec(getPathComponents(), "aggregations");
        }

        public com.linkedin.metadata.search.FilterValueArray.Fields filterValues() {
            return new com.linkedin.metadata.search.FilterValueArray.Fields(getPathComponents(), "filterValues");
        }

        public PathSpec filterValues(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "filterValues");
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
