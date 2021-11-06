
package com.linkedin.metadata.recommendation;

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
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Parameters required to render a recommendation of a given type
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationParams.pdl.")
public class RecommendationParams
    extends RecordTemplate
{

    private final static RecommendationParams.Fields _fields = new RecommendationParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Parameters required to render a recommendation of a given type*/record RecommendationParams{/**Context to define the search recommendations*/searchParams:optional/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]=[]}/**Context to define the entity profile page*/entityProfileParams:optional/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Context about the recommendation*/contentParams:optional/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_SearchParams = SCHEMA.getField("searchParams");
    private final static RecordDataSchema.Field FIELD_EntityProfileParams = SCHEMA.getField("entityProfileParams");
    private final static RecordDataSchema.Field FIELD_ContentParams = SCHEMA.getField("contentParams");

    public RecommendationParams() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
    }

    public RecommendationParams(DataMap data) {
        super(data, SCHEMA);
    }

    public static RecommendationParams.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    public boolean hasSearchParams() {
        return contains(FIELD_SearchParams);
    }

    /**
     * Remover for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    public void removeSearchParams() {
        remove(FIELD_SearchParams);
    }

    /**
     * Getter for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    public SearchParams getSearchParams(GetMode mode) {
        return obtainWrapped(FIELD_SearchParams, SearchParams.class, mode);
    }

    /**
     * Getter for searchParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationParams.Fields#searchParams
     */
    @Nullable
    public SearchParams getSearchParams() {
        return obtainWrapped(FIELD_SearchParams, SearchParams.class, GetMode.STRICT);
    }

    /**
     * Setter for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    public RecommendationParams setSearchParams(SearchParams value, SetMode mode) {
        putWrapped(FIELD_SearchParams, SearchParams.class, value, mode);
        return this;
    }

    /**
     * Setter for searchParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationParams.Fields#searchParams
     */
    public RecommendationParams setSearchParams(
        @Nonnull
        SearchParams value) {
        putWrapped(FIELD_SearchParams, SearchParams.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public boolean hasEntityProfileParams() {
        return contains(FIELD_EntityProfileParams);
    }

    /**
     * Remover for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public void removeEntityProfileParams() {
        remove(FIELD_EntityProfileParams);
    }

    /**
     * Getter for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public EntityProfileParams getEntityProfileParams(GetMode mode) {
        return obtainWrapped(FIELD_EntityProfileParams, EntityProfileParams.class, mode);
    }

    /**
     * Getter for entityProfileParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationParams.Fields#entityProfileParams
     */
    @Nullable
    public EntityProfileParams getEntityProfileParams() {
        return obtainWrapped(FIELD_EntityProfileParams, EntityProfileParams.class, GetMode.STRICT);
    }

    /**
     * Setter for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public RecommendationParams setEntityProfileParams(EntityProfileParams value, SetMode mode) {
        putWrapped(FIELD_EntityProfileParams, EntityProfileParams.class, value, mode);
        return this;
    }

    /**
     * Setter for entityProfileParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public RecommendationParams setEntityProfileParams(
        @Nonnull
        EntityProfileParams value) {
        putWrapped(FIELD_EntityProfileParams, EntityProfileParams.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    public boolean hasContentParams() {
        return contains(FIELD_ContentParams);
    }

    /**
     * Remover for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    public void removeContentParams() {
        remove(FIELD_ContentParams);
    }

    /**
     * Getter for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    public ContentParams getContentParams(GetMode mode) {
        return obtainWrapped(FIELD_ContentParams, ContentParams.class, mode);
    }

    /**
     * Getter for contentParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationParams.Fields#contentParams
     */
    @Nullable
    public ContentParams getContentParams() {
        return obtainWrapped(FIELD_ContentParams, ContentParams.class, GetMode.STRICT);
    }

    /**
     * Setter for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    public RecommendationParams setContentParams(ContentParams value, SetMode mode) {
        putWrapped(FIELD_ContentParams, ContentParams.class, value, mode);
        return this;
    }

    /**
     * Setter for contentParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationParams.Fields#contentParams
     */
    public RecommendationParams setContentParams(
        @Nonnull
        ContentParams value) {
        putWrapped(FIELD_ContentParams, ContentParams.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public RecommendationParams clone()
        throws CloneNotSupportedException
    {
        return ((RecommendationParams) super.clone());
    }

    @Override
    public RecommendationParams copy()
        throws CloneNotSupportedException
    {
        return ((RecommendationParams) super.copy());
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
         * Context to define the search recommendations
         * 
         */
        public com.linkedin.metadata.recommendation.SearchParams.Fields searchParams() {
            return new com.linkedin.metadata.recommendation.SearchParams.Fields(getPathComponents(), "searchParams");
        }

        /**
         * Context to define the entity profile page
         * 
         */
        public com.linkedin.metadata.recommendation.EntityProfileParams.Fields entityProfileParams() {
            return new com.linkedin.metadata.recommendation.EntityProfileParams.Fields(getPathComponents(), "entityProfileParams");
        }

        /**
         * Context about the recommendation
         * 
         */
        public com.linkedin.metadata.recommendation.ContentParams.Fields contentParams() {
            return new com.linkedin.metadata.recommendation.ContentParams.Fields(getPathComponents(), "contentParams");
        }

    }

}
