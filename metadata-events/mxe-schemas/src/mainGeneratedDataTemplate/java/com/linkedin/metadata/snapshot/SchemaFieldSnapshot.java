
package com.linkedin.metadata.snapshot;

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
import com.linkedin.metadata.aspect.SchemaFieldAspectArray;


/**
 * A metadata snapshot for a specific schema field entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/SchemaFieldSnapshot.pdl.")
public class SchemaFieldSnapshot
    extends RecordTemplate
{

    private final static SchemaFieldSnapshot.Fields _fields = new SchemaFieldSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific schema field entity.*/@Entity={\"keyAspect\":\"schemaFieldKey\",\"name\":\"schemaField\"}record SchemaFieldSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The list of metadata aspects associated with the dataset. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a SchemaField*/typeref SchemaFieldAspect=union[{namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:com.linkedin.common.Urn/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}}]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SchemaFieldSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public SchemaFieldSnapshot(DataMap data) {
        super(data, SCHEMA);
    }

    public static SchemaFieldSnapshot.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see SchemaFieldSnapshot.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see SchemaFieldSnapshot.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see SchemaFieldSnapshot.Fields#urn
     */
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see SchemaFieldSnapshot.Fields#urn
     */
    public SchemaFieldSnapshot setUrn(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldSnapshot.Fields#urn
     */
    public SchemaFieldSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see SchemaFieldSnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        return contains(FIELD_Aspects);
    }

    /**
     * Remover for aspects
     * 
     * @see SchemaFieldSnapshot.Fields#aspects
     */
    public void removeAspects() {
        remove(FIELD_Aspects);
    }

    /**
     * Getter for aspects
     * 
     * @see SchemaFieldSnapshot.Fields#aspects
     */
    public SchemaFieldAspectArray getAspects(GetMode mode) {
        return obtainWrapped(FIELD_Aspects, SchemaFieldAspectArray.class, mode);
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldSnapshot.Fields#aspects
     */
    @Nonnull
    public SchemaFieldAspectArray getAspects() {
        return obtainWrapped(FIELD_Aspects, SchemaFieldAspectArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspects
     * 
     * @see SchemaFieldSnapshot.Fields#aspects
     */
    public SchemaFieldSnapshot setAspects(SchemaFieldAspectArray value, SetMode mode) {
        putWrapped(FIELD_Aspects, SchemaFieldAspectArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldSnapshot.Fields#aspects
     */
    public SchemaFieldSnapshot setAspects(
        @Nonnull
        SchemaFieldAspectArray value) {
        putWrapped(FIELD_Aspects, SchemaFieldAspectArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SchemaFieldSnapshot clone()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldSnapshot) super.clone());
    }

    @Override
    public SchemaFieldSnapshot copy()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldSnapshot) super.copy());
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
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The list of metadata aspects associated with the dataset. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.SchemaFieldAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.SchemaFieldAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the dataset. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public PathSpec aspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspects");
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
