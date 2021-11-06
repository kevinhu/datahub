
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Description of a foreign key constraint in a schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/ForeignKeyConstraint.pdl.")
public class ForeignKeyConstraint
    extends RecordTemplate
{

    private final static ForeignKeyConstraint.Fields _fields = new ForeignKeyConstraint.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"name\":\"ForeignKeyTo\",\"entityTypes\":[\"schemaField\"]}foreignFields:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"name\":\"ForeignKeyToDataset\",\"entityTypes\":[\"dataset\"]}foreignDataset:com.linkedin.common.Urn}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_ForeignFields = SCHEMA.getField("foreignFields");
    private final static RecordDataSchema.Field FIELD_SourceFields = SCHEMA.getField("sourceFields");
    private final static RecordDataSchema.Field FIELD_ForeignDataset = SCHEMA.getField("foreignDataset");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public ForeignKeyConstraint() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
    }

    public ForeignKeyConstraint(DataMap data) {
        super(data, SCHEMA);
    }

    public static ForeignKeyConstraint.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see ForeignKeyConstraint.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see ForeignKeyConstraint.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see ForeignKeyConstraint.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeyConstraint.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see ForeignKeyConstraint.Fields#name
     */
    public ForeignKeyConstraint setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeyConstraint.Fields#name
     */
    public ForeignKeyConstraint setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public boolean hasForeignFields() {
        return contains(FIELD_ForeignFields);
    }

    /**
     * Remover for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public void removeForeignFields() {
        remove(FIELD_ForeignFields);
    }

    /**
     * Getter for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public UrnArray getForeignFields(GetMode mode) {
        return obtainWrapped(FIELD_ForeignFields, UrnArray.class, mode);
    }

    /**
     * Getter for foreignFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    @Nonnull
    public UrnArray getForeignFields() {
        return obtainWrapped(FIELD_ForeignFields, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for foreignFields
     * 
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public ForeignKeyConstraint setForeignFields(UrnArray value, SetMode mode) {
        putWrapped(FIELD_ForeignFields, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for foreignFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeyConstraint.Fields#foreignFields
     */
    public ForeignKeyConstraint setForeignFields(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_ForeignFields, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public boolean hasSourceFields() {
        return contains(FIELD_SourceFields);
    }

    /**
     * Remover for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public void removeSourceFields() {
        remove(FIELD_SourceFields);
    }

    /**
     * Getter for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public UrnArray getSourceFields(GetMode mode) {
        return obtainWrapped(FIELD_SourceFields, UrnArray.class, mode);
    }

    /**
     * Getter for sourceFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    @Nonnull
    public UrnArray getSourceFields() {
        return obtainWrapped(FIELD_SourceFields, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for sourceFields
     * 
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public ForeignKeyConstraint setSourceFields(UrnArray value, SetMode mode) {
        putWrapped(FIELD_SourceFields, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for sourceFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeyConstraint.Fields#sourceFields
     */
    public ForeignKeyConstraint setSourceFields(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_SourceFields, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public boolean hasForeignDataset() {
        return contains(FIELD_ForeignDataset);
    }

    /**
     * Remover for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public void removeForeignDataset() {
        remove(FIELD_ForeignDataset);
    }

    /**
     * Getter for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public com.linkedin.common.urn.Urn getForeignDataset(GetMode mode) {
        return obtainCustomType(FIELD_ForeignDataset, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for foreignDataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getForeignDataset() {
        return obtainCustomType(FIELD_ForeignDataset, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for foreignDataset
     * 
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public ForeignKeyConstraint setForeignDataset(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_ForeignDataset, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for foreignDataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ForeignKeyConstraint.Fields#foreignDataset
     */
    public ForeignKeyConstraint setForeignDataset(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_ForeignDataset, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ForeignKeyConstraint clone()
        throws CloneNotSupportedException
    {
        return ((ForeignKeyConstraint) super.clone());
    }

    @Override
    public ForeignKeyConstraint copy()
        throws CloneNotSupportedException
    {
        return ((ForeignKeyConstraint) super.copy());
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
         * Name of the constraint, likely provided from the source
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Fields the constraint maps to on the foreign dataset
         * 
         */
        public PathSpec foreignFields() {
            return new PathSpec(getPathComponents(), "foreignFields");
        }

        /**
         * Fields the constraint maps to on the foreign dataset
         * 
         */
        public PathSpec foreignFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "foreignFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Fields the constraint maps to on the source dataset
         * 
         */
        public PathSpec sourceFields() {
            return new PathSpec(getPathComponents(), "sourceFields");
        }

        /**
         * Fields the constraint maps to on the source dataset
         * 
         */
        public PathSpec sourceFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sourceFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Reference to the foreign dataset for ease of lookup
         * 
         */
        public PathSpec foreignDataset() {
            return new PathSpec(getPathComponents(), "foreignDataset");
        }

    }

}
