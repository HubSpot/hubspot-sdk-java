// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the next availability times for a meeting page. */
class MeetingsLinkGetAvailabilityBySlugParams
private constructor(
    private val slug: String?,
    private val timezone: String,
    private val monthOffset: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun slug(): Optional<String> = Optional.ofNullable(slug)

    /** Return times in response based on specified time zone. */
    fun timezone(): String = timezone

    /** Get times for a different month. */
    fun monthOffset(): Optional<Int> = Optional.ofNullable(monthOffset)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MeetingsLinkGetAvailabilityBySlugParams].
         *
         * The following fields are required:
         * ```java
         * .timezone()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingsLinkGetAvailabilityBySlugParams]. */
    class Builder internal constructor() {

        private var slug: String? = null
        private var timezone: String? = null
        private var monthOffset: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            meetingsLinkGetAvailabilityBySlugParams: MeetingsLinkGetAvailabilityBySlugParams
        ) = apply {
            slug = meetingsLinkGetAvailabilityBySlugParams.slug
            timezone = meetingsLinkGetAvailabilityBySlugParams.timezone
            monthOffset = meetingsLinkGetAvailabilityBySlugParams.monthOffset
            additionalHeaders =
                meetingsLinkGetAvailabilityBySlugParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                meetingsLinkGetAvailabilityBySlugParams.additionalQueryParams.toBuilder()
        }

        fun slug(slug: String?) = apply { this.slug = slug }

        /** Alias for calling [Builder.slug] with `slug.orElse(null)`. */
        fun slug(slug: Optional<String>) = slug(slug.getOrNull())

        /** Return times in response based on specified time zone. */
        fun timezone(timezone: String) = apply { this.timezone = timezone }

        /** Get times for a different month. */
        fun monthOffset(monthOffset: Int?) = apply { this.monthOffset = monthOffset }

        /**
         * Alias for [Builder.monthOffset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun monthOffset(monthOffset: Int) = monthOffset(monthOffset as Int?)

        /** Alias for calling [Builder.monthOffset] with `monthOffset.orElse(null)`. */
        fun monthOffset(monthOffset: Optional<Int>) = monthOffset(monthOffset.getOrNull())

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
         * Returns an immutable instance of [MeetingsLinkGetAvailabilityBySlugParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .timezone()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeetingsLinkGetAvailabilityBySlugParams =
            MeetingsLinkGetAvailabilityBySlugParams(
                slug,
                checkRequired("timezone", timezone),
                monthOffset,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> slug ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("timezone", timezone)
                monthOffset?.let { put("monthOffset", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingsLinkGetAvailabilityBySlugParams &&
            slug == other.slug &&
            timezone == other.timezone &&
            monthOffset == other.monthOffset &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(slug, timezone, monthOffset, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MeetingsLinkGetAvailabilityBySlugParams{slug=$slug, timezone=$timezone, monthOffset=$monthOffset, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
