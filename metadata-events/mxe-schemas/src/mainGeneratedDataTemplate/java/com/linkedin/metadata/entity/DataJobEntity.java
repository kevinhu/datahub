
package com.linkedin.metadata.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Data model for a DataJob entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/DataJobEntity.pdl.")
public class DataJobEntity
    extends RecordTemplate
{

    private final static DataJobEntity.Fields _fields = new DataJobEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a DataJob entity*/record DataJobEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the DataJob*/urn:{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}/**Urn of the associated DataFlow*/flow:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Id of the job*/jobId:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Flow = SCHEMA.getField("flow");
    private final static RecordDataSchema.Field FIELD_JobId = SCHEMA.getField("jobId");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataJobUrn.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.DataFlowUrn.class);
    }

    public DataJobEntity() {
        super(new DataMap(6, 0.75F), SCHEMA);
    }

    public DataJobEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataJobEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DataJobEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DataJobEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DataJobEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DataJobEntity.Fields#removed
     */
    public DataJobEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobEntity.Fields#removed
     */
    public DataJobEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DataJobEntity.Fields#removed
     */
    public DataJobEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataJobEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataJobEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataJobEntity.Fields#urn
     */
    public com.linkedin.common.urn.DataJobUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataJobUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataJobEntity.Fields#urn
     */
    public DataJobEntity setUrn(com.linkedin.common.urn.DataJobUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobEntity.Fields#urn
     */
    public DataJobEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.DataJobUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for flow
     * 
     * @see DataJobEntity.Fields#flow
     */
    public boolean hasFlow() {
        return contains(FIELD_Flow);
    }

    /**
     * Remover for flow
     * 
     * @see DataJobEntity.Fields#flow
     */
    public void removeFlow() {
        remove(FIELD_Flow);
    }

    /**
     * Getter for flow
     * 
     * @see DataJobEntity.Fields#flow
     */
    public com.linkedin.common.urn.DataFlowUrn getFlow(GetMode mode) {
        return obtainCustomType(FIELD_Flow, com.linkedin.common.urn.DataFlowUrn.class, mode);
    }

    /**
     * Getter for flow
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobEntity.Fields#flow
     */
    @Nullable
    public com.linkedin.common.urn.DataFlowUrn getFlow() {
        return obtainCustomType(FIELD_Flow, com.linkedin.common.urn.DataFlowUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for flow
     * 
     * @see DataJobEntity.Fields#flow
     */
    public DataJobEntity setFlow(com.linkedin.common.urn.DataFlowUrn value, SetMode mode) {
        putCustomType(FIELD_Flow, com.linkedin.common.urn.DataFlowUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for flow
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobEntity.Fields#flow
     */
    public DataJobEntity setFlow(
        @Nonnull
        com.linkedin.common.urn.DataFlowUrn value) {
        putCustomType(FIELD_Flow, com.linkedin.common.urn.DataFlowUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for jobId
     * 
     * @see DataJobEntity.Fields#jobId
     */
    public boolean hasJobId() {
        return contains(FIELD_JobId);
    }

    /**
     * Remover for jobId
     * 
     * @see DataJobEntity.Fields#jobId
     */
    public void removeJobId() {
        remove(FIELD_JobId);
    }

    /**
     * Getter for jobId
     * 
     * @see DataJobEntity.Fields#jobId
     */
    public String getJobId(GetMode mode) {
        return obtainDirect(FIELD_JobId, String.class, mode);
    }

    /**
     * Getter for jobId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobEntity.Fields#jobId
     */
    @Nullable
    public String getJobId() {
        return obtainDirect(FIELD_JobId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for jobId
     * 
     * @see DataJobEntity.Fields#jobId
     */
    public DataJobEntity setJobId(String value, SetMode mode) {
        putDirect(FIELD_JobId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for jobId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobEntity.Fields#jobId
     */
    public DataJobEntity setJobId(
        @Nonnull
        String value) {
        putDirect(FIELD_JobId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataJobEntity clone()
        throws CloneNotSupportedException
    {
        return ((DataJobEntity) super.clone());
    }

    @Override
    public DataJobEntity copy()
        throws CloneNotSupportedException
    {
        return ((DataJobEntity) super.copy());
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
         * Whether the entity has been removed or not
         * 
         */
        public PathSpec removed() {
            return new PathSpec(getPathComponents(), "removed");
        }

        /**
         * Urn for the DataJob
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Urn of the associated DataFlow
         * 
         */
        public PathSpec flow() {
            return new PathSpec(getPathComponents(), "flow");
        }

        /**
         * Id of the job
         * 
         */
        public PathSpec jobId() {
            return new PathSpec(getPathComponents(), "jobId");
        }

    }

}
