// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an existing property for an object type. */
class MediaBridgeUpdatePropertyParams
private constructor(
    private val appId: Int,
    private val objectType: String,
    private val propertyName: String?,
    private val mediaBridgePropertyUpdate: MediaBridgePropertyUpdate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun objectType(): String = objectType

    fun propertyName(): Optional<String> = Optional.ofNullable(propertyName)

    fun mediaBridgePropertyUpdate(): MediaBridgePropertyUpdate = mediaBridgePropertyUpdate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        mediaBridgePropertyUpdate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MediaBridgeUpdatePropertyParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .objectType()
         * .mediaBridgePropertyUpdate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaBridgeUpdatePropertyParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var objectType: String? = null
        private var propertyName: String? = null
        private var mediaBridgePropertyUpdate: MediaBridgePropertyUpdate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mediaBridgeUpdatePropertyParams: MediaBridgeUpdatePropertyParams) =
            apply {
                appId = mediaBridgeUpdatePropertyParams.appId
                objectType = mediaBridgeUpdatePropertyParams.objectType
                propertyName = mediaBridgeUpdatePropertyParams.propertyName
                mediaBridgePropertyUpdate =
                    mediaBridgeUpdatePropertyParams.mediaBridgePropertyUpdate
                additionalHeaders = mediaBridgeUpdatePropertyParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    mediaBridgeUpdatePropertyParams.additionalQueryParams.toBuilder()
            }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun propertyName(propertyName: String?) = apply { this.propertyName = propertyName }

        /** Alias for calling [Builder.propertyName] with `propertyName.orElse(null)`. */
        fun propertyName(propertyName: Optional<String>) = propertyName(propertyName.getOrNull())

        fun mediaBridgePropertyUpdate(mediaBridgePropertyUpdate: MediaBridgePropertyUpdate) =
            apply {
                this.mediaBridgePropertyUpdate = mediaBridgePropertyUpdate
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
         * Returns an immutable instance of [MediaBridgeUpdatePropertyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .objectType()
         * .mediaBridgePropertyUpdate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaBridgeUpdatePropertyParams =
            MediaBridgeUpdatePropertyParams(
                checkRequired("appId", appId),
                checkRequired("objectType", objectType),
                propertyName,
                checkRequired("mediaBridgePropertyUpdate", mediaBridgePropertyUpdate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): MediaBridgePropertyUpdate = mediaBridgePropertyUpdate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> objectType
            2 -> propertyName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgeUpdatePropertyParams &&
            appId == other.appId &&
            objectType == other.objectType &&
            propertyName == other.propertyName &&
            mediaBridgePropertyUpdate == other.mediaBridgePropertyUpdate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            objectType,
            propertyName,
            mediaBridgePropertyUpdate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MediaBridgeUpdatePropertyParams{appId=$appId, objectType=$objectType, propertyName=$propertyName, mediaBridgePropertyUpdate=$mediaBridgePropertyUpdate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
