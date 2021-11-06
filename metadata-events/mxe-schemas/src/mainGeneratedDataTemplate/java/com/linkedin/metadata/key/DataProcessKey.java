
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.FabricType;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Key for a Data Process
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/DataProcessKey.pdl.")
public class DataProcessKey
    extends RecordTemplate
{

    private final static DataProcessKey.Fields _fields = new DataProcessKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Process*/@Aspect.name=\"dataProcessKey\"record DataProcessKey{/**Process name i.e. an ETL job name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Standardized Orchestrator where data process is defined.\nTODO: Migrate towards something that can be validated like DataPlatform urn*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}orchestrator:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"queryByDefault\":false,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");

    public DataProcessKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public DataProcessKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataProcessKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see DataProcessKey.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DataProcessKey.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DataProcessKey.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessKey.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DataProcessKey.Fields#name
     */
    public DataProcessKey setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessKey.Fields#name
     */
    public DataProcessKey setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        return contains(FIELD_Orchestrator);
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    public void removeOrchestrator() {
        remove(FIELD_Orchestrator);
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    public String getOrchestrator(GetMode mode) {
        return obtainDirect(FIELD_Orchestrator, String.class, mode);
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessKey.Fields#orchestrator
     */
    @Nonnull
    public String getOrchestrator() {
        return obtainDirect(FIELD_Orchestrator, String.class, GetMode.STRICT);
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataProcessKey.Fields#orchestrator
     */
    public DataProcessKey setOrchestrator(String value, SetMode mode) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessKey.Fields#orchestrator
     */
    public DataProcessKey setOrchestrator(
        @Nonnull
        String value) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    public boolean hasOrigin() {
        return contains(FIELD_Origin);
    }

    /**
     * Remover for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    public void removeOrigin() {
        remove(FIELD_Origin);
    }

    /**
     * Getter for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    public FabricType getOrigin(GetMode mode) {
        return obtainDirect(FIELD_Origin, FabricType.class, mode);
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessKey.Fields#origin
     */
    @Nonnull
    public FabricType getOrigin() {
        return obtainDirect(FIELD_Origin, FabricType.class, GetMode.STRICT);
    }

    /**
     * Setter for origin
     * 
     * @see DataProcessKey.Fields#origin
     */
    public DataProcessKey setOrigin(FabricType value, SetMode mode) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessKey.Fields#origin
     */
    public DataProcessKey setOrigin(
        @Nonnull
        FabricType value) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataProcessKey clone()
        throws CloneNotSupportedException
    {
        return ((DataProcessKey) super.clone());
    }

    @Override
    public DataProcessKey copy()
        throws CloneNotSupportedException
    {
        return ((DataProcessKey) super.copy());
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
         * Process name i.e. an ETL job name
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Standardized Orchestrator where data process is defined.
         * TODO: Migrate towards something that can be validated like DataPlatform urn
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
