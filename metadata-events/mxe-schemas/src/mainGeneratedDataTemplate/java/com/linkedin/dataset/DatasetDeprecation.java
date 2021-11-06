
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
 * Dataset deprecation status
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetDeprecation.pdl.")
public class DatasetDeprecation
    extends RecordTemplate
{

    private final static DatasetDeprecation.Fields _fields = new DatasetDeprecation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Dataset deprecation status*/@Aspect.name=\"datasetDeprecation\"record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Deprecated = SCHEMA.getField("deprecated");
    private final static RecordDataSchema.Field FIELD_DecommissionTime = SCHEMA.getField("decommissionTime");
    private final static RecordDataSchema.Field FIELD_Note = SCHEMA.getField("note");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DatasetDeprecation() {
        super(new DataMap(6, 0.75F), SCHEMA);
    }

    public DatasetDeprecation(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetDeprecation.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
     */
    public boolean hasDeprecated() {
        return contains(FIELD_Deprecated);
    }

    /**
     * Remover for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
     */
    public void removeDeprecated() {
        remove(FIELD_Deprecated);
    }

    /**
     * Getter for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
     */
    public Boolean isDeprecated(GetMode mode) {
        return obtainDirect(FIELD_Deprecated, Boolean.class, mode);
    }

    /**
     * Getter for deprecated
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetDeprecation.Fields#deprecated
     */
    @Nonnull
    public Boolean isDeprecated() {
        return obtainDirect(FIELD_Deprecated, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
     */
    public DatasetDeprecation setDeprecated(Boolean value, SetMode mode) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDeprecation.Fields#deprecated
     */
    public DatasetDeprecation setDeprecated(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
     */
    public DatasetDeprecation setDeprecated(boolean value) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public boolean hasDecommissionTime() {
        return contains(FIELD_DecommissionTime);
    }

    /**
     * Remover for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public void removeDecommissionTime() {
        remove(FIELD_DecommissionTime);
    }

    /**
     * Getter for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public Long getDecommissionTime(GetMode mode) {
        return obtainDirect(FIELD_DecommissionTime, Long.class, mode);
    }

    /**
     * Getter for decommissionTime
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    @Nullable
    public Long getDecommissionTime() {
        return obtainDirect(FIELD_DecommissionTime, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public DatasetDeprecation setDecommissionTime(Long value, SetMode mode) {
        putDirect(FIELD_DecommissionTime, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for decommissionTime
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public DatasetDeprecation setDecommissionTime(
        @Nonnull
        Long value) {
        putDirect(FIELD_DecommissionTime, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public DatasetDeprecation setDecommissionTime(long value) {
        putDirect(FIELD_DecommissionTime, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for note
     * 
     * @see DatasetDeprecation.Fields#note
     */
    public boolean hasNote() {
        return contains(FIELD_Note);
    }

    /**
     * Remover for note
     * 
     * @see DatasetDeprecation.Fields#note
     */
    public void removeNote() {
        remove(FIELD_Note);
    }

    /**
     * Getter for note
     * 
     * @see DatasetDeprecation.Fields#note
     */
    public String getNote(GetMode mode) {
        return obtainDirect(FIELD_Note, String.class, mode);
    }

    /**
     * Getter for note
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetDeprecation.Fields#note
     */
    @Nonnull
    public String getNote() {
        return obtainDirect(FIELD_Note, String.class, GetMode.STRICT);
    }

    /**
     * Setter for note
     * 
     * @see DatasetDeprecation.Fields#note
     */
    public DatasetDeprecation setNote(String value, SetMode mode) {
        putDirect(FIELD_Note, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for note
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDeprecation.Fields#note
     */
    public DatasetDeprecation setNote(
        @Nonnull
        String value) {
        putDirect(FIELD_Note, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see DatasetDeprecation.Fields#actor
     */
    public boolean hasActor() {
        return contains(FIELD_Actor);
    }

    /**
     * Remover for actor
     * 
     * @see DatasetDeprecation.Fields#actor
     */
    public void removeActor() {
        remove(FIELD_Actor);
    }

    /**
     * Getter for actor
     * 
     * @see DatasetDeprecation.Fields#actor
     */
    public com.linkedin.common.urn.Urn getActor(GetMode mode) {
        return obtainCustomType(FIELD_Actor, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDeprecation.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor() {
        return obtainCustomType(FIELD_Actor, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for actor
     * 
     * @see DatasetDeprecation.Fields#actor
     */
    public DatasetDeprecation setActor(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Actor, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for actor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDeprecation.Fields#actor
     */
    public DatasetDeprecation setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Actor, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetDeprecation clone()
        throws CloneNotSupportedException
    {
        return ((DatasetDeprecation) super.clone());
    }

    @Override
    public DatasetDeprecation copy()
        throws CloneNotSupportedException
    {
        return ((DatasetDeprecation) super.copy());
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
         * Whether the dataset is deprecated by owner.
         * 
         */
        public PathSpec deprecated() {
            return new PathSpec(getPathComponents(), "deprecated");
        }

        /**
         * The time user plan to decommission this dataset.
         * 
         */
        public PathSpec decommissionTime() {
            return new PathSpec(getPathComponents(), "decommissionTime");
        }

        /**
         * Additional information about the dataset deprecation plan, such as the wiki, doc, RB.
         * 
         */
        public PathSpec note() {
            return new PathSpec(getPathComponents(), "note");
        }

        /**
         * The corpuser URN which will be credited for modifying this deprecation content.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

    }

}
