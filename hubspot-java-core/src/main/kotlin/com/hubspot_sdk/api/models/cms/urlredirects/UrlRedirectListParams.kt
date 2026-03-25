// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of URL redirects configured in your HubSpot account. This endpoint allows you to
 * filter redirects based on their creation or update timestamps, and sort the results. It supports
 * pagination and can include archived redirects if specified.
 */
class UrlRedirectListParams
private constructor(
    private val after: String?,
    private val archived: Boolean?,
    private val createdAfter: OffsetDateTime?,
    private val createdAt: OffsetDateTime?,
    private val createdBefore: OffsetDateTime?,
    private val limit: Int?,
    private val sort: List<String>?,
    private val updatedAfter: OffsetDateTime?,
    private val updatedAt: OffsetDateTime?,
    private val updatedBefore: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A cursor token for pagination. Use the value from the previous response's paging.next.after
     * field.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /** Filter redirects created after a specific timestamp. Format must be date-time. */
    fun createdAfter(): Optional<OffsetDateTime> = Optional.ofNullable(createdAfter)

    /** Filter redirects by their exact creation timestamp. Format must be date-time. */
    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    /** Filter redirects created before a specific timestamp. Format must be date-time. */
    fun createdBefore(): Optional<OffsetDateTime> = Optional.ofNullable(createdBefore)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Specify the order in which to sort the results. Accepts an array of strings. */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Filter redirects updated after a specific timestamp. Format must be date-time. */
    fun updatedAfter(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAfter)

    /** Filter redirects by their exact update timestamp. Format must be date-time. */
    fun updatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAt)

    /** Filter redirects updated before a specific timestamp. Format must be date-time. */
    fun updatedBefore(): Optional<OffsetDateTime> = Optional.ofNullable(updatedBefore)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UrlRedirectListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UrlRedirectListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UrlRedirectListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var archived: Boolean? = null
        private var createdAfter: OffsetDateTime? = null
        private var createdAt: OffsetDateTime? = null
        private var createdBefore: OffsetDateTime? = null
        private var limit: Int? = null
        private var sort: MutableList<String>? = null
        private var updatedAfter: OffsetDateTime? = null
        private var updatedAt: OffsetDateTime? = null
        private var updatedBefore: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(urlRedirectListParams: UrlRedirectListParams) = apply {
            after = urlRedirectListParams.after
            archived = urlRedirectListParams.archived
            createdAfter = urlRedirectListParams.createdAfter
            createdAt = urlRedirectListParams.createdAt
            createdBefore = urlRedirectListParams.createdBefore
            limit = urlRedirectListParams.limit
            sort = urlRedirectListParams.sort?.toMutableList()
            updatedAfter = urlRedirectListParams.updatedAfter
            updatedAt = urlRedirectListParams.updatedAt
            updatedBefore = urlRedirectListParams.updatedBefore
            additionalHeaders = urlRedirectListParams.additionalHeaders.toBuilder()
            additionalQueryParams = urlRedirectListParams.additionalQueryParams.toBuilder()
        }

        /**
         * A cursor token for pagination. Use the value from the previous response's
         * paging.next.after field.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Whether to return only results that have been archived. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /** Filter redirects created after a specific timestamp. Format must be date-time. */
        fun createdAfter(createdAfter: OffsetDateTime?) = apply { this.createdAfter = createdAfter }

        /** Alias for calling [Builder.createdAfter] with `createdAfter.orElse(null)`. */
        fun createdAfter(createdAfter: Optional<OffsetDateTime>) =
            createdAfter(createdAfter.getOrNull())

        /** Filter redirects by their exact creation timestamp. Format must be date-time. */
        fun createdAt(createdAt: OffsetDateTime?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /** Filter redirects created before a specific timestamp. Format must be date-time. */
        fun createdBefore(createdBefore: OffsetDateTime?) = apply {
            this.createdBefore = createdBefore
        }

        /** Alias for calling [Builder.createdBefore] with `createdBefore.orElse(null)`. */
        fun createdBefore(createdBefore: Optional<OffsetDateTime>) =
            createdBefore(createdBefore.getOrNull())

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

        /** Specify the order in which to sort the results. Accepts an array of strings. */
        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
        }

        /** Filter redirects updated after a specific timestamp. Format must be date-time. */
        fun updatedAfter(updatedAfter: OffsetDateTime?) = apply { this.updatedAfter = updatedAfter }

        /** Alias for calling [Builder.updatedAfter] with `updatedAfter.orElse(null)`. */
        fun updatedAfter(updatedAfter: Optional<OffsetDateTime>) =
            updatedAfter(updatedAfter.getOrNull())

        /** Filter redirects by their exact update timestamp. Format must be date-time. */
        fun updatedAt(updatedAt: OffsetDateTime?) = apply { this.updatedAt = updatedAt }

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /** Filter redirects updated before a specific timestamp. Format must be date-time. */
        fun updatedBefore(updatedBefore: OffsetDateTime?) = apply {
            this.updatedBefore = updatedBefore
        }

        /** Alias for calling [Builder.updatedBefore] with `updatedBefore.orElse(null)`. */
        fun updatedBefore(updatedBefore: Optional<OffsetDateTime>) =
            updatedBefore(updatedBefore.getOrNull())

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
         * Returns an immutable instance of [UrlRedirectListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UrlRedirectListParams =
            UrlRedirectListParams(
                after,
                archived,
                createdAfter,
                createdAt,
                createdBefore,
                limit,
                sort?.toImmutable(),
                updatedAfter,
                updatedAt,
                updatedBefore,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                archived?.let { put("archived", it.toString()) }
                createdAfter?.let {
                    put("createdAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAt?.let {
                    put("createdAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdBefore?.let {
                    put("createdBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                limit?.let { put("limit", it.toString()) }
                sort?.let { put("sort", it.joinToString(",")) }
                updatedAfter?.let {
                    put("updatedAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedAt?.let {
                    put("updatedAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedBefore?.let {
                    put("updatedBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlRedirectListParams &&
            after == other.after &&
            archived == other.archived &&
            createdAfter == other.createdAfter &&
            createdAt == other.createdAt &&
            createdBefore == other.createdBefore &&
            limit == other.limit &&
            sort == other.sort &&
            updatedAfter == other.updatedAfter &&
            updatedAt == other.updatedAt &&
            updatedBefore == other.updatedBefore &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            archived,
            createdAfter,
            createdAt,
            createdBefore,
            limit,
            sort,
            updatedAfter,
            updatedAt,
            updatedBefore,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "UrlRedirectListParams{after=$after, archived=$archived, createdAfter=$createdAfter, createdAt=$createdAt, createdBefore=$createdBefore, limit=$limit, sort=$sort, updatedAfter=$updatedAfter, updatedAt=$updatedAt, updatedBefore=$updatedBefore, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
