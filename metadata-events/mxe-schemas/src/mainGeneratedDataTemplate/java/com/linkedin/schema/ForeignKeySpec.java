
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.UnionTemplate;


/**
 * Description of a foreign key in a schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/ForeignKeySpec.pdl.")
public class ForeignKeySpec
    extends RecordTemplate
{

    private final static ForeignKeySpec.Fields _fields = new ForeignKeySpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_ForeignKey = SCHEMA.getField("foreignKey");

    public ForeignKeySpec() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public ForeignKeySpec(DataMap data) {
        super(data, SCHEMA);
    }

    public static ForeignKeySpec.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public boolean hasForeignKey() {
        return contains(FIELD_ForeignKey);
    }

    /**
     * Remover for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public void removeForeignKey() {
        remove(FIELD_ForeignKey);
    }

    /**
     * Getter for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public ForeignKeySpec.ForeignKey getForeignKey(GetMode mode) {
        return obtainWrapped(FIELD_ForeignKey, ForeignKeySpec.ForeignKey.class, mode);
    }

    /**
     * Getter for foreignKey
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeySpec.Fields#foreignKey
     */
    @Nonnull
    public ForeignKeySpec.ForeignKey getForeignKey() {
        return obtainWrapped(FIELD_ForeignKey, ForeignKeySpec.ForeignKey.class, GetMode.STRICT);
    }

    /**
     * Setter for foreignKey
     * 
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public ForeignKeySpec setForeignKey(ForeignKeySpec.ForeignKey value, SetMode mode) {
        putWrapped(FIELD_ForeignKey, ForeignKeySpec.ForeignKey.class, value, mode);
        return this;
    }

    /**
     * Setter for foreignKey
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeySpec.Fields#foreignKey
     */
    public ForeignKeySpec setForeignKey(
        @Nonnull
        ForeignKeySpec.ForeignKey value) {
        putWrapped(FIELD_ForeignKey, ForeignKeySpec.ForeignKey.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ForeignKeySpec clone()
        throws CloneNotSupportedException
    {
        return ((ForeignKeySpec) super.clone());
    }

    @Override
    public ForeignKeySpec copy()
        throws CloneNotSupportedException
    {
        return ((ForeignKeySpec) super.copy());
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
         * Foreign key definition in metadata schema.
         * 
         */
        public com.linkedin.schema.ForeignKeySpec.ForeignKey.Fields foreignKey() {
            return new com.linkedin.schema.ForeignKeySpec.ForeignKey.Fields(getPathComponents(), "foreignKey");
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/ForeignKeySpec.pdl.")
    public final static class ForeignKey
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.schema/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}}{namespace com.linkedin.schema/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}}]", SchemaFormatType.PDL));
        private final static DataSchema MEMBER_DatasetFieldForeignKey = SCHEMA.getTypeByMemberKey("com.linkedin.schema.DatasetFieldForeignKey");
        private final static DataSchema MEMBER_UrnForeignKey = SCHEMA.getTypeByMemberKey("com.linkedin.schema.UrnForeignKey");

        public ForeignKey() {
            super(new DataMap(2, 0.75F), SCHEMA);
        }

        public ForeignKey(Object data) {
            super(data, SCHEMA);
        }

        public static ForeignKeySpec.ForeignKey create(com.linkedin.schema.DatasetFieldForeignKey value) {
            ForeignKeySpec.ForeignKey newUnion = new ForeignKeySpec.ForeignKey();
            newUnion.setDatasetFieldForeignKey(value);
            return newUnion;
        }

        public boolean isDatasetFieldForeignKey() {
            return memberIs("com.linkedin.schema.DatasetFieldForeignKey");
        }

        public com.linkedin.schema.DatasetFieldForeignKey getDatasetFieldForeignKey() {
            return obtainWrapped(MEMBER_DatasetFieldForeignKey, com.linkedin.schema.DatasetFieldForeignKey.class, "com.linkedin.schema.DatasetFieldForeignKey");
        }

        public void setDatasetFieldForeignKey(com.linkedin.schema.DatasetFieldForeignKey value) {
            selectWrapped(MEMBER_DatasetFieldForeignKey, com.linkedin.schema.DatasetFieldForeignKey.class, "com.linkedin.schema.DatasetFieldForeignKey", value);
        }

        public static ForeignKeySpec.ForeignKey create(com.linkedin.schema.UrnForeignKey value) {
            ForeignKeySpec.ForeignKey newUnion = new ForeignKeySpec.ForeignKey();
            newUnion.setUrnForeignKey(value);
            return newUnion;
        }

        public boolean isUrnForeignKey() {
            return memberIs("com.linkedin.schema.UrnForeignKey");
        }

        public com.linkedin.schema.UrnForeignKey getUrnForeignKey() {
            return obtainWrapped(MEMBER_UrnForeignKey, com.linkedin.schema.UrnForeignKey.class, "com.linkedin.schema.UrnForeignKey");
        }

        public void setUrnForeignKey(com.linkedin.schema.UrnForeignKey value) {
            selectWrapped(MEMBER_UrnForeignKey, com.linkedin.schema.UrnForeignKey.class, "com.linkedin.schema.UrnForeignKey", value);
        }

        @Override
        public ForeignKeySpec.ForeignKey clone()
            throws CloneNotSupportedException
        {
            return ((ForeignKeySpec.ForeignKey) super.clone());
        }

        @Override
        public ForeignKeySpec.ForeignKey copy()
            throws CloneNotSupportedException
        {
            return ((ForeignKeySpec.ForeignKey) super.copy());
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

            public com.linkedin.schema.DatasetFieldForeignKey.Fields DatasetFieldForeignKey() {
                return new com.linkedin.schema.DatasetFieldForeignKey.Fields(getPathComponents(), "com.linkedin.schema.DatasetFieldForeignKey");
            }

            public com.linkedin.schema.UrnForeignKey.Fields UrnForeignKey() {
                return new com.linkedin.schema.UrnForeignKey.Fields(getPathComponents(), "com.linkedin.schema.UrnForeignKey");
            }

        }

    }

}
