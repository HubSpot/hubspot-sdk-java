// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SubscriptionDefinitionsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val subscriptionDefinitions: JsonField<List<SubscriptionDefinition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("subscriptionDefinitions")
        @ExcludeMissing
        subscriptionDefinitions: JsonField<List<SubscriptionDefinition>> = JsonMissing.of()
    ) : this(subscriptionDefinitions, mutableMapOf())

    /**
     * A list of all subscription definitions.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionDefinitions(): List<SubscriptionDefinition> =
        subscriptionDefinitions.getRequired("subscriptionDefinitions")

    /**
     * Returns the raw JSON value of [subscriptionDefinitions].
     *
     * Unlike [subscriptionDefinitions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscriptionDefinitions")
    @ExcludeMissing
    fun _subscriptionDefinitions(): JsonField<List<SubscriptionDefinition>> =
        subscriptionDefinitions

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
         * [SubscriptionDefinitionsResponse].
         *
         * The following fields are required:
         * ```java
         * .subscriptionDefinitions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionDefinitionsResponse]. */
    class Builder internal constructor() {

        private var subscriptionDefinitions: JsonField<MutableList<SubscriptionDefinition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionDefinitionsResponse: SubscriptionDefinitionsResponse) =
            apply {
                subscriptionDefinitions =
                    subscriptionDefinitionsResponse.subscriptionDefinitions.map {
                        it.toMutableList()
                    }
                additionalProperties =
                    subscriptionDefinitionsResponse.additionalProperties.toMutableMap()
            }

        /** A list of all subscription definitions. */
        fun subscriptionDefinitions(subscriptionDefinitions: List<SubscriptionDefinition>) =
            subscriptionDefinitions(JsonField.of(subscriptionDefinitions))

        /**
         * Sets [Builder.subscriptionDefinitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionDefinitions] with a well-typed
         * `List<SubscriptionDefinition>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun subscriptionDefinitions(
            subscriptionDefinitions: JsonField<List<SubscriptionDefinition>>
        ) = apply {
            this.subscriptionDefinitions = subscriptionDefinitions.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubscriptionDefinition] to [subscriptionDefinitions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionDefinition(subscriptionDefinition: SubscriptionDefinition) = apply {
            subscriptionDefinitions =
                (subscriptionDefinitions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subscriptionDefinitions", it).add(subscriptionDefinition)
                }
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
         * Returns an immutable instance of [SubscriptionDefinitionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .subscriptionDefinitions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionDefinitionsResponse =
            SubscriptionDefinitionsResponse(
                checkRequired("subscriptionDefinitions", subscriptionDefinitions).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionDefinitionsResponse = apply {
        if (validated) {
            return@apply
        }

        subscriptionDefinitions().forEach { it.validate() }
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
        (subscriptionDefinitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionDefinitionsResponse &&
            subscriptionDefinitions == other.subscriptionDefinitions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(subscriptionDefinitions, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionDefinitionsResponse{subscriptionDefinitions=$subscriptionDefinitions, additionalProperties=$additionalProperties}"
}
