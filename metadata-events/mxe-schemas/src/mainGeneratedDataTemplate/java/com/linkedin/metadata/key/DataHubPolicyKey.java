
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
 * Key for a DataHub Policy
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/DataHubPolicyKey.pdl.")
public class DataHubPolicyKey
    extends RecordTemplate
{

    private final static DataHubPolicyKey.Fields _fields = new DataHubPolicyKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a DataHub Policy*/@Aspect.name=\"dataHubPolicyKey\"record DataHubPolicyKey{/**A unique id for the DataHub access policy record. Generated on the server side at policy creation time.*/id:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");

    public DataHubPolicyKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public DataHubPolicyKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataHubPolicyKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for id
     * 
     * @see DataHubPolicyKey.Fields#id
     */
    public boolean hasId() {
        return contains(FIELD_Id);
    }

    /**
     * Remover for id
     * 
     * @see DataHubPolicyKey.Fields#id
     */
    public void removeId() {
        remove(FIELD_Id);
    }

    /**
     * Getter for id
     * 
     * @see DataHubPolicyKey.Fields#id
     */
    public String getId(GetMode mode) {
        return obtainDirect(FIELD_Id, String.class, mode);
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyKey.Fields#id
     */
    @Nonnull
    public String getId() {
        return obtainDirect(FIELD_Id, String.class, GetMode.STRICT);
    }

    /**
     * Setter for id
     * 
     * @see DataHubPolicyKey.Fields#id
     */
    public DataHubPolicyKey setId(String value, SetMode mode) {
        putDirect(FIELD_Id, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyKey.Fields#id
     */
    public DataHubPolicyKey setId(
        @Nonnull
        String value) {
        putDirect(FIELD_Id, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataHubPolicyKey clone()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyKey) super.clone());
    }

    @Override
    public DataHubPolicyKey copy()
        throws CloneNotSupportedException
    {
        return ((DataHubPolicyKey) super.copy());
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
         * A unique id for the DataHub access policy record. Generated on the server side at policy creation time.
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

    }

}
