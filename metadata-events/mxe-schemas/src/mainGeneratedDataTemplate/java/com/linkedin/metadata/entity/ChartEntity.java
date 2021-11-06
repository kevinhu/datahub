
package com.linkedin.metadata.entity;

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
 * Data model for a Chart entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/ChartEntity.pdl.")
public class ChartEntity
    extends RecordTemplate
{

    private final static ChartEntity.Fields _fields = new ChartEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a Chart entity*/record ChartEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the chart*/urn:{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"chart\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Chart\",\"doc\":\"Standardized chart identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dashboardTool\",\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"chartId\",\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":236}typeref ChartUrn=string}/**Dashboard tool*/dashboardTool:optional string/**Chart Id*/chartId:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_DashboardTool = SCHEMA.getField("dashboardTool");
    private final static RecordDataSchema.Field FIELD_ChartId = SCHEMA.getField("chartId");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.ChartUrn.class);
    }

    public ChartEntity() {
        super(new DataMap(6, 0.75F), SCHEMA);
    }

    public ChartEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static ChartEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see ChartEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see ChartEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see ChartEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see ChartEntity.Fields#removed
     */
    public ChartEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartEntity.Fields#removed
     */
    public ChartEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see ChartEntity.Fields#removed
     */
    public ChartEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see ChartEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see ChartEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see ChartEntity.Fields#urn
     */
    public com.linkedin.common.urn.ChartUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.ChartUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.ChartUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.ChartUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see ChartEntity.Fields#urn
     */
    public ChartEntity setUrn(com.linkedin.common.urn.ChartUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.ChartUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartEntity.Fields#urn
     */
    public ChartEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.ChartUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.ChartUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dashboardTool
     * 
     * @see ChartEntity.Fields#dashboardTool
     */
    public boolean hasDashboardTool() {
        return contains(FIELD_DashboardTool);
    }

    /**
     * Remover for dashboardTool
     * 
     * @see ChartEntity.Fields#dashboardTool
     */
    public void removeDashboardTool() {
        remove(FIELD_DashboardTool);
    }

    /**
     * Getter for dashboardTool
     * 
     * @see ChartEntity.Fields#dashboardTool
     */
    public String getDashboardTool(GetMode mode) {
        return obtainDirect(FIELD_DashboardTool, String.class, mode);
    }

    /**
     * Getter for dashboardTool
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartEntity.Fields#dashboardTool
     */
    @Nullable
    public String getDashboardTool() {
        return obtainDirect(FIELD_DashboardTool, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboardTool
     * 
     * @see ChartEntity.Fields#dashboardTool
     */
    public ChartEntity setDashboardTool(String value, SetMode mode) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboardTool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartEntity.Fields#dashboardTool
     */
    public ChartEntity setDashboardTool(
        @Nonnull
        String value) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for chartId
     * 
     * @see ChartEntity.Fields#chartId
     */
    public boolean hasChartId() {
        return contains(FIELD_ChartId);
    }

    /**
     * Remover for chartId
     * 
     * @see ChartEntity.Fields#chartId
     */
    public void removeChartId() {
        remove(FIELD_ChartId);
    }

    /**
     * Getter for chartId
     * 
     * @see ChartEntity.Fields#chartId
     */
    public String getChartId(GetMode mode) {
        return obtainDirect(FIELD_ChartId, String.class, mode);
    }

    /**
     * Getter for chartId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ChartEntity.Fields#chartId
     */
    @Nullable
    public String getChartId() {
        return obtainDirect(FIELD_ChartId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for chartId
     * 
     * @see ChartEntity.Fields#chartId
     */
    public ChartEntity setChartId(String value, SetMode mode) {
        putDirect(FIELD_ChartId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for chartId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartEntity.Fields#chartId
     */
    public ChartEntity setChartId(
        @Nonnull
        String value) {
        putDirect(FIELD_ChartId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ChartEntity clone()
        throws CloneNotSupportedException
    {
        return ((ChartEntity) super.clone());
    }

    @Override
    public ChartEntity copy()
        throws CloneNotSupportedException
    {
        return ((ChartEntity) super.copy());
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
         * Whether the entity has been removed or not
         * 
         */
        public PathSpec removed() {
            return new PathSpec(getPathComponents(), "removed");
        }

        /**
         * Urn for the chart
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Dashboard tool
         * 
         */
        public PathSpec dashboardTool() {
            return new PathSpec(getPathComponents(), "dashboardTool");
        }

        /**
         * Chart Id
         * 
         */
        public PathSpec chartId() {
            return new PathSpec(getPathComponents(), "chartId");
        }

    }

}
