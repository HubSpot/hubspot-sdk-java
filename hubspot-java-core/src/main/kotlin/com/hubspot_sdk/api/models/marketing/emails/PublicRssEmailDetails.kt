// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** RSS related data if it is a blog or rss email. */
class PublicRssEmailDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val blogEmailType: JsonField<String>,
    private val blogImageMaxWidth: JsonField<Int>,
    private val blogLayout: JsonField<String>,
    private val hubspotBlogId: JsonField<String>,
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
        blogLayout: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hubspotBlogId")
        @ExcludeMissing
        hubspotBlogId: JsonField<String> = JsonMissing.of(),
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
        hubspotBlogId,
        maxEntries,
        rssEntryTemplate,
        timing,
        url,
        useHeadlineAsSubject,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blogEmailType(): Optional<String> = blogEmailType.getOptional("blogEmailType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blogImageMaxWidth(): Optional<Int> = blogImageMaxWidth.getOptional("blogImageMaxWidth")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blogLayout(): Optional<String> = blogLayout.getOptional("blogLayout")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubspotBlogId(): Optional<String> = hubspotBlogId.getOptional("hubspotBlogId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxEntries(): Optional<Int> = maxEntries.getOptional("maxEntries")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rssEntryTemplate(): Optional<String> = rssEntryTemplate.getOptional("rssEntryTemplate")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timing(): Optional<Timing> = timing.getOptional("timing")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
    @JsonProperty("blogLayout") @ExcludeMissing fun _blogLayout(): JsonField<String> = blogLayout

    /**
     * Returns the raw JSON value of [hubspotBlogId].
     *
     * Unlike [hubspotBlogId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspotBlogId")
    @ExcludeMissing
    fun _hubspotBlogId(): JsonField<String> = hubspotBlogId

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
        private var blogLayout: JsonField<String> = JsonMissing.of()
        private var hubspotBlogId: JsonField<String> = JsonMissing.of()
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
            hubspotBlogId = publicRssEmailDetails.hubspotBlogId
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

        fun blogLayout(blogLayout: String) = blogLayout(JsonField.of(blogLayout))

        /**
         * Sets [Builder.blogLayout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blogLayout] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun blogLayout(blogLayout: JsonField<String>) = apply { this.blogLayout = blogLayout }

        fun hubspotBlogId(hubspotBlogId: String) = hubspotBlogId(JsonField.of(hubspotBlogId))

        /**
         * Sets [Builder.hubspotBlogId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubspotBlogId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hubspotBlogId(hubspotBlogId: JsonField<String>) = apply {
            this.hubspotBlogId = hubspotBlogId
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
                hubspotBlogId,
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
        blogLayout()
        hubspotBlogId()
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
        } catch (e: HubspotInvalidDataException) {
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
            (if (blogLayout.asKnown().isPresent) 1 else 0) +
            (if (hubspotBlogId.asKnown().isPresent) 1 else 0) +
            (if (maxEntries.asKnown().isPresent) 1 else 0) +
            (if (rssEntryTemplate.asKnown().isPresent) 1 else 0) +
            (timing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (useHeadlineAsSubject.asKnown().isPresent) 1 else 0)

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
            } catch (e: HubspotInvalidDataException) {
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
            hubspotBlogId == other.hubspotBlogId &&
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
            hubspotBlogId,
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
        "PublicRssEmailDetails{blogEmailType=$blogEmailType, blogImageMaxWidth=$blogImageMaxWidth, blogLayout=$blogLayout, hubspotBlogId=$hubspotBlogId, maxEntries=$maxEntries, rssEntryTemplate=$rssEntryTemplate, timing=$timing, url=$url, useHeadlineAsSubject=$useHeadlineAsSubject, additionalProperties=$additionalProperties}"
}
