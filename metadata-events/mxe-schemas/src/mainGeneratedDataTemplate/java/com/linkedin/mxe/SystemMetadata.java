
package com.linkedin.mxe;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Kafka event for proposing a metadata change for an entity. A corresponding MetadataAuditEvent is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeEvent will be emitted instead.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/SystemMetadata.pdl.")
public class SystemMetadata
    extends RecordTemplate
{

    private final static SystemMetadata.Fields _fields = new SystemMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataAuditEvent is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeEvent will be emitted instead.*/record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The run id that produced the metadata*/runId:optional string=\"no-run-id-provided\"/**Additional properties*/properties:optional map[string,string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_LastObserved = SCHEMA.getField("lastObserved");
    private final static RecordDataSchema.Field FIELD_RunId = SCHEMA.getField("runId");
    private final static RecordDataSchema.Field FIELD_Properties = SCHEMA.getField("properties");

    public SystemMetadata() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public SystemMetadata(DataMap data) {
        super(data, SCHEMA);
    }

    public static SystemMetadata.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public boolean hasLastObserved() {
        return contains(FIELD_LastObserved);
    }

    /**
     * Remover for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public void removeLastObserved() {
        remove(FIELD_LastObserved);
    }

    /**
     * Getter for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public Long getLastObserved(GetMode mode) {
        return obtainDirect(FIELD_LastObserved, Long.class, mode);
    }

    /**
     * Getter for lastObserved
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#lastObserved
     */
    @Nullable
    public Long getLastObserved() {
        return obtainDirect(FIELD_LastObserved, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public SystemMetadata setLastObserved(Long value, SetMode mode) {
        putDirect(FIELD_LastObserved, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for lastObserved
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#lastObserved
     */
    public SystemMetadata setLastObserved(
        @Nonnull
        Long value) {
        putDirect(FIELD_LastObserved, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public SystemMetadata setLastObserved(long value) {
        putDirect(FIELD_LastObserved, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    public boolean hasRunId() {
        return contains(FIELD_RunId);
    }

    /**
     * Remover for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    public void removeRunId() {
        remove(FIELD_RunId);
    }

    /**
     * Getter for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    public String getRunId(GetMode mode) {
        return obtainDirect(FIELD_RunId, String.class, mode);
    }

    /**
     * Getter for runId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#runId
     */
    @Nullable
    public String getRunId() {
        return obtainDirect(FIELD_RunId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    public SystemMetadata setRunId(String value, SetMode mode) {
        putDirect(FIELD_RunId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for runId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#runId
     */
    public SystemMetadata setRunId(
        @Nonnull
        String value) {
        putDirect(FIELD_RunId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    public boolean hasProperties() {
        return contains(FIELD_Properties);
    }

    /**
     * Remover for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    public void removeProperties() {
        remove(FIELD_Properties);
    }

    /**
     * Getter for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    public StringMap getProperties(GetMode mode) {
        return obtainWrapped(FIELD_Properties, StringMap.class, mode);
    }

    /**
     * Getter for properties
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#properties
     */
    @Nullable
    public StringMap getProperties() {
        return obtainWrapped(FIELD_Properties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    public SystemMetadata setProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_Properties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for properties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#properties
     */
    public SystemMetadata setProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_Properties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SystemMetadata clone()
        throws CloneNotSupportedException
    {
        return ((SystemMetadata) super.clone());
    }

    @Override
    public SystemMetadata copy()
        throws CloneNotSupportedException
    {
        return ((SystemMetadata) super.copy());
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
         * The timestamp the metadata was observed at
         * 
         */
        public PathSpec lastObserved() {
            return new PathSpec(getPathComponents(), "lastObserved");
        }

        /**
         * The run id that produced the metadata
         * 
         */
        public PathSpec runId() {
            return new PathSpec(getPathComponents(), "runId");
        }

        /**
         * Additional properties
         * 
         */
        public PathSpec properties() {
            return new PathSpec(getPathComponents(), "properties");
        }

    }

}
