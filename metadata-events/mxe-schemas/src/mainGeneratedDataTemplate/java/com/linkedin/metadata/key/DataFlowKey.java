
package com.linkedin.metadata.key;

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
 * Key for a Data Flow
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/DataFlowKey.pdl.")
public class DataFlowKey
    extends RecordTemplate
{

    private final static DataFlowKey.Fields _fields = new DataFlowKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Flow*/@Aspect.name=\"dataFlowKey\"record DataFlowKey{/**Workflow manager like azkaban, airflow which orchestrates the flow*/@Searchable.fieldType=\"TEXT_PARTIAL\"orchestrator:string/**Unique Identifier of the data flow*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}flowId:string/**Cluster where the flow is executed*/@Searchable.fieldType=\"TEXT_PARTIAL\"cluster:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_FlowId = SCHEMA.getField("flowId");
    private final static RecordDataSchema.Field FIELD_Cluster = SCHEMA.getField("cluster");

    public DataFlowKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public DataFlowKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataFlowKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        return contains(FIELD_Orchestrator);
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    public void removeOrchestrator() {
        remove(FIELD_Orchestrator);
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    public String getOrchestrator(GetMode mode) {
        return obtainDirect(FIELD_Orchestrator, String.class, mode);
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowKey.Fields#orchestrator
     */
    @Nonnull
    public String getOrchestrator() {
        return obtainDirect(FIELD_Orchestrator, String.class, GetMode.STRICT);
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    public DataFlowKey setOrchestrator(String value, SetMode mode) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowKey.Fields#orchestrator
     */
    public DataFlowKey setOrchestrator(
        @Nonnull
        String value) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    public boolean hasFlowId() {
        return contains(FIELD_FlowId);
    }

    /**
     * Remover for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    public void removeFlowId() {
        remove(FIELD_FlowId);
    }

    /**
     * Getter for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    public String getFlowId(GetMode mode) {
        return obtainDirect(FIELD_FlowId, String.class, mode);
    }

    /**
     * Getter for flowId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowKey.Fields#flowId
     */
    @Nonnull
    public String getFlowId() {
        return obtainDirect(FIELD_FlowId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    public DataFlowKey setFlowId(String value, SetMode mode) {
        putDirect(FIELD_FlowId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for flowId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowKey.Fields#flowId
     */
    public DataFlowKey setFlowId(
        @Nonnull
        String value) {
        putDirect(FIELD_FlowId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    public boolean hasCluster() {
        return contains(FIELD_Cluster);
    }

    /**
     * Remover for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    public void removeCluster() {
        remove(FIELD_Cluster);
    }

    /**
     * Getter for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    public String getCluster(GetMode mode) {
        return obtainDirect(FIELD_Cluster, String.class, mode);
    }

    /**
     * Getter for cluster
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowKey.Fields#cluster
     */
    @Nonnull
    public String getCluster() {
        return obtainDirect(FIELD_Cluster, String.class, GetMode.STRICT);
    }

    /**
     * Setter for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    public DataFlowKey setCluster(String value, SetMode mode) {
        putDirect(FIELD_Cluster, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for cluster
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowKey.Fields#cluster
     */
    public DataFlowKey setCluster(
        @Nonnull
        String value) {
        putDirect(FIELD_Cluster, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataFlowKey clone()
        throws CloneNotSupportedException
    {
        return ((DataFlowKey) super.clone());
    }

    @Override
    public DataFlowKey copy()
        throws CloneNotSupportedException
    {
        return ((DataFlowKey) super.copy());
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
         * Workflow manager like azkaban, airflow which orchestrates the flow
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
        }

        /**
         * Unique Identifier of the data flow
         * 
         */
        public PathSpec flowId() {
            return new PathSpec(getPathComponents(), "flowId");
        }

        /**
         * Cluster where the flow is executed
         * 
         */
        public PathSpec cluster() {
            return new PathSpec(getPathComponents(), "cluster");
        }

    }

}
