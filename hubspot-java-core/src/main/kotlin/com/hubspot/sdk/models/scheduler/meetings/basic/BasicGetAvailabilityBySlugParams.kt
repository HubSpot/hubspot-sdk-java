// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings.basic

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get the next availability times for a meeting page. */
class BasicGetAvailabilityBySlugParams
private constructor(
    private val slug: String?,
    private val timezone: String,
    private val monthOffset: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun slug(): Optional<String> = Optional.ofNullable(slug)

    fun timezone(): String = timezone

    fun monthOffset(): Optional<Int> = Optional.ofNullable(monthOffset)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BasicGetAvailabilityBySlugParams].
         *
         * The following fields are required:
         * ```java
         * .timezone()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BasicGetAvailabilityBySlugParams]. */
    class Builder internal constructor() {

        private var slug: String? = null
        private var timezone: String? = null
        private var monthOffset: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(basicGetAvailabilityBySlugParams: BasicGetAvailabilityBySlugParams) =
            apply {
                slug = basicGetAvailabilityBySlugParams.slug
                timezone = basicGetAvailabilityBySlugParams.timezone
                monthOffset = basicGetAvailabilityBySlugParams.monthOffset
                additionalHeaders = basicGetAvailabilityBySlugParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    basicGetAvailabilityBySlugParams.additionalQueryParams.toBuilder()
            }

        fun slug(slug: String?) = apply { this.slug = slug }

        /** Alias for calling [Builder.slug] with `slug.orElse(null)`. */
        fun slug(slug: Optional<String>) = slug(slug.getOrNull())

        fun timezone(timezone: String) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [BasicGetAvailabilityBySlugParams].
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
        fun build(): BasicGetAvailabilityBySlugParams =
            BasicGetAvailabilityBySlugParams(
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

        return other is BasicGetAvailabilityBySlugParams &&
            slug == other.slug &&
            timezone == other.timezone &&
            monthOffset == other.monthOffset &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(slug, timezone, monthOffset, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BasicGetAvailabilityBySlugParams{slug=$slug, timezone=$timezone, monthOffset=$monthOffset, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
