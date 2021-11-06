
package com.linkedin.ml.metadata;

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
import com.linkedin.data.template.StringArray;


/**
 * BaseData record
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/BaseData.pdl.")
public class BaseData
    extends RecordTemplate
{

    private final static BaseData.Fields _fields = new BaseData.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Motivation = SCHEMA.getField("motivation");
    private final static RecordDataSchema.Field FIELD_PreProcessing = SCHEMA.getField("preProcessing");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public BaseData() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public BaseData(DataMap data) {
        super(data, SCHEMA);
    }

    public static BaseData.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    public boolean hasDataset() {
        return contains(FIELD_Dataset);
    }

    /**
     * Remover for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    public void removeDataset() {
        remove(FIELD_Dataset);
    }

    /**
     * Getter for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    public com.linkedin.common.urn.DatasetUrn getDataset(GetMode mode) {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, mode);
    }

    /**
     * Getter for dataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BaseData.Fields#dataset
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getDataset() {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    public BaseData setDataset(com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseData.Fields#dataset
     */
    public BaseData setDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    public boolean hasMotivation() {
        return contains(FIELD_Motivation);
    }

    /**
     * Remover for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    public void removeMotivation() {
        remove(FIELD_Motivation);
    }

    /**
     * Getter for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    public String getMotivation(GetMode mode) {
        return obtainDirect(FIELD_Motivation, String.class, mode);
    }

    /**
     * Getter for motivation
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BaseData.Fields#motivation
     */
    @Nullable
    public String getMotivation() {
        return obtainDirect(FIELD_Motivation, String.class, GetMode.STRICT);
    }

    /**
     * Setter for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    public BaseData setMotivation(String value, SetMode mode) {
        putDirect(FIELD_Motivation, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for motivation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseData.Fields#motivation
     */
    public BaseData setMotivation(
        @Nonnull
        String value) {
        putDirect(FIELD_Motivation, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    public boolean hasPreProcessing() {
        return contains(FIELD_PreProcessing);
    }

    /**
     * Remover for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    public void removePreProcessing() {
        remove(FIELD_PreProcessing);
    }

    /**
     * Getter for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    public StringArray getPreProcessing(GetMode mode) {
        return obtainWrapped(FIELD_PreProcessing, StringArray.class, mode);
    }

    /**
     * Getter for preProcessing
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BaseData.Fields#preProcessing
     */
    @Nullable
    public StringArray getPreProcessing() {
        return obtainWrapped(FIELD_PreProcessing, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    public BaseData setPreProcessing(StringArray value, SetMode mode) {
        putWrapped(FIELD_PreProcessing, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for preProcessing
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseData.Fields#preProcessing
     */
    public BaseData setPreProcessing(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_PreProcessing, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BaseData clone()
        throws CloneNotSupportedException
    {
        return ((BaseData) super.clone());
    }

    @Override
    public BaseData copy()
        throws CloneNotSupportedException
    {
        return ((BaseData) super.copy());
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
         * What dataset were used in the MLModel?
         * 
         */
        public PathSpec dataset() {
            return new PathSpec(getPathComponents(), "dataset");
        }

        /**
         * Why was this dataset chosen?
         * 
         */
        public PathSpec motivation() {
            return new PathSpec(getPathComponents(), "motivation");
        }

        /**
         * How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?
         * 
         */
        public PathSpec preProcessing() {
            return new PathSpec(getPathComponents(), "preProcessing");
        }

        /**
         * How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?
         * 
         */
        public PathSpec preProcessing(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "preProcessing");
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
