// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.attendance

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventSubscriber
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Records the participation of multiple HubSpot contacts in a Marketing Event using their HubSpot
 * contact IDs.
 *
 * Additional Functionality:
 * - Adds a timeline event to the contacts.
 *
 * Allowed Properties: For the state "attend":
 * - joinedAt
 * - leftAt
 */
class AttendanceCreateByEventIdAndContactIdParams
private constructor(
    private val objectId: String,
    private val subscriberState: String?,
    private val batchInputMarketingEventSubscriber: BatchInputMarketingEventSubscriber,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectId(): String = objectId

    fun subscriberState(): Optional<String> = Optional.ofNullable(subscriberState)

    fun batchInputMarketingEventSubscriber(): BatchInputMarketingEventSubscriber =
        batchInputMarketingEventSubscriber

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputMarketingEventSubscriber._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AttendanceCreateByEventIdAndContactIdParams].
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .batchInputMarketingEventSubscriber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttendanceCreateByEventIdAndContactIdParams]. */
    class Builder internal constructor() {

        private var objectId: String? = null
        private var subscriberState: String? = null
        private var batchInputMarketingEventSubscriber: BatchInputMarketingEventSubscriber? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            attendanceCreateByEventIdAndContactIdParams: AttendanceCreateByEventIdAndContactIdParams
        ) = apply {
            objectId = attendanceCreateByEventIdAndContactIdParams.objectId
            subscriberState = attendanceCreateByEventIdAndContactIdParams.subscriberState
            batchInputMarketingEventSubscriber =
                attendanceCreateByEventIdAndContactIdParams.batchInputMarketingEventSubscriber
            additionalHeaders =
                attendanceCreateByEventIdAndContactIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                attendanceCreateByEventIdAndContactIdParams.additionalQueryParams.toBuilder()
        }

        fun objectId(objectId: String) = apply { this.objectId = objectId }

        fun subscriberState(subscriberState: String?) = apply {
            this.subscriberState = subscriberState
        }

        /** Alias for calling [Builder.subscriberState] with `subscriberState.orElse(null)`. */
        fun subscriberState(subscriberState: Optional<String>) =
            subscriberState(subscriberState.getOrNull())

        fun batchInputMarketingEventSubscriber(
            batchInputMarketingEventSubscriber: BatchInputMarketingEventSubscriber
        ) = apply { this.batchInputMarketingEventSubscriber = batchInputMarketingEventSubscriber }

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
         * Returns an immutable instance of [AttendanceCreateByEventIdAndContactIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .batchInputMarketingEventSubscriber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttendanceCreateByEventIdAndContactIdParams =
            AttendanceCreateByEventIdAndContactIdParams(
                checkRequired("objectId", objectId),
                subscriberState,
                checkRequired(
                    "batchInputMarketingEventSubscriber",
                    batchInputMarketingEventSubscriber,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputMarketingEventSubscriber = batchInputMarketingEventSubscriber

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectId
            1 -> subscriberState ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttendanceCreateByEventIdAndContactIdParams &&
            objectId == other.objectId &&
            subscriberState == other.subscriberState &&
            batchInputMarketingEventSubscriber == other.batchInputMarketingEventSubscriber &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectId,
            subscriberState,
            batchInputMarketingEventSubscriber,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AttendanceCreateByEventIdAndContactIdParams{objectId=$objectId, subscriberState=$subscriberState, batchInputMarketingEventSubscriber=$batchInputMarketingEventSubscriber, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
