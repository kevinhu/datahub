
package com.linkedin.metadata.search;

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
import com.linkedin.data.template.DoubleMap;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * The model for each entity returned by the search query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchEntity.pdl.")
public class SearchEntity
    extends RecordTemplate
{

    private final static SearchEntity.Fields _fields = new SearchEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_MatchedFields = SCHEMA.getField("matchedFields");
    private final static RecordDataSchema.Field FIELD_Features = SCHEMA.getField("features");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SearchEntity() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
    }

    public SearchEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static SearchEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    public boolean hasEntity() {
        return contains(FIELD_Entity);
    }

    /**
     * Remover for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    public void removeEntity() {
        remove(FIELD_Entity);
    }

    /**
     * Getter for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchEntity.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        return obtainCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    public SearchEntity setEntity(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#entity
     */
    public SearchEntity setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Entity, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    public boolean hasMatchedFields() {
        return contains(FIELD_MatchedFields);
    }

    /**
     * Remover for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    public void removeMatchedFields() {
        remove(FIELD_MatchedFields);
    }

    /**
     * Getter for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    public MatchedFieldArray getMatchedFields(GetMode mode) {
        return obtainWrapped(FIELD_MatchedFields, MatchedFieldArray.class, mode);
    }

    /**
     * Getter for matchedFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchEntity.Fields#matchedFields
     */
    @Nonnull
    public MatchedFieldArray getMatchedFields() {
        return obtainWrapped(FIELD_MatchedFields, MatchedFieldArray.class, GetMode.STRICT);
    }

    /**
     * Setter for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    public SearchEntity setMatchedFields(MatchedFieldArray value, SetMode mode) {
        putWrapped(FIELD_MatchedFields, MatchedFieldArray.class, value, mode);
        return this;
    }

    /**
     * Setter for matchedFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#matchedFields
     */
    public SearchEntity setMatchedFields(
        @Nonnull
        MatchedFieldArray value) {
        putWrapped(FIELD_MatchedFields, MatchedFieldArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for features
     * 
     * @see SearchEntity.Fields#features
     */
    public boolean hasFeatures() {
        return contains(FIELD_Features);
    }

    /**
     * Remover for features
     * 
     * @see SearchEntity.Fields#features
     */
    public void removeFeatures() {
        remove(FIELD_Features);
    }

    /**
     * Getter for features
     * 
     * @see SearchEntity.Fields#features
     */
    public DoubleMap getFeatures(GetMode mode) {
        return obtainWrapped(FIELD_Features, DoubleMap.class, mode);
    }

    /**
     * Getter for features
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchEntity.Fields#features
     */
    @Nullable
    public DoubleMap getFeatures() {
        return obtainWrapped(FIELD_Features, DoubleMap.class, GetMode.STRICT);
    }

    /**
     * Setter for features
     * 
     * @see SearchEntity.Fields#features
     */
    public SearchEntity setFeatures(DoubleMap value, SetMode mode) {
        putWrapped(FIELD_Features, DoubleMap.class, value, mode);
        return this;
    }

    /**
     * Setter for features
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#features
     */
    public SearchEntity setFeatures(
        @Nonnull
        DoubleMap value) {
        putWrapped(FIELD_Features, DoubleMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SearchEntity clone()
        throws CloneNotSupportedException
    {
        return ((SearchEntity) super.clone());
    }

    @Override
    public SearchEntity copy()
        throws CloneNotSupportedException
    {
        return ((SearchEntity) super.copy());
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
         * Urn of the entity being returned
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * Matched field name and values
         * 
         */
        public com.linkedin.metadata.search.MatchedFieldArray.Fields matchedFields() {
            return new com.linkedin.metadata.search.MatchedFieldArray.Fields(getPathComponents(), "matchedFields");
        }

        /**
         * Matched field name and values
         * 
         */
        public PathSpec matchedFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "matchedFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public PathSpec features() {
            return new PathSpec(getPathComponents(), "features");
        }

    }

}
