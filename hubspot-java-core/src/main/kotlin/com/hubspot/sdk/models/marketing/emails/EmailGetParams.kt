// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Use this endpoint to get aggregated statistics of emails sent in a specified time span. It also
 * returns the list of emails that were sent during the time span.
 */
class EmailGetParams
private constructor(
    private val emailIds: List<Long>?,
    private val endTimestamp: OffsetDateTime?,
    private val property: String?,
    private val startTimestamp: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun emailIds(): Optional<List<Long>> = Optional.ofNullable(emailIds)

    fun endTimestamp(): Optional<OffsetDateTime> = Optional.ofNullable(endTimestamp)

    fun property(): Optional<String> = Optional.ofNullable(property)

    fun startTimestamp(): Optional<OffsetDateTime> = Optional.ofNullable(startTimestamp)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailGetParams]. */
    class Builder internal constructor() {

        private var emailIds: MutableList<Long>? = null
        private var endTimestamp: OffsetDateTime? = null
        private var property: String? = null
        private var startTimestamp: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailGetParams: EmailGetParams) = apply {
            emailIds = emailGetParams.emailIds?.toMutableList()
            endTimestamp = emailGetParams.endTimestamp
            property = emailGetParams.property
            startTimestamp = emailGetParams.startTimestamp
            additionalHeaders = emailGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailGetParams.additionalQueryParams.toBuilder()
        }

        fun emailIds(emailIds: List<Long>?) = apply { this.emailIds = emailIds?.toMutableList() }

        /** Alias for calling [Builder.emailIds] with `emailIds.orElse(null)`. */
        fun emailIds(emailIds: Optional<List<Long>>) = emailIds(emailIds.getOrNull())

        /**
         * Adds a single [Long] to [emailIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmailId(emailId: Long) = apply {
            emailIds = (emailIds ?: mutableListOf()).apply { add(emailId) }
        }

        fun endTimestamp(endTimestamp: OffsetDateTime?) = apply { this.endTimestamp = endTimestamp }

        /** Alias for calling [Builder.endTimestamp] with `endTimestamp.orElse(null)`. */
        fun endTimestamp(endTimestamp: Optional<OffsetDateTime>) =
            endTimestamp(endTimestamp.getOrNull())

        fun property(property: String?) = apply { this.property = property }

        /** Alias for calling [Builder.property] with `property.orElse(null)`. */
        fun property(property: Optional<String>) = property(property.getOrNull())

        fun startTimestamp(startTimestamp: OffsetDateTime?) = apply {
            this.startTimestamp = startTimestamp
        }

        /** Alias for calling [Builder.startTimestamp] with `startTimestamp.orElse(null)`. */
        fun startTimestamp(startTimestamp: Optional<OffsetDateTime>) =
            startTimestamp(startTimestamp.getOrNull())

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
         * Returns an immutable instance of [EmailGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailGetParams =
            EmailGetParams(
                emailIds?.toImmutable(),
                endTimestamp,
                property,
                startTimestamp,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                emailIds?.let { put("emailIds", it.joinToString(",") { it.toString() }) }
                endTimestamp?.let {
                    put("endTimestamp", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                property?.let { put("property", it) }
                startTimestamp?.let {
                    put("startTimestamp", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailGetParams &&
            emailIds == other.emailIds &&
            endTimestamp == other.endTimestamp &&
            property == other.property &&
            startTimestamp == other.startTimestamp &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailIds,
            endTimestamp,
            property,
            startTimestamp,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailGetParams{emailIds=$emailIds, endTimestamp=$endTimestamp, property=$property, startTimestamp=$startTimestamp, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
