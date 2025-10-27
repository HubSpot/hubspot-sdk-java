// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiStaticBranch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val branchValue: JsonField<String>,
    private val connection: JsonField<ApiConnection>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("branchValue")
        @ExcludeMissing
        branchValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection")
        @ExcludeMissing
        connection: JsonField<ApiConnection> = JsonMissing.of(),
    ) : this(branchValue, connection, mutableMapOf())

    /**
     * If value to check for. If the value of the `inputValue` matches this `branchValue` than this
     * `connection` will get traversed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun branchValue(): String = branchValue.getRequired("branchValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connection(): Optional<ApiConnection> = connection.getOptional("connection")

    /**
     * Returns the raw JSON value of [branchValue].
     *
     * Unlike [branchValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branchValue") @ExcludeMissing fun _branchValue(): JsonField<String> = branchValue

    /**
     * Returns the raw JSON value of [connection].
     *
     * Unlike [connection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection")
    @ExcludeMissing
    fun _connection(): JsonField<ApiConnection> = connection

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
         * Returns a mutable builder for constructing an instance of [ApiStaticBranch].
         *
         * The following fields are required:
         * ```java
         * .branchValue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiStaticBranch]. */
    class Builder internal constructor() {

        private var branchValue: JsonField<String>? = null
        private var connection: JsonField<ApiConnection> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiStaticBranch: ApiStaticBranch) = apply {
            branchValue = apiStaticBranch.branchValue
            connection = apiStaticBranch.connection
            additionalProperties = apiStaticBranch.additionalProperties.toMutableMap()
        }

        /**
         * If value to check for. If the value of the `inputValue` matches this `branchValue` than
         * this `connection` will get traversed.
         */
        fun branchValue(branchValue: String) = branchValue(JsonField.of(branchValue))

        /**
         * Sets [Builder.branchValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branchValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun branchValue(branchValue: JsonField<String>) = apply { this.branchValue = branchValue }

        fun connection(connection: ApiConnection) = connection(JsonField.of(connection))

        /**
         * Sets [Builder.connection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connection] with a well-typed [ApiConnection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connection(connection: JsonField<ApiConnection>) = apply {
            this.connection = connection
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
         * Returns an immutable instance of [ApiStaticBranch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .branchValue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiStaticBranch =
            ApiStaticBranch(
                checkRequired("branchValue", branchValue),
                connection,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiStaticBranch = apply {
        if (validated) {
            return@apply
        }

        branchValue()
        connection().ifPresent { it.validate() }
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
        (if (branchValue.asKnown().isPresent) 1 else 0) +
            (connection.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiStaticBranch &&
            branchValue == other.branchValue &&
            connection == other.connection &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(branchValue, connection, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiStaticBranch{branchValue=$branchValue, connection=$connection, additionalProperties=$additionalProperties}"
}
