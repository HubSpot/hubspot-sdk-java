// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Schedule the conversion of an active list into a static list, or update the already scheduled
 * conversion. This can be scheduled for a specific date or based on activity.
 */
class ListScheduleConversionParams
private constructor(
    private val listId: String?,
    private val publicListConversionTime: PublicListConversionTime,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun listId(): Optional<String> = Optional.ofNullable(listId)

    fun publicListConversionTime(): PublicListConversionTime = publicListConversionTime

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ListScheduleConversionParams].
         *
         * The following fields are required:
         * ```java
         * .publicListConversionTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListScheduleConversionParams]. */
    class Builder internal constructor() {

        private var listId: String? = null
        private var publicListConversionTime: PublicListConversionTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(listScheduleConversionParams: ListScheduleConversionParams) = apply {
            listId = listScheduleConversionParams.listId
            publicListConversionTime = listScheduleConversionParams.publicListConversionTime
            additionalHeaders = listScheduleConversionParams.additionalHeaders.toBuilder()
            additionalQueryParams = listScheduleConversionParams.additionalQueryParams.toBuilder()
        }

        fun listId(listId: String?) = apply { this.listId = listId }

        /** Alias for calling [Builder.listId] with `listId.orElse(null)`. */
        fun listId(listId: Optional<String>) = listId(listId.getOrNull())

        fun publicListConversionTime(publicListConversionTime: PublicListConversionTime) = apply {
            this.publicListConversionTime = publicListConversionTime
        }

        /**
         * Alias for calling [publicListConversionTime] with
         * `PublicListConversionTime.ofDate(date)`.
         */
        fun publicListConversionTime(date: PublicListConversionDate) =
            publicListConversionTime(PublicListConversionTime.ofDate(date))

        /**
         * Alias for calling [publicListConversionTime] with
         * `PublicListConversionTime.ofInactivity(inactivity)`.
         */
        fun publicListConversionTime(inactivity: PublicListConversionInactivity) =
            publicListConversionTime(PublicListConversionTime.ofInactivity(inactivity))

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
         * Returns an immutable instance of [ListScheduleConversionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .publicListConversionTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListScheduleConversionParams =
            ListScheduleConversionParams(
                listId,
                checkRequired("publicListConversionTime", publicListConversionTime),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicListConversionTime = publicListConversionTime

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> listId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListScheduleConversionParams &&
            listId == other.listId &&
            publicListConversionTime == other.publicListConversionTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(listId, publicListConversionTime, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ListScheduleConversionParams{listId=$listId, publicListConversionTime=$publicListConversionTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
