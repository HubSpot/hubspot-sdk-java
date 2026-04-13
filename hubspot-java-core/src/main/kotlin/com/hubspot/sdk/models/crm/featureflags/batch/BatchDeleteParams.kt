// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.featureflags.batch

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.crm.featureflags.PortalFlagStateBatchDeleteRequest
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Delete an account-level flag state for multiple HubSpot accounts at once. Use this endpoint to
 * manage flag exposure for groups of HubSpot accounts.
 */
class BatchDeleteParams
private constructor(
    private val appId: Int,
    private val flagName: String?,
    private val portalFlagStateBatchDeleteRequest: PortalFlagStateBatchDeleteRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun flagName(): Optional<String> = Optional.ofNullable(flagName)

    fun portalFlagStateBatchDeleteRequest(): PortalFlagStateBatchDeleteRequest =
        portalFlagStateBatchDeleteRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        portalFlagStateBatchDeleteRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchDeleteParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .portalFlagStateBatchDeleteRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchDeleteParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var flagName: String? = null
        private var portalFlagStateBatchDeleteRequest: PortalFlagStateBatchDeleteRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchDeleteParams: BatchDeleteParams) = apply {
            appId = batchDeleteParams.appId
            flagName = batchDeleteParams.flagName
            portalFlagStateBatchDeleteRequest = batchDeleteParams.portalFlagStateBatchDeleteRequest
            additionalHeaders = batchDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchDeleteParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun flagName(flagName: String?) = apply { this.flagName = flagName }

        /** Alias for calling [Builder.flagName] with `flagName.orElse(null)`. */
        fun flagName(flagName: Optional<String>) = flagName(flagName.getOrNull())

        fun portalFlagStateBatchDeleteRequest(
            portalFlagStateBatchDeleteRequest: PortalFlagStateBatchDeleteRequest
        ) = apply { this.portalFlagStateBatchDeleteRequest = portalFlagStateBatchDeleteRequest }

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
         * Returns an immutable instance of [BatchDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .portalFlagStateBatchDeleteRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchDeleteParams =
            BatchDeleteParams(
                checkRequired("appId", appId),
                flagName,
                checkRequired(
                    "portalFlagStateBatchDeleteRequest",
                    portalFlagStateBatchDeleteRequest,
                ),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PortalFlagStateBatchDeleteRequest = portalFlagStateBatchDeleteRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> flagName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchDeleteParams &&
            appId == other.appId &&
            flagName == other.flagName &&
            portalFlagStateBatchDeleteRequest == other.portalFlagStateBatchDeleteRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            flagName,
            portalFlagStateBatchDeleteRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchDeleteParams{appId=$appId, flagName=$flagName, portalFlagStateBatchDeleteRequest=$portalFlagStateBatchDeleteRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
