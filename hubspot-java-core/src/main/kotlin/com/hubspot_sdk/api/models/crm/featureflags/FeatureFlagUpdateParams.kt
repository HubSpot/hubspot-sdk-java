// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Specify an account-level flag state for a specific HubSpot account. */
class FeatureFlagUpdateParams
private constructor(
    private val appId: Int,
    private val flagName: String,
    private val portalId: Int?,
    private val portalFlagStatePutRequest: PortalFlagStatePutRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun flagName(): String = flagName

    fun portalId(): Optional<Int> = Optional.ofNullable(portalId)

    fun portalFlagStatePutRequest(): PortalFlagStatePutRequest = portalFlagStatePutRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        portalFlagStatePutRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeatureFlagUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .flagName()
         * .portalFlagStatePutRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeatureFlagUpdateParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var flagName: String? = null
        private var portalId: Int? = null
        private var portalFlagStatePutRequest: PortalFlagStatePutRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(featureFlagUpdateParams: FeatureFlagUpdateParams) = apply {
            appId = featureFlagUpdateParams.appId
            flagName = featureFlagUpdateParams.flagName
            portalId = featureFlagUpdateParams.portalId
            portalFlagStatePutRequest = featureFlagUpdateParams.portalFlagStatePutRequest
            additionalHeaders = featureFlagUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = featureFlagUpdateParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun flagName(flagName: String) = apply { this.flagName = flagName }

        fun portalId(portalId: Int?) = apply { this.portalId = portalId }

        /**
         * Alias for [Builder.portalId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun portalId(portalId: Int) = portalId(portalId as Int?)

        /** Alias for calling [Builder.portalId] with `portalId.orElse(null)`. */
        fun portalId(portalId: Optional<Int>) = portalId(portalId.getOrNull())

        fun portalFlagStatePutRequest(portalFlagStatePutRequest: PortalFlagStatePutRequest) =
            apply {
                this.portalFlagStatePutRequest = portalFlagStatePutRequest
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
         * Returns an immutable instance of [FeatureFlagUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .flagName()
         * .portalFlagStatePutRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeatureFlagUpdateParams =
            FeatureFlagUpdateParams(
                checkRequired("appId", appId),
                checkRequired("flagName", flagName),
                portalId,
                checkRequired("portalFlagStatePutRequest", portalFlagStatePutRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PortalFlagStatePutRequest = portalFlagStatePutRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> flagName
            2 -> portalId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeatureFlagUpdateParams &&
            appId == other.appId &&
            flagName == other.flagName &&
            portalId == other.portalId &&
            portalFlagStatePutRequest == other.portalFlagStatePutRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            flagName,
            portalId,
            portalFlagStatePutRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FeatureFlagUpdateParams{appId=$appId, flagName=$flagName, portalId=$portalId, portalFlagStatePutRequest=$portalFlagStatePutRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
