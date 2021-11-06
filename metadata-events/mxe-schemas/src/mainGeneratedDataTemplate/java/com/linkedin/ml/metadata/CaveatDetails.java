
package com.linkedin.ml.metadata;

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
 * This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/CaveatDetails.pdl.")
public class CaveatDetails
    extends RecordTemplate
{

    private final static CaveatDetails.Fields _fields = new CaveatDetails.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_NeedsFurtherTesting = SCHEMA.getField("needsFurtherTesting");
    private final static RecordDataSchema.Field FIELD_CaveatDescription = SCHEMA.getField("caveatDescription");
    private final static RecordDataSchema.Field FIELD_GroupsNotRepresented = SCHEMA.getField("groupsNotRepresented");

    public CaveatDetails() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public CaveatDetails(DataMap data) {
        super(data, SCHEMA);
    }

    public static CaveatDetails.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public boolean hasNeedsFurtherTesting() {
        return contains(FIELD_NeedsFurtherTesting);
    }

    /**
     * Remover for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public void removeNeedsFurtherTesting() {
        remove(FIELD_NeedsFurtherTesting);
    }

    /**
     * Getter for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public Boolean isNeedsFurtherTesting(GetMode mode) {
        return obtainDirect(FIELD_NeedsFurtherTesting, Boolean.class, mode);
    }

    /**
     * Getter for needsFurtherTesting
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    @Nullable
    public Boolean isNeedsFurtherTesting() {
        return obtainDirect(FIELD_NeedsFurtherTesting, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public CaveatDetails setNeedsFurtherTesting(Boolean value, SetMode mode) {
        putDirect(FIELD_NeedsFurtherTesting, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for needsFurtherTesting
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public CaveatDetails setNeedsFurtherTesting(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_NeedsFurtherTesting, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for needsFurtherTesting
     * 
     * @see CaveatDetails.Fields#needsFurtherTesting
     */
    public CaveatDetails setNeedsFurtherTesting(boolean value) {
        putDirect(FIELD_NeedsFurtherTesting, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    public boolean hasCaveatDescription() {
        return contains(FIELD_CaveatDescription);
    }

    /**
     * Remover for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    public void removeCaveatDescription() {
        remove(FIELD_CaveatDescription);
    }

    /**
     * Getter for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    public String getCaveatDescription(GetMode mode) {
        return obtainDirect(FIELD_CaveatDescription, String.class, mode);
    }

    /**
     * Getter for caveatDescription
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatDetails.Fields#caveatDescription
     */
    @Nullable
    public String getCaveatDescription() {
        return obtainDirect(FIELD_CaveatDescription, String.class, GetMode.STRICT);
    }

    /**
     * Setter for caveatDescription
     * 
     * @see CaveatDetails.Fields#caveatDescription
     */
    public CaveatDetails setCaveatDescription(String value, SetMode mode) {
        putDirect(FIELD_CaveatDescription, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for caveatDescription
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatDetails.Fields#caveatDescription
     */
    public CaveatDetails setCaveatDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_CaveatDescription, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public boolean hasGroupsNotRepresented() {
        return contains(FIELD_GroupsNotRepresented);
    }

    /**
     * Remover for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public void removeGroupsNotRepresented() {
        remove(FIELD_GroupsNotRepresented);
    }

    /**
     * Getter for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public StringArray getGroupsNotRepresented(GetMode mode) {
        return obtainWrapped(FIELD_GroupsNotRepresented, StringArray.class, mode);
    }

    /**
     * Getter for groupsNotRepresented
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    @Nullable
    public StringArray getGroupsNotRepresented() {
        return obtainWrapped(FIELD_GroupsNotRepresented, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groupsNotRepresented
     * 
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public CaveatDetails setGroupsNotRepresented(StringArray value, SetMode mode) {
        putWrapped(FIELD_GroupsNotRepresented, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groupsNotRepresented
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CaveatDetails.Fields#groupsNotRepresented
     */
    public CaveatDetails setGroupsNotRepresented(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_GroupsNotRepresented, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CaveatDetails clone()
        throws CloneNotSupportedException
    {
        return ((CaveatDetails) super.clone());
    }

    @Override
    public CaveatDetails copy()
        throws CloneNotSupportedException
    {
        return ((CaveatDetails) super.copy());
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
         * Did the results suggest any further testing?
         * 
         */
        public PathSpec needsFurtherTesting() {
            return new PathSpec(getPathComponents(), "needsFurtherTesting");
        }

        /**
         * Caveat Description
         * For ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.
         * 
         */
        public PathSpec caveatDescription() {
            return new PathSpec(getPathComponents(), "caveatDescription");
        }

        /**
         * Relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public PathSpec groupsNotRepresented() {
            return new PathSpec(getPathComponents(), "groupsNotRepresented");
        }

        /**
         * Relevant groups that were not represented in the evaluation dataset?
         * 
         */
        public PathSpec groupsNotRepresented(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groupsNotRepresented");
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
