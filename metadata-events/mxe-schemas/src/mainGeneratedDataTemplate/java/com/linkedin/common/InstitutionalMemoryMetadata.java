
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.url.UrlCoercer;
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
 * Metadata corresponding to a record of institutional memory.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/InstitutionalMemoryMetadata.pdl.")
public class InstitutionalMemoryMetadata
    extends RecordTemplate
{

    private final static InstitutionalMemoryMetadata.Fields _fields = new InstitutionalMemoryMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Url = SCHEMA.getField("url");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_CreateStamp = SCHEMA.getField("createStamp");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public InstitutionalMemoryMetadata() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public InstitutionalMemoryMetadata(DataMap data) {
        super(data, SCHEMA);
    }

    public static InstitutionalMemoryMetadata.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public boolean hasUrl() {
        return contains(FIELD_Url);
    }

    /**
     * Remover for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public void removeUrl() {
        remove(FIELD_Url);
    }

    /**
     * Getter for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public com.linkedin.common.url.Url getUrl(GetMode mode) {
        return obtainCustomType(FIELD_Url, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for url
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    @Nonnull
    public com.linkedin.common.url.Url getUrl() {
        return obtainCustomType(FIELD_Url, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for url
     * 
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public InstitutionalMemoryMetadata setUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_Url, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for url
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#url
     */
    public InstitutionalMemoryMetadata setUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_Url, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    @Nonnull
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public InstitutionalMemoryMetadata setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#description
     */
    public InstitutionalMemoryMetadata setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public boolean hasCreateStamp() {
        return contains(FIELD_CreateStamp);
    }

    /**
     * Remover for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public void removeCreateStamp() {
        remove(FIELD_CreateStamp);
    }

    /**
     * Getter for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public AuditStamp getCreateStamp(GetMode mode) {
        return obtainWrapped(FIELD_CreateStamp, AuditStamp.class, mode);
    }

    /**
     * Getter for createStamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    @Nonnull
    public AuditStamp getCreateStamp() {
        return obtainWrapped(FIELD_CreateStamp, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for createStamp
     * 
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public InstitutionalMemoryMetadata setCreateStamp(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_CreateStamp, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for createStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadata.Fields#createStamp
     */
    public InstitutionalMemoryMetadata setCreateStamp(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_CreateStamp, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public InstitutionalMemoryMetadata clone()
        throws CloneNotSupportedException
    {
        return ((InstitutionalMemoryMetadata) super.clone());
    }

    @Override
    public InstitutionalMemoryMetadata copy()
        throws CloneNotSupportedException
    {
        return ((InstitutionalMemoryMetadata) super.copy());
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
         * Link to an engineering design document or a wiki page.
         * 
         */
        public PathSpec url() {
            return new PathSpec(getPathComponents(), "url");
        }

        /**
         * Description of the link.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Audit stamp associated with creation of this record
         * 
         */
        public com.linkedin.common.AuditStamp.Fields createStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "createStamp");
        }

    }

}
