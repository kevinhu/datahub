
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * Properties of an applied glossary term.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/GlossaryTermAssociation.pdl.")
public class GlossaryTermAssociation
    extends RecordTemplate
{

    private final static GlossaryTermAssociation.Fields _fields = new GlossaryTermAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryTermUrn.class);
    }

    public GlossaryTermAssociation() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public GlossaryTermAssociation(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryTermAssociation.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    public com.linkedin.common.urn.GlossaryTermUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermAssociation.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.GlossaryTermUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see GlossaryTermAssociation.Fields#urn
     */
    public GlossaryTermAssociation setUrn(com.linkedin.common.urn.GlossaryTermUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermAssociation.Fields#urn
     */
    public GlossaryTermAssociation setUrn(
        @Nonnull
        com.linkedin.common.urn.GlossaryTermUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryTermAssociation clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermAssociation) super.clone());
    }

    @Override
    public GlossaryTermAssociation copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermAssociation) super.copy());
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
         * Urn of the applied glossary term
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

    }

}
