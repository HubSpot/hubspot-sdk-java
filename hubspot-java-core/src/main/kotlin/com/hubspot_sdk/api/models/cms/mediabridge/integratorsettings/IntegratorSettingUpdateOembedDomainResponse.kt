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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class IntegratorSettingUpdateOembedDomainResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val appId: JsonField<Int>,
    private val createdAt: JsonField<Long>,
    private val deletedAt: JsonField<Long>,
    private val endpoints: JsonField<Endpoints>,
    private val portalId: JsonField<Int>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("appId") @ExcludeMissing appId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("deletedAt") @ExcludeMissing deletedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("endpoints")
        @ExcludeMissing
        endpoints: JsonField<Endpoints> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(id, appId, createdAt, deletedAt, endpoints, portalId, updatedAt, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): Int = appId.getRequired("appId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deletedAt(): Long = deletedAt.getRequired("deletedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endpoints(): Endpoints = endpoints.getRequired("endpoints")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Int = portalId.getRequired("portalId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Long = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appId") @ExcludeMissing fun _appId(): JsonField<Int> = appId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deletedAt") @ExcludeMissing fun _deletedAt(): JsonField<Long> = deletedAt

    /**
     * Returns the raw JSON value of [endpoints].
     *
     * Unlike [endpoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endpoints") @ExcludeMissing fun _endpoints(): JsonField<Endpoints> = endpoints

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

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
         * Returns a mutable builder for constructing an instance of
         * [IntegratorSettingUpdateOembedDomainResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .appId()
         * .createdAt()
         * .deletedAt()
         * .endpoints()
         * .portalId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegratorSettingUpdateOembedDomainResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var appId: JsonField<Int>? = null
        private var createdAt: JsonField<Long>? = null
        private var deletedAt: JsonField<Long>? = null
        private var endpoints: JsonField<Endpoints>? = null
        private var portalId: JsonField<Int>? = null
        private var updatedAt: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            integratorSettingUpdateOembedDomainResponse: IntegratorSettingUpdateOembedDomainResponse
        ) = apply {
            id = integratorSettingUpdateOembedDomainResponse.id
            appId = integratorSettingUpdateOembedDomainResponse.appId
            createdAt = integratorSettingUpdateOembedDomainResponse.createdAt
            deletedAt = integratorSettingUpdateOembedDomainResponse.deletedAt
            endpoints = integratorSettingUpdateOembedDomainResponse.endpoints
            portalId = integratorSettingUpdateOembedDomainResponse.portalId
            updatedAt = integratorSettingUpdateOembedDomainResponse.updatedAt
            additionalProperties =
                integratorSettingUpdateOembedDomainResponse.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun appId(appId: Int) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<Int>) = apply { this.appId = appId }

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun deletedAt(deletedAt: Long) = deletedAt(JsonField.of(deletedAt))

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deletedAt(deletedAt: JsonField<Long>) = apply { this.deletedAt = deletedAt }

        fun endpoints(endpoints: Endpoints) = endpoints(JsonField.of(endpoints))

        /**
         * Sets [Builder.endpoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpoints] with a well-typed [Endpoints] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endpoints(endpoints: JsonField<Endpoints>) = apply { this.endpoints = endpoints }

        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [IntegratorSettingUpdateOembedDomainResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .appId()
         * .createdAt()
         * .deletedAt()
         * .endpoints()
         * .portalId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegratorSettingUpdateOembedDomainResponse =
            IntegratorSettingUpdateOembedDomainResponse(
                checkRequired("id", id),
                checkRequired("appId", appId),
                checkRequired("createdAt", createdAt),
                checkRequired("deletedAt", deletedAt),
                checkRequired("endpoints", endpoints),
                checkRequired("portalId", portalId),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IntegratorSettingUpdateOembedDomainResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        appId()
        createdAt()
        deletedAt()
        endpoints().validate()
        portalId()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (appId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (endpoints.asKnown().getOrNull()?.validity() ?: 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

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

        return other is IntegratorSettingUpdateOembedDomainResponse &&
            id == other.id &&
            appId == other.appId &&
            createdAt == other.createdAt &&
            deletedAt == other.deletedAt &&
            endpoints == other.endpoints &&
            portalId == other.portalId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            appId,
            createdAt,
            deletedAt,
            endpoints,
            portalId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegratorSettingUpdateOembedDomainResponse{id=$id, appId=$appId, createdAt=$createdAt, deletedAt=$deletedAt, endpoints=$endpoints, portalId=$portalId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
