
package com.linkedin.metadata.recommendation;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Content to display within each recommendation module
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationContent.pdl.")
public class RecommendationContent
    extends RecordTemplate
{

    private final static RecommendationContent.Fields _fields = new RecommendationContent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Content to display within each recommendation module*/record RecommendationContent{/**String representation of content*/value:string/**Entity being recommended. Empty if the content being recommended is not an entity*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Additional context required to generate the the recommendation*/params:optional/**Parameters required to render a recommendation of a given type*/record RecommendationParams{/**Context to define the search recommendations*/searchParams:optional/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]=[]}/**Context to define the entity profile page*/entityProfileParams:optional/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:com.linkedin.common.Urn}/**Context about the recommendation*/contentParams:optional/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Params = SCHEMA.getField("params");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public RecommendationContent() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public RecommendationContent(DataMap data) {
        super(data, SCHEMA);
    }

    public static RecommendationContent.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for value
     * 
     * @see RecommendationContent.Fields#value
     */
    public boolean hasValue() {
        return contains(FIELD_Value);
    }

    /**
     * Remover for value
     * 
     * @see RecommendationContent.Fields#value
     */
    public void removeValue() {
        remove(FIELD_Value);
    }

    /**
     * Getter for value
     * 
     * @see RecommendationContent.Fields#value
     */
    public String getValue(GetMode mode) {
        return obtainDirect(FIELD_Value, String.class, mode);
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationContent.Fields#value
     */
    @Nonnull
    public String getValue() {
        return obtainDirect(FIELD_Value, String.class, GetMode.STRICT);
    }

    /**
     * Setter for value
     * 
     * @see RecommendationContent.Fields#value
     */
    public RecommendationContent setValue(String value, SetMode mode) {
        putDirect(FIELD_Value, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationContent.Fields#value
     */
    public RecommendationContent setValue(
        @Nonnull
        String value) {
        putDirect(FIELD_Value, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    public boolean hasEntity() {
        return contains(FIELD_Entity);
    }

    /**
     * Remover for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    public void removeEntity() {
        remove(FIELD_Entity);
    }

    /**
     * Getter for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationContent.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity() {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for entity
     * 
     * @see RecommendationContent.Fields#entity
     */
    public RecommendationContent setEntity(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationContent.Fields#entity
     */
    public RecommendationContent setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for params
     * 
     * @see RecommendationContent.Fields#params
     */
    public boolean hasParams() {
        return contains(FIELD_Params);
    }

    /**
     * Remover for params
     * 
     * @see RecommendationContent.Fields#params
     */
    public void removeParams() {
        remove(FIELD_Params);
    }

    /**
     * Getter for params
     * 
     * @see RecommendationContent.Fields#params
     */
    public RecommendationParams getParams(GetMode mode) {
        return obtainWrapped(FIELD_Params, RecommendationParams.class, mode);
    }

    /**
     * Getter for params
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationContent.Fields#params
     */
    @Nullable
    public RecommendationParams getParams() {
        return obtainWrapped(FIELD_Params, RecommendationParams.class, GetMode.STRICT);
    }

    /**
     * Setter for params
     * 
     * @see RecommendationContent.Fields#params
     */
    public RecommendationContent setParams(RecommendationParams value, SetMode mode) {
        putWrapped(FIELD_Params, RecommendationParams.class, value, mode);
        return this;
    }

    /**
     * Setter for params
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationContent.Fields#params
     */
    public RecommendationContent setParams(
        @Nonnull
        RecommendationParams value) {
        putWrapped(FIELD_Params, RecommendationParams.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public RecommendationContent clone()
        throws CloneNotSupportedException
    {
        return ((RecommendationContent) super.clone());
    }

    @Override
    public RecommendationContent copy()
        throws CloneNotSupportedException
    {
        return ((RecommendationContent) super.copy());
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
         * String representation of content
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * Entity being recommended. Empty if the content being recommended is not an entity
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * Additional context required to generate the the recommendation
         * 
         */
        public com.linkedin.metadata.recommendation.RecommendationParams.Fields params() {
            return new com.linkedin.metadata.recommendation.RecommendationParams.Fields(getPathComponents(), "params");
        }

    }

}
