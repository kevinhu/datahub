
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
 * Data model for a Dashboard entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/DashboardEntity.pdl.")
public class DashboardEntity
    extends RecordTemplate
{

    private final static DashboardEntity.Fields _fields = new DashboardEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a Dashboard entity*/record DashboardEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the dashboard*/urn:{namespace com.linkedin.common/**Standardized dashboard identifier*/@java.class=\"com.linkedin.common.urn.DashboardUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dashboard\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dashboard\",\"doc\":\"Standardized dashboard identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dashboardTool\",\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"dashboardId\",\"doc\":\"Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":240}typeref DashboardUrn=string}/**Dashboard tool*/dashboardTool:optional string/**Dashboard Id*/dashboardId:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_DashboardTool = SCHEMA.getField("dashboardTool");
    private final static RecordDataSchema.Field FIELD_DashboardId = SCHEMA.getField("dashboardId");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DashboardUrn.class);
    }

    public DashboardEntity() {
        super(new DataMap(6, 0.75F), SCHEMA);
    }

    public DashboardEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static DashboardEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DashboardEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DashboardEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DashboardEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DashboardEntity.Fields#removed
     */
    public DashboardEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardEntity.Fields#removed
     */
    public DashboardEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DashboardEntity.Fields#removed
     */
    public DashboardEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DashboardEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DashboardEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DashboardEntity.Fields#urn
     */
    public com.linkedin.common.urn.DashboardUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DashboardUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DashboardEntity.Fields#urn
     */
    public DashboardEntity setUrn(com.linkedin.common.urn.DashboardUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardEntity.Fields#urn
     */
    public DashboardEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.DashboardUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dashboardTool
     * 
     * @see DashboardEntity.Fields#dashboardTool
     */
    public boolean hasDashboardTool() {
        return contains(FIELD_DashboardTool);
    }

    /**
     * Remover for dashboardTool
     * 
     * @see DashboardEntity.Fields#dashboardTool
     */
    public void removeDashboardTool() {
        remove(FIELD_DashboardTool);
    }

    /**
     * Getter for dashboardTool
     * 
     * @see DashboardEntity.Fields#dashboardTool
     */
    public String getDashboardTool(GetMode mode) {
        return obtainDirect(FIELD_DashboardTool, String.class, mode);
    }

    /**
     * Getter for dashboardTool
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardEntity.Fields#dashboardTool
     */
    @Nullable
    public String getDashboardTool() {
        return obtainDirect(FIELD_DashboardTool, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboardTool
     * 
     * @see DashboardEntity.Fields#dashboardTool
     */
    public DashboardEntity setDashboardTool(String value, SetMode mode) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboardTool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardEntity.Fields#dashboardTool
     */
    public DashboardEntity setDashboardTool(
        @Nonnull
        String value) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dashboardId
     * 
     * @see DashboardEntity.Fields#dashboardId
     */
    public boolean hasDashboardId() {
        return contains(FIELD_DashboardId);
    }

    /**
     * Remover for dashboardId
     * 
     * @see DashboardEntity.Fields#dashboardId
     */
    public void removeDashboardId() {
        remove(FIELD_DashboardId);
    }

    /**
     * Getter for dashboardId
     * 
     * @see DashboardEntity.Fields#dashboardId
     */
    public String getDashboardId(GetMode mode) {
        return obtainDirect(FIELD_DashboardId, String.class, mode);
    }

    /**
     * Getter for dashboardId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardEntity.Fields#dashboardId
     */
    @Nullable
    public String getDashboardId() {
        return obtainDirect(FIELD_DashboardId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboardId
     * 
     * @see DashboardEntity.Fields#dashboardId
     */
    public DashboardEntity setDashboardId(String value, SetMode mode) {
        putDirect(FIELD_DashboardId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboardId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardEntity.Fields#dashboardId
     */
    public DashboardEntity setDashboardId(
        @Nonnull
        String value) {
        putDirect(FIELD_DashboardId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DashboardEntity clone()
        throws CloneNotSupportedException
    {
        return ((DashboardEntity) super.clone());
    }

    @Override
    public DashboardEntity copy()
        throws CloneNotSupportedException
    {
        return ((DashboardEntity) super.copy());
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
         * Urn for the dashboard
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
         * Dashboard Id
         * 
         */
        public PathSpec dashboardId() {
            return new PathSpec(getPathComponents(), "dashboardId");
        }

    }

}
