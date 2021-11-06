
package com.linkedin.datajob;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.url.UrlCoercer;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;
import com.linkedin.data.template.UnionTemplate;


/**
 * Information about a Data processing job
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/DataJobInfo.pdl.")
public class DataJobInfo
    extends RecordTemplate
{

    private final static DataJobInfo.Fields _fields = new DataJobInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Job name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Job description*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Status of the job*/status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_FlowUrn = SCHEMA.getField("flowUrn");
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.DataFlowUrn.class);
    }

    public DataJobInfo() {
        super(new DataMap(10, 0.75F), SCHEMA, 3);
    }

    public DataJobInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataJobInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see DataJobInfo.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see DataJobInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see DataJobInfo.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInfo.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see DataJobInfo.Fields#customProperties
     */
    public DataJobInfo setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#customProperties
     */
    public DataJobInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see DataJobInfo.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        return contains(FIELD_ExternalUrl);
    }

    /**
     * Remover for externalUrl
     * 
     * @see DataJobInfo.Fields#externalUrl
     */
    public void removeExternalUrl() {
        remove(FIELD_ExternalUrl);
    }

    /**
     * Getter for externalUrl
     * 
     * @see DataJobInfo.Fields#externalUrl
     */
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInfo.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for externalUrl
     * 
     * @see DataJobInfo.Fields#externalUrl
     */
    public DataJobInfo setExternalUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, java.lang.String.class, value, mode);
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#externalUrl
     */
    public DataJobInfo setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, java.lang.String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DataJobInfo.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DataJobInfo.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DataJobInfo.Fields#name
     */
    public java.lang.String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, java.lang.String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInfo.Fields#name
     */
    @Nonnull
    public java.lang.String getName() {
        return obtainDirect(FIELD_Name, java.lang.String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DataJobInfo.Fields#name
     */
    public DataJobInfo setName(java.lang.String value, SetMode mode) {
        putDirect(FIELD_Name, java.lang.String.class, java.lang.String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#name
     */
    public DataJobInfo setName(
        @Nonnull
        java.lang.String value) {
        putDirect(FIELD_Name, java.lang.String.class, java.lang.String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataJobInfo.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see DataJobInfo.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see DataJobInfo.Fields#description
     */
    public java.lang.String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, java.lang.String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInfo.Fields#description
     */
    @Nullable
    public java.lang.String getDescription() {
        return obtainDirect(FIELD_Description, java.lang.String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see DataJobInfo.Fields#description
     */
    public DataJobInfo setDescription(java.lang.String value, SetMode mode) {
        putDirect(FIELD_Description, java.lang.String.class, java.lang.String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#description
     */
    public DataJobInfo setDescription(
        @Nonnull
        java.lang.String value) {
        putDirect(FIELD_Description, java.lang.String.class, java.lang.String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataJobInfo.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see DataJobInfo.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see DataJobInfo.Fields#type
     */
    public DataJobInfo.Type getType(GetMode mode) {
        return obtainWrapped(FIELD_Type, DataJobInfo.Type.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInfo.Fields#type
     */
    @Nonnull
    public DataJobInfo.Type getType() {
        return obtainWrapped(FIELD_Type, DataJobInfo.Type.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see DataJobInfo.Fields#type
     */
    public DataJobInfo setType(DataJobInfo.Type value, SetMode mode) {
        putWrapped(FIELD_Type, DataJobInfo.Type.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#type
     */
    public DataJobInfo setType(
        @Nonnull
        DataJobInfo.Type value) {
        putWrapped(FIELD_Type, DataJobInfo.Type.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    public boolean hasFlowUrn() {
        return contains(FIELD_FlowUrn);
    }

    /**
     * Remover for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    public void removeFlowUrn() {
        remove(FIELD_FlowUrn);
    }

    /**
     * Getter for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    public com.linkedin.common.urn.DataFlowUrn getFlowUrn(GetMode mode) {
        return obtainCustomType(FIELD_FlowUrn, com.linkedin.common.urn.DataFlowUrn.class, mode);
    }

    /**
     * Getter for flowUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInfo.Fields#flowUrn
     */
    @Nullable
    public com.linkedin.common.urn.DataFlowUrn getFlowUrn() {
        return obtainCustomType(FIELD_FlowUrn, com.linkedin.common.urn.DataFlowUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for flowUrn
     * 
     * @see DataJobInfo.Fields#flowUrn
     */
    public DataJobInfo setFlowUrn(com.linkedin.common.urn.DataFlowUrn value, SetMode mode) {
        putCustomType(FIELD_FlowUrn, com.linkedin.common.urn.DataFlowUrn.class, java.lang.String.class, value, mode);
        return this;
    }

    /**
     * Setter for flowUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#flowUrn
     */
    public DataJobInfo setFlowUrn(
        @Nonnull
        com.linkedin.common.urn.DataFlowUrn value) {
        putCustomType(FIELD_FlowUrn, com.linkedin.common.urn.DataFlowUrn.class, java.lang.String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for status
     * 
     * @see DataJobInfo.Fields#status
     */
    public boolean hasStatus() {
        return contains(FIELD_Status);
    }

    /**
     * Remover for status
     * 
     * @see DataJobInfo.Fields#status
     */
    public void removeStatus() {
        remove(FIELD_Status);
    }

    /**
     * Getter for status
     * 
     * @see DataJobInfo.Fields#status
     */
    public JobStatus getStatus(GetMode mode) {
        return obtainDirect(FIELD_Status, JobStatus.class, mode);
    }

    /**
     * Getter for status
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInfo.Fields#status
     */
    @Nullable
    public JobStatus getStatus() {
        return obtainDirect(FIELD_Status, JobStatus.class, GetMode.STRICT);
    }

    /**
     * Setter for status
     * 
     * @see DataJobInfo.Fields#status
     */
    public DataJobInfo setStatus(JobStatus value, SetMode mode) {
        putDirect(FIELD_Status, JobStatus.class, java.lang.String.class, value, mode);
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInfo.Fields#status
     */
    public DataJobInfo setStatus(
        @Nonnull
        JobStatus value) {
        putDirect(FIELD_Status, JobStatus.class, java.lang.String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataJobInfo clone()
        throws CloneNotSupportedException
    {
        return ((DataJobInfo) super.clone());
    }

    @Override
    public DataJobInfo copy()
        throws CloneNotSupportedException
    {
        return ((DataJobInfo) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<java.lang.String> path, java.lang.String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Job name
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Job description
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Datajob type
         * **NOTE**: AzkabanJobType is deprecated. Please use strings instead.
         * 
         */
        public com.linkedin.datajob.DataJobInfo.Type.Fields type() {
            return new com.linkedin.datajob.DataJobInfo.Type.Fields(getPathComponents(), "type");
        }

        /**
         * DataFlow urn that this job is part of
         * 
         */
        public PathSpec flowUrn() {
            return new PathSpec(getPathComponents(), "flowUrn");
        }

        /**
         * Status of the job
         * 
         */
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/DataJobInfo.pdl.")
    public final static class Type
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]", SchemaFormatType.PDL));
        private final static DataSchema MEMBER_AzkabanJobType = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.azkaban.AzkabanJobType");
        private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");

        public Type() {
            super(new DataMap(2, 0.75F), SCHEMA);
        }

        public Type(Object data) {
            super(data, SCHEMA);
        }

        public static DataJobInfo.Type create(com.linkedin.datajob.azkaban.AzkabanJobType value) {
            DataJobInfo.Type newUnion = new DataJobInfo.Type();
            newUnion.setAzkabanJobType(value);
            return newUnion;
        }

        public boolean isAzkabanJobType() {
            return memberIs("com.linkedin.datajob.azkaban.AzkabanJobType");
        }

        public com.linkedin.datajob.azkaban.AzkabanJobType getAzkabanJobType() {
            return obtainDirect(MEMBER_AzkabanJobType, com.linkedin.datajob.azkaban.AzkabanJobType.class, "com.linkedin.datajob.azkaban.AzkabanJobType");
        }

        public void setAzkabanJobType(com.linkedin.datajob.azkaban.AzkabanJobType value) {
            selectDirect(MEMBER_AzkabanJobType, com.linkedin.datajob.azkaban.AzkabanJobType.class, java.lang.String.class, "com.linkedin.datajob.azkaban.AzkabanJobType", value);
        }

        public static DataJobInfo.Type create(java.lang.String value) {
            DataJobInfo.Type newUnion = new DataJobInfo.Type();
            newUnion.setString(value);
            return newUnion;
        }

        public boolean isString() {
            return memberIs("string");
        }

        public java.lang.String getString() {
            return obtainDirect(MEMBER_String, java.lang.String.class, "string");
        }

        public void setString(java.lang.String value) {
            selectDirect(MEMBER_String, java.lang.String.class, java.lang.String.class, "string", value);
        }

        @Override
        public DataJobInfo.Type clone()
            throws CloneNotSupportedException
        {
            return ((DataJobInfo.Type) super.clone());
        }

        @Override
        public DataJobInfo.Type copy()
            throws CloneNotSupportedException
        {
            return ((DataJobInfo.Type) super.copy());
        }

        public static class Fields
            extends PathSpec
        {


            public Fields(List<java.lang.String> path, java.lang.String name) {
                super(path, name);
            }

            public Fields() {
                super();
            }

            public PathSpec AzkabanJobType() {
                return new PathSpec(getPathComponents(), "com.linkedin.datajob.azkaban.AzkabanJobType");
            }

            public PathSpec String() {
                return new PathSpec(getPathComponents(), "string");
            }

        }

    }

}
