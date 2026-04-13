// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects

/** Create a custom event definition. */
class DefinitionCreateParams
private constructor(
    private val externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalBehavioralEventTypeDefinitionEgg(): ExternalBehavioralEventTypeDefinitionEgg =
        externalBehavioralEventTypeDefinitionEgg

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        externalBehavioralEventTypeDefinitionEgg._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DefinitionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .externalBehavioralEventTypeDefinitionEgg()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefinitionCreateParams]. */
    class Builder internal constructor() {

        private var externalBehavioralEventTypeDefinitionEgg:
            ExternalBehavioralEventTypeDefinitionEgg? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(definitionCreateParams: DefinitionCreateParams) = apply {
            externalBehavioralEventTypeDefinitionEgg =
                definitionCreateParams.externalBehavioralEventTypeDefinitionEgg
            additionalHeaders = definitionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = definitionCreateParams.additionalQueryParams.toBuilder()
        }

        fun externalBehavioralEventTypeDefinitionEgg(
            externalBehavioralEventTypeDefinitionEgg: ExternalBehavioralEventTypeDefinitionEgg
        ) = apply {
            this.externalBehavioralEventTypeDefinitionEgg = externalBehavioralEventTypeDefinitionEgg
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
         * Returns an immutable instance of [DefinitionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalBehavioralEventTypeDefinitionEgg()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DefinitionCreateParams =
            DefinitionCreateParams(
                checkRequired(
                    "externalBehavioralEventTypeDefinitionEgg",
                    externalBehavioralEventTypeDefinitionEgg,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ExternalBehavioralEventTypeDefinitionEgg = externalBehavioralEventTypeDefinitionEgg

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DefinitionCreateParams &&
            externalBehavioralEventTypeDefinitionEgg ==
                other.externalBehavioralEventTypeDefinitionEgg &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            externalBehavioralEventTypeDefinitionEgg,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DefinitionCreateParams{externalBehavioralEventTypeDefinitionEgg=$externalBehavioralEventTypeDefinitionEgg, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
