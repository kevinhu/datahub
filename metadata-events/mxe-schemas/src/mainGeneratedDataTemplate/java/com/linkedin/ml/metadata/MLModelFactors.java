
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
 * Factors affecting the performance of the MLModel.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelFactors.pdl.")
public class MLModelFactors
    extends RecordTemplate
{

    private final static MLModelFactors.Fields _fields = new MLModelFactors.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera\u2019s hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_Instrumentation = SCHEMA.getField("instrumentation");
    private final static RecordDataSchema.Field FIELD_Environment = SCHEMA.getField("environment");

    public MLModelFactors() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
    }

    public MLModelFactors(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLModelFactors.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    public boolean hasGroups() {
        return contains(FIELD_Groups);
    }

    /**
     * Remover for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    public void removeGroups() {
        remove(FIELD_Groups);
    }

    /**
     * Getter for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    public StringArray getGroups(GetMode mode) {
        return obtainWrapped(FIELD_Groups, StringArray.class, mode);
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactors.Fields#groups
     */
    @Nullable
    public StringArray getGroups() {
        return obtainWrapped(FIELD_Groups, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groups
     * 
     * @see MLModelFactors.Fields#groups
     */
    public MLModelFactors setGroups(StringArray value, SetMode mode) {
        putWrapped(FIELD_Groups, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactors.Fields#groups
     */
    public MLModelFactors setGroups(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Groups, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    public boolean hasInstrumentation() {
        return contains(FIELD_Instrumentation);
    }

    /**
     * Remover for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    public void removeInstrumentation() {
        remove(FIELD_Instrumentation);
    }

    /**
     * Getter for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    public StringArray getInstrumentation(GetMode mode) {
        return obtainWrapped(FIELD_Instrumentation, StringArray.class, mode);
    }

    /**
     * Getter for instrumentation
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactors.Fields#instrumentation
     */
    @Nullable
    public StringArray getInstrumentation() {
        return obtainWrapped(FIELD_Instrumentation, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for instrumentation
     * 
     * @see MLModelFactors.Fields#instrumentation
     */
    public MLModelFactors setInstrumentation(StringArray value, SetMode mode) {
        putWrapped(FIELD_Instrumentation, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for instrumentation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactors.Fields#instrumentation
     */
    public MLModelFactors setInstrumentation(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Instrumentation, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    public boolean hasEnvironment() {
        return contains(FIELD_Environment);
    }

    /**
     * Remover for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    public void removeEnvironment() {
        remove(FIELD_Environment);
    }

    /**
     * Getter for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    public StringArray getEnvironment(GetMode mode) {
        return obtainWrapped(FIELD_Environment, StringArray.class, mode);
    }

    /**
     * Getter for environment
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactors.Fields#environment
     */
    @Nullable
    public StringArray getEnvironment() {
        return obtainWrapped(FIELD_Environment, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for environment
     * 
     * @see MLModelFactors.Fields#environment
     */
    public MLModelFactors setEnvironment(StringArray value, SetMode mode) {
        putWrapped(FIELD_Environment, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for environment
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactors.Fields#environment
     */
    public MLModelFactors setEnvironment(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Environment, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLModelFactors clone()
        throws CloneNotSupportedException
    {
        return ((MLModelFactors) super.clone());
    }

    @Override
    public MLModelFactors copy()
        throws CloneNotSupportedException
    {
        return ((MLModelFactors) super.copy());
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
         * Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.
         * For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.
         * For human-centric machine learning MLModels, groups are people who share one or multiple characteristics.
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.
         * For example, a face detection model may perform differently depending on the camera’s hardware and software,
         * including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.
         * 
         */
        public PathSpec instrumentation() {
            return new PathSpec(getPathComponents(), "instrumentation");
        }

        /**
         * The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.
         * For example, a face detection model may perform differently depending on the camera’s hardware and software,
         * including lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.
         * 
         */
        public PathSpec instrumentation(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "instrumentation");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A further factor affecting MLModel performance is the environment in which it is deployed.
         * 
         */
        public PathSpec environment() {
            return new PathSpec(getPathComponents(), "environment");
        }

        /**
         * A further factor affecting MLModel performance is the environment in which it is deployed.
         * 
         */
        public PathSpec environment(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "environment");
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
