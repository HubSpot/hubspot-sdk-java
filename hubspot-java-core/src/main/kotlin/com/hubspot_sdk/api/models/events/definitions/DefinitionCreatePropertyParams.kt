// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new property for an existing event definition. */
class DefinitionCreatePropertyParams
private constructor(
    private val eventName: String?,
    private val externalBehavioralEventPropertyCreate: ExternalBehavioralEventPropertyCreate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun eventName(): Optional<String> = Optional.ofNullable(eventName)

    fun externalBehavioralEventPropertyCreate(): ExternalBehavioralEventPropertyCreate =
        externalBehavioralEventPropertyCreate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        externalBehavioralEventPropertyCreate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DefinitionCreatePropertyParams].
         *
         * The following fields are required:
         * ```java
         * .externalBehavioralEventPropertyCreate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefinitionCreatePropertyParams]. */
    class Builder internal constructor() {

        private var eventName: String? = null
        private var externalBehavioralEventPropertyCreate: ExternalBehavioralEventPropertyCreate? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(definitionCreatePropertyParams: DefinitionCreatePropertyParams) = apply {
            eventName = definitionCreatePropertyParams.eventName
            externalBehavioralEventPropertyCreate =
                definitionCreatePropertyParams.externalBehavioralEventPropertyCreate
            additionalHeaders = definitionCreatePropertyParams.additionalHeaders.toBuilder()
            additionalQueryParams = definitionCreatePropertyParams.additionalQueryParams.toBuilder()
        }

        fun eventName(eventName: String?) = apply { this.eventName = eventName }

        /** Alias for calling [Builder.eventName] with `eventName.orElse(null)`. */
        fun eventName(eventName: Optional<String>) = eventName(eventName.getOrNull())

        fun externalBehavioralEventPropertyCreate(
            externalBehavioralEventPropertyCreate: ExternalBehavioralEventPropertyCreate
        ) = apply {
            this.externalBehavioralEventPropertyCreate = externalBehavioralEventPropertyCreate
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
         * Returns an immutable instance of [DefinitionCreatePropertyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalBehavioralEventPropertyCreate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DefinitionCreatePropertyParams =
            DefinitionCreatePropertyParams(
                eventName,
                checkRequired(
                    "externalBehavioralEventPropertyCreate",
                    externalBehavioralEventPropertyCreate,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ExternalBehavioralEventPropertyCreate = externalBehavioralEventPropertyCreate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> eventName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DefinitionCreatePropertyParams &&
            eventName == other.eventName &&
            externalBehavioralEventPropertyCreate == other.externalBehavioralEventPropertyCreate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            eventName,
            externalBehavioralEventPropertyCreate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DefinitionCreatePropertyParams{eventName=$eventName, externalBehavioralEventPropertyCreate=$externalBehavioralEventPropertyCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
