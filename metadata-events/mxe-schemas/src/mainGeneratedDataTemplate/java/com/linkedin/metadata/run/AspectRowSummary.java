
package com.linkedin.metadata.run;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/AspectRowSummary.pdl.")
public class AspectRowSummary
    extends RecordTemplate
{

    private final static AspectRowSummary.Fields _fields = new AspectRowSummary.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_RunId = SCHEMA.getField("runId");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Timestamp = SCHEMA.getField("timestamp");
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_KeyAspect = SCHEMA.getField("keyAspect");

    public AspectRowSummary() {
        super(new DataMap(10, 0.75F), SCHEMA);
    }

    public AspectRowSummary(DataMap data) {
        super(data, SCHEMA);
    }

    public static AspectRowSummary.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for runId
     * 
     * @see AspectRowSummary.Fields#runId
     */
    public boolean hasRunId() {
        return contains(FIELD_RunId);
    }

    /**
     * Remover for runId
     * 
     * @see AspectRowSummary.Fields#runId
     */
    public void removeRunId() {
        remove(FIELD_RunId);
    }

    /**
     * Getter for runId
     * 
     * @see AspectRowSummary.Fields#runId
     */
    public String getRunId(GetMode mode) {
        return obtainDirect(FIELD_RunId, String.class, mode);
    }

    /**
     * Getter for runId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#runId
     */
    @Nonnull
    public String getRunId() {
        return obtainDirect(FIELD_RunId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for runId
     * 
     * @see AspectRowSummary.Fields#runId
     */
    public AspectRowSummary setRunId(String value, SetMode mode) {
        putDirect(FIELD_RunId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for runId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#runId
     */
    public AspectRowSummary setRunId(
        @Nonnull
        String value) {
        putDirect(FIELD_RunId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    public boolean hasAspectName() {
        return contains(FIELD_AspectName);
    }

    /**
     * Remover for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    public void removeAspectName() {
        remove(FIELD_AspectName);
    }

    /**
     * Getter for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    public String getAspectName(GetMode mode) {
        return obtainDirect(FIELD_AspectName, String.class, mode);
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#aspectName
     */
    @Nonnull
    public String getAspectName() {
        return obtainDirect(FIELD_AspectName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    public AspectRowSummary setAspectName(String value, SetMode mode) {
        putDirect(FIELD_AspectName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#aspectName
     */
    public AspectRowSummary setAspectName(
        @Nonnull
        String value) {
        putDirect(FIELD_AspectName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see AspectRowSummary.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see AspectRowSummary.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see AspectRowSummary.Fields#urn
     */
    public String getUrn(GetMode mode) {
        return obtainDirect(FIELD_Urn, String.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#urn
     */
    @Nonnull
    public String getUrn() {
        return obtainDirect(FIELD_Urn, String.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see AspectRowSummary.Fields#urn
     */
    public AspectRowSummary setUrn(String value, SetMode mode) {
        putDirect(FIELD_Urn, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#urn
     */
    public AspectRowSummary setUrn(
        @Nonnull
        String value) {
        putDirect(FIELD_Urn, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    public boolean hasTimestamp() {
        return contains(FIELD_Timestamp);
    }

    /**
     * Remover for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    public void removeTimestamp() {
        remove(FIELD_Timestamp);
    }

    /**
     * Getter for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    public Long getTimestamp(GetMode mode) {
        return obtainDirect(FIELD_Timestamp, Long.class, mode);
    }

    /**
     * Getter for timestamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#timestamp
     */
    @Nonnull
    public Long getTimestamp() {
        return obtainDirect(FIELD_Timestamp, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    public AspectRowSummary setTimestamp(Long value, SetMode mode) {
        putDirect(FIELD_Timestamp, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#timestamp
     */
    public AspectRowSummary setTimestamp(
        @Nonnull
        Long value) {
        putDirect(FIELD_Timestamp, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    public AspectRowSummary setTimestamp(long value) {
        putDirect(FIELD_Timestamp, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    public boolean hasMetadata() {
        return contains(FIELD_Metadata);
    }

    /**
     * Remover for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    public void removeMetadata() {
        remove(FIELD_Metadata);
    }

    /**
     * Getter for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    public String getMetadata(GetMode mode) {
        return obtainDirect(FIELD_Metadata, String.class, mode);
    }

    /**
     * Getter for metadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#metadata
     */
    @Nonnull
    public String getMetadata() {
        return obtainDirect(FIELD_Metadata, String.class, GetMode.STRICT);
    }

    /**
     * Setter for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    public AspectRowSummary setMetadata(String value, SetMode mode) {
        putDirect(FIELD_Metadata, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for metadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#metadata
     */
    public AspectRowSummary setMetadata(
        @Nonnull
        String value) {
        putDirect(FIELD_Metadata, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    public boolean hasVersion() {
        return contains(FIELD_Version);
    }

    /**
     * Remover for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    public void removeVersion() {
        remove(FIELD_Version);
    }

    /**
     * Getter for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    public Long getVersion(GetMode mode) {
        return obtainDirect(FIELD_Version, Long.class, mode);
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#version
     */
    @Nonnull
    public Long getVersion() {
        return obtainDirect(FIELD_Version, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    public AspectRowSummary setVersion(Long value, SetMode mode) {
        putDirect(FIELD_Version, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#version
     */
    public AspectRowSummary setVersion(
        @Nonnull
        Long value) {
        putDirect(FIELD_Version, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    public AspectRowSummary setVersion(long value) {
        putDirect(FIELD_Version, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public boolean hasKeyAspect() {
        return contains(FIELD_KeyAspect);
    }

    /**
     * Remover for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public void removeKeyAspect() {
        remove(FIELD_KeyAspect);
    }

    /**
     * Getter for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public Boolean isKeyAspect(GetMode mode) {
        return obtainDirect(FIELD_KeyAspect, Boolean.class, mode);
    }

    /**
     * Getter for keyAspect
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#keyAspect
     */
    @Nonnull
    public Boolean isKeyAspect() {
        return obtainDirect(FIELD_KeyAspect, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public AspectRowSummary setKeyAspect(Boolean value, SetMode mode) {
        putDirect(FIELD_KeyAspect, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for keyAspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#keyAspect
     */
    public AspectRowSummary setKeyAspect(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_KeyAspect, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public AspectRowSummary setKeyAspect(boolean value) {
        putDirect(FIELD_KeyAspect, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public AspectRowSummary clone()
        throws CloneNotSupportedException
    {
        return ((AspectRowSummary) super.clone());
    }

    @Override
    public AspectRowSummary copy()
        throws CloneNotSupportedException
    {
        return ((AspectRowSummary) super.copy());
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

        public PathSpec runId() {
            return new PathSpec(getPathComponents(), "runId");
        }

        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        public PathSpec timestamp() {
            return new PathSpec(getPathComponents(), "timestamp");
        }

        public PathSpec metadata() {
            return new PathSpec(getPathComponents(), "metadata");
        }

        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        public PathSpec keyAspect() {
            return new PathSpec(getPathComponents(), "keyAspect");
        }

    }

}
