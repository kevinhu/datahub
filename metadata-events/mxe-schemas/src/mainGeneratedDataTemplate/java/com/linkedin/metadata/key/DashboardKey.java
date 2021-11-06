
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
 * Key for a Dashboard
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/DashboardKey.pdl.")
public class DashboardKey
    extends RecordTemplate
{

    private final static DashboardKey.Fields _fields = new DashboardKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Dashboard*/@Aspect.name=\"dashboardKey\"record DashboardKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'*/dashboardId:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_DashboardTool = SCHEMA.getField("dashboardTool");
    private final static RecordDataSchema.Field FIELD_DashboardId = SCHEMA.getField("dashboardId");

    public DashboardKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public DashboardKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static DashboardKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    public boolean hasDashboardTool() {
        return contains(FIELD_DashboardTool);
    }

    /**
     * Remover for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    public void removeDashboardTool() {
        remove(FIELD_DashboardTool);
    }

    /**
     * Getter for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    public String getDashboardTool(GetMode mode) {
        return obtainDirect(FIELD_DashboardTool, String.class, mode);
    }

    /**
     * Getter for dashboardTool
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardKey.Fields#dashboardTool
     */
    @Nonnull
    public String getDashboardTool() {
        return obtainDirect(FIELD_DashboardTool, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboardTool
     * 
     * @see DashboardKey.Fields#dashboardTool
     */
    public DashboardKey setDashboardTool(String value, SetMode mode) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboardTool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardKey.Fields#dashboardTool
     */
    public DashboardKey setDashboardTool(
        @Nonnull
        String value) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    public boolean hasDashboardId() {
        return contains(FIELD_DashboardId);
    }

    /**
     * Remover for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    public void removeDashboardId() {
        remove(FIELD_DashboardId);
    }

    /**
     * Getter for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    public String getDashboardId(GetMode mode) {
        return obtainDirect(FIELD_DashboardId, String.class, mode);
    }

    /**
     * Getter for dashboardId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardKey.Fields#dashboardId
     */
    @Nonnull
    public String getDashboardId() {
        return obtainDirect(FIELD_DashboardId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboardId
     * 
     * @see DashboardKey.Fields#dashboardId
     */
    public DashboardKey setDashboardId(String value, SetMode mode) {
        putDirect(FIELD_DashboardId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboardId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardKey.Fields#dashboardId
     */
    public DashboardKey setDashboardId(
        @Nonnull
        String value) {
        putDirect(FIELD_DashboardId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DashboardKey clone()
        throws CloneNotSupportedException
    {
        return ((DashboardKey) super.clone());
    }

    @Override
    public DashboardKey copy()
        throws CloneNotSupportedException
    {
        return ((DashboardKey) super.copy());
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
         * The name of the dashboard tool such as looker, redash etc.
         * 
         */
        public PathSpec dashboardTool() {
            return new PathSpec(getPathComponents(), "dashboardTool");
        }

        /**
         * Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'
         * 
         */
        public PathSpec dashboardId() {
            return new PathSpec(getPathComponents(), "dashboardId");
        }

    }

}
