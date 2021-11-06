
package com.linkedin.glossary;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.GlossaryTermUrnArray;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Has A / Is A lineage information about a glossary Term reporting the lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/glossary/GlossaryRelatedTerms.pdl.")
public class GlossaryRelatedTerms
    extends RecordTemplate
{

    private final static GlossaryRelatedTerms.Fields _fields = new GlossaryRelatedTerms.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.glossary/**Has A / Is A lineage information about a glossary Term reporting the lineage*/@Aspect.name=\"glossaryRelatedTerms\"record GlossaryRelatedTerms{/**The relationship Is A with glossary term*/@Relationship.`/*`={\"name\":\"IsA\",\"entityTypes\":[\"glossaryTerm\"]}@Searchable.`/*`={\"fieldName\":\"isRelatedTerms\",\"boostScore\":2.0,\"fieldType\":\"URN\"}isRelatedTerms:optional array[{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**The relationship Has A with glossary term*/@Relationship.`/*`={\"name\":\"HasA\",\"entityTypes\":[\"glossaryTerm\"]}@Searchable.`/*`={\"fieldName\":\"hasRelatedTerms\",\"boostScore\":2.0,\"fieldType\":\"URN\"}hasRelatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_IsRelatedTerms = SCHEMA.getField("isRelatedTerms");
    private final static RecordDataSchema.Field FIELD_HasRelatedTerms = SCHEMA.getField("hasRelatedTerms");

    public GlossaryRelatedTerms() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public GlossaryRelatedTerms(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryRelatedTerms.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public boolean hasIsRelatedTerms() {
        return contains(FIELD_IsRelatedTerms);
    }

    /**
     * Remover for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public void removeIsRelatedTerms() {
        remove(FIELD_IsRelatedTerms);
    }

    /**
     * Getter for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public GlossaryTermUrnArray getIsRelatedTerms(GetMode mode) {
        return obtainWrapped(FIELD_IsRelatedTerms, GlossaryTermUrnArray.class, mode);
    }

    /**
     * Getter for isRelatedTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getIsRelatedTerms() {
        return obtainWrapped(FIELD_IsRelatedTerms, GlossaryTermUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public GlossaryRelatedTerms setIsRelatedTerms(GlossaryTermUrnArray value, SetMode mode) {
        putWrapped(FIELD_IsRelatedTerms, GlossaryTermUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for isRelatedTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public GlossaryRelatedTerms setIsRelatedTerms(
        @Nonnull
        GlossaryTermUrnArray value) {
        putWrapped(FIELD_IsRelatedTerms, GlossaryTermUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public boolean hasHasRelatedTerms() {
        return contains(FIELD_HasRelatedTerms);
    }

    /**
     * Remover for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public void removeHasRelatedTerms() {
        remove(FIELD_HasRelatedTerms);
    }

    /**
     * Getter for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public GlossaryTermUrnArray getHasRelatedTerms(GetMode mode) {
        return obtainWrapped(FIELD_HasRelatedTerms, GlossaryTermUrnArray.class, mode);
    }

    /**
     * Getter for hasRelatedTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getHasRelatedTerms() {
        return obtainWrapped(FIELD_HasRelatedTerms, GlossaryTermUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public GlossaryRelatedTerms setHasRelatedTerms(GlossaryTermUrnArray value, SetMode mode) {
        putWrapped(FIELD_HasRelatedTerms, GlossaryTermUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for hasRelatedTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public GlossaryRelatedTerms setHasRelatedTerms(
        @Nonnull
        GlossaryTermUrnArray value) {
        putWrapped(FIELD_HasRelatedTerms, GlossaryTermUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryRelatedTerms clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryRelatedTerms) super.clone());
    }

    @Override
    public GlossaryRelatedTerms copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryRelatedTerms) super.copy());
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
         * The relationship Is A with glossary term
         * 
         */
        public PathSpec isRelatedTerms() {
            return new PathSpec(getPathComponents(), "isRelatedTerms");
        }

        /**
         * The relationship Is A with glossary term
         * 
         */
        public PathSpec isRelatedTerms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "isRelatedTerms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The relationship Has A with glossary term
         * 
         */
        public PathSpec hasRelatedTerms() {
            return new PathSpec(getPathComponents(), "hasRelatedTerms");
        }

        /**
         * The relationship Has A with glossary term
         * 
         */
        public PathSpec hasRelatedTerms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "hasRelatedTerms");
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
