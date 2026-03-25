// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events.settings

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.marketing.events.EventDetailSettingsUrl
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SettingCreateOrUpdateParams
private constructor(
    private val appId: Int?,
    private val eventDetailSettingsUrl: EventDetailSettingsUrl,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Optional<Int> = Optional.ofNullable(appId)

    fun eventDetailSettingsUrl(): EventDetailSettingsUrl = eventDetailSettingsUrl

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        eventDetailSettingsUrl._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SettingCreateOrUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .eventDetailSettingsUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettingCreateOrUpdateParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var eventDetailSettingsUrl: EventDetailSettingsUrl? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(settingCreateOrUpdateParams: SettingCreateOrUpdateParams) = apply {
            appId = settingCreateOrUpdateParams.appId
            eventDetailSettingsUrl = settingCreateOrUpdateParams.eventDetailSettingsUrl
            additionalHeaders = settingCreateOrUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = settingCreateOrUpdateParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int?) = apply { this.appId = appId }

        /**
         * Alias for [Builder.appId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun appId(appId: Int) = appId(appId as Int?)

        /** Alias for calling [Builder.appId] with `appId.orElse(null)`. */
        fun appId(appId: Optional<Int>) = appId(appId.getOrNull())

        fun eventDetailSettingsUrl(eventDetailSettingsUrl: EventDetailSettingsUrl) = apply {
            this.eventDetailSettingsUrl = eventDetailSettingsUrl
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
         * Returns an immutable instance of [SettingCreateOrUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventDetailSettingsUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettingCreateOrUpdateParams =
            SettingCreateOrUpdateParams(
                appId,
                checkRequired("eventDetailSettingsUrl", eventDetailSettingsUrl),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): EventDetailSettingsUrl = eventDetailSettingsUrl

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingCreateOrUpdateParams &&
            appId == other.appId &&
            eventDetailSettingsUrl == other.eventDetailSettingsUrl &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(appId, eventDetailSettingsUrl, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SettingCreateOrUpdateParams{appId=$appId, eventDetailSettingsUrl=$eventDetailSettingsUrl, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
