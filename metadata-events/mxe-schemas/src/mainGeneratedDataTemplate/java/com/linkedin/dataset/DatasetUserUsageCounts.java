
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Records a single user's usage counts for a given resource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetUserUsageCounts.pdl.")
public class DatasetUserUsageCounts
    extends RecordTemplate
{

    private final static DatasetUserUsageCounts.Fields _fields = new DatasetUserUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Records a single user's usage counts for a given resource*/record DatasetUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of times the dataset has been used by the user.*/@TimeseriesField={}count:int/**If user_email is set, we attempt to resolve the user's urn upon ingest*/@TimeseriesField={}userEmail:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_User = SCHEMA.getField("user");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_UserEmail = SCHEMA.getField("userEmail");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DatasetUserUsageCounts() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public DatasetUserUsageCounts(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetUserUsageCounts.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for user
     * 
     * @see DatasetUserUsageCounts.Fields#user
     */
    public boolean hasUser() {
        return contains(FIELD_User);
    }

    /**
     * Remover for user
     * 
     * @see DatasetUserUsageCounts.Fields#user
     */
    public void removeUser() {
        remove(FIELD_User);
    }

    /**
     * Getter for user
     * 
     * @see DatasetUserUsageCounts.Fields#user
     */
    public com.linkedin.common.urn.Urn getUser(GetMode mode) {
        return obtainCustomType(FIELD_User, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for user
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetUserUsageCounts.Fields#user
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUser() {
        return obtainCustomType(FIELD_User, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for user
     * 
     * @see DatasetUserUsageCounts.Fields#user
     */
    public DatasetUserUsageCounts setUser(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_User, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for user
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUserUsageCounts.Fields#user
     */
    public DatasetUserUsageCounts setUser(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_User, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
     */
    public boolean hasCount() {
        return contains(FIELD_Count);
    }

    /**
     * Remover for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
     */
    public void removeCount() {
        remove(FIELD_Count);
    }

    /**
     * Getter for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
     */
    public Integer getCount(GetMode mode) {
        return obtainDirect(FIELD_Count, Integer.class, mode);
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetUserUsageCounts.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        return obtainDirect(FIELD_Count, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
     */
    public DatasetUserUsageCounts setCount(Integer value, SetMode mode) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUserUsageCounts.Fields#count
     */
    public DatasetUserUsageCounts setCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
     */
    public DatasetUserUsageCounts setCount(int value) {
        putDirect(FIELD_Count, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for userEmail
     * 
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public boolean hasUserEmail() {
        return contains(FIELD_UserEmail);
    }

    /**
     * Remover for userEmail
     * 
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public void removeUserEmail() {
        remove(FIELD_UserEmail);
    }

    /**
     * Getter for userEmail
     * 
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public String getUserEmail(GetMode mode) {
        return obtainDirect(FIELD_UserEmail, String.class, mode);
    }

    /**
     * Getter for userEmail
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    @Nullable
    public String getUserEmail() {
        return obtainDirect(FIELD_UserEmail, String.class, GetMode.STRICT);
    }

    /**
     * Setter for userEmail
     * 
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public DatasetUserUsageCounts setUserEmail(String value, SetMode mode) {
        putDirect(FIELD_UserEmail, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for userEmail
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public DatasetUserUsageCounts setUserEmail(
        @Nonnull
        String value) {
        putDirect(FIELD_UserEmail, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetUserUsageCounts clone()
        throws CloneNotSupportedException
    {
        return ((DatasetUserUsageCounts) super.clone());
    }

    @Override
    public DatasetUserUsageCounts copy()
        throws CloneNotSupportedException
    {
        return ((DatasetUserUsageCounts) super.copy());
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
         * The unique id of the user.
         * 
         */
        public PathSpec user() {
            return new PathSpec(getPathComponents(), "user");
        }

        /**
         * Number of times the dataset has been used by the user.
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * If user_email is set, we attempt to resolve the user's urn upon ingest
         * 
         */
        public PathSpec userEmail() {
            return new PathSpec(getPathComponents(), "userEmail");
        }

    }

}
