
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * Key for a Data Job
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/DataJobKey.pdl.")
public class DataJobKey
    extends RecordTemplate
{

    private final static DataJobKey.Fields _fields = new DataJobKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"name\":\"IsPartOf\",\"entityTypes\":[\"dataFlow\"]}@Searchable={\"fieldName\":\"dataFlow\",\"queryByDefault\":false,\"fieldType\":\"URN_PARTIAL\"}flow:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}jobId:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Flow = SCHEMA.getField("flow");
    private final static RecordDataSchema.Field FIELD_JobId = SCHEMA.getField("jobId");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataJobKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public DataJobKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataJobKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    public boolean hasFlow() {
        return contains(FIELD_Flow);
    }

    /**
     * Remover for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    public void removeFlow() {
        remove(FIELD_Flow);
    }

    /**
     * Getter for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    public com.linkedin.common.urn.Urn getFlow(GetMode mode) {
        return obtainCustomType(FIELD_Flow, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for flow
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobKey.Fields#flow
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getFlow() {
        return obtainCustomType(FIELD_Flow, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    public DataJobKey setFlow(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Flow, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for flow
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobKey.Fields#flow
     */
    public DataJobKey setFlow(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Flow, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    public boolean hasJobId() {
        return contains(FIELD_JobId);
    }

    /**
     * Remover for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    public void removeJobId() {
        remove(FIELD_JobId);
    }

    /**
     * Getter for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    public String getJobId(GetMode mode) {
        return obtainDirect(FIELD_JobId, String.class, mode);
    }

    /**
     * Getter for jobId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobKey.Fields#jobId
     */
    @Nonnull
    public String getJobId() {
        return obtainDirect(FIELD_JobId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    public DataJobKey setJobId(String value, SetMode mode) {
        putDirect(FIELD_JobId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for jobId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobKey.Fields#jobId
     */
    public DataJobKey setJobId(
        @Nonnull
        String value) {
        putDirect(FIELD_JobId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataJobKey clone()
        throws CloneNotSupportedException
    {
        return ((DataJobKey) super.clone());
    }

    @Override
    public DataJobKey copy()
        throws CloneNotSupportedException
    {
        return ((DataJobKey) super.copy());
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
         * Standardized data processing flow urn representing the flow for the job
         * 
         */
        public PathSpec flow() {
            return new PathSpec(getPathComponents(), "flow");
        }

        /**
         * Unique Identifier of the data job
         * 
         */
        public PathSpec jobId() {
            return new PathSpec(getPathComponents(), "jobId");
        }

    }

}
