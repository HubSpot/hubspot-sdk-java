// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.participations

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Read Marketing event's participations breakdown with optional filters by internal identifier
 * marketingEventId.
 */
class ParticipationListBreakdownByIdParams
private constructor(
    private val marketingEventId: Long?,
    private val after: String?,
    private val contactIdentifier: String?,
    private val limit: Int?,
    private val state: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun marketingEventId(): Optional<Long> = Optional.ofNullable(marketingEventId)

    /** The cursor indicating the position of the last retrieved item. */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** The identifier of the Contact. It may be email or internal id. */
    fun contactIdentifier(): Optional<String> = Optional.ofNullable(contactIdentifier)

    /** The limit for response size. The default value is 10, the max number is 100 */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** The participation state value. It may be REGISTERED, CANCELLED, ATTENDED, NO_SHOW */
    fun state(): Optional<String> = Optional.ofNullable(state)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ParticipationListBreakdownByIdParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipationListBreakdownByIdParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipationListBreakdownByIdParams]. */
    class Builder internal constructor() {

        private var marketingEventId: Long? = null
        private var after: String? = null
        private var contactIdentifier: String? = null
        private var limit: Int? = null
        private var state: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            participationListBreakdownByIdParams: ParticipationListBreakdownByIdParams
        ) = apply {
            marketingEventId = participationListBreakdownByIdParams.marketingEventId
            after = participationListBreakdownByIdParams.after
            contactIdentifier = participationListBreakdownByIdParams.contactIdentifier
            limit = participationListBreakdownByIdParams.limit
            state = participationListBreakdownByIdParams.state
            additionalHeaders = participationListBreakdownByIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                participationListBreakdownByIdParams.additionalQueryParams.toBuilder()
        }

        fun marketingEventId(marketingEventId: Long?) = apply {
            this.marketingEventId = marketingEventId
        }

        /**
         * Alias for [Builder.marketingEventId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun marketingEventId(marketingEventId: Long) = marketingEventId(marketingEventId as Long?)

        /** Alias for calling [Builder.marketingEventId] with `marketingEventId.orElse(null)`. */
        fun marketingEventId(marketingEventId: Optional<Long>) =
            marketingEventId(marketingEventId.getOrNull())

        /** The cursor indicating the position of the last retrieved item. */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** The identifier of the Contact. It may be email or internal id. */
        fun contactIdentifier(contactIdentifier: String?) = apply {
            this.contactIdentifier = contactIdentifier
        }

        /** Alias for calling [Builder.contactIdentifier] with `contactIdentifier.orElse(null)`. */
        fun contactIdentifier(contactIdentifier: Optional<String>) =
            contactIdentifier(contactIdentifier.getOrNull())

        /** The limit for response size. The default value is 10, the max number is 100 */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /** The participation state value. It may be REGISTERED, CANCELLED, ATTENDED, NO_SHOW */
        fun state(state: String?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

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
         * Returns an immutable instance of [ParticipationListBreakdownByIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ParticipationListBreakdownByIdParams =
            ParticipationListBreakdownByIdParams(
                marketingEventId,
                after,
                contactIdentifier,
                limit,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> marketingEventId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                contactIdentifier?.let { put("contactIdentifier", it) }
                limit?.let { put("limit", it.toString()) }
                state?.let { put("state", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationListBreakdownByIdParams &&
            marketingEventId == other.marketingEventId &&
            after == other.after &&
            contactIdentifier == other.contactIdentifier &&
            limit == other.limit &&
            state == other.state &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            marketingEventId,
            after,
            contactIdentifier,
            limit,
            state,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ParticipationListBreakdownByIdParams{marketingEventId=$marketingEventId, after=$after, contactIdentifier=$contactIdentifier, limit=$limit, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
