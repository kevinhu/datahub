
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.GlobalTags;
import com.linkedin.common.GlossaryTerms;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * SchemaField to describe metadata related to dataset schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/EditableSchemaFieldInfo.pdl.")
public class EditableSchemaFieldInfo
    extends RecordTemplate
{

    private final static EditableSchemaFieldInfo.Fields _fields = new EditableSchemaFieldInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"fieldName\":\"editedFieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"editedFieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"editedFieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_GlobalTags = SCHEMA.getField("globalTags");
    private final static RecordDataSchema.Field FIELD_GlossaryTerms = SCHEMA.getField("glossaryTerms");

    public EditableSchemaFieldInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
    }

    public EditableSchemaFieldInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static EditableSchemaFieldInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        return contains(FIELD_FieldPath);
    }

    /**
     * Remover for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public void removeFieldPath() {
        remove(FIELD_FieldPath);
    }

    /**
     * Getter for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public String getFieldPath(GetMode mode) {
        return obtainDirect(FIELD_FieldPath, String.class, mode);
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        return obtainDirect(FIELD_FieldPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public EditableSchemaFieldInfo setFieldPath(String value, SetMode mode) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public EditableSchemaFieldInfo setFieldPath(
        @Nonnull
        String value) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableSchemaFieldInfo.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public EditableSchemaFieldInfo setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public EditableSchemaFieldInfo setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public boolean hasGlobalTags() {
        return contains(FIELD_GlobalTags);
    }

    /**
     * Remover for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public void removeGlobalTags() {
        remove(FIELD_GlobalTags);
    }

    /**
     * Getter for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public GlobalTags getGlobalTags(GetMode mode) {
        return obtainWrapped(FIELD_GlobalTags, GlobalTags.class, mode);
    }

    /**
     * Getter for globalTags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    @Nullable
    public GlobalTags getGlobalTags() {
        return obtainWrapped(FIELD_GlobalTags, GlobalTags.class, GetMode.STRICT);
    }

    /**
     * Setter for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public EditableSchemaFieldInfo setGlobalTags(GlobalTags value, SetMode mode) {
        putWrapped(FIELD_GlobalTags, GlobalTags.class, value, mode);
        return this;
    }

    /**
     * Setter for globalTags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public EditableSchemaFieldInfo setGlobalTags(
        @Nonnull
        GlobalTags value) {
        putWrapped(FIELD_GlobalTags, GlobalTags.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public boolean hasGlossaryTerms() {
        return contains(FIELD_GlossaryTerms);
    }

    /**
     * Remover for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public void removeGlossaryTerms() {
        remove(FIELD_GlossaryTerms);
    }

    /**
     * Getter for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public GlossaryTerms getGlossaryTerms(GetMode mode) {
        return obtainWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, mode);
    }

    /**
     * Getter for glossaryTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    @Nullable
    public GlossaryTerms getGlossaryTerms() {
        return obtainWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, GetMode.STRICT);
    }

    /**
     * Setter for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public EditableSchemaFieldInfo setGlossaryTerms(GlossaryTerms value, SetMode mode) {
        putWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, value, mode);
        return this;
    }

    /**
     * Setter for glossaryTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public EditableSchemaFieldInfo setGlossaryTerms(
        @Nonnull
        GlossaryTerms value) {
        putWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EditableSchemaFieldInfo clone()
        throws CloneNotSupportedException
    {
        return ((EditableSchemaFieldInfo) super.clone());
    }

    @Override
    public EditableSchemaFieldInfo copy()
        throws CloneNotSupportedException
    {
        return ((EditableSchemaFieldInfo) super.copy());
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
         * FieldPath uniquely identifying the SchemaField this metadata is associated with
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Description
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Tags associated with the field
         * 
         */
        public com.linkedin.common.GlobalTags.Fields globalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "globalTags");
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public com.linkedin.common.GlossaryTerms.Fields glossaryTerms() {
            return new com.linkedin.common.GlossaryTerms.Fields(getPathComponents(), "glossaryTerms");
        }

    }

}
