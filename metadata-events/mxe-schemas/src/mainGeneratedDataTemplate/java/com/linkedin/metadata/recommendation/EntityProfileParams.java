
package com.linkedin.metadata.recommendation;

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


/**
 * Context to define the entity profile page
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/EntityProfileParams.pdl.")
public class EntityProfileParams
    extends RecordTemplate
{

    private final static EntityProfileParams.Fields _fields = new EntityProfileParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public EntityProfileParams() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public EntityProfileParams(DataMap data) {
        super(data, SCHEMA);
    }

    public static EntityProfileParams.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see EntityProfileParams.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see EntityProfileParams.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see EntityProfileParams.Fields#urn
     */
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityProfileParams.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see EntityProfileParams.Fields#urn
     */
    public EntityProfileParams setUrn(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityProfileParams.Fields#urn
     */
    public EntityProfileParams setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public EntityProfileParams clone()
        throws CloneNotSupportedException
    {
        return ((EntityProfileParams) super.clone());
    }

    @Override
    public EntityProfileParams copy()
        throws CloneNotSupportedException
    {
        return ((EntityProfileParams) super.copy());
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
         * Urn of the entity being shown
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

    }

}
