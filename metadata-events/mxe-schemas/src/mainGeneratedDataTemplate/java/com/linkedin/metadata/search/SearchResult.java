
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
 * The model for the result of a search query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchResult.pdl.")
public class SearchResult
    extends RecordTemplate
{

    private final static SearchResult.Fields _fields = new SearchResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for the result of a search query*/record SearchResult{/**A list of entities returned from the search results*/entities:array[/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]}]/**Metadata specific to the browse result of the queried path*/metadata:/**The model for the search result*/record SearchResultMetadata{/**A list of search result metadata such as aggregations*/aggregations:array[record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional com.linkedin.common.Urn,facetCount:long}]}]=[]}/**Offset of the first entity in the result*/from:int/**Size of each page in the result*/pageSize:int/**The total number of entities directly under searched path*/numEntities:int}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_From = SCHEMA.getField("from");
    private final static RecordDataSchema.Field FIELD_PageSize = SCHEMA.getField("pageSize");
    private final static RecordDataSchema.Field FIELD_NumEntities = SCHEMA.getField("numEntities");

    public SearchResult() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
    }

    public SearchResult(DataMap data) {
        super(data, SCHEMA);
    }

    public static SearchResult.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for entities
     * 
     * @see SearchResult.Fields#entities
     */
    public boolean hasEntities() {
        return contains(FIELD_Entities);
    }

    /**
     * Remover for entities
     * 
     * @see SearchResult.Fields#entities
     */
    public void removeEntities() {
        remove(FIELD_Entities);
    }

    /**
     * Getter for entities
     * 
     * @see SearchResult.Fields#entities
     */
    public SearchEntityArray getEntities(GetMode mode) {
        return obtainWrapped(FIELD_Entities, SearchEntityArray.class, mode);
    }

    /**
     * Getter for entities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResult.Fields#entities
     */
    @Nonnull
    public SearchEntityArray getEntities() {
        return obtainWrapped(FIELD_Entities, SearchEntityArray.class, GetMode.STRICT);
    }

    /**
     * Setter for entities
     * 
     * @see SearchResult.Fields#entities
     */
    public SearchResult setEntities(SearchEntityArray value, SetMode mode) {
        putWrapped(FIELD_Entities, SearchEntityArray.class, value, mode);
        return this;
    }

    /**
     * Setter for entities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResult.Fields#entities
     */
    public SearchResult setEntities(
        @Nonnull
        SearchEntityArray value) {
        putWrapped(FIELD_Entities, SearchEntityArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see SearchResult.Fields#metadata
     */
    public boolean hasMetadata() {
        return contains(FIELD_Metadata);
    }

    /**
     * Remover for metadata
     * 
     * @see SearchResult.Fields#metadata
     */
    public void removeMetadata() {
        remove(FIELD_Metadata);
    }

    /**
     * Getter for metadata
     * 
     * @see SearchResult.Fields#metadata
     */
    public SearchResultMetadata getMetadata(GetMode mode) {
        return obtainWrapped(FIELD_Metadata, SearchResultMetadata.class, mode);
    }

    /**
     * Getter for metadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResult.Fields#metadata
     */
    @Nonnull
    public SearchResultMetadata getMetadata() {
        return obtainWrapped(FIELD_Metadata, SearchResultMetadata.class, GetMode.STRICT);
    }

    /**
     * Setter for metadata
     * 
     * @see SearchResult.Fields#metadata
     */
    public SearchResult setMetadata(SearchResultMetadata value, SetMode mode) {
        putWrapped(FIELD_Metadata, SearchResultMetadata.class, value, mode);
        return this;
    }

    /**
     * Setter for metadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResult.Fields#metadata
     */
    public SearchResult setMetadata(
        @Nonnull
        SearchResultMetadata value) {
        putWrapped(FIELD_Metadata, SearchResultMetadata.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for from
     * 
     * @see SearchResult.Fields#from
     */
    public boolean hasFrom() {
        return contains(FIELD_From);
    }

    /**
     * Remover for from
     * 
     * @see SearchResult.Fields#from
     */
    public void removeFrom() {
        remove(FIELD_From);
    }

    /**
     * Getter for from
     * 
     * @see SearchResult.Fields#from
     */
    public Integer getFrom(GetMode mode) {
        return obtainDirect(FIELD_From, Integer.class, mode);
    }

    /**
     * Getter for from
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResult.Fields#from
     */
    @Nonnull
    public Integer getFrom() {
        return obtainDirect(FIELD_From, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for from
     * 
     * @see SearchResult.Fields#from
     */
    public SearchResult setFrom(Integer value, SetMode mode) {
        putDirect(FIELD_From, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for from
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResult.Fields#from
     */
    public SearchResult setFrom(
        @Nonnull
        Integer value) {
        putDirect(FIELD_From, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for from
     * 
     * @see SearchResult.Fields#from
     */
    public SearchResult setFrom(int value) {
        putDirect(FIELD_From, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for pageSize
     * 
     * @see SearchResult.Fields#pageSize
     */
    public boolean hasPageSize() {
        return contains(FIELD_PageSize);
    }

    /**
     * Remover for pageSize
     * 
     * @see SearchResult.Fields#pageSize
     */
    public void removePageSize() {
        remove(FIELD_PageSize);
    }

    /**
     * Getter for pageSize
     * 
     * @see SearchResult.Fields#pageSize
     */
    public Integer getPageSize(GetMode mode) {
        return obtainDirect(FIELD_PageSize, Integer.class, mode);
    }

    /**
     * Getter for pageSize
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResult.Fields#pageSize
     */
    @Nonnull
    public Integer getPageSize() {
        return obtainDirect(FIELD_PageSize, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for pageSize
     * 
     * @see SearchResult.Fields#pageSize
     */
    public SearchResult setPageSize(Integer value, SetMode mode) {
        putDirect(FIELD_PageSize, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResult.Fields#pageSize
     */
    public SearchResult setPageSize(
        @Nonnull
        Integer value) {
        putDirect(FIELD_PageSize, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @see SearchResult.Fields#pageSize
     */
    public SearchResult setPageSize(int value) {
        putDirect(FIELD_PageSize, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numEntities
     * 
     * @see SearchResult.Fields#numEntities
     */
    public boolean hasNumEntities() {
        return contains(FIELD_NumEntities);
    }

    /**
     * Remover for numEntities
     * 
     * @see SearchResult.Fields#numEntities
     */
    public void removeNumEntities() {
        remove(FIELD_NumEntities);
    }

    /**
     * Getter for numEntities
     * 
     * @see SearchResult.Fields#numEntities
     */
    public Integer getNumEntities(GetMode mode) {
        return obtainDirect(FIELD_NumEntities, Integer.class, mode);
    }

    /**
     * Getter for numEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResult.Fields#numEntities
     */
    @Nonnull
    public Integer getNumEntities() {
        return obtainDirect(FIELD_NumEntities, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for numEntities
     * 
     * @see SearchResult.Fields#numEntities
     */
    public SearchResult setNumEntities(Integer value, SetMode mode) {
        putDirect(FIELD_NumEntities, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResult.Fields#numEntities
     */
    public SearchResult setNumEntities(
        @Nonnull
        Integer value) {
        putDirect(FIELD_NumEntities, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @see SearchResult.Fields#numEntities
     */
    public SearchResult setNumEntities(int value) {
        putDirect(FIELD_NumEntities, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SearchResult clone()
        throws CloneNotSupportedException
    {
        return ((SearchResult) super.clone());
    }

    @Override
    public SearchResult copy()
        throws CloneNotSupportedException
    {
        return ((SearchResult) super.copy());
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
         * A list of entities returned from the search results
         * 
         */
        public com.linkedin.metadata.search.SearchEntityArray.Fields entities() {
            return new com.linkedin.metadata.search.SearchEntityArray.Fields(getPathComponents(), "entities");
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public PathSpec entities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entities");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public com.linkedin.metadata.search.SearchResultMetadata.Fields metadata() {
            return new com.linkedin.metadata.search.SearchResultMetadata.Fields(getPathComponents(), "metadata");
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public PathSpec from() {
            return new PathSpec(getPathComponents(), "from");
        }

        /**
         * Size of each page in the result
         * 
         */
        public PathSpec pageSize() {
            return new PathSpec(getPathComponents(), "pageSize");
        }

        /**
         * The total number of entities directly under searched path
         * 
         */
        public PathSpec numEntities() {
            return new PathSpec(getPathComponents(), "numEntities");
        }

    }

}
