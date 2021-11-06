
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from
 * ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/EditableSchemaMetadata.pdl.")
public class EditableSchemaMetadata
    extends RecordTemplate
{

    private final static EditableSchemaMetadata.Fields _fields = new EditableSchemaMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"fieldName\":\"editedFieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"editedFieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"editedFieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Deleted = SCHEMA.getField("deleted");
    private final static RecordDataSchema.Field FIELD_EditableSchemaFieldInfo = SCHEMA.getField("editableSchemaFieldInfo");

    public EditableSchemaMetadata() {
        super(new DataMap(6, 0.75F), SCHEMA, 6);
    }

    public EditableSchemaMetadata(DataMap data) {
        super(data, SCHEMA);
    }

    public static EditableSchemaMetadata.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for created
     * 
     * @see EditableSchemaMetadata.Fields#created
     */
    public boolean hasCreated() {
        return contains(FIELD_Created);
    }

    /**
     * Remover for created
     * 
     * @see EditableSchemaMetadata.Fields#created
     */
    public void removeCreated() {
        remove(FIELD_Created);
    }

    /**
     * Getter for created
     * 
     * @see EditableSchemaMetadata.Fields#created
     */
    public AuditStamp getCreated(GetMode mode) {
        return obtainWrapped(FIELD_Created, AuditStamp.class, mode);
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableSchemaMetadata.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        return obtainWrapped(FIELD_Created, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for created
     * 
     * @see EditableSchemaMetadata.Fields#created
     */
    public EditableSchemaMetadata setCreated(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Created, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaMetadata.Fields#created
     */
    public EditableSchemaMetadata setCreated(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Created, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public boolean hasLastModified() {
        return contains(FIELD_LastModified);
    }

    /**
     * Remover for lastModified
     * 
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public void removeLastModified() {
        remove(FIELD_LastModified);
    }

    /**
     * Getter for lastModified
     * 
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public AuditStamp getLastModified(GetMode mode) {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, mode);
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for lastModified
     * 
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public EditableSchemaMetadata setLastModified(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public EditableSchemaMetadata setLastModified(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for deleted
     * 
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public boolean hasDeleted() {
        return contains(FIELD_Deleted);
    }

    /**
     * Remover for deleted
     * 
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public void removeDeleted() {
        remove(FIELD_Deleted);
    }

    /**
     * Getter for deleted
     * 
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public AuditStamp getDeleted(GetMode mode) {
        return obtainWrapped(FIELD_Deleted, AuditStamp.class, mode);
    }

    /**
     * Getter for deleted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableSchemaMetadata.Fields#deleted
     */
    @Nullable
    public AuditStamp getDeleted() {
        return obtainWrapped(FIELD_Deleted, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for deleted
     * 
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public EditableSchemaMetadata setDeleted(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Deleted, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for deleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public EditableSchemaMetadata setDeleted(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Deleted, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public boolean hasEditableSchemaFieldInfo() {
        return contains(FIELD_EditableSchemaFieldInfo);
    }

    /**
     * Remover for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public void removeEditableSchemaFieldInfo() {
        remove(FIELD_EditableSchemaFieldInfo);
    }

    /**
     * Getter for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public EditableSchemaFieldInfoArray getEditableSchemaFieldInfo(GetMode mode) {
        return obtainWrapped(FIELD_EditableSchemaFieldInfo, EditableSchemaFieldInfoArray.class, mode);
    }

    /**
     * Getter for editableSchemaFieldInfo
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    @Nonnull
    public EditableSchemaFieldInfoArray getEditableSchemaFieldInfo() {
        return obtainWrapped(FIELD_EditableSchemaFieldInfo, EditableSchemaFieldInfoArray.class, GetMode.STRICT);
    }

    /**
     * Setter for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public EditableSchemaMetadata setEditableSchemaFieldInfo(EditableSchemaFieldInfoArray value, SetMode mode) {
        putWrapped(FIELD_EditableSchemaFieldInfo, EditableSchemaFieldInfoArray.class, value, mode);
        return this;
    }

    /**
     * Setter for editableSchemaFieldInfo
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public EditableSchemaMetadata setEditableSchemaFieldInfo(
        @Nonnull
        EditableSchemaFieldInfoArray value) {
        putWrapped(FIELD_EditableSchemaFieldInfo, EditableSchemaFieldInfoArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EditableSchemaMetadata clone()
        throws CloneNotSupportedException
    {
        return ((EditableSchemaMetadata) super.clone());
    }

    @Override
    public EditableSchemaMetadata copy()
        throws CloneNotSupportedException
    {
        return ((EditableSchemaMetadata) super.copy());
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
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields deleted() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "deleted");
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public com.linkedin.schema.EditableSchemaFieldInfoArray.Fields editableSchemaFieldInfo() {
            return new com.linkedin.schema.EditableSchemaFieldInfoArray.Fields(getPathComponents(), "editableSchemaFieldInfo");
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public PathSpec editableSchemaFieldInfo(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "editableSchemaFieldInfo");
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
