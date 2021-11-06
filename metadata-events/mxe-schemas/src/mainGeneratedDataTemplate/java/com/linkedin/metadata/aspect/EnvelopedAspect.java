
package com.linkedin.metadata.aspect;

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
import com.linkedin.mxe.GenericAspect;
import com.linkedin.mxe.SystemMetadata;


/**
 * Enveloped record for an aspect.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/EnvelopedAspect.pdl.")
public class EnvelopedAspect
    extends RecordTemplate
{

    private final static EnvelopedAspect.Fields _fields = new EnvelopedAspect.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**Enveloped record for an aspect.\n*/record EnvelopedAspect{aspect:{namespace com.linkedin.mxe/**Generic record structure for serializing an Aspect\n*/record GenericAspect{value:bytes,contentType:string}}systemMetadata:{namespace com.linkedin.mxe/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataAuditEvent is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeEvent will be emitted instead.*/record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The run id that produced the metadata*/runId:optional string=\"no-run-id-provided\"/**Additional properties*/properties:optional map[string,string]}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Aspect = SCHEMA.getField("aspect");
    private final static RecordDataSchema.Field FIELD_SystemMetadata = SCHEMA.getField("systemMetadata");

    public EnvelopedAspect() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public EnvelopedAspect(DataMap data) {
        super(data, SCHEMA);
    }

    public static EnvelopedAspect.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    public boolean hasAspect() {
        return contains(FIELD_Aspect);
    }

    /**
     * Remover for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    public void removeAspect() {
        remove(FIELD_Aspect);
    }

    /**
     * Getter for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    public GenericAspect getAspect(GetMode mode) {
        return obtainWrapped(FIELD_Aspect, GenericAspect.class, mode);
    }

    /**
     * Getter for aspect
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#aspect
     */
    @Nonnull
    public GenericAspect getAspect() {
        return obtainWrapped(FIELD_Aspect, GenericAspect.class, GetMode.STRICT);
    }

    /**
     * Setter for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    public EnvelopedAspect setAspect(GenericAspect value, SetMode mode) {
        putWrapped(FIELD_Aspect, GenericAspect.class, value, mode);
        return this;
    }

    /**
     * Setter for aspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#aspect
     */
    public EnvelopedAspect setAspect(
        @Nonnull
        GenericAspect value) {
        putWrapped(FIELD_Aspect, GenericAspect.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for systemMetadata
     * 
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public boolean hasSystemMetadata() {
        return contains(FIELD_SystemMetadata);
    }

    /**
     * Remover for systemMetadata
     * 
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public void removeSystemMetadata() {
        remove(FIELD_SystemMetadata);
    }

    /**
     * Getter for systemMetadata
     * 
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public SystemMetadata getSystemMetadata(GetMode mode) {
        return obtainWrapped(FIELD_SystemMetadata, SystemMetadata.class, mode);
    }

    /**
     * Getter for systemMetadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    @Nonnull
    public SystemMetadata getSystemMetadata() {
        return obtainWrapped(FIELD_SystemMetadata, SystemMetadata.class, GetMode.STRICT);
    }

    /**
     * Setter for systemMetadata
     * 
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public EnvelopedAspect setSystemMetadata(SystemMetadata value, SetMode mode) {
        putWrapped(FIELD_SystemMetadata, SystemMetadata.class, value, mode);
        return this;
    }

    /**
     * Setter for systemMetadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public EnvelopedAspect setSystemMetadata(
        @Nonnull
        SystemMetadata value) {
        putWrapped(FIELD_SystemMetadata, SystemMetadata.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EnvelopedAspect clone()
        throws CloneNotSupportedException
    {
        return ((EnvelopedAspect) super.clone());
    }

    @Override
    public EnvelopedAspect copy()
        throws CloneNotSupportedException
    {
        return ((EnvelopedAspect) super.copy());
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

        public com.linkedin.mxe.GenericAspect.Fields aspect() {
            return new com.linkedin.mxe.GenericAspect.Fields(getPathComponents(), "aspect");
        }

        public com.linkedin.mxe.SystemMetadata.Fields systemMetadata() {
            return new com.linkedin.mxe.SystemMetadata.Fields(getPathComponents(), "systemMetadata");
        }

    }

}
