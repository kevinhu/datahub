
package com.linkedin.common;

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
 * Base model representing field mappings
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/BaseFieldMapping.pdl.")
public class BaseFieldMapping
    extends RecordTemplate
{

    private final static BaseFieldMapping.Fields _fields = new BaseFieldMapping.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_Transformation = SCHEMA.getField("transformation");

    public BaseFieldMapping() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public BaseFieldMapping(DataMap data) {
        super(data, SCHEMA);
    }

    public static BaseFieldMapping.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for created
     * 
     * @see BaseFieldMapping.Fields#created
     */
    public boolean hasCreated() {
        return contains(FIELD_Created);
    }

    /**
     * Remover for created
     * 
     * @see BaseFieldMapping.Fields#created
     */
    public void removeCreated() {
        remove(FIELD_Created);
    }

    /**
     * Getter for created
     * 
     * @see BaseFieldMapping.Fields#created
     */
    public AuditStamp getCreated(GetMode mode) {
        return obtainWrapped(FIELD_Created, AuditStamp.class, mode);
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BaseFieldMapping.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        return obtainWrapped(FIELD_Created, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for created
     * 
     * @see BaseFieldMapping.Fields#created
     */
    public BaseFieldMapping setCreated(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Created, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseFieldMapping.Fields#created
     */
    public BaseFieldMapping setCreated(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Created, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for transformation
     * 
     * @see BaseFieldMapping.Fields#transformation
     */
    public boolean hasTransformation() {
        return contains(FIELD_Transformation);
    }

    /**
     * Remover for transformation
     * 
     * @see BaseFieldMapping.Fields#transformation
     */
    public void removeTransformation() {
        remove(FIELD_Transformation);
    }

    /**
     * Getter for transformation
     * 
     * @see BaseFieldMapping.Fields#transformation
     */
    public BaseFieldMapping.Transformation getTransformation(GetMode mode) {
        return obtainWrapped(FIELD_Transformation, BaseFieldMapping.Transformation.class, mode);
    }

    /**
     * Getter for transformation
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BaseFieldMapping.Fields#transformation
     */
    @Nonnull
    public BaseFieldMapping.Transformation getTransformation() {
        return obtainWrapped(FIELD_Transformation, BaseFieldMapping.Transformation.class, GetMode.STRICT);
    }

    /**
     * Setter for transformation
     * 
     * @see BaseFieldMapping.Fields#transformation
     */
    public BaseFieldMapping setTransformation(BaseFieldMapping.Transformation value, SetMode mode) {
        putWrapped(FIELD_Transformation, BaseFieldMapping.Transformation.class, value, mode);
        return this;
    }

    /**
     * Setter for transformation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseFieldMapping.Fields#transformation
     */
    public BaseFieldMapping setTransformation(
        @Nonnull
        BaseFieldMapping.Transformation value) {
        putWrapped(FIELD_Transformation, BaseFieldMapping.Transformation.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public BaseFieldMapping clone()
        throws CloneNotSupportedException
    {
        return ((BaseFieldMapping) super.clone());
    }

    @Override
    public BaseFieldMapping copy()
        throws CloneNotSupportedException
    {
        return ((BaseFieldMapping) super.copy());
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
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Transfomration function between the fields involved
         * 
         */
        public com.linkedin.common.BaseFieldMapping.Transformation.Fields transformation() {
            return new com.linkedin.common.BaseFieldMapping.Transformation.Fields(getPathComponents(), "transformation");
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/BaseFieldMapping.pdl.")
    public final static class Transformation
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]", SchemaFormatType.PDL));
        private final static DataSchema MEMBER_TransformationType = SCHEMA.getTypeByMemberKey("com.linkedin.common.fieldtransformer.TransformationType");
        private final static DataSchema MEMBER_UDFTransformer = SCHEMA.getTypeByMemberKey("com.linkedin.common.fieldtransformer.UDFTransformer");

        public Transformation() {
            super(new DataMap(2, 0.75F), SCHEMA);
        }

        public Transformation(Object data) {
            super(data, SCHEMA);
        }

        public static BaseFieldMapping.Transformation create(com.linkedin.common.fieldtransformer.TransformationType value) {
            BaseFieldMapping.Transformation newUnion = new BaseFieldMapping.Transformation();
            newUnion.setTransformationType(value);
            return newUnion;
        }

        public boolean isTransformationType() {
            return memberIs("com.linkedin.common.fieldtransformer.TransformationType");
        }

        public com.linkedin.common.fieldtransformer.TransformationType getTransformationType() {
            return obtainDirect(MEMBER_TransformationType, com.linkedin.common.fieldtransformer.TransformationType.class, "com.linkedin.common.fieldtransformer.TransformationType");
        }

        public void setTransformationType(com.linkedin.common.fieldtransformer.TransformationType value) {
            selectDirect(MEMBER_TransformationType, com.linkedin.common.fieldtransformer.TransformationType.class, String.class, "com.linkedin.common.fieldtransformer.TransformationType", value);
        }

        public static BaseFieldMapping.Transformation create(com.linkedin.common.fieldtransformer.UDFTransformer value) {
            BaseFieldMapping.Transformation newUnion = new BaseFieldMapping.Transformation();
            newUnion.setUDFTransformer(value);
            return newUnion;
        }

        public boolean isUDFTransformer() {
            return memberIs("com.linkedin.common.fieldtransformer.UDFTransformer");
        }

        public com.linkedin.common.fieldtransformer.UDFTransformer getUDFTransformer() {
            return obtainWrapped(MEMBER_UDFTransformer, com.linkedin.common.fieldtransformer.UDFTransformer.class, "com.linkedin.common.fieldtransformer.UDFTransformer");
        }

        public void setUDFTransformer(com.linkedin.common.fieldtransformer.UDFTransformer value) {
            selectWrapped(MEMBER_UDFTransformer, com.linkedin.common.fieldtransformer.UDFTransformer.class, "com.linkedin.common.fieldtransformer.UDFTransformer", value);
        }

        @Override
        public BaseFieldMapping.Transformation clone()
            throws CloneNotSupportedException
        {
            return ((BaseFieldMapping.Transformation) super.clone());
        }

        @Override
        public BaseFieldMapping.Transformation copy()
            throws CloneNotSupportedException
        {
            return ((BaseFieldMapping.Transformation) super.copy());
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

            public PathSpec TransformationType() {
                return new PathSpec(getPathComponents(), "com.linkedin.common.fieldtransformer.TransformationType");
            }

            public com.linkedin.common.fieldtransformer.UDFTransformer.Fields UDFTransformer() {
                return new com.linkedin.common.fieldtransformer.UDFTransformer.Fields(getPathComponents(), "com.linkedin.common.fieldtransformer.UDFTransformer");
            }

        }

    }

}
