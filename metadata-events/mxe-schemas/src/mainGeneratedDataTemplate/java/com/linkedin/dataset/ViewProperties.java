
package com.linkedin.dataset;

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
 * Details about a View. 
 * e.g. Gets activated when subTypes is view
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/ViewProperties.pdl.")
public class ViewProperties
    extends RecordTemplate
{

    private final static ViewProperties.Fields _fields = new ViewProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Details about a View. \ne.g. Gets activated when subTypes is view*/@Aspect.name=\"viewProperties\"record ViewProperties{/**Whether the view is materialized*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}materialized:boolean/**The view logic*/viewLogic:string/**The view logic language / dialect*/viewLanguage:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Materialized = SCHEMA.getField("materialized");
    private final static RecordDataSchema.Field FIELD_ViewLogic = SCHEMA.getField("viewLogic");
    private final static RecordDataSchema.Field FIELD_ViewLanguage = SCHEMA.getField("viewLanguage");

    public ViewProperties() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public ViewProperties(DataMap data) {
        super(data, SCHEMA);
    }

    public static ViewProperties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public boolean hasMaterialized() {
        return contains(FIELD_Materialized);
    }

    /**
     * Remover for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public void removeMaterialized() {
        remove(FIELD_Materialized);
    }

    /**
     * Getter for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public Boolean isMaterialized(GetMode mode) {
        return obtainDirect(FIELD_Materialized, Boolean.class, mode);
    }

    /**
     * Getter for materialized
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ViewProperties.Fields#materialized
     */
    @Nonnull
    public Boolean isMaterialized() {
        return obtainDirect(FIELD_Materialized, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public ViewProperties setMaterialized(Boolean value, SetMode mode) {
        putDirect(FIELD_Materialized, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for materialized
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ViewProperties.Fields#materialized
     */
    public ViewProperties setMaterialized(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Materialized, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for materialized
     * 
     * @see ViewProperties.Fields#materialized
     */
    public ViewProperties setMaterialized(boolean value) {
        putDirect(FIELD_Materialized, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    public boolean hasViewLogic() {
        return contains(FIELD_ViewLogic);
    }

    /**
     * Remover for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    public void removeViewLogic() {
        remove(FIELD_ViewLogic);
    }

    /**
     * Getter for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    public String getViewLogic(GetMode mode) {
        return obtainDirect(FIELD_ViewLogic, String.class, mode);
    }

    /**
     * Getter for viewLogic
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ViewProperties.Fields#viewLogic
     */
    @Nonnull
    public String getViewLogic() {
        return obtainDirect(FIELD_ViewLogic, String.class, GetMode.STRICT);
    }

    /**
     * Setter for viewLogic
     * 
     * @see ViewProperties.Fields#viewLogic
     */
    public ViewProperties setViewLogic(String value, SetMode mode) {
        putDirect(FIELD_ViewLogic, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for viewLogic
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ViewProperties.Fields#viewLogic
     */
    public ViewProperties setViewLogic(
        @Nonnull
        String value) {
        putDirect(FIELD_ViewLogic, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    public boolean hasViewLanguage() {
        return contains(FIELD_ViewLanguage);
    }

    /**
     * Remover for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    public void removeViewLanguage() {
        remove(FIELD_ViewLanguage);
    }

    /**
     * Getter for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    public String getViewLanguage(GetMode mode) {
        return obtainDirect(FIELD_ViewLanguage, String.class, mode);
    }

    /**
     * Getter for viewLanguage
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ViewProperties.Fields#viewLanguage
     */
    @Nonnull
    public String getViewLanguage() {
        return obtainDirect(FIELD_ViewLanguage, String.class, GetMode.STRICT);
    }

    /**
     * Setter for viewLanguage
     * 
     * @see ViewProperties.Fields#viewLanguage
     */
    public ViewProperties setViewLanguage(String value, SetMode mode) {
        putDirect(FIELD_ViewLanguage, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for viewLanguage
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ViewProperties.Fields#viewLanguage
     */
    public ViewProperties setViewLanguage(
        @Nonnull
        String value) {
        putDirect(FIELD_ViewLanguage, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ViewProperties clone()
        throws CloneNotSupportedException
    {
        return ((ViewProperties) super.clone());
    }

    @Override
    public ViewProperties copy()
        throws CloneNotSupportedException
    {
        return ((ViewProperties) super.copy());
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
         * Whether the view is materialized
         * 
         */
        public PathSpec materialized() {
            return new PathSpec(getPathComponents(), "materialized");
        }

        /**
         * The view logic
         * 
         */
        public PathSpec viewLogic() {
            return new PathSpec(getPathComponents(), "viewLogic");
        }

        /**
         * The view logic language / dialect
         * 
         */
        public PathSpec viewLanguage() {
            return new PathSpec(getPathComponents(), "viewLanguage");
        }

    }

}
