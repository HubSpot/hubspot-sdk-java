// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get details about the initial information necessary for a meeting scheduler. */
class MeetingsLinkGetBookingInfoBySlugParams
private constructor(
    private val slug: String?,
    private val timezone: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun slug(): Optional<String> = Optional.ofNullable(slug)

    /** Return times in response based on specified time zone. */
    fun timezone(): String = timezone

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MeetingsLinkGetBookingInfoBySlugParams].
         *
         * The following fields are required:
         * ```java
         * .timezone()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeetingsLinkGetBookingInfoBySlugParams]. */
    class Builder internal constructor() {

        private var slug: String? = null
        private var timezone: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            meetingsLinkGetBookingInfoBySlugParams: MeetingsLinkGetBookingInfoBySlugParams
        ) = apply {
            slug = meetingsLinkGetBookingInfoBySlugParams.slug
            timezone = meetingsLinkGetBookingInfoBySlugParams.timezone
            additionalHeaders = meetingsLinkGetBookingInfoBySlugParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                meetingsLinkGetBookingInfoBySlugParams.additionalQueryParams.toBuilder()
        }

        fun slug(slug: String?) = apply { this.slug = slug }

        /** Alias for calling [Builder.slug] with `slug.orElse(null)`. */
        fun slug(slug: Optional<String>) = slug(slug.getOrNull())

        /** Return times in response based on specified time zone. */
        fun timezone(timezone: String) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [MeetingsLinkGetBookingInfoBySlugParams].
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
        fun build(): MeetingsLinkGetBookingInfoBySlugParams =
            MeetingsLinkGetBookingInfoBySlugParams(
                slug,
                checkRequired("timezone", timezone),
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
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeetingsLinkGetBookingInfoBySlugParams &&
            slug == other.slug &&
            timezone == other.timezone &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(slug, timezone, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MeetingsLinkGetBookingInfoBySlugParams{slug=$slug, timezone=$timezone, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
