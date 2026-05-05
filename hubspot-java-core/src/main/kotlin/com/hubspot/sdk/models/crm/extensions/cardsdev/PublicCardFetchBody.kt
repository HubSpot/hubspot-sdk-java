// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicCardFetchBody
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectTypes: JsonField<List<CardObjectTypeBody>>,
    private val targetUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectTypes")
        @ExcludeMissing
        objectTypes: JsonField<List<CardObjectTypeBody>> = JsonMissing.of(),
        @JsonProperty("targetUrl") @ExcludeMissing targetUrl: JsonField<String> = JsonMissing.of(),
    ) : this(objectTypes, targetUrl, mutableMapOf())

    /**
     * An array of CRM object types where this card should be displayed. HubSpot will call your
     * target URL whenever a user visits a record page of the types defined here.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypes(): List<CardObjectTypeBody> = objectTypes.getRequired("objectTypes")

    /**
     * URL to a service endpoint that will respond with details for this card. HubSpot will call
     * this endpoint each time a user visits a CRM record page where this card should be displayed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetUrl(): String = targetUrl.getRequired("targetUrl")

    /**
     * Returns the raw JSON value of [objectTypes].
     *
     * Unlike [objectTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypes")
    @ExcludeMissing
    fun _objectTypes(): JsonField<List<CardObjectTypeBody>> = objectTypes

    /**
     * Returns the raw JSON value of [targetUrl].
     *
     * Unlike [targetUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetUrl") @ExcludeMissing fun _targetUrl(): JsonField<String> = targetUrl

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
         * Returns a mutable builder for constructing an instance of [PublicCardFetchBody].
         *
         * The following fields are required:
         * ```java
         * .objectTypes()
         * .targetUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicCardFetchBody]. */
    class Builder internal constructor() {

        private var objectTypes: JsonField<MutableList<CardObjectTypeBody>>? = null
        private var targetUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicCardFetchBody: PublicCardFetchBody) = apply {
            objectTypes = publicCardFetchBody.objectTypes.map { it.toMutableList() }
            targetUrl = publicCardFetchBody.targetUrl
            additionalProperties = publicCardFetchBody.additionalProperties.toMutableMap()
        }

        /**
         * An array of CRM object types where this card should be displayed. HubSpot will call your
         * target URL whenever a user visits a record page of the types defined here.
         */
        fun objectTypes(objectTypes: List<CardObjectTypeBody>) =
            objectTypes(JsonField.of(objectTypes))

        /**
         * Sets [Builder.objectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypes] with a well-typed
         * `List<CardObjectTypeBody>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun objectTypes(objectTypes: JsonField<List<CardObjectTypeBody>>) = apply {
            this.objectTypes = objectTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [CardObjectTypeBody] to [objectTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectType(objectType: CardObjectTypeBody) = apply {
            objectTypes =
                (objectTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectTypes", it).add(objectType)
                }
        }

        /**
         * URL to a service endpoint that will respond with details for this card. HubSpot will call
         * this endpoint each time a user visits a CRM record page where this card should be
         * displayed.
         */
        fun targetUrl(targetUrl: String) = targetUrl(JsonField.of(targetUrl))

        /**
         * Sets [Builder.targetUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetUrl(targetUrl: JsonField<String>) = apply { this.targetUrl = targetUrl }

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
         * Returns an immutable instance of [PublicCardFetchBody].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectTypes()
         * .targetUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicCardFetchBody =
            PublicCardFetchBody(
                checkRequired("objectTypes", objectTypes).map { it.toImmutable() },
                checkRequired("targetUrl", targetUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PublicCardFetchBody = apply {
        if (validated) {
            return@apply
        }

        objectTypes().forEach { it.validate() }
        targetUrl()
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
        (objectTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (targetUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicCardFetchBody &&
            objectTypes == other.objectTypes &&
            targetUrl == other.targetUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(objectTypes, targetUrl, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicCardFetchBody{objectTypes=$objectTypes, targetUrl=$targetUrl, additionalProperties=$additionalProperties}"
}
