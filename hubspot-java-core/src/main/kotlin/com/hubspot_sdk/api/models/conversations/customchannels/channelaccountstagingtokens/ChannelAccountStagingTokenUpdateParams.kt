// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a channel account staging token's account name and delivery identifier. This information
 * will be applied to the channel account created from this staging token. This is used for public
 * apps.
 */
class ChannelAccountStagingTokenUpdateParams
private constructor(
    private val channelId: String,
    private val accountToken: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun channelId(): String = channelId

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountName(): String = body.accountName()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deliveryIdentifier(): PublicDeliveryIdentifier = body.deliveryIdentifier()

    /**
     * Returns the raw JSON value of [accountName].
     *
     * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountName(): JsonField<String> = body._accountName()

    /**
     * Returns the raw JSON value of [deliveryIdentifier].
     *
     * Unlike [deliveryIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _deliveryIdentifier(): JsonField<PublicDeliveryIdentifier> = body._deliveryIdentifier()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ChannelAccountStagingTokenUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .channelId()
         * .accountName()
         * .deliveryIdentifier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelAccountStagingTokenUpdateParams]. */
    class Builder internal constructor() {

        private var channelId: String? = null
        private var accountToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            channelAccountStagingTokenUpdateParams: ChannelAccountStagingTokenUpdateParams
        ) = apply {
            channelId = channelAccountStagingTokenUpdateParams.channelId
            accountToken = channelAccountStagingTokenUpdateParams.accountToken
            body = channelAccountStagingTokenUpdateParams.body.toBuilder()
            additionalHeaders = channelAccountStagingTokenUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                channelAccountStagingTokenUpdateParams.additionalQueryParams.toBuilder()
        }

        fun channelId(channelId: String) = apply { this.channelId = channelId }

        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** Alias for calling [Builder.accountToken] with `accountToken.orElse(null)`. */
        fun accountToken(accountToken: Optional<String>) = accountToken(accountToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountName]
         * - [deliveryIdentifier]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun accountName(accountName: String) = apply { body.accountName(accountName) }

        /**
         * Sets [Builder.accountName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountName(accountName: JsonField<String>) = apply { body.accountName(accountName) }

        fun deliveryIdentifier(deliveryIdentifier: PublicDeliveryIdentifier) = apply {
            body.deliveryIdentifier(deliveryIdentifier)
        }

        /**
         * Sets [Builder.deliveryIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryIdentifier] with a well-typed
         * [PublicDeliveryIdentifier] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun deliveryIdentifier(deliveryIdentifier: JsonField<PublicDeliveryIdentifier>) = apply {
            body.deliveryIdentifier(deliveryIdentifier)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ChannelAccountStagingTokenUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channelId()
         * .accountName()
         * .deliveryIdentifier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelAccountStagingTokenUpdateParams =
            ChannelAccountStagingTokenUpdateParams(
                checkRequired("channelId", channelId),
                accountToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> channelId
            1 -> accountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountName: JsonField<String>,
        private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountName")
            @ExcludeMissing
            accountName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deliveryIdentifier")
            @ExcludeMissing
            deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
        ) : this(accountName, deliveryIdentifier, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountName(): String = accountName.getRequired("accountName")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryIdentifier(): PublicDeliveryIdentifier =
            deliveryIdentifier.getRequired("deliveryIdentifier")

        /**
         * Returns the raw JSON value of [accountName].
         *
         * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountName")
        @ExcludeMissing
        fun _accountName(): JsonField<String> = accountName

        /**
         * Returns the raw JSON value of [deliveryIdentifier].
         *
         * Unlike [deliveryIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        fun _deliveryIdentifier(): JsonField<PublicDeliveryIdentifier> = deliveryIdentifier

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountName()
             * .deliveryIdentifier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountName: JsonField<String>? = null
            private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountName = body.accountName
                deliveryIdentifier = body.deliveryIdentifier
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun accountName(accountName: String) = accountName(JsonField.of(accountName))

            /**
             * Sets [Builder.accountName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            fun deliveryIdentifier(deliveryIdentifier: PublicDeliveryIdentifier) =
                deliveryIdentifier(JsonField.of(deliveryIdentifier))

            /**
             * Sets [Builder.deliveryIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryIdentifier] with a well-typed
             * [PublicDeliveryIdentifier] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun deliveryIdentifier(deliveryIdentifier: JsonField<PublicDeliveryIdentifier>) =
                apply {
                    this.deliveryIdentifier = deliveryIdentifier
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountName()
             * .deliveryIdentifier()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountName", accountName),
                    checkRequired("deliveryIdentifier", deliveryIdentifier),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountName()
            deliveryIdentifier().validate()
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
            (if (accountName.asKnown().isPresent) 1 else 0) +
                (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountName == other.accountName &&
                deliveryIdentifier == other.deliveryIdentifier &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountName, deliveryIdentifier, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountName=$accountName, deliveryIdentifier=$deliveryIdentifier, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelAccountStagingTokenUpdateParams &&
            channelId == other.channelId &&
            accountToken == other.accountToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(channelId, accountToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChannelAccountStagingTokenUpdateParams{channelId=$channelId, accountToken=$accountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
