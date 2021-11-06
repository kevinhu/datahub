
package com.linkedin.dataprocess;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.DatasetUrnArray;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * The inputs and outputs of this data process
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataprocess/DataProcessInfo.pdl.")
public class DataProcessInfo
    extends RecordTemplate
{

    private final static DataProcessInfo.Fields _fields = new DataProcessInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess/**The inputs and outputs of this data process*/@Aspect.name=\"dataProcessInfo\"record DataProcessInfo{/**the inputs of the data process*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"inputs\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]/**the outputs of the data process*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"outputs\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}outputs:optional array[com.linkedin.common.DatasetUrn]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Inputs = SCHEMA.getField("inputs");
    private final static RecordDataSchema.Field FIELD_Outputs = SCHEMA.getField("outputs");

    public DataProcessInfo() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public DataProcessInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataProcessInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    public boolean hasInputs() {
        return contains(FIELD_Inputs);
    }

    /**
     * Remover for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    public void removeInputs() {
        remove(FIELD_Inputs);
    }

    /**
     * Getter for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    public DatasetUrnArray getInputs(GetMode mode) {
        return obtainWrapped(FIELD_Inputs, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for inputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInfo.Fields#inputs
     */
    @Nullable
    public DatasetUrnArray getInputs() {
        return obtainWrapped(FIELD_Inputs, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    public DataProcessInfo setInputs(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_Inputs, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for inputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInfo.Fields#inputs
     */
    public DataProcessInfo setInputs(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_Inputs, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    public boolean hasOutputs() {
        return contains(FIELD_Outputs);
    }

    /**
     * Remover for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    public void removeOutputs() {
        remove(FIELD_Outputs);
    }

    /**
     * Getter for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    public DatasetUrnArray getOutputs(GetMode mode) {
        return obtainWrapped(FIELD_Outputs, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for outputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInfo.Fields#outputs
     */
    @Nullable
    public DatasetUrnArray getOutputs() {
        return obtainWrapped(FIELD_Outputs, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    public DataProcessInfo setOutputs(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_Outputs, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for outputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInfo.Fields#outputs
     */
    public DataProcessInfo setOutputs(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_Outputs, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataProcessInfo clone()
        throws CloneNotSupportedException
    {
        return ((DataProcessInfo) super.clone());
    }

    @Override
    public DataProcessInfo copy()
        throws CloneNotSupportedException
    {
        return ((DataProcessInfo) super.copy());
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
         * the inputs of the data process
         * 
         */
        public PathSpec inputs() {
            return new PathSpec(getPathComponents(), "inputs");
        }

        /**
         * the inputs of the data process
         * 
         */
        public PathSpec inputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * the outputs of the data process
         * 
         */
        public PathSpec outputs() {
            return new PathSpec(getPathComponents(), "outputs");
        }

        /**
         * the outputs of the data process
         * 
         */
        public PathSpec outputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
