
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
 * Intended Use for the ML Model
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/IntendedUse.pdl.")
public class IntendedUse
    extends RecordTemplate
{

    private final static IntendedUse.Fields _fields = new IntendedUse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_PrimaryUses = SCHEMA.getField("primaryUses");
    private final static RecordDataSchema.Field FIELD_PrimaryUsers = SCHEMA.getField("primaryUsers");
    private final static RecordDataSchema.Field FIELD_OutOfScopeUses = SCHEMA.getField("outOfScopeUses");

    public IntendedUse() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
    }

    public IntendedUse(DataMap data) {
        super(data, SCHEMA);
    }

    public static IntendedUse.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    public boolean hasPrimaryUses() {
        return contains(FIELD_PrimaryUses);
    }

    /**
     * Remover for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    public void removePrimaryUses() {
        remove(FIELD_PrimaryUses);
    }

    /**
     * Getter for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    public StringArray getPrimaryUses(GetMode mode) {
        return obtainWrapped(FIELD_PrimaryUses, StringArray.class, mode);
    }

    /**
     * Getter for primaryUses
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IntendedUse.Fields#primaryUses
     */
    @Nullable
    public StringArray getPrimaryUses() {
        return obtainWrapped(FIELD_PrimaryUses, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for primaryUses
     * 
     * @see IntendedUse.Fields#primaryUses
     */
    public IntendedUse setPrimaryUses(StringArray value, SetMode mode) {
        putWrapped(FIELD_PrimaryUses, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for primaryUses
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IntendedUse.Fields#primaryUses
     */
    public IntendedUse setPrimaryUses(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_PrimaryUses, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    public boolean hasPrimaryUsers() {
        return contains(FIELD_PrimaryUsers);
    }

    /**
     * Remover for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    public void removePrimaryUsers() {
        remove(FIELD_PrimaryUsers);
    }

    /**
     * Getter for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    public IntendedUserTypeArray getPrimaryUsers(GetMode mode) {
        return obtainWrapped(FIELD_PrimaryUsers, IntendedUserTypeArray.class, mode);
    }

    /**
     * Getter for primaryUsers
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IntendedUse.Fields#primaryUsers
     */
    @Nullable
    public IntendedUserTypeArray getPrimaryUsers() {
        return obtainWrapped(FIELD_PrimaryUsers, IntendedUserTypeArray.class, GetMode.STRICT);
    }

    /**
     * Setter for primaryUsers
     * 
     * @see IntendedUse.Fields#primaryUsers
     */
    public IntendedUse setPrimaryUsers(IntendedUserTypeArray value, SetMode mode) {
        putWrapped(FIELD_PrimaryUsers, IntendedUserTypeArray.class, value, mode);
        return this;
    }

    /**
     * Setter for primaryUsers
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IntendedUse.Fields#primaryUsers
     */
    public IntendedUse setPrimaryUsers(
        @Nonnull
        IntendedUserTypeArray value) {
        putWrapped(FIELD_PrimaryUsers, IntendedUserTypeArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public boolean hasOutOfScopeUses() {
        return contains(FIELD_OutOfScopeUses);
    }

    /**
     * Remover for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public void removeOutOfScopeUses() {
        remove(FIELD_OutOfScopeUses);
    }

    /**
     * Getter for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public StringArray getOutOfScopeUses(GetMode mode) {
        return obtainWrapped(FIELD_OutOfScopeUses, StringArray.class, mode);
    }

    /**
     * Getter for outOfScopeUses
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IntendedUse.Fields#outOfScopeUses
     */
    @Nullable
    public StringArray getOutOfScopeUses() {
        return obtainWrapped(FIELD_OutOfScopeUses, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for outOfScopeUses
     * 
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public IntendedUse setOutOfScopeUses(StringArray value, SetMode mode) {
        putWrapped(FIELD_OutOfScopeUses, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for outOfScopeUses
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IntendedUse.Fields#outOfScopeUses
     */
    public IntendedUse setOutOfScopeUses(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_OutOfScopeUses, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public IntendedUse clone()
        throws CloneNotSupportedException
    {
        return ((IntendedUse) super.clone());
    }

    @Override
    public IntendedUse copy()
        throws CloneNotSupportedException
    {
        return ((IntendedUse) super.copy());
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
         * Primary Use cases for the MLModel.
         * 
         */
        public PathSpec primaryUses() {
            return new PathSpec(getPathComponents(), "primaryUses");
        }

        /**
         * Primary Use cases for the MLModel.
         * 
         */
        public PathSpec primaryUses(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "primaryUses");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?
         * 
         */
        public PathSpec primaryUsers() {
            return new PathSpec(getPathComponents(), "primaryUsers");
        }

        /**
         * Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?
         * 
         */
        public PathSpec primaryUsers(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "primaryUsers");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.
         * 
         */
        public PathSpec outOfScopeUses() {
            return new PathSpec(getPathComponents(), "outOfScopeUses");
        }

        /**
         * Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.
         * 
         */
        public PathSpec outOfScopeUses(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outOfScopeUses");
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
