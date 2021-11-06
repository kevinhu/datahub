
package com.linkedin.ml.metadata;

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
 * Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/TrainingData.pdl.")
public class TrainingData
    extends RecordTemplate
{

    private final static TrainingData.Fields _fields = new TrainingData.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_TrainingData = SCHEMA.getField("trainingData");

    public TrainingData() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public TrainingData(DataMap data) {
        super(data, SCHEMA);
    }

    public static TrainingData.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    public boolean hasTrainingData() {
        return contains(FIELD_TrainingData);
    }

    /**
     * Remover for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    public void removeTrainingData() {
        remove(FIELD_TrainingData);
    }

    /**
     * Getter for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    public BaseDataArray getTrainingData(GetMode mode) {
        return obtainWrapped(FIELD_TrainingData, BaseDataArray.class, mode);
    }

    /**
     * Getter for trainingData
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TrainingData.Fields#trainingData
     */
    @Nonnull
    public BaseDataArray getTrainingData() {
        return obtainWrapped(FIELD_TrainingData, BaseDataArray.class, GetMode.STRICT);
    }

    /**
     * Setter for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    public TrainingData setTrainingData(BaseDataArray value, SetMode mode) {
        putWrapped(FIELD_TrainingData, BaseDataArray.class, value, mode);
        return this;
    }

    /**
     * Setter for trainingData
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TrainingData.Fields#trainingData
     */
    public TrainingData setTrainingData(
        @Nonnull
        BaseDataArray value) {
        putWrapped(FIELD_TrainingData, BaseDataArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public TrainingData clone()
        throws CloneNotSupportedException
    {
        return ((TrainingData) super.clone());
    }

    @Override
    public TrainingData copy()
        throws CloneNotSupportedException
    {
        return ((TrainingData) super.copy());
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
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public com.linkedin.ml.metadata.BaseDataArray.Fields trainingData() {
            return new com.linkedin.ml.metadata.BaseDataArray.Fields(getPathComponents(), "trainingData");
        }

        /**
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public PathSpec trainingData(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingData");
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
