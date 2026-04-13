// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicRssEmailDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val blogEmailType: JsonField<String>,
    private val blogImageMaxWidth: JsonField<Int>,
    private val blogLayout: JsonField<BlogLayout>,
    private val hubSpotBlogId: JsonField<String>,
    private val maxEntries: JsonField<Int>,
    private val rssEntryTemplate: JsonField<String>,
    private val timing: JsonField<Timing>,
    private val url: JsonField<String>,
    private val useHeadlineAsSubject: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("blogEmailType")
        @ExcludeMissing
        blogEmailType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("blogImageMaxWidth")
        @ExcludeMissing
        blogImageMaxWidth: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("blogLayout")
        @ExcludeMissing
        blogLayout: JsonField<BlogLayout> = JsonMissing.of(),
        @JsonProperty("hubspotBlogId")
        @ExcludeMissing
        hubSpotBlogId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxEntries") @ExcludeMissing maxEntries: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rssEntryTemplate")
        @ExcludeMissing
        rssEntryTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timing") @ExcludeMissing timing: JsonField<Timing> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("useHeadlineAsSubject")
        @ExcludeMissing
        useHeadlineAsSubject: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        blogEmailType,
        blogImageMaxWidth,
        blogLayout,
        hubSpotBlogId,
        maxEntries,
        rssEntryTemplate,
        timing,
        url,
        useHeadlineAsSubject,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blogEmailType(): Optional<String> = blogEmailType.getOptional("blogEmailType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blogImageMaxWidth(): Optional<Int> = blogImageMaxWidth.getOptional("blogImageMaxWidth")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blogLayout(): Optional<BlogLayout> = blogLayout.getOptional("blogLayout")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubSpotBlogId(): Optional<String> = hubSpotBlogId.getOptional("hubspotBlogId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxEntries(): Optional<Int> = maxEntries.getOptional("maxEntries")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rssEntryTemplate(): Optional<String> = rssEntryTemplate.getOptional("rssEntryTemplate")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timing(): Optional<Timing> = timing.getOptional("timing")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useHeadlineAsSubject(): Optional<Boolean> =
        useHeadlineAsSubject.getOptional("useHeadlineAsSubject")

    /**
     * Returns the raw JSON value of [blogEmailType].
     *
     * Unlike [blogEmailType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blogEmailType")
    @ExcludeMissing
    fun _blogEmailType(): JsonField<String> = blogEmailType

    /**
     * Returns the raw JSON value of [blogImageMaxWidth].
     *
     * Unlike [blogImageMaxWidth], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("blogImageMaxWidth")
    @ExcludeMissing
    fun _blogImageMaxWidth(): JsonField<Int> = blogImageMaxWidth

    /**
     * Returns the raw JSON value of [blogLayout].
     *
     * Unlike [blogLayout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blogLayout")
    @ExcludeMissing
    fun _blogLayout(): JsonField<BlogLayout> = blogLayout

    /**
     * Returns the raw JSON value of [hubSpotBlogId].
     *
     * Unlike [hubSpotBlogId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspotBlogId")
    @ExcludeMissing
    fun _hubSpotBlogId(): JsonField<String> = hubSpotBlogId

    /**
     * Returns the raw JSON value of [maxEntries].
     *
     * Unlike [maxEntries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxEntries") @ExcludeMissing fun _maxEntries(): JsonField<Int> = maxEntries

    /**
     * Returns the raw JSON value of [rssEntryTemplate].
     *
     * Unlike [rssEntryTemplate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rssEntryTemplate")
    @ExcludeMissing
    fun _rssEntryTemplate(): JsonField<String> = rssEntryTemplate

    /**
     * Returns the raw JSON value of [timing].
     *
     * Unlike [timing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timing") @ExcludeMissing fun _timing(): JsonField<Timing> = timing

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [useHeadlineAsSubject].
     *
     * Unlike [useHeadlineAsSubject], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("useHeadlineAsSubject")
    @ExcludeMissing
    fun _useHeadlineAsSubject(): JsonField<Boolean> = useHeadlineAsSubject

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [PublicRssEmailDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicRssEmailDetails]. */
    class Builder internal constructor() {

        private var blogEmailType: JsonField<String> = JsonMissing.of()
        private var blogImageMaxWidth: JsonField<Int> = JsonMissing.of()
        private var blogLayout: JsonField<BlogLayout> = JsonMissing.of()
        private var hubSpotBlogId: JsonField<String> = JsonMissing.of()
        private var maxEntries: JsonField<Int> = JsonMissing.of()
        private var rssEntryTemplate: JsonField<String> = JsonMissing.of()
        private var timing: JsonField<Timing> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var useHeadlineAsSubject: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicRssEmailDetails: PublicRssEmailDetails) = apply {
            blogEmailType = publicRssEmailDetails.blogEmailType
            blogImageMaxWidth = publicRssEmailDetails.blogImageMaxWidth
            blogLayout = publicRssEmailDetails.blogLayout
            hubSpotBlogId = publicRssEmailDetails.hubSpotBlogId
            maxEntries = publicRssEmailDetails.maxEntries
            rssEntryTemplate = publicRssEmailDetails.rssEntryTemplate
            timing = publicRssEmailDetails.timing
            url = publicRssEmailDetails.url
            useHeadlineAsSubject = publicRssEmailDetails.useHeadlineAsSubject
            additionalProperties = publicRssEmailDetails.additionalProperties.toMutableMap()
        }

        fun blogEmailType(blogEmailType: String) = blogEmailType(JsonField.of(blogEmailType))

        /**
         * Sets [Builder.blogEmailType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blogEmailType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun blogEmailType(blogEmailType: JsonField<String>) = apply {
            this.blogEmailType = blogEmailType
        }

        fun blogImageMaxWidth(blogImageMaxWidth: Int) =
            blogImageMaxWidth(JsonField.of(blogImageMaxWidth))

        /**
         * Sets [Builder.blogImageMaxWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blogImageMaxWidth] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blogImageMaxWidth(blogImageMaxWidth: JsonField<Int>) = apply {
            this.blogImageMaxWidth = blogImageMaxWidth
        }

        fun blogLayout(blogLayout: BlogLayout) = blogLayout(JsonField.of(blogLayout))

        /**
         * Sets [Builder.blogLayout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blogLayout] with a well-typed [BlogLayout] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blogLayout(blogLayout: JsonField<BlogLayout>) = apply { this.blogLayout = blogLayout }

        fun hubSpotBlogId(hubSpotBlogId: String) = hubSpotBlogId(JsonField.of(hubSpotBlogId))

        /**
         * Sets [Builder.hubSpotBlogId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubSpotBlogId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hubSpotBlogId(hubSpotBlogId: JsonField<String>) = apply {
            this.hubSpotBlogId = hubSpotBlogId
        }

        fun maxEntries(maxEntries: Int) = maxEntries(JsonField.of(maxEntries))

        /**
         * Sets [Builder.maxEntries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxEntries] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxEntries(maxEntries: JsonField<Int>) = apply { this.maxEntries = maxEntries }

        fun rssEntryTemplate(rssEntryTemplate: String) =
            rssEntryTemplate(JsonField.of(rssEntryTemplate))

        /**
         * Sets [Builder.rssEntryTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rssEntryTemplate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rssEntryTemplate(rssEntryTemplate: JsonField<String>) = apply {
            this.rssEntryTemplate = rssEntryTemplate
        }

        fun timing(timing: Timing) = timing(JsonField.of(timing))

        /**
         * Sets [Builder.timing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timing] with a well-typed [Timing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timing(timing: JsonField<Timing>) = apply { this.timing = timing }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun useHeadlineAsSubject(useHeadlineAsSubject: Boolean) =
            useHeadlineAsSubject(JsonField.of(useHeadlineAsSubject))

        /**
         * Sets [Builder.useHeadlineAsSubject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useHeadlineAsSubject] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useHeadlineAsSubject(useHeadlineAsSubject: JsonField<Boolean>) = apply {
            this.useHeadlineAsSubject = useHeadlineAsSubject
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PublicRssEmailDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicRssEmailDetails =
            PublicRssEmailDetails(
                blogEmailType,
                blogImageMaxWidth,
                blogLayout,
                hubSpotBlogId,
                maxEntries,
                rssEntryTemplate,
                timing,
                url,
                useHeadlineAsSubject,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicRssEmailDetails = apply {
        if (validated) {
            return@apply
        }

        blogEmailType()
        blogImageMaxWidth()
        blogLayout().ifPresent { it.validate() }
        hubSpotBlogId()
        maxEntries()
        rssEntryTemplate()
        timing().ifPresent { it.validate() }
        url()
        useHeadlineAsSubject()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubSpotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (blogEmailType.asKnown().isPresent) 1 else 0) +
            (if (blogImageMaxWidth.asKnown().isPresent) 1 else 0) +
            (blogLayout.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hubSpotBlogId.asKnown().isPresent) 1 else 0) +
            (if (maxEntries.asKnown().isPresent) 1 else 0) +
            (if (rssEntryTemplate.asKnown().isPresent) 1 else 0) +
            (timing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (useHeadlineAsSubject.asKnown().isPresent) 1 else 0)

    class BlogLayout @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FULL_POST = of("FULL_POST")

            @JvmField val SUMMARY_NO_FEATURED_IMAGE = of("SUMMARY_NO_FEATURED_IMAGE")

            @JvmField val SUMMARY_WITH_FEATURED_IMAGE = of("SUMMARY_WITH_FEATURED_IMAGE")

            @JvmStatic fun of(value: String) = BlogLayout(JsonField.of(value))
        }

        /** An enum containing [BlogLayout]'s known values. */
        enum class Known {
            FULL_POST,
            SUMMARY_NO_FEATURED_IMAGE,
            SUMMARY_WITH_FEATURED_IMAGE,
        }

        /**
         * An enum containing [BlogLayout]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BlogLayout] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FULL_POST,
            SUMMARY_NO_FEATURED_IMAGE,
            SUMMARY_WITH_FEATURED_IMAGE,
            /**
             * An enum member indicating that [BlogLayout] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FULL_POST -> Value.FULL_POST
                SUMMARY_NO_FEATURED_IMAGE -> Value.SUMMARY_NO_FEATURED_IMAGE
                SUMMARY_WITH_FEATURED_IMAGE -> Value.SUMMARY_WITH_FEATURED_IMAGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FULL_POST -> Known.FULL_POST
                SUMMARY_NO_FEATURED_IMAGE -> Known.SUMMARY_NO_FEATURED_IMAGE
                SUMMARY_WITH_FEATURED_IMAGE -> Known.SUMMARY_WITH_FEATURED_IMAGE
                else -> throw HubSpotInvalidDataException("Unknown BlogLayout: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): BlogLayout = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubSpotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BlogLayout && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Timing
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Timing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Timing]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(timing: Timing) = apply {
                additionalProperties = timing.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Timing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Timing = Timing(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Timing = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubSpotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Timing && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Timing{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicRssEmailDetails &&
            blogEmailType == other.blogEmailType &&
            blogImageMaxWidth == other.blogImageMaxWidth &&
            blogLayout == other.blogLayout &&
            hubSpotBlogId == other.hubSpotBlogId &&
            maxEntries == other.maxEntries &&
            rssEntryTemplate == other.rssEntryTemplate &&
            timing == other.timing &&
            url == other.url &&
            useHeadlineAsSubject == other.useHeadlineAsSubject &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            blogEmailType,
            blogImageMaxWidth,
            blogLayout,
            hubSpotBlogId,
            maxEntries,
            rssEntryTemplate,
            timing,
            url,
            useHeadlineAsSubject,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicRssEmailDetails{blogEmailType=$blogEmailType, blogImageMaxWidth=$blogImageMaxWidth, blogLayout=$blogLayout, hubSpotBlogId=$hubSpotBlogId, maxEntries=$maxEntries, rssEntryTemplate=$rssEntryTemplate, timing=$timing, url=$url, useHeadlineAsSubject=$useHeadlineAsSubject, additionalProperties=$additionalProperties}"
}
