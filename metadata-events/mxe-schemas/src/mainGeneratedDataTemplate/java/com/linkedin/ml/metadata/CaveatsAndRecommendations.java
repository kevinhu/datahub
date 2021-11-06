
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/CaveatsAndRecommendations.pdl.")
public class CaveatsAndRecommendations
    extends RecordTemplate
{

    private final static CaveatsAndRecommendations.Fields _fields = new CaveatsAndRecommendations.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Caveats = SCHEMA.getField("caveats");
    private final static RecordDataSchema.Field FIELD_Recommendations = SCHEMA.getField("recommendations");
    private final static RecordDataSchema.Field FIELD_IdealDatasetCharacteristics = SCHEMA.getField("idealDatasetCharacteristics");

    public CaveatsAndRecommendations() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
    }

    public CaveatsAndRecommendations(DataMap data) {
        super(data, SCHEMA);
    }

    public static CaveatsAndRecommendations.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public boolean hasCaveats() {
        return contains(FIELD_Caveats);
    }

    /**
     * Remover for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public void removeCaveats() {
        remove(FIELD_Caveats);
    }

    /**
     * Getter for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public CaveatDetails getCaveats(GetMode mode) {
        return obtainWrapped(FIELD_Caveats, CaveatDetails.class, mode);
    }

    /**
     * Getter for caveats
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    @Nullable
    public CaveatDetails getCaveats() {
        return obtainWrapped(FIELD_Caveats, CaveatDetails.class, GetMode.STRICT);
    }

    /**
     * Setter for caveats
     * 
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public CaveatsAndRecommendations setCaveats(CaveatDetails value, SetMode mode) {
        putWrapped(FIELD_Caveats, CaveatDetails.class, value, mode);
        return this;
    }

    /**
     * Setter for caveats
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatsAndRecommendations.Fields#caveats
     */
    public CaveatsAndRecommendations setCaveats(
        @Nonnull
        CaveatDetails value) {
        putWrapped(FIELD_Caveats, CaveatDetails.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public boolean hasRecommendations() {
        return contains(FIELD_Recommendations);
    }

    /**
     * Remover for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public void removeRecommendations() {
        remove(FIELD_Recommendations);
    }

    /**
     * Getter for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public String getRecommendations(GetMode mode) {
        return obtainDirect(FIELD_Recommendations, String.class, mode);
    }

    /**
     * Getter for recommendations
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    @Nullable
    public String getRecommendations() {
        return obtainDirect(FIELD_Recommendations, String.class, GetMode.STRICT);
    }

    /**
     * Setter for recommendations
     * 
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public CaveatsAndRecommendations setRecommendations(String value, SetMode mode) {
        putDirect(FIELD_Recommendations, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for recommendations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatsAndRecommendations.Fields#recommendations
     */
    public CaveatsAndRecommendations setRecommendations(
        @Nonnull
        String value) {
        putDirect(FIELD_Recommendations, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public boolean hasIdealDatasetCharacteristics() {
        return contains(FIELD_IdealDatasetCharacteristics);
    }

    /**
     * Remover for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public void removeIdealDatasetCharacteristics() {
        remove(FIELD_IdealDatasetCharacteristics);
    }

    /**
     * Getter for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public StringArray getIdealDatasetCharacteristics(GetMode mode) {
        return obtainWrapped(FIELD_IdealDatasetCharacteristics, StringArray.class, mode);
    }

    /**
     * Getter for idealDatasetCharacteristics
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    @Nullable
    public StringArray getIdealDatasetCharacteristics() {
        return obtainWrapped(FIELD_IdealDatasetCharacteristics, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for idealDatasetCharacteristics
     * 
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public CaveatsAndRecommendations setIdealDatasetCharacteristics(StringArray value, SetMode mode) {
        putWrapped(FIELD_IdealDatasetCharacteristics, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for idealDatasetCharacteristics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatsAndRecommendations.Fields#idealDatasetCharacteristics
     */
    public CaveatsAndRecommendations setIdealDatasetCharacteristics(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_IdealDatasetCharacteristics, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CaveatsAndRecommendations clone()
        throws CloneNotSupportedException
    {
        return ((CaveatsAndRecommendations) super.clone());
    }

    @Override
    public CaveatsAndRecommendations copy()
        throws CloneNotSupportedException
    {
        return ((CaveatsAndRecommendations) super.copy());
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
         * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public com.linkedin.ml.metadata.CaveatDetails.Fields caveats() {
            return new com.linkedin.ml.metadata.CaveatDetails.Fields(getPathComponents(), "caveats");
        }

        /**
         * Recommendations on where this MLModel should be used.
         * 
         */
        public PathSpec recommendations() {
            return new PathSpec(getPathComponents(), "recommendations");
        }

        /**
         * Ideal characteristics of an evaluation dataset for this MLModel
         * 
         */
        public PathSpec idealDatasetCharacteristics() {
            return new PathSpec(getPathComponents(), "idealDatasetCharacteristics");
        }

        /**
         * Ideal characteristics of an evaluation dataset for this MLModel
         * 
         */
        public PathSpec idealDatasetCharacteristics(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "idealDatasetCharacteristics");
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
