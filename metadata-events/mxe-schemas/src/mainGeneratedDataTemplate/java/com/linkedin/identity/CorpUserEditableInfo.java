
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.url.UrlCoercer;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Linkedin corp user information that can be edited from UI
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpUserEditableInfo.pdl.")
public class CorpUserEditableInfo
    extends RecordTemplate
{

    private final static CorpUserEditableInfo.Fields _fields = new CorpUserEditableInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"name\":\"corpUserEditableInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}=\"https://raw.githubusercontent.com/linkedin/datahub/master/datahub-web-react/src/images/default_avatar.png\"}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AboutMe = SCHEMA.getField("aboutMe");
    private final static RecordDataSchema.Field FIELD_Teams = SCHEMA.getField("teams");
    private final static RecordDataSchema.Field FIELD_Skills = SCHEMA.getField("skills");
    private final static RecordDataSchema.Field FIELD_PictureLink = SCHEMA.getField("pictureLink");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public CorpUserEditableInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
    }

    public CorpUserEditableInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpUserEditableInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public boolean hasAboutMe() {
        return contains(FIELD_AboutMe);
    }

    /**
     * Remover for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public void removeAboutMe() {
        remove(FIELD_AboutMe);
    }

    /**
     * Getter for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public String getAboutMe(GetMode mode) {
        return obtainDirect(FIELD_AboutMe, String.class, mode);
    }

    /**
     * Getter for aboutMe
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    @Nullable
    public String getAboutMe() {
        return obtainDirect(FIELD_AboutMe, String.class, GetMode.STRICT);
    }

    /**
     * Setter for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public CorpUserEditableInfo setAboutMe(String value, SetMode mode) {
        putDirect(FIELD_AboutMe, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for aboutMe
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public CorpUserEditableInfo setAboutMe(
        @Nonnull
        String value) {
        putDirect(FIELD_AboutMe, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    public boolean hasTeams() {
        return contains(FIELD_Teams);
    }

    /**
     * Remover for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    public void removeTeams() {
        remove(FIELD_Teams);
    }

    /**
     * Getter for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    public StringArray getTeams(GetMode mode) {
        return obtainWrapped(FIELD_Teams, StringArray.class, mode);
    }

    /**
     * Getter for teams
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserEditableInfo.Fields#teams
     */
    @Nonnull
    public StringArray getTeams() {
        return obtainWrapped(FIELD_Teams, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    public CorpUserEditableInfo setTeams(StringArray value, SetMode mode) {
        putWrapped(FIELD_Teams, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for teams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#teams
     */
    public CorpUserEditableInfo setTeams(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Teams, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    public boolean hasSkills() {
        return contains(FIELD_Skills);
    }

    /**
     * Remover for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    public void removeSkills() {
        remove(FIELD_Skills);
    }

    /**
     * Getter for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    public StringArray getSkills(GetMode mode) {
        return obtainWrapped(FIELD_Skills, StringArray.class, mode);
    }

    /**
     * Getter for skills
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserEditableInfo.Fields#skills
     */
    @Nonnull
    public StringArray getSkills() {
        return obtainWrapped(FIELD_Skills, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    public CorpUserEditableInfo setSkills(StringArray value, SetMode mode) {
        putWrapped(FIELD_Skills, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for skills
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#skills
     */
    public CorpUserEditableInfo setSkills(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Skills, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public boolean hasPictureLink() {
        return contains(FIELD_PictureLink);
    }

    /**
     * Remover for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public void removePictureLink() {
        remove(FIELD_PictureLink);
    }

    /**
     * Getter for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public com.linkedin.common.url.Url getPictureLink(GetMode mode) {
        return obtainCustomType(FIELD_PictureLink, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for pictureLink
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    @Nonnull
    public com.linkedin.common.url.Url getPictureLink() {
        return obtainCustomType(FIELD_PictureLink, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public CorpUserEditableInfo setPictureLink(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_PictureLink, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for pictureLink
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public CorpUserEditableInfo setPictureLink(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_PictureLink, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpUserEditableInfo clone()
        throws CloneNotSupportedException
    {
        return ((CorpUserEditableInfo) super.clone());
    }

    @Override
    public CorpUserEditableInfo copy()
        throws CloneNotSupportedException
    {
        return ((CorpUserEditableInfo) super.copy());
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
         * About me section of the user
         * 
         */
        public PathSpec aboutMe() {
            return new PathSpec(getPathComponents(), "aboutMe");
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public PathSpec teams() {
            return new PathSpec(getPathComponents(), "teams");
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public PathSpec teams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "teams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public PathSpec skills() {
            return new PathSpec(getPathComponents(), "skills");
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public PathSpec skills(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "skills");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A URL which points to a picture which user wants to set as a profile photo
         * 
         */
        public PathSpec pictureLink() {
            return new PathSpec(getPathComponents(), "pictureLink");
        }

    }

}
