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
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class Endpoints
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val discovery: JsonField<Boolean>,
    private val schemes: JsonField<List<String>>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("discovery") @ExcludeMissing discovery: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("schemes")
        @ExcludeMissing
        schemes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(discovery, schemes, url, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discovery(): Boolean = discovery.getRequired("discovery")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun schemes(): List<String> = schemes.getRequired("schemes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Returns the raw JSON value of [discovery].
     *
     * Unlike [discovery], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discovery") @ExcludeMissing fun _discovery(): JsonField<Boolean> = discovery

    /**
     * Returns the raw JSON value of [schemes].
     *
     * Unlike [schemes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schemes") @ExcludeMissing fun _schemes(): JsonField<List<String>> = schemes

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [Endpoints].
         *
         * The following fields are required:
         * ```java
         * .discovery()
         * .schemes()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Endpoints]. */
    class Builder internal constructor() {

        private var discovery: JsonField<Boolean>? = null
        private var schemes: JsonField<MutableList<String>>? = null
        private var url: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(endpoints: Endpoints) = apply {
            discovery = endpoints.discovery
            schemes = endpoints.schemes.map { it.toMutableList() }
            url = endpoints.url
            additionalProperties = endpoints.additionalProperties.toMutableMap()
        }

        fun discovery(discovery: Boolean) = discovery(JsonField.of(discovery))

        /**
         * Sets [Builder.discovery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discovery] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discovery(discovery: JsonField<Boolean>) = apply { this.discovery = discovery }

        fun schemes(schemes: List<String>) = schemes(JsonField.of(schemes))

        /**
         * Sets [Builder.schemes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schemes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun schemes(schemes: JsonField<List<String>>) = apply {
            this.schemes = schemes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [schemes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScheme(scheme: String) = apply {
            schemes =
                (schemes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("schemes", it).add(scheme)
                }
        }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [Endpoints].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .discovery()
         * .schemes()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Endpoints =
            Endpoints(
                checkRequired("discovery", discovery),
                checkRequired("schemes", schemes).map { it.toImmutable() },
                checkRequired("url", url),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Endpoints = apply {
        if (validated) {
            return@apply
        }

        discovery()
        schemes()
        url()
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
        (if (discovery.asKnown().isPresent) 1 else 0) +
            (schemes.asKnown().getOrNull()?.size ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Endpoints &&
            discovery == other.discovery &&
            schemes == other.schemes &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(discovery, schemes, url, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Endpoints{discovery=$discovery, schemes=$schemes, url=$url, additionalProperties=$additionalProperties}"
}
