// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline.tokens

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateTokenUpdateRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an event type template token, specified by token name. */
class TokenUpdateParams
private constructor(
    private val appId: Int,
    private val eventTemplateId: String,
    private val tokenName: String?,
    private val timelineEventTemplateTokenUpdateRequest: TimelineEventTemplateTokenUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun eventTemplateId(): String = eventTemplateId

    fun tokenName(): Optional<String> = Optional.ofNullable(tokenName)

    /** State of the token definition for update requests. */
    fun timelineEventTemplateTokenUpdateRequest(): TimelineEventTemplateTokenUpdateRequest =
        timelineEventTemplateTokenUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        timelineEventTemplateTokenUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .eventTemplateId()
         * .timelineEventTemplateTokenUpdateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenUpdateParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var eventTemplateId: String? = null
        private var tokenName: String? = null
        private var timelineEventTemplateTokenUpdateRequest:
            TimelineEventTemplateTokenUpdateRequest? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenUpdateParams: TokenUpdateParams) = apply {
            appId = tokenUpdateParams.appId
            eventTemplateId = tokenUpdateParams.eventTemplateId
            tokenName = tokenUpdateParams.tokenName
            timelineEventTemplateTokenUpdateRequest =
                tokenUpdateParams.timelineEventTemplateTokenUpdateRequest
            additionalHeaders = tokenUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenUpdateParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun eventTemplateId(eventTemplateId: String) = apply {
            this.eventTemplateId = eventTemplateId
        }

        fun tokenName(tokenName: String?) = apply { this.tokenName = tokenName }

        /** Alias for calling [Builder.tokenName] with `tokenName.orElse(null)`. */
        fun tokenName(tokenName: Optional<String>) = tokenName(tokenName.getOrNull())

        /** State of the token definition for update requests. */
        fun timelineEventTemplateTokenUpdateRequest(
            timelineEventTemplateTokenUpdateRequest: TimelineEventTemplateTokenUpdateRequest
        ) = apply {
            this.timelineEventTemplateTokenUpdateRequest = timelineEventTemplateTokenUpdateRequest
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
         * Returns an immutable instance of [TokenUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .eventTemplateId()
         * .timelineEventTemplateTokenUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenUpdateParams =
            TokenUpdateParams(
                checkRequired("appId", appId),
                checkRequired("eventTemplateId", eventTemplateId),
                tokenName,
                checkRequired(
                    "timelineEventTemplateTokenUpdateRequest",
                    timelineEventTemplateTokenUpdateRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): TimelineEventTemplateTokenUpdateRequest = timelineEventTemplateTokenUpdateRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> eventTemplateId
            2 -> tokenName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenUpdateParams &&
            appId == other.appId &&
            eventTemplateId == other.eventTemplateId &&
            tokenName == other.tokenName &&
            timelineEventTemplateTokenUpdateRequest ==
                other.timelineEventTemplateTokenUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            eventTemplateId,
            tokenName,
            timelineEventTemplateTokenUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TokenUpdateParams{appId=$appId, eventTemplateId=$eventTemplateId, tokenName=$tokenName, timelineEventTemplateTokenUpdateRequest=$timelineEventTemplateTokenUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
