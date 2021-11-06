
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * The status of the user, e.g. provisioned, active, suspended, etc.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpUserStatus.pdl.")
public class CorpUserStatus
    extends RecordTemplate
{

    private final static CorpUserStatus.Fields _fields = new CorpUserStatus.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    public CorpUserStatus() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public CorpUserStatus(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpUserStatus.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    public boolean hasStatus() {
        return contains(FIELD_Status);
    }

    /**
     * Remover for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    public void removeStatus() {
        remove(FIELD_Status);
    }

    /**
     * Getter for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    public String getStatus(GetMode mode) {
        return obtainDirect(FIELD_Status, String.class, mode);
    }

    /**
     * Getter for status
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserStatus.Fields#status
     */
    @Nonnull
    public String getStatus() {
        return obtainDirect(FIELD_Status, String.class, GetMode.STRICT);
    }

    /**
     * Setter for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    public CorpUserStatus setStatus(String value, SetMode mode) {
        putDirect(FIELD_Status, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserStatus.Fields#status
     */
    public CorpUserStatus setStatus(
        @Nonnull
        String value) {
        putDirect(FIELD_Status, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    public boolean hasLastModified() {
        return contains(FIELD_LastModified);
    }

    /**
     * Remover for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    public void removeLastModified() {
        remove(FIELD_LastModified);
    }

    /**
     * Getter for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    public AuditStamp getLastModified(GetMode mode) {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, mode);
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserStatus.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    public CorpUserStatus setLastModified(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserStatus.Fields#lastModified
     */
    public CorpUserStatus setLastModified(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpUserStatus clone()
        throws CloneNotSupportedException
    {
        return ((CorpUserStatus) super.clone());
    }

    @Override
    public CorpUserStatus copy()
        throws CloneNotSupportedException
    {
        return ((CorpUserStatus) super.copy());
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
         * Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED
         * 
         */
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

        /**
         * Audit stamp containing who last modified the status and when.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

}
