
package com.linkedin.metadata.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.FabricType;
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
 * Data model for a Data Process entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/DataProcessEntity.pdl.")
public class DataProcessEntity
    extends RecordTemplate
{

    private final static DataProcessEntity.Fields _fields = new DataProcessEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a Data Process entity*/record DataProcessEntity{/**Urn for the Data Process*/urn:{namespace com.linkedin.common/**Standardized process identifier.*/@java.class=\"com.linkedin.common.urn.DataProcessUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataProcess\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataProcess\",\"doc\":\"Standardized process identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"process name i.e. an ETL job name\",\"type\":\"string\",\"maxLength\":25},{\"name\":\"orchestrator\",\"doc\":\"Standardized Orchestrator where data process is defined.\",\"type\":\"string\",\"maxLength\":100},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DataProcessUrn=string}/**Data Process name(id)*/name:optional string/**Process Orchestrator for this process in the form. Options can be Airflow, Azkaban, Azure Data Factory*/orchestrator:optional string/**Fabric type where dataset belongs to or where it was generated.*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataProcessUrn.class);
    }

    public DataProcessEntity() {
        super(new DataMap(6, 0.75F), SCHEMA);
    }

    public DataProcessEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataProcessEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataProcessEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataProcessEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataProcessEntity.Fields#urn
     */
    public com.linkedin.common.urn.DataProcessUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataProcessUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataProcessEntity.Fields#urn
     */
    public DataProcessEntity setUrn(com.linkedin.common.urn.DataProcessUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessEntity.Fields#urn
     */
    public DataProcessEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.DataProcessUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DataProcessEntity.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DataProcessEntity.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DataProcessEntity.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessEntity.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DataProcessEntity.Fields#name
     */
    public DataProcessEntity setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessEntity.Fields#name
     */
    public DataProcessEntity setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataProcessEntity.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        return contains(FIELD_Orchestrator);
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataProcessEntity.Fields#orchestrator
     */
    public void removeOrchestrator() {
        remove(FIELD_Orchestrator);
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataProcessEntity.Fields#orchestrator
     */
    public String getOrchestrator(GetMode mode) {
        return obtainDirect(FIELD_Orchestrator, String.class, mode);
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessEntity.Fields#orchestrator
     */
    @Nullable
    public String getOrchestrator() {
        return obtainDirect(FIELD_Orchestrator, String.class, GetMode.STRICT);
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataProcessEntity.Fields#orchestrator
     */
    public DataProcessEntity setOrchestrator(String value, SetMode mode) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessEntity.Fields#orchestrator
     */
    public DataProcessEntity setOrchestrator(
        @Nonnull
        String value) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see DataProcessEntity.Fields#origin
     */
    public boolean hasOrigin() {
        return contains(FIELD_Origin);
    }

    /**
     * Remover for origin
     * 
     * @see DataProcessEntity.Fields#origin
     */
    public void removeOrigin() {
        remove(FIELD_Origin);
    }

    /**
     * Getter for origin
     * 
     * @see DataProcessEntity.Fields#origin
     */
    public FabricType getOrigin(GetMode mode) {
        return obtainDirect(FIELD_Origin, FabricType.class, mode);
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessEntity.Fields#origin
     */
    @Nullable
    public FabricType getOrigin() {
        return obtainDirect(FIELD_Origin, FabricType.class, GetMode.STRICT);
    }

    /**
     * Setter for origin
     * 
     * @see DataProcessEntity.Fields#origin
     */
    public DataProcessEntity setOrigin(FabricType value, SetMode mode) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessEntity.Fields#origin
     */
    public DataProcessEntity setOrigin(
        @Nonnull
        FabricType value) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataProcessEntity clone()
        throws CloneNotSupportedException
    {
        return ((DataProcessEntity) super.clone());
    }

    @Override
    public DataProcessEntity copy()
        throws CloneNotSupportedException
    {
        return ((DataProcessEntity) super.copy());
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
         * Urn for the Data Process
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Data Process name(id)
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Process Orchestrator for this process in the form. Options can be Airflow, Azkaban, Azure Data Factory
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
        }

        /**
         * Fabric type where dataset belongs to or where it was generated.
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

    }

}
