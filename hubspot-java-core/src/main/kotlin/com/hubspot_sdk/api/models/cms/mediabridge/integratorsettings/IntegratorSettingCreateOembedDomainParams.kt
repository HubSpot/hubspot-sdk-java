// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Set up a new oEmbed domain for your media bridge app. */
class IntegratorSettingCreateOembedDomainParams
private constructor(
    private val appId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Optional<String> = Optional.ofNullable(appId)

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endpoints(): Endpoints = body.endpoints()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun portalId(): Optional<Int> = body.portalId()

    /**
     * Returns the raw JSON value of [endpoints].
     *
     * Unlike [endpoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endpoints(): JsonField<Endpoints> = body._endpoints()

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _portalId(): JsonField<Int> = body._portalId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntegratorSettingCreateOembedDomainParams].
         *
         * The following fields are required:
         * ```java
         * .endpoints()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegratorSettingCreateOembedDomainParams]. */
    class Builder internal constructor() {

        private var appId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            integratorSettingCreateOembedDomainParams: IntegratorSettingCreateOembedDomainParams
        ) = apply {
            appId = integratorSettingCreateOembedDomainParams.appId
            body = integratorSettingCreateOembedDomainParams.body.toBuilder()
            additionalHeaders =
                integratorSettingCreateOembedDomainParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                integratorSettingCreateOembedDomainParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: String?) = apply { this.appId = appId }

        /** Alias for calling [Builder.appId] with `appId.orElse(null)`. */
        fun appId(appId: Optional<String>) = appId(appId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endpoints]
         * - [portalId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun endpoints(endpoints: Endpoints) = apply { body.endpoints(endpoints) }

        /**
         * Sets [Builder.endpoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpoints] with a well-typed [Endpoints] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endpoints(endpoints: JsonField<Endpoints>) = apply { body.endpoints(endpoints) }

        fun portalId(portalId: Int) = apply { body.portalId(portalId) }

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { body.portalId(portalId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [IntegratorSettingCreateOembedDomainParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endpoints()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegratorSettingCreateOembedDomainParams =
            IntegratorSettingCreateOembedDomainParams(
                appId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endpoints: JsonField<Endpoints>,
        private val portalId: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("endpoints")
            @ExcludeMissing
            endpoints: JsonField<Endpoints> = JsonMissing.of(),
            @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        ) : this(endpoints, portalId, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endpoints(): Endpoints = endpoints.getRequired("endpoints")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun portalId(): Optional<Int> = portalId.getOptional("portalId")

        /**
         * Returns the raw JSON value of [endpoints].
         *
         * Unlike [endpoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endpoints")
        @ExcludeMissing
        fun _endpoints(): JsonField<Endpoints> = endpoints

        /**
         * Returns the raw JSON value of [portalId].
         *
         * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .endpoints()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endpoints: JsonField<Endpoints>? = null
            private var portalId: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endpoints = body.endpoints
                portalId = body.portalId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun endpoints(endpoints: Endpoints) = endpoints(JsonField.of(endpoints))

            /**
             * Sets [Builder.endpoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpoints] with a well-typed [Endpoints] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endpoints(endpoints: JsonField<Endpoints>) = apply { this.endpoints = endpoints }

            fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

            /**
             * Sets [Builder.portalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portalId] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endpoints()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("endpoints", endpoints),
                    portalId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endpoints().validate()
            portalId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubspotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (endpoints.asKnown().getOrNull()?.validity() ?: 0) +
                (if (portalId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endpoints == other.endpoints &&
                portalId == other.portalId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endpoints, portalId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endpoints=$endpoints, portalId=$portalId, additionalProperties=$additionalProperties}"
    }

    class Endpoints
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val discovery: JsonField<Boolean>,
        private val schemes: JsonField<List<String>>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("discovery")
            @ExcludeMissing
            discovery: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("schemes")
            @ExcludeMissing
            schemes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(discovery, schemes, url, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discovery(): Boolean = discovery.getRequired("discovery")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schemes(): List<String> = schemes.getRequired("schemes")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Returns the raw JSON value of [discovery].
         *
         * Unlike [discovery], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discovery") @ExcludeMissing fun _discovery(): JsonField<Boolean> = discovery

        /**
         * Returns the raw JSON value of [schemes].
         *
         * Unlike [schemes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schemes") @ExcludeMissing fun _schemes(): JsonField<List<String>> = schemes

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Endpoints].
             *
             * The following fields are required:
             * ```java
             * .discovery()
             * .schemes()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Endpoints]. */
        class Builder internal constructor() {

            private var discovery: JsonField<Boolean>? = null
            private var schemes: JsonField<MutableList<String>>? = null
            private var url: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(endpoints: Endpoints) = apply {
                discovery = endpoints.discovery
                schemes = endpoints.schemes.map { it.toMutableList() }
                url = endpoints.url
                additionalProperties = endpoints.additionalProperties.toMutableMap()
            }

            fun discovery(discovery: Boolean) = discovery(JsonField.of(discovery))

            /**
             * Sets [Builder.discovery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discovery] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discovery(discovery: JsonField<Boolean>) = apply { this.discovery = discovery }

            fun schemes(schemes: List<String>) = schemes(JsonField.of(schemes))

            /**
             * Sets [Builder.schemes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schemes] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schemes(schemes: JsonField<List<String>>) = apply {
                this.schemes = schemes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [schemes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScheme(scheme: String) = apply {
                schemes =
                    (schemes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("schemes", it).add(scheme)
                    }
            }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Endpoints].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .discovery()
             * .schemes()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Endpoints =
                Endpoints(
                    checkRequired("discovery", discovery),
                    checkRequired("schemes", schemes).map { it.toImmutable() },
                    checkRequired("url", url),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Endpoints = apply {
            if (validated) {
                return@apply
            }

            discovery()
            schemes()
            url()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubspotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (discovery.asKnown().isPresent) 1 else 0) +
                (schemes.asKnown().getOrNull()?.size ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Endpoints &&
                discovery == other.discovery &&
                schemes == other.schemes &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(discovery, schemes, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Endpoints{discovery=$discovery, schemes=$schemes, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegratorSettingCreateOembedDomainParams &&
            appId == other.appId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(appId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IntegratorSettingCreateOembedDomainParams{appId=$appId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
