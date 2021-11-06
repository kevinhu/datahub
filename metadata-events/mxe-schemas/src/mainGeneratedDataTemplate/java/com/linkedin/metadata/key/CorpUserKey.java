
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
 * Key for a CorpUser
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/CorpUserKey.pdl.")
public class CorpUserKey
    extends RecordTemplate
{

    private final static CorpUserKey.Fields _fields = new CorpUserKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"boostScore\":2.0,\"fieldType\":\"TEXT_PARTIAL\"}username:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Username = SCHEMA.getField("username");

    public CorpUserKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public CorpUserKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpUserKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for username
     * 
     * @see CorpUserKey.Fields#username
     */
    public boolean hasUsername() {
        return contains(FIELD_Username);
    }

    /**
     * Remover for username
     * 
     * @see CorpUserKey.Fields#username
     */
    public void removeUsername() {
        remove(FIELD_Username);
    }

    /**
     * Getter for username
     * 
     * @see CorpUserKey.Fields#username
     */
    public String getUsername(GetMode mode) {
        return obtainDirect(FIELD_Username, String.class, mode);
    }

    /**
     * Getter for username
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserKey.Fields#username
     */
    @Nonnull
    public String getUsername() {
        return obtainDirect(FIELD_Username, String.class, GetMode.STRICT);
    }

    /**
     * Setter for username
     * 
     * @see CorpUserKey.Fields#username
     */
    public CorpUserKey setUsername(String value, SetMode mode) {
        putDirect(FIELD_Username, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for username
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserKey.Fields#username
     */
    public CorpUserKey setUsername(
        @Nonnull
        String value) {
        putDirect(FIELD_Username, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpUserKey clone()
        throws CloneNotSupportedException
    {
        return ((CorpUserKey) super.clone());
    }

    @Override
    public CorpUserKey copy()
        throws CloneNotSupportedException
    {
        return ((CorpUserKey) super.copy());
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
         * The name of the AD/LDAP user.
         * 
         */
        public PathSpec username() {
            return new PathSpec(getPathComponents(), "username");
        }

    }

}
