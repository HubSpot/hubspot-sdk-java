// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a paged list meeting scheduling pages */
class MeetingsLinkListParams
private constructor(
    private val after: String?,
    private val limit: Int?,
    private val name: String?,
    private val organizerUserId: String?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Retrieve scheduling pages with a specified name. */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /** Filter the response to scheduling pages created by the specified user. */
    fun organizerUserId(): Optional<String> = Optional.ofNullable(organizerUserId)

    /** Filter the response to the specific type of meeting. */
    fun type(): Optional<String> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MeetingsLinkListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MeetingsLinkListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingsLinkListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var limit: Int? = null
        private var name: String? = null
        private var organizerUserId: String? = null
        private var type: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(meetingsLinkListParams: MeetingsLinkListParams) = apply {
            after = meetingsLinkListParams.after
            limit = meetingsLinkListParams.limit
            name = meetingsLinkListParams.name
            organizerUserId = meetingsLinkListParams.organizerUserId
            type = meetingsLinkListParams.type
            additionalHeaders = meetingsLinkListParams.additionalHeaders.toBuilder()
            additionalQueryParams = meetingsLinkListParams.additionalQueryParams.toBuilder()
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** The maximum number of results to display per page. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /** Retrieve scheduling pages with a specified name. */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Filter the response to scheduling pages created by the specified user. */
        fun organizerUserId(organizerUserId: String?) = apply {
            this.organizerUserId = organizerUserId
        }

        /** Alias for calling [Builder.organizerUserId] with `organizerUserId.orElse(null)`. */
        fun organizerUserId(organizerUserId: Optional<String>) =
            organizerUserId(organizerUserId.getOrNull())

        /** Filter the response to the specific type of meeting. */
        fun type(type: String?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<String>) = type(type.getOrNull())

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
         * Returns an immutable instance of [MeetingsLinkListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MeetingsLinkListParams =
            MeetingsLinkListParams(
                after,
                limit,
                name,
                organizerUserId,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                organizerUserId?.let { put("organizerUserId", it) }
                type?.let { put("type", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingsLinkListParams &&
            after == other.after &&
            limit == other.limit &&
            name == other.name &&
            organizerUserId == other.organizerUserId &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            limit,
            name,
            organizerUserId,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MeetingsLinkListParams{after=$after, limit=$limit, name=$name, organizerUserId=$organizerUserId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
