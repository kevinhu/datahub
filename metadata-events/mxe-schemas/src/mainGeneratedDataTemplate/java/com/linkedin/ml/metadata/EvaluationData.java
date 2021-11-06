
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
 * All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/EvaluationData.pdl.")
public class EvaluationData
    extends RecordTemplate
{

    private final static EvaluationData.Fields _fields = new EvaluationData.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_EvaluationData = SCHEMA.getField("evaluationData");

    public EvaluationData() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public EvaluationData(DataMap data) {
        super(data, SCHEMA);
    }

    public static EvaluationData.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    public boolean hasEvaluationData() {
        return contains(FIELD_EvaluationData);
    }

    /**
     * Remover for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    public void removeEvaluationData() {
        remove(FIELD_EvaluationData);
    }

    /**
     * Getter for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    public BaseDataArray getEvaluationData(GetMode mode) {
        return obtainWrapped(FIELD_EvaluationData, BaseDataArray.class, mode);
    }

    /**
     * Getter for evaluationData
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EvaluationData.Fields#evaluationData
     */
    @Nonnull
    public BaseDataArray getEvaluationData() {
        return obtainWrapped(FIELD_EvaluationData, BaseDataArray.class, GetMode.STRICT);
    }

    /**
     * Setter for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    public EvaluationData setEvaluationData(BaseDataArray value, SetMode mode) {
        putWrapped(FIELD_EvaluationData, BaseDataArray.class, value, mode);
        return this;
    }

    /**
     * Setter for evaluationData
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EvaluationData.Fields#evaluationData
     */
    public EvaluationData setEvaluationData(
        @Nonnull
        BaseDataArray value) {
        putWrapped(FIELD_EvaluationData, BaseDataArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EvaluationData clone()
        throws CloneNotSupportedException
    {
        return ((EvaluationData) super.clone());
    }

    @Override
    public EvaluationData copy()
        throws CloneNotSupportedException
    {
        return ((EvaluationData) super.copy());
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
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public com.linkedin.ml.metadata.BaseDataArray.Fields evaluationData() {
            return new com.linkedin.ml.metadata.BaseDataArray.Fields(getPathComponents(), "evaluationData");
        }

        /**
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public PathSpec evaluationData(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "evaluationData");
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
