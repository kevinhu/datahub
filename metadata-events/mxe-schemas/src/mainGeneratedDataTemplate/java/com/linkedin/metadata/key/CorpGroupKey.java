
package com.linkedin.metadata.key;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Key for a CorpGroup
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/CorpGroupKey.pdl.")
public class CorpGroupKey
    extends RecordTemplate
{

    private final static CorpGroupKey.Fields _fields = new CorpGroupKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    public CorpGroupKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public CorpGroupKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpGroupKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see CorpGroupKey.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see CorpGroupKey.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see CorpGroupKey.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupKey.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see CorpGroupKey.Fields#name
     */
    public CorpGroupKey setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupKey.Fields#name
     */
    public CorpGroupKey setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpGroupKey clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupKey) super.clone());
    }

    @Override
    public CorpGroupKey copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupKey) super.copy());
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
         * The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

}
