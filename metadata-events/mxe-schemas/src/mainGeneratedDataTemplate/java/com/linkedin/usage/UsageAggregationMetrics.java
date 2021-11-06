
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
import com.linkedin.data.template.StringArray;


/**
 * Metrics for usage data for a given resource and bucket. Not all fields
 * make sense for all buckets, so every field is optional.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageAggregationMetrics.pdl.")
public class UsageAggregationMetrics
    extends RecordTemplate
{

    private final static UsageAggregationMetrics.Fields _fields = new UsageAggregationMetrics.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/**Metrics for usage data for a given resource and bucket. Not all fields\nmake sense for all buckets, so every field is optional.*/record UsageAggregationMetrics{/** Unique user count */uniqueUserCount:optional int/** Users within this bucket, with frequency counts */users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]/** Total SQL query count */totalSqlQueries:optional int/** Frequent SQL queries; mostly makes sense for datasets in SQL databases */topSqlQueries:optional array[string]/** Field-level usage stats */fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_UniqueUserCount = SCHEMA.getField("uniqueUserCount");
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");
    private final static RecordDataSchema.Field FIELD_TotalSqlQueries = SCHEMA.getField("totalSqlQueries");
    private final static RecordDataSchema.Field FIELD_TopSqlQueries = SCHEMA.getField("topSqlQueries");
    private final static RecordDataSchema.Field FIELD_Fields = SCHEMA.getField("fields");

    public UsageAggregationMetrics() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
    }

    public UsageAggregationMetrics(DataMap data) {
        super(data, SCHEMA);
    }

    public static UsageAggregationMetrics.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public boolean hasUniqueUserCount() {
        return contains(FIELD_UniqueUserCount);
    }

    /**
     * Remover for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public void removeUniqueUserCount() {
        remove(FIELD_UniqueUserCount);
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public Integer getUniqueUserCount(GetMode mode) {
        return obtainDirect(FIELD_UniqueUserCount, Integer.class, mode);
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    @Nullable
    public Integer getUniqueUserCount() {
        return obtainDirect(FIELD_UniqueUserCount, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public UsageAggregationMetrics setUniqueUserCount(Integer value, SetMode mode) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public UsageAggregationMetrics setUniqueUserCount(
        @Nonnull
        Integer value) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public UsageAggregationMetrics setUniqueUserCount(int value) {
        putDirect(FIELD_UniqueUserCount, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for users
     * 
     * @see UsageAggregationMetrics.Fields#users
     */
    public boolean hasUsers() {
        return contains(FIELD_Users);
    }

    /**
     * Remover for users
     * 
     * @see UsageAggregationMetrics.Fields#users
     */
    public void removeUsers() {
        remove(FIELD_Users);
    }

    /**
     * Getter for users
     * 
     * @see UsageAggregationMetrics.Fields#users
     */
    public UserUsageCountsArray getUsers(GetMode mode) {
        return obtainWrapped(FIELD_Users, UserUsageCountsArray.class, mode);
    }

    /**
     * Getter for users
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageAggregationMetrics.Fields#users
     */
    @Nullable
    public UserUsageCountsArray getUsers() {
        return obtainWrapped(FIELD_Users, UserUsageCountsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for users
     * 
     * @see UsageAggregationMetrics.Fields#users
     */
    public UsageAggregationMetrics setUsers(UserUsageCountsArray value, SetMode mode) {
        putWrapped(FIELD_Users, UserUsageCountsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for users
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregationMetrics.Fields#users
     */
    public UsageAggregationMetrics setUsers(
        @Nonnull
        UserUsageCountsArray value) {
        putWrapped(FIELD_Users, UserUsageCountsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public boolean hasTotalSqlQueries() {
        return contains(FIELD_TotalSqlQueries);
    }

    /**
     * Remover for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public void removeTotalSqlQueries() {
        remove(FIELD_TotalSqlQueries);
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public Integer getTotalSqlQueries(GetMode mode) {
        return obtainDirect(FIELD_TotalSqlQueries, Integer.class, mode);
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    @Nullable
    public Integer getTotalSqlQueries() {
        return obtainDirect(FIELD_TotalSqlQueries, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public UsageAggregationMetrics setTotalSqlQueries(Integer value, SetMode mode) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public UsageAggregationMetrics setTotalSqlQueries(
        @Nonnull
        Integer value) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public UsageAggregationMetrics setTotalSqlQueries(int value) {
        putDirect(FIELD_TotalSqlQueries, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public boolean hasTopSqlQueries() {
        return contains(FIELD_TopSqlQueries);
    }

    /**
     * Remover for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public void removeTopSqlQueries() {
        remove(FIELD_TopSqlQueries);
    }

    /**
     * Getter for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public StringArray getTopSqlQueries(GetMode mode) {
        return obtainWrapped(FIELD_TopSqlQueries, StringArray.class, mode);
    }

    /**
     * Getter for topSqlQueries
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    @Nullable
    public StringArray getTopSqlQueries() {
        return obtainWrapped(FIELD_TopSqlQueries, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public UsageAggregationMetrics setTopSqlQueries(StringArray value, SetMode mode) {
        putWrapped(FIELD_TopSqlQueries, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for topSqlQueries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public UsageAggregationMetrics setTopSqlQueries(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_TopSqlQueries, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fields
     * 
     * @see UsageAggregationMetrics.Fields#fields
     */
    public boolean hasFields() {
        return contains(FIELD_Fields);
    }

    /**
     * Remover for fields
     * 
     * @see UsageAggregationMetrics.Fields#fields
     */
    public void removeFields() {
        remove(FIELD_Fields);
    }

    /**
     * Getter for fields
     * 
     * @see UsageAggregationMetrics.Fields#fields
     */
    public FieldUsageCountsArray getFields(GetMode mode) {
        return obtainWrapped(FIELD_Fields, FieldUsageCountsArray.class, mode);
    }

    /**
     * Getter for fields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageAggregationMetrics.Fields#fields
     */
    @Nullable
    public FieldUsageCountsArray getFields() {
        return obtainWrapped(FIELD_Fields, FieldUsageCountsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fields
     * 
     * @see UsageAggregationMetrics.Fields#fields
     */
    public UsageAggregationMetrics setFields(FieldUsageCountsArray value, SetMode mode) {
        putWrapped(FIELD_Fields, FieldUsageCountsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregationMetrics.Fields#fields
     */
    public UsageAggregationMetrics setFields(
        @Nonnull
        FieldUsageCountsArray value) {
        putWrapped(FIELD_Fields, FieldUsageCountsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UsageAggregationMetrics clone()
        throws CloneNotSupportedException
    {
        return ((UsageAggregationMetrics) super.clone());
    }

    @Override
    public UsageAggregationMetrics copy()
        throws CloneNotSupportedException
    {
        return ((UsageAggregationMetrics) super.copy());
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
         *  Unique user count 
         * 
         */
        public PathSpec uniqueUserCount() {
            return new PathSpec(getPathComponents(), "uniqueUserCount");
        }

        /**
         *  Users within this bucket, with frequency counts 
         * 
         */
        public com.linkedin.usage.UserUsageCountsArray.Fields users() {
            return new com.linkedin.usage.UserUsageCountsArray.Fields(getPathComponents(), "users");
        }

        /**
         *  Users within this bucket, with frequency counts 
         * 
         */
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

        /**
         *  Total SQL query count 
         * 
         */
        public PathSpec totalSqlQueries() {
            return new PathSpec(getPathComponents(), "totalSqlQueries");
        }

        /**
         *  Frequent SQL queries; mostly makes sense for datasets in SQL databases 
         * 
         */
        public PathSpec topSqlQueries() {
            return new PathSpec(getPathComponents(), "topSqlQueries");
        }

        /**
         *  Frequent SQL queries; mostly makes sense for datasets in SQL databases 
         * 
         */
        public PathSpec topSqlQueries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "topSqlQueries");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         *  Field-level usage stats 
         * 
         */
        public com.linkedin.usage.FieldUsageCountsArray.Fields fields() {
            return new com.linkedin.usage.FieldUsageCountsArray.Fields(getPathComponents(), "fields");
        }

        /**
         *  Field-level usage stats 
         * 
         */
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
