
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.MLFeatureDataType;
import com.linkedin.common.UrnArray;
import com.linkedin.common.VersionTag;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Properties associated with a MLFeature
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLFeatureProperties.pdl.")
public class MLFeatureProperties
    extends RecordTemplate
{

    private final static MLFeatureProperties.Fields _fields = new MLFeatureProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a MLFeature*/@Aspect.name=\"mlFeatureProperties\"record MLFeatureProperties{/**Documentation of the MLFeature*/description:optional string/**Data Type of the MLFeature*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories \u2014 mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories \u2014 either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data \u2014 no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period\u2014 daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLFeature*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Source of the MLFeature*/@Relationship.`/*`={\"name\":\"DerivedFrom\",\"entityTypes\":[\"dataset\"]}sources:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_DataType = SCHEMA.getField("dataType");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Sources = SCHEMA.getField("sources");

    public MLFeatureProperties() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
    }

    public MLFeatureProperties(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLFeatureProperties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for description
     * 
     * @see MLFeatureProperties.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see MLFeatureProperties.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see MLFeatureProperties.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see MLFeatureProperties.Fields#description
     */
    public MLFeatureProperties setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureProperties.Fields#description
     */
    public MLFeatureProperties setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dataType
     * 
     * @see MLFeatureProperties.Fields#dataType
     */
    public boolean hasDataType() {
        return contains(FIELD_DataType);
    }

    /**
     * Remover for dataType
     * 
     * @see MLFeatureProperties.Fields#dataType
     */
    public void removeDataType() {
        remove(FIELD_DataType);
    }

    /**
     * Getter for dataType
     * 
     * @see MLFeatureProperties.Fields#dataType
     */
    public MLFeatureDataType getDataType(GetMode mode) {
        return obtainDirect(FIELD_DataType, MLFeatureDataType.class, mode);
    }

    /**
     * Getter for dataType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureProperties.Fields#dataType
     */
    @Nullable
    public MLFeatureDataType getDataType() {
        return obtainDirect(FIELD_DataType, MLFeatureDataType.class, GetMode.STRICT);
    }

    /**
     * Setter for dataType
     * 
     * @see MLFeatureProperties.Fields#dataType
     */
    public MLFeatureProperties setDataType(MLFeatureDataType value, SetMode mode) {
        putDirect(FIELD_DataType, MLFeatureDataType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dataType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureProperties.Fields#dataType
     */
    public MLFeatureProperties setDataType(
        @Nonnull
        MLFeatureDataType value) {
        putDirect(FIELD_DataType, MLFeatureDataType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see MLFeatureProperties.Fields#version
     */
    public boolean hasVersion() {
        return contains(FIELD_Version);
    }

    /**
     * Remover for version
     * 
     * @see MLFeatureProperties.Fields#version
     */
    public void removeVersion() {
        remove(FIELD_Version);
    }

    /**
     * Getter for version
     * 
     * @see MLFeatureProperties.Fields#version
     */
    public VersionTag getVersion(GetMode mode) {
        return obtainWrapped(FIELD_Version, VersionTag.class, mode);
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion() {
        return obtainWrapped(FIELD_Version, VersionTag.class, GetMode.STRICT);
    }

    /**
     * Setter for version
     * 
     * @see MLFeatureProperties.Fields#version
     */
    public MLFeatureProperties setVersion(VersionTag value, SetMode mode) {
        putWrapped(FIELD_Version, VersionTag.class, value, mode);
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureProperties.Fields#version
     */
    public MLFeatureProperties setVersion(
        @Nonnull
        VersionTag value) {
        putWrapped(FIELD_Version, VersionTag.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sources
     * 
     * @see MLFeatureProperties.Fields#sources
     */
    public boolean hasSources() {
        return contains(FIELD_Sources);
    }

    /**
     * Remover for sources
     * 
     * @see MLFeatureProperties.Fields#sources
     */
    public void removeSources() {
        remove(FIELD_Sources);
    }

    /**
     * Getter for sources
     * 
     * @see MLFeatureProperties.Fields#sources
     */
    public UrnArray getSources(GetMode mode) {
        return obtainWrapped(FIELD_Sources, UrnArray.class, mode);
    }

    /**
     * Getter for sources
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureProperties.Fields#sources
     */
    @Nullable
    public UrnArray getSources() {
        return obtainWrapped(FIELD_Sources, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for sources
     * 
     * @see MLFeatureProperties.Fields#sources
     */
    public MLFeatureProperties setSources(UrnArray value, SetMode mode) {
        putWrapped(FIELD_Sources, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for sources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureProperties.Fields#sources
     */
    public MLFeatureProperties setSources(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_Sources, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLFeatureProperties clone()
        throws CloneNotSupportedException
    {
        return ((MLFeatureProperties) super.clone());
    }

    @Override
    public MLFeatureProperties copy()
        throws CloneNotSupportedException
    {
        return ((MLFeatureProperties) super.copy());
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
         * Documentation of the MLFeature
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Data Type of the MLFeature
         * 
         */
        public PathSpec dataType() {
            return new PathSpec(getPathComponents(), "dataType");
        }

        /**
         * Version of the MLFeature
         * 
         */
        public com.linkedin.common.VersionTag.Fields version() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), "version");
        }

        /**
         * Source of the MLFeature
         * 
         */
        public PathSpec sources() {
            return new PathSpec(getPathComponents(), "sources");
        }

        /**
         * Source of the MLFeature
         * 
         */
        public PathSpec sources(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sources");
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
