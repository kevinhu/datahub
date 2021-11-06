
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a MLFeatureTable
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLFeatureTableProperties.pdl.")
public class MLFeatureTableProperties
    extends RecordTemplate
{

    private final static MLFeatureTableProperties.Fields _fields = new MLFeatureTableProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a MLFeatureTable*/@Aspect.name=\"mlFeatureTableProperties\"record MLFeatureTableProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{/**Documentation of the MLFeatureTable*/description:optional string/**List of features contained in the feature table*/@Relationship.`/*`={\"name\":\"Contains\",\"entityTypes\":[\"mlFeature\"]}mlFeatures:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**List of primary keys in the feature table (if multiple, assumed to act as a composite key)*/@Relationship.`/*`={\"name\":\"KeyedBy\",\"entityTypes\":[\"mlPrimaryKey\"]}mlPrimaryKeys:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_MlFeatures = SCHEMA.getField("mlFeatures");
    private final static RecordDataSchema.Field FIELD_MlPrimaryKeys = SCHEMA.getField("mlPrimaryKeys");

    public MLFeatureTableProperties() {
        super(new DataMap(6, 0.75F), SCHEMA, 4);
    }

    public MLFeatureTableProperties(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLFeatureTableProperties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public MLFeatureTableProperties setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public MLFeatureTableProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLFeatureTableProperties.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see MLFeatureTableProperties.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see MLFeatureTableProperties.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureTableProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see MLFeatureTableProperties.Fields#description
     */
    public MLFeatureTableProperties setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableProperties.Fields#description
     */
    public MLFeatureTableProperties setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public boolean hasMlFeatures() {
        return contains(FIELD_MlFeatures);
    }

    /**
     * Remover for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public void removeMlFeatures() {
        remove(FIELD_MlFeatures);
    }

    /**
     * Getter for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public UrnArray getMlFeatures(GetMode mode) {
        return obtainWrapped(FIELD_MlFeatures, UrnArray.class, mode);
    }

    /**
     * Getter for mlFeatures
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    @Nullable
    public UrnArray getMlFeatures() {
        return obtainWrapped(FIELD_MlFeatures, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public MLFeatureTableProperties setMlFeatures(UrnArray value, SetMode mode) {
        putWrapped(FIELD_MlFeatures, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for mlFeatures
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public MLFeatureTableProperties setMlFeatures(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_MlFeatures, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public boolean hasMlPrimaryKeys() {
        return contains(FIELD_MlPrimaryKeys);
    }

    /**
     * Remover for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public void removeMlPrimaryKeys() {
        remove(FIELD_MlPrimaryKeys);
    }

    /**
     * Getter for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public UrnArray getMlPrimaryKeys(GetMode mode) {
        return obtainWrapped(FIELD_MlPrimaryKeys, UrnArray.class, mode);
    }

    /**
     * Getter for mlPrimaryKeys
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    @Nullable
    public UrnArray getMlPrimaryKeys() {
        return obtainWrapped(FIELD_MlPrimaryKeys, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public MLFeatureTableProperties setMlPrimaryKeys(UrnArray value, SetMode mode) {
        putWrapped(FIELD_MlPrimaryKeys, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for mlPrimaryKeys
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public MLFeatureTableProperties setMlPrimaryKeys(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_MlPrimaryKeys, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLFeatureTableProperties clone()
        throws CloneNotSupportedException
    {
        return ((MLFeatureTableProperties) super.clone());
    }

    @Override
    public MLFeatureTableProperties copy()
        throws CloneNotSupportedException
    {
        return ((MLFeatureTableProperties) super.copy());
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * Documentation of the MLFeatureTable
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * List of features contained in the feature table
         * 
         */
        public PathSpec mlFeatures() {
            return new PathSpec(getPathComponents(), "mlFeatures");
        }

        /**
         * List of features contained in the feature table
         * 
         */
        public PathSpec mlFeatures(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mlFeatures");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of primary keys in the feature table (if multiple, assumed to act as a composite key)
         * 
         */
        public PathSpec mlPrimaryKeys() {
            return new PathSpec(getPathComponents(), "mlPrimaryKeys");
        }

        /**
         * List of primary keys in the feature table (if multiple, assumed to act as a composite key)
         * 
         */
        public PathSpec mlPrimaryKeys(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mlPrimaryKeys");
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
