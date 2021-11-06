
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * For non-urn based foregin keys.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/DatasetFieldForeignKey.pdl.")
public class DatasetFieldForeignKey
    extends RecordTemplate
{

    private final static DatasetFieldForeignKey.Fields _fields = new DatasetFieldForeignKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_ParentDataset = SCHEMA.getField("parentDataset");
    private final static RecordDataSchema.Field FIELD_CurrentFieldPaths = SCHEMA.getField("currentFieldPaths");
    private final static RecordDataSchema.Field FIELD_ParentField = SCHEMA.getField("parentField");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public DatasetFieldForeignKey() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public DatasetFieldForeignKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetFieldForeignKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public boolean hasParentDataset() {
        return contains(FIELD_ParentDataset);
    }

    /**
     * Remover for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public void removeParentDataset() {
        remove(FIELD_ParentDataset);
    }

    /**
     * Getter for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public com.linkedin.common.urn.DatasetUrn getParentDataset(GetMode mode) {
        return obtainCustomType(FIELD_ParentDataset, com.linkedin.common.urn.DatasetUrn.class, mode);
    }

    /**
     * Getter for parentDataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getParentDataset() {
        return obtainCustomType(FIELD_ParentDataset, com.linkedin.common.urn.DatasetUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for parentDataset
     * 
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public DatasetFieldForeignKey setParentDataset(com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        putCustomType(FIELD_ParentDataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for parentDataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldForeignKey.Fields#parentDataset
     */
    public DatasetFieldForeignKey setParentDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        putCustomType(FIELD_ParentDataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public boolean hasCurrentFieldPaths() {
        return contains(FIELD_CurrentFieldPaths);
    }

    /**
     * Remover for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public void removeCurrentFieldPaths() {
        remove(FIELD_CurrentFieldPaths);
    }

    /**
     * Getter for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public StringArray getCurrentFieldPaths(GetMode mode) {
        return obtainWrapped(FIELD_CurrentFieldPaths, StringArray.class, mode);
    }

    /**
     * Getter for currentFieldPaths
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    @Nonnull
    public StringArray getCurrentFieldPaths() {
        return obtainWrapped(FIELD_CurrentFieldPaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for currentFieldPaths
     * 
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public DatasetFieldForeignKey setCurrentFieldPaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_CurrentFieldPaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for currentFieldPaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldForeignKey.Fields#currentFieldPaths
     */
    public DatasetFieldForeignKey setCurrentFieldPaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_CurrentFieldPaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public boolean hasParentField() {
        return contains(FIELD_ParentField);
    }

    /**
     * Remover for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public void removeParentField() {
        remove(FIELD_ParentField);
    }

    /**
     * Getter for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public String getParentField(GetMode mode) {
        return obtainDirect(FIELD_ParentField, String.class, mode);
    }

    /**
     * Getter for parentField
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    @Nonnull
    public String getParentField() {
        return obtainDirect(FIELD_ParentField, String.class, GetMode.STRICT);
    }

    /**
     * Setter for parentField
     * 
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public DatasetFieldForeignKey setParentField(String value, SetMode mode) {
        putDirect(FIELD_ParentField, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for parentField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldForeignKey.Fields#parentField
     */
    public DatasetFieldForeignKey setParentField(
        @Nonnull
        String value) {
        putDirect(FIELD_ParentField, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetFieldForeignKey clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldForeignKey) super.clone());
    }

    @Override
    public DatasetFieldForeignKey copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldForeignKey) super.copy());
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
         * dataset that stores the resource.
         * 
         */
        public PathSpec parentDataset() {
            return new PathSpec(getPathComponents(), "parentDataset");
        }

        /**
         * List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.
         * 
         */
        public PathSpec currentFieldPaths() {
            return new PathSpec(getPathComponents(), "currentFieldPaths");
        }

        /**
         * List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.
         * 
         */
        public PathSpec currentFieldPaths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "currentFieldPaths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.
         * 
         */
        public PathSpec parentField() {
            return new PathSpec(getPathComponents(), "parentField");
        }

    }

}
