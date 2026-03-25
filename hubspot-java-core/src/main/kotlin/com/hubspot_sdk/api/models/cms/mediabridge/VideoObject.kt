// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class VideoObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Int>,
    private val deeplinkUrl: JsonField<String>,
    private val fileId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("deeplinkUrl")
        @ExcludeMissing
        deeplinkUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileId") @ExcludeMissing fileId: JsonField<Int> = JsonMissing.of(),
    ) : this(id, deeplinkUrl, fileId, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Int = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deeplinkUrl(): String = deeplinkUrl.getRequired("deeplinkUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): Int = fileId.getRequired("fileId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Int> = id

    /**
     * Returns the raw JSON value of [deeplinkUrl].
     *
     * Unlike [deeplinkUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deeplinkUrl") @ExcludeMissing fun _deeplinkUrl(): JsonField<String> = deeplinkUrl

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileId") @ExcludeMissing fun _fileId(): JsonField<Int> = fileId

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

        /**
         * Returns a mutable builder for constructing an instance of [VideoObject].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .deeplinkUrl()
         * .fileId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VideoObject]. */
    class Builder internal constructor() {

        private var id: JsonField<Int>? = null
        private var deeplinkUrl: JsonField<String>? = null
        private var fileId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(videoObject: VideoObject) = apply {
            id = videoObject.id
            deeplinkUrl = videoObject.deeplinkUrl
            fileId = videoObject.fileId
            additionalProperties = videoObject.additionalProperties.toMutableMap()
        }

        fun id(id: Int) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Int>) = apply { this.id = id }

        fun deeplinkUrl(deeplinkUrl: String) = deeplinkUrl(JsonField.of(deeplinkUrl))

        /**
         * Sets [Builder.deeplinkUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deeplinkUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deeplinkUrl(deeplinkUrl: JsonField<String>) = apply { this.deeplinkUrl = deeplinkUrl }

        fun fileId(fileId: Int) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<Int>) = apply { this.fileId = fileId }

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
         * Returns an immutable instance of [VideoObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .deeplinkUrl()
         * .fileId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VideoObject =
            VideoObject(
                checkRequired("id", id),
                checkRequired("deeplinkUrl", deeplinkUrl),
                checkRequired("fileId", fileId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VideoObject = apply {
        if (validated) {
            return@apply
        }

        id()
        deeplinkUrl()
        fileId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (deeplinkUrl.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VideoObject &&
            id == other.id &&
            deeplinkUrl == other.deeplinkUrl &&
            fileId == other.fileId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, deeplinkUrl, fileId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VideoObject{id=$id, deeplinkUrl=$deeplinkUrl, fileId=$fileId, additionalProperties=$additionalProperties}"
}
