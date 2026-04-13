// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IntegratorOEmbedDomainRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endpoints: JsonField<Endpoints>,
    private val portalId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("endpoints")
        @ExcludeMissing
        endpoints: JsonField<Endpoints> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
    ) : this(endpoints, portalId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endpoints(): Endpoints = endpoints.getRequired("endpoints")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portalId(): Optional<Int> = portalId.getOptional("portalId")

    /**
     * Returns the raw JSON value of [endpoints].
     *
     * Unlike [endpoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endpoints") @ExcludeMissing fun _endpoints(): JsonField<Endpoints> = endpoints

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

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
         * Returns a mutable builder for constructing an instance of
         * [IntegratorOEmbedDomainRequest].
         *
         * The following fields are required:
         * ```java
         * .endpoints()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegratorOEmbedDomainRequest]. */
    class Builder internal constructor() {

        private var endpoints: JsonField<Endpoints>? = null
        private var portalId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(integratorOEmbedDomainRequest: IntegratorOEmbedDomainRequest) = apply {
            endpoints = integratorOEmbedDomainRequest.endpoints
            portalId = integratorOEmbedDomainRequest.portalId
            additionalProperties = integratorOEmbedDomainRequest.additionalProperties.toMutableMap()
        }

        fun endpoints(endpoints: Endpoints) = endpoints(JsonField.of(endpoints))

        /**
         * Sets [Builder.endpoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpoints] with a well-typed [Endpoints] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endpoints(endpoints: JsonField<Endpoints>) = apply { this.endpoints = endpoints }

        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

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
         * Returns an immutable instance of [IntegratorOEmbedDomainRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endpoints()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegratorOEmbedDomainRequest =
            IntegratorOEmbedDomainRequest(
                checkRequired("endpoints", endpoints),
                portalId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IntegratorOEmbedDomainRequest = apply {
        if (validated) {
            return@apply
        }

        endpoints().validate()
        portalId()
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
        (endpoints.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portalId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegratorOEmbedDomainRequest &&
            endpoints == other.endpoints &&
            portalId == other.portalId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(endpoints, portalId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegratorOEmbedDomainRequest{endpoints=$endpoints, portalId=$portalId, additionalProperties=$additionalProperties}"
}
