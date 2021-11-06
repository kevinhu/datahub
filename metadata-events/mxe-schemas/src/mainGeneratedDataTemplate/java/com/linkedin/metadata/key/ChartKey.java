
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
 * Key for a Chart
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/ChartKey.pdl.")
public class ChartKey
    extends RecordTemplate
{

    private final static ChartKey.Fields _fields = new ChartKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"fieldName\":\"tool\",\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_DashboardTool = SCHEMA.getField("dashboardTool");
    private final static RecordDataSchema.Field FIELD_ChartId = SCHEMA.getField("chartId");

    public ChartKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public ChartKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static ChartKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for dashboardTool
     * 
     * @see ChartKey.Fields#dashboardTool
     */
    public boolean hasDashboardTool() {
        return contains(FIELD_DashboardTool);
    }

    /**
     * Remover for dashboardTool
     * 
     * @see ChartKey.Fields#dashboardTool
     */
    public void removeDashboardTool() {
        remove(FIELD_DashboardTool);
    }

    /**
     * Getter for dashboardTool
     * 
     * @see ChartKey.Fields#dashboardTool
     */
    public String getDashboardTool(GetMode mode) {
        return obtainDirect(FIELD_DashboardTool, String.class, mode);
    }

    /**
     * Getter for dashboardTool
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartKey.Fields#dashboardTool
     */
    @Nonnull
    public String getDashboardTool() {
        return obtainDirect(FIELD_DashboardTool, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dashboardTool
     * 
     * @see ChartKey.Fields#dashboardTool
     */
    public ChartKey setDashboardTool(String value, SetMode mode) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dashboardTool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartKey.Fields#dashboardTool
     */
    public ChartKey setDashboardTool(
        @Nonnull
        String value) {
        putDirect(FIELD_DashboardTool, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    public boolean hasChartId() {
        return contains(FIELD_ChartId);
    }

    /**
     * Remover for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    public void removeChartId() {
        remove(FIELD_ChartId);
    }

    /**
     * Getter for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    public String getChartId(GetMode mode) {
        return obtainDirect(FIELD_ChartId, String.class, mode);
    }

    /**
     * Getter for chartId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartKey.Fields#chartId
     */
    @Nonnull
    public String getChartId() {
        return obtainDirect(FIELD_ChartId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for chartId
     * 
     * @see ChartKey.Fields#chartId
     */
    public ChartKey setChartId(String value, SetMode mode) {
        putDirect(FIELD_ChartId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for chartId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartKey.Fields#chartId
     */
    public ChartKey setChartId(
        @Nonnull
        String value) {
        putDirect(FIELD_ChartId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ChartKey clone()
        throws CloneNotSupportedException
    {
        return ((ChartKey) super.clone());
    }

    @Override
    public ChartKey copy()
        throws CloneNotSupportedException
    {
        return ((ChartKey) super.copy());
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
         * Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'
         * 
         */
        public PathSpec chartId() {
            return new PathSpec(getPathComponents(), "chartId");
        }

    }

}
