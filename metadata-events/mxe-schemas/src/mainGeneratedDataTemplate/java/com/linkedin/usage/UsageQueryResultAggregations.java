
package com.linkedin.usage;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageQueryResult.pdl.")
public class UsageQueryResultAggregations
    extends RecordTemplate
{

    private final static UsageQueryResultAggregations.Fields _fields = new UsageQueryResultAggregations.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage,record UsageQueryResultAggregations{uniqueUserCount:optional int,totalSqlQueries:optional int,users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_UniqueUserCount = SCHEMA.getField("uniqueUserCount");
    private final static RecordDataSchema.Field FIELD_TotalSqlQueries = SCHEMA.getField("totalSqlQueries");
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");
    private final static RecordDataSchema.Field FIELD_Fields = SCHEMA.getField("fields");

    public UsageQueryResultAggregations() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
    }

    public UsageQueryResultAggregations(DataMap data) {
        super(data, SCHEMA);
    }

    public static UsageQueryResultAggregations.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public boolean hasUniqueUserCount() {
        return contains(FIELD_UniqueUserCount);
    }

    /**
     * Remover for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public void removeUniqueUserCount() {
        remove(FIELD_UniqueUserCount);
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public Integer getUniqueUserCount(GetMode mode) {
        return obtainDirect(FIELD_UniqueUserCount, Integer.class, mode);
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    @Nullable
    public Integer getUniqueUserCount() {
        return obtainDirect(FIELD_UniqueUserCount, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public UsageQueryResultAggregations setUniqueUserCount(Integer value, SetMode mode) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public UsageQueryResultAggregations setUniqueUserCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public UsageQueryResultAggregations setUniqueUserCount(int value) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public boolean hasTotalSqlQueries() {
        return contains(FIELD_TotalSqlQueries);
    }

    /**
     * Remover for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public void removeTotalSqlQueries() {
        remove(FIELD_TotalSqlQueries);
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public Integer getTotalSqlQueries(GetMode mode) {
        return obtainDirect(FIELD_TotalSqlQueries, Integer.class, mode);
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    @Nullable
    public Integer getTotalSqlQueries() {
        return obtainDirect(FIELD_TotalSqlQueries, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public UsageQueryResultAggregations setTotalSqlQueries(Integer value, SetMode mode) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public UsageQueryResultAggregations setTotalSqlQueries(
        @Nonnull
        Integer value) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public UsageQueryResultAggregations setTotalSqlQueries(int value) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for users
     * 
     * @see UsageQueryResultAggregations.Fields#users
     */
    public boolean hasUsers() {
        return contains(FIELD_Users);
    }

    /**
     * Remover for users
     * 
     * @see UsageQueryResultAggregations.Fields#users
     */
    public void removeUsers() {
        remove(FIELD_Users);
    }

    /**
     * Getter for users
     * 
     * @see UsageQueryResultAggregations.Fields#users
     */
    public UserUsageCountsArray getUsers(GetMode mode) {
        return obtainWrapped(FIELD_Users, UserUsageCountsArray.class, mode);
    }

    /**
     * Getter for users
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#users
     */
    @Nullable
    public UserUsageCountsArray getUsers() {
        return obtainWrapped(FIELD_Users, UserUsageCountsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for users
     * 
     * @see UsageQueryResultAggregations.Fields#users
     */
    public UsageQueryResultAggregations setUsers(UserUsageCountsArray value, SetMode mode) {
        putWrapped(FIELD_Users, UserUsageCountsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for users
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResultAggregations.Fields#users
     */
    public UsageQueryResultAggregations setUsers(
        @Nonnull
        UserUsageCountsArray value) {
        putWrapped(FIELD_Users, UserUsageCountsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public boolean hasFields() {
        return contains(FIELD_Fields);
    }

    /**
     * Remover for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public void removeFields() {
        remove(FIELD_Fields);
    }

    /**
     * Getter for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public FieldUsageCountsArray getFields(GetMode mode) {
        return obtainWrapped(FIELD_Fields, FieldUsageCountsArray.class, mode);
    }

    /**
     * Getter for fields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#fields
     */
    @Nullable
    public FieldUsageCountsArray getFields() {
        return obtainWrapped(FIELD_Fields, FieldUsageCountsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public UsageQueryResultAggregations setFields(FieldUsageCountsArray value, SetMode mode) {
        putWrapped(FIELD_Fields, FieldUsageCountsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public UsageQueryResultAggregations setFields(
        @Nonnull
        FieldUsageCountsArray value) {
        putWrapped(FIELD_Fields, FieldUsageCountsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UsageQueryResultAggregations clone()
        throws CloneNotSupportedException
    {
        return ((UsageQueryResultAggregations) super.clone());
    }

    @Override
    public UsageQueryResultAggregations copy()
        throws CloneNotSupportedException
    {
        return ((UsageQueryResultAggregations) super.copy());
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

        public PathSpec uniqueUserCount() {
            return new PathSpec(getPathComponents(), "uniqueUserCount");
        }

        public PathSpec totalSqlQueries() {
            return new PathSpec(getPathComponents(), "totalSqlQueries");
        }

        public com.linkedin.usage.UserUsageCountsArray.Fields users() {
            return new com.linkedin.usage.UserUsageCountsArray.Fields(getPathComponents(), "users");
        }

        public PathSpec users(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "users");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public com.linkedin.usage.FieldUsageCountsArray.Fields fields() {
            return new com.linkedin.usage.FieldUsageCountsArray.Fields(getPathComponents(), "fields");
        }

        public PathSpec fields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fields");
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
