
package com.linkedin.common;

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
 * Related business terms information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/GlossaryTerms.pdl.")
public class GlossaryTerms
    extends RecordTemplate
{

    private final static GlossaryTerms.Fields _fields = new GlossaryTerms.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Terms = SCHEMA.getField("terms");
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");

    public GlossaryTerms() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public GlossaryTerms(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryTerms.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    public boolean hasTerms() {
        return contains(FIELD_Terms);
    }

    /**
     * Remover for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    public void removeTerms() {
        remove(FIELD_Terms);
    }

    /**
     * Getter for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    public GlossaryTermAssociationArray getTerms(GetMode mode) {
        return obtainWrapped(FIELD_Terms, GlossaryTermAssociationArray.class, mode);
    }

    /**
     * Getter for terms
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTerms.Fields#terms
     */
    @Nonnull
    public GlossaryTermAssociationArray getTerms() {
        return obtainWrapped(FIELD_Terms, GlossaryTermAssociationArray.class, GetMode.STRICT);
    }

    /**
     * Setter for terms
     * 
     * @see GlossaryTerms.Fields#terms
     */
    public GlossaryTerms setTerms(GlossaryTermAssociationArray value, SetMode mode) {
        putWrapped(FIELD_Terms, GlossaryTermAssociationArray.class, value, mode);
        return this;
    }

    /**
     * Setter for terms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTerms.Fields#terms
     */
    public GlossaryTerms setTerms(
        @Nonnull
        GlossaryTermAssociationArray value) {
        putWrapped(FIELD_Terms, GlossaryTermAssociationArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @see GlossaryTerms.Fields#auditStamp
     */
    public boolean hasAuditStamp() {
        return contains(FIELD_AuditStamp);
    }

    /**
     * Remover for auditStamp
     * 
     * @see GlossaryTerms.Fields#auditStamp
     */
    public void removeAuditStamp() {
        remove(FIELD_AuditStamp);
    }

    /**
     * Getter for auditStamp
     * 
     * @see GlossaryTerms.Fields#auditStamp
     */
    public AuditStamp getAuditStamp(GetMode mode) {
        return obtainWrapped(FIELD_AuditStamp, AuditStamp.class, mode);
    }

    /**
     * Getter for auditStamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTerms.Fields#auditStamp
     */
    @Nonnull
    public AuditStamp getAuditStamp() {
        return obtainWrapped(FIELD_AuditStamp, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for auditStamp
     * 
     * @see GlossaryTerms.Fields#auditStamp
     */
    public GlossaryTerms setAuditStamp(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_AuditStamp, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for auditStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTerms.Fields#auditStamp
     */
    public GlossaryTerms setAuditStamp(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_AuditStamp, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryTerms clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTerms) super.clone());
    }

    @Override
    public GlossaryTerms copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTerms) super.copy());
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
         * The related business terms
         * 
         */
        public com.linkedin.common.GlossaryTermAssociationArray.Fields terms() {
            return new com.linkedin.common.GlossaryTermAssociationArray.Fields(getPathComponents(), "terms");
        }

        /**
         * The related business terms
         * 
         */
        public PathSpec terms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "terms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Audit stamp containing who reported the related business term
         * 
         */
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

    }

}
