
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
 * Data model for a DataFlow entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/DataFlowEntity.pdl.")
public class DataFlowEntity
    extends RecordTemplate
{

    private final static DataFlowEntity.Fields _fields = new DataFlowEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a DataFlow entity*/record DataFlowEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the DataFlow*/urn:{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Workflow orchestrator ex: Azkaban, Airflow*/orchestrator:optional string/**Id of the flow*/flowId:optional string/**Cluster of the flow*/cluster:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_FlowId = SCHEMA.getField("flowId");
    private final static RecordDataSchema.Field FIELD_Cluster = SCHEMA.getField("cluster");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataFlowUrn.class);
    }

    public DataFlowEntity() {
        super(new DataMap(7, 0.75F), SCHEMA);
    }

    public DataFlowEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataFlowEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DataFlowEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DataFlowEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DataFlowEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DataFlowEntity.Fields#removed
     */
    public DataFlowEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowEntity.Fields#removed
     */
    public DataFlowEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DataFlowEntity.Fields#removed
     */
    public DataFlowEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataFlowEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataFlowEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataFlowEntity.Fields#urn
     */
    public com.linkedin.common.urn.DataFlowUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataFlowUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataFlowEntity.Fields#urn
     */
    public DataFlowEntity setUrn(com.linkedin.common.urn.DataFlowUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowEntity.Fields#urn
     */
    public DataFlowEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.DataFlowUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataFlowEntity.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        return contains(FIELD_Orchestrator);
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataFlowEntity.Fields#orchestrator
     */
    public void removeOrchestrator() {
        remove(FIELD_Orchestrator);
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataFlowEntity.Fields#orchestrator
     */
    public String getOrchestrator(GetMode mode) {
        return obtainDirect(FIELD_Orchestrator, String.class, mode);
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowEntity.Fields#orchestrator
     */
    @Nullable
    public String getOrchestrator() {
        return obtainDirect(FIELD_Orchestrator, String.class, GetMode.STRICT);
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataFlowEntity.Fields#orchestrator
     */
    public DataFlowEntity setOrchestrator(String value, SetMode mode) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowEntity.Fields#orchestrator
     */
    public DataFlowEntity setOrchestrator(
        @Nonnull
        String value) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for flowId
     * 
     * @see DataFlowEntity.Fields#flowId
     */
    public boolean hasFlowId() {
        return contains(FIELD_FlowId);
    }

    /**
     * Remover for flowId
     * 
     * @see DataFlowEntity.Fields#flowId
     */
    public void removeFlowId() {
        remove(FIELD_FlowId);
    }

    /**
     * Getter for flowId
     * 
     * @see DataFlowEntity.Fields#flowId
     */
    public String getFlowId(GetMode mode) {
        return obtainDirect(FIELD_FlowId, String.class, mode);
    }

    /**
     * Getter for flowId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowEntity.Fields#flowId
     */
    @Nullable
    public String getFlowId() {
        return obtainDirect(FIELD_FlowId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for flowId
     * 
     * @see DataFlowEntity.Fields#flowId
     */
    public DataFlowEntity setFlowId(String value, SetMode mode) {
        putDirect(FIELD_FlowId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for flowId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowEntity.Fields#flowId
     */
    public DataFlowEntity setFlowId(
        @Nonnull
        String value) {
        putDirect(FIELD_FlowId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for cluster
     * 
     * @see DataFlowEntity.Fields#cluster
     */
    public boolean hasCluster() {
        return contains(FIELD_Cluster);
    }

    /**
     * Remover for cluster
     * 
     * @see DataFlowEntity.Fields#cluster
     */
    public void removeCluster() {
        remove(FIELD_Cluster);
    }

    /**
     * Getter for cluster
     * 
     * @see DataFlowEntity.Fields#cluster
     */
    public String getCluster(GetMode mode) {
        return obtainDirect(FIELD_Cluster, String.class, mode);
    }

    /**
     * Getter for cluster
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowEntity.Fields#cluster
     */
    @Nullable
    public String getCluster() {
        return obtainDirect(FIELD_Cluster, String.class, GetMode.STRICT);
    }

    /**
     * Setter for cluster
     * 
     * @see DataFlowEntity.Fields#cluster
     */
    public DataFlowEntity setCluster(String value, SetMode mode) {
        putDirect(FIELD_Cluster, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for cluster
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowEntity.Fields#cluster
     */
    public DataFlowEntity setCluster(
        @Nonnull
        String value) {
        putDirect(FIELD_Cluster, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataFlowEntity clone()
        throws CloneNotSupportedException
    {
        return ((DataFlowEntity) super.clone());
    }

    @Override
    public DataFlowEntity copy()
        throws CloneNotSupportedException
    {
        return ((DataFlowEntity) super.copy());
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
         * Urn for the DataFlow
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Workflow orchestrator ex: Azkaban, Airflow
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
        }

        /**
         * Id of the flow
         * 
         */
        public PathSpec flowId() {
            return new PathSpec(getPathComponents(), "flowId");
        }

        /**
         * Cluster of the flow
         * 
         */
        public PathSpec cluster() {
            return new PathSpec(getPathComponents(), "cluster");
        }

    }

}
