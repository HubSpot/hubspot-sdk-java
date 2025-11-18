// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.channelaccounts

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of channel accounts, with optional filters and sorting. */
class ChannelAccountListParams
private constructor(
    private val after: String?,
    private val archived: Boolean?,
    private val channelId: List<Int>?,
    private val defaultPageLength: Int?,
    private val inboxId: List<Int>?,
    private val limit: Int?,
    private val sort: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Whether to include archived channel accounts in the response. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /** Limits results to channel accounts within a particular channel. */
    fun channelId(): Optional<List<Int>> = Optional.ofNullable(channelId)

    /** The default number of results to display per page. */
    fun defaultPageLength(): Optional<Int> = Optional.ofNullable(defaultPageLength)

    /** Limits results to channel accounts within a particular inbox. */
    fun inboxId(): Optional<List<Int>> = Optional.ofNullable(inboxId)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** The sort order for the channel accounts. */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ChannelAccountListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ChannelAccountListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelAccountListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var archived: Boolean? = null
        private var channelId: MutableList<Int>? = null
        private var defaultPageLength: Int? = null
        private var inboxId: MutableList<Int>? = null
        private var limit: Int? = null
        private var sort: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(channelAccountListParams: ChannelAccountListParams) = apply {
            after = channelAccountListParams.after
            archived = channelAccountListParams.archived
            channelId = channelAccountListParams.channelId?.toMutableList()
            defaultPageLength = channelAccountListParams.defaultPageLength
            inboxId = channelAccountListParams.inboxId?.toMutableList()
            limit = channelAccountListParams.limit
            sort = channelAccountListParams.sort?.toMutableList()
            additionalHeaders = channelAccountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = channelAccountListParams.additionalQueryParams.toBuilder()
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Whether to include archived channel accounts in the response. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /** Limits results to channel accounts within a particular channel. */
        fun channelId(channelId: List<Int>?) = apply { this.channelId = channelId?.toMutableList() }

        /** Alias for calling [Builder.channelId] with `channelId.orElse(null)`. */
        fun channelId(channelId: Optional<List<Int>>) = channelId(channelId.getOrNull())

        /**
         * Adds a single [Int] to [Builder.channelId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannelId(channelId: Int) = apply {
            this.channelId = (this.channelId ?: mutableListOf()).apply { add(channelId) }
        }

        /** The default number of results to display per page. */
        fun defaultPageLength(defaultPageLength: Int?) = apply {
            this.defaultPageLength = defaultPageLength
        }

        /**
         * Alias for [Builder.defaultPageLength].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun defaultPageLength(defaultPageLength: Int) = defaultPageLength(defaultPageLength as Int?)

        /** Alias for calling [Builder.defaultPageLength] with `defaultPageLength.orElse(null)`. */
        fun defaultPageLength(defaultPageLength: Optional<Int>) =
            defaultPageLength(defaultPageLength.getOrNull())

        /** Limits results to channel accounts within a particular inbox. */
        fun inboxId(inboxId: List<Int>?) = apply { this.inboxId = inboxId?.toMutableList() }

        /** Alias for calling [Builder.inboxId] with `inboxId.orElse(null)`. */
        fun inboxId(inboxId: Optional<List<Int>>) = inboxId(inboxId.getOrNull())

        /**
         * Adds a single [Int] to [Builder.inboxId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInboxId(inboxId: Int) = apply {
            this.inboxId = (this.inboxId ?: mutableListOf()).apply { add(inboxId) }
        }

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

        /** The sort order for the channel accounts. */
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
         * Returns an immutable instance of [ChannelAccountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChannelAccountListParams =
            ChannelAccountListParams(
                after,
                archived,
                channelId?.toImmutable(),
                defaultPageLength,
                inboxId?.toImmutable(),
                limit,
                sort?.toImmutable(),
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
                channelId?.let { put("channelId", it.joinToString(",") { it.toString() }) }
                defaultPageLength?.let { put("defaultPageLength", it.toString()) }
                inboxId?.let { put("inboxId", it.joinToString(",") { it.toString() }) }
                limit?.let { put("limit", it.toString()) }
                sort?.let { put("sort", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelAccountListParams &&
            after == other.after &&
            archived == other.archived &&
            channelId == other.channelId &&
            defaultPageLength == other.defaultPageLength &&
            inboxId == other.inboxId &&
            limit == other.limit &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            archived,
            channelId,
            defaultPageLength,
            inboxId,
            limit,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ChannelAccountListParams{after=$after, archived=$archived, channelId=$channelId, defaultPageLength=$defaultPageLength, inboxId=$inboxId, limit=$limit, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
