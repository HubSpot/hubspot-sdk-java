// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings.advanced

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.scheduler.meetings.ExternalCalendarMeetingEventCreateRequest
import java.util.Objects

/**
 * Create a new calendar event and meeting object by providing the necessary details such as
 * associations, email reminders, meeting object properties, and timezone.
 */
class AdvancedCreateParams
private constructor(
    private val organizerUserId: String,
    private val externalCalendarMeetingEventCreateRequest:
        ExternalCalendarMeetingEventCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun organizerUserId(): String = organizerUserId

    fun externalCalendarMeetingEventCreateRequest(): ExternalCalendarMeetingEventCreateRequest =
        externalCalendarMeetingEventCreateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        externalCalendarMeetingEventCreateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdvancedCreateParams].
         *
         * The following fields are required:
         * ```java
         * .organizerUserId()
         * .externalCalendarMeetingEventCreateRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdvancedCreateParams]. */
    class Builder internal constructor() {

        private var organizerUserId: String? = null
        private var externalCalendarMeetingEventCreateRequest:
            ExternalCalendarMeetingEventCreateRequest? =
            null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(advancedCreateParams: AdvancedCreateParams) = apply {
            organizerUserId = advancedCreateParams.organizerUserId
            externalCalendarMeetingEventCreateRequest =
                advancedCreateParams.externalCalendarMeetingEventCreateRequest
            additionalHeaders = advancedCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = advancedCreateParams.additionalQueryParams.toBuilder()
        }

        fun organizerUserId(organizerUserId: String) = apply {
            this.organizerUserId = organizerUserId
        }

        fun externalCalendarMeetingEventCreateRequest(
            externalCalendarMeetingEventCreateRequest: ExternalCalendarMeetingEventCreateRequest
        ) = apply {
            this.externalCalendarMeetingEventCreateRequest =
                externalCalendarMeetingEventCreateRequest
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
         * Returns an immutable instance of [AdvancedCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .organizerUserId()
         * .externalCalendarMeetingEventCreateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdvancedCreateParams =
            AdvancedCreateParams(
                checkRequired("organizerUserId", organizerUserId),
                checkRequired(
                    "externalCalendarMeetingEventCreateRequest",
                    externalCalendarMeetingEventCreateRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ExternalCalendarMeetingEventCreateRequest =
        externalCalendarMeetingEventCreateRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("organizerUserId", organizerUserId)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdvancedCreateParams &&
            organizerUserId == other.organizerUserId &&
            externalCalendarMeetingEventCreateRequest ==
                other.externalCalendarMeetingEventCreateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            organizerUserId,
            externalCalendarMeetingEventCreateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AdvancedCreateParams{organizerUserId=$organizerUserId, externalCalendarMeetingEventCreateRequest=$externalCalendarMeetingEventCreateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
