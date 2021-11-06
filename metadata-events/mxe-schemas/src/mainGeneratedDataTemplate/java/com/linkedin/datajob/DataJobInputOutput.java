
package com.linkedin.datajob;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.DataJobUrnArray;
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
 * Information about the inputs and outputs of a Data processing job
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/DataJobInputOutput.pdl.")
public class DataJobInputOutput
    extends RecordTemplate
{

    private final static DataJobInputOutput.Fields _fields = new DataJobInputOutput.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"inputs\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}inputDatasets:array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]/**Output datasets produced by the data job during processing*/@Relationship.`/*`={\"name\":\"Produces\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"outputs\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}outputDatasets:array[com.linkedin.common.DatasetUrn]/**Input datajobs that this data job depends on*/@Relationship.`/*`={\"name\":\"DownstreamOf\",\"entityTypes\":[\"dataJob\"]}inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_InputDatasets = SCHEMA.getField("inputDatasets");
    private final static RecordDataSchema.Field FIELD_OutputDatasets = SCHEMA.getField("outputDatasets");
    private final static RecordDataSchema.Field FIELD_InputDatajobs = SCHEMA.getField("inputDatajobs");

    public DataJobInputOutput() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
    }

    public DataJobInputOutput(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataJobInputOutput.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    public boolean hasInputDatasets() {
        return contains(FIELD_InputDatasets);
    }

    /**
     * Remover for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    public void removeInputDatasets() {
        remove(FIELD_InputDatasets);
    }

    /**
     * Getter for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    public DatasetUrnArray getInputDatasets(GetMode mode) {
        return obtainWrapped(FIELD_InputDatasets, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for inputDatasets
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    @Nonnull
    public DatasetUrnArray getInputDatasets() {
        return obtainWrapped(FIELD_InputDatasets, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    public DataJobInputOutput setInputDatasets(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_InputDatasets, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for inputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    public DataJobInputOutput setInputDatasets(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_InputDatasets, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    public boolean hasOutputDatasets() {
        return contains(FIELD_OutputDatasets);
    }

    /**
     * Remover for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    public void removeOutputDatasets() {
        remove(FIELD_OutputDatasets);
    }

    /**
     * Getter for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    public DatasetUrnArray getOutputDatasets(GetMode mode) {
        return obtainWrapped(FIELD_OutputDatasets, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for outputDatasets
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    @Nonnull
    public DatasetUrnArray getOutputDatasets() {
        return obtainWrapped(FIELD_OutputDatasets, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    public DataJobInputOutput setOutputDatasets(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_OutputDatasets, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for outputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    public DataJobInputOutput setOutputDatasets(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_OutputDatasets, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    public boolean hasInputDatajobs() {
        return contains(FIELD_InputDatajobs);
    }

    /**
     * Remover for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    public void removeInputDatajobs() {
        remove(FIELD_InputDatajobs);
    }

    /**
     * Getter for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    public DataJobUrnArray getInputDatajobs(GetMode mode) {
        return obtainWrapped(FIELD_InputDatajobs, DataJobUrnArray.class, mode);
    }

    /**
     * Getter for inputDatajobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    @Nullable
    public DataJobUrnArray getInputDatajobs() {
        return obtainWrapped(FIELD_InputDatajobs, DataJobUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    public DataJobInputOutput setInputDatajobs(DataJobUrnArray value, SetMode mode) {
        putWrapped(FIELD_InputDatajobs, DataJobUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for inputDatajobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    public DataJobInputOutput setInputDatajobs(
        @Nonnull
        DataJobUrnArray value) {
        putWrapped(FIELD_InputDatajobs, DataJobUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataJobInputOutput clone()
        throws CloneNotSupportedException
    {
        return ((DataJobInputOutput) super.clone());
    }

    @Override
    public DataJobInputOutput copy()
        throws CloneNotSupportedException
    {
        return ((DataJobInputOutput) super.copy());
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
         * Input datasets consumed by the data job during processing
         * 
         */
        public PathSpec inputDatasets() {
            return new PathSpec(getPathComponents(), "inputDatasets");
        }

        /**
         * Input datasets consumed by the data job during processing
         * 
         */
        public PathSpec inputDatasets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputDatasets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public PathSpec outputDatasets() {
            return new PathSpec(getPathComponents(), "outputDatasets");
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public PathSpec outputDatasets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputDatasets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public PathSpec inputDatajobs() {
            return new PathSpec(getPathComponents(), "inputDatajobs");
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public PathSpec inputDatajobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputDatajobs");
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
