// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

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
import java.util.Optional

class MediaBridgeProviderPartial
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val updatedAt: JsonField<Long>,
    private val allowImportOnDisconnect: JsonField<Boolean>,
    private val moduleName: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("allowImportOnDisconnect")
        @ExcludeMissing
        allowImportOnDisconnect: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("moduleName")
        @ExcludeMissing
        moduleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(updatedAt, allowImportOnDisconnect, moduleName, name, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Long = updatedAt.getRequired("updatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowImportOnDisconnect(): Optional<Boolean> =
        allowImportOnDisconnect.getOptional("allowImportOnDisconnect")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun moduleName(): Optional<String> = moduleName.getOptional("moduleName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

    /**
     * Returns the raw JSON value of [allowImportOnDisconnect].
     *
     * Unlike [allowImportOnDisconnect], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowImportOnDisconnect")
    @ExcludeMissing
    fun _allowImportOnDisconnect(): JsonField<Boolean> = allowImportOnDisconnect

    /**
     * Returns the raw JSON value of [moduleName].
     *
     * Unlike [moduleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("moduleName") @ExcludeMissing fun _moduleName(): JsonField<String> = moduleName

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [MediaBridgeProviderPartial].
         *
         * The following fields are required:
         * ```java
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaBridgeProviderPartial]. */
    class Builder internal constructor() {

        private var updatedAt: JsonField<Long>? = null
        private var allowImportOnDisconnect: JsonField<Boolean> = JsonMissing.of()
        private var moduleName: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mediaBridgeProviderPartial: MediaBridgeProviderPartial) = apply {
            updatedAt = mediaBridgeProviderPartial.updatedAt
            allowImportOnDisconnect = mediaBridgeProviderPartial.allowImportOnDisconnect
            moduleName = mediaBridgeProviderPartial.moduleName
            name = mediaBridgeProviderPartial.name
            additionalProperties = mediaBridgeProviderPartial.additionalProperties.toMutableMap()
        }

        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

        fun allowImportOnDisconnect(allowImportOnDisconnect: Boolean) =
            allowImportOnDisconnect(JsonField.of(allowImportOnDisconnect))

        /**
         * Sets [Builder.allowImportOnDisconnect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowImportOnDisconnect] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowImportOnDisconnect(allowImportOnDisconnect: JsonField<Boolean>) = apply {
            this.allowImportOnDisconnect = allowImportOnDisconnect
        }

        fun moduleName(moduleName: String) = moduleName(JsonField.of(moduleName))

        /**
         * Sets [Builder.moduleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.moduleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun moduleName(moduleName: JsonField<String>) = apply { this.moduleName = moduleName }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [MediaBridgeProviderPartial].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaBridgeProviderPartial =
            MediaBridgeProviderPartial(
                checkRequired("updatedAt", updatedAt),
                allowImportOnDisconnect,
                moduleName,
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MediaBridgeProviderPartial = apply {
        if (validated) {
            return@apply
        }

        updatedAt()
        allowImportOnDisconnect()
        moduleName()
        name()
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
        (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (allowImportOnDisconnect.asKnown().isPresent) 1 else 0) +
            (if (moduleName.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgeProviderPartial &&
            updatedAt == other.updatedAt &&
            allowImportOnDisconnect == other.allowImportOnDisconnect &&
            moduleName == other.moduleName &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(updatedAt, allowImportOnDisconnect, moduleName, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MediaBridgeProviderPartial{updatedAt=$updatedAt, allowImportOnDisconnect=$allowImportOnDisconnect, moduleName=$moduleName, name=$name, additionalProperties=$additionalProperties}"
}
