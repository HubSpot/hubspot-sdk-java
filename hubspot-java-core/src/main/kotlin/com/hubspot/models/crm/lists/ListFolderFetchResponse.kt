// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ListFolderFetchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val folder: JsonField<PublicListFolder>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("folder")
        @ExcludeMissing
        folder: JsonField<PublicListFolder> = JsonMissing.of()
    ) : this(folder, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun folder(): PublicListFolder = folder.getRequired("folder")

    /**
     * Returns the raw JSON value of [folder].
     *
     * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonField<PublicListFolder> = folder

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
         * Returns a mutable builder for constructing an instance of [ListFolderFetchResponse].
         *
         * The following fields are required:
         * ```java
         * .folder()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListFolderFetchResponse]. */
    class Builder internal constructor() {

        private var folder: JsonField<PublicListFolder>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listFolderFetchResponse: ListFolderFetchResponse) = apply {
            folder = listFolderFetchResponse.folder
            additionalProperties = listFolderFetchResponse.additionalProperties.toMutableMap()
        }

        fun folder(folder: PublicListFolder) = folder(JsonField.of(folder))

        /**
         * Sets [Builder.folder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folder] with a well-typed [PublicListFolder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun folder(folder: JsonField<PublicListFolder>) = apply { this.folder = folder }

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
         * Returns an immutable instance of [ListFolderFetchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .folder()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListFolderFetchResponse =
            ListFolderFetchResponse(
                checkRequired("folder", folder),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListFolderFetchResponse = apply {
        if (validated) {
            return@apply
        }

        folder().validate()
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
    @JvmSynthetic internal fun validity(): Int = (folder.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListFolderFetchResponse &&
            folder == other.folder &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(folder, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListFolderFetchResponse{folder=$folder, additionalProperties=$additionalProperties}"
}
