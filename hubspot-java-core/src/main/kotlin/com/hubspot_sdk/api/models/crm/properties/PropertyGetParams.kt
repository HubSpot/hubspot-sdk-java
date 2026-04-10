// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Read a property identified by {propertyName}. */
class PropertyGetParams
private constructor(
    private val objectType: String,
    private val propertyName: String?,
    private val archived: Boolean?,
    private val dataSensitivity: DataSensitivity?,
    private val locale: String?,
    private val properties: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): String = objectType

    fun propertyName(): Optional<String> = Optional.ofNullable(propertyName)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    fun dataSensitivity(): Optional<DataSensitivity> = Optional.ofNullable(dataSensitivity)

    fun locale(): Optional<String> = Optional.ofNullable(locale)

    fun properties(): Optional<String> = Optional.ofNullable(properties)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PropertyGetParams].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyGetParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var propertyName: String? = null
        private var archived: Boolean? = null
        private var dataSensitivity: DataSensitivity? = null
        private var locale: String? = null
        private var properties: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(propertyGetParams: PropertyGetParams) = apply {
            objectType = propertyGetParams.objectType
            propertyName = propertyGetParams.propertyName
            archived = propertyGetParams.archived
            dataSensitivity = propertyGetParams.dataSensitivity
            locale = propertyGetParams.locale
            properties = propertyGetParams.properties
            additionalHeaders = propertyGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = propertyGetParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun propertyName(propertyName: String?) = apply { this.propertyName = propertyName }

        /** Alias for calling [Builder.propertyName] with `propertyName.orElse(null)`. */
        fun propertyName(propertyName: Optional<String>) = propertyName(propertyName.getOrNull())

        /** Whether to return only results that have been archived. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        fun dataSensitivity(dataSensitivity: DataSensitivity?) = apply {
            this.dataSensitivity = dataSensitivity
        }

        /** Alias for calling [Builder.dataSensitivity] with `dataSensitivity.orElse(null)`. */
        fun dataSensitivity(dataSensitivity: Optional<DataSensitivity>) =
            dataSensitivity(dataSensitivity.getOrNull())

        fun locale(locale: String?) = apply { this.locale = locale }

        /** Alias for calling [Builder.locale] with `locale.orElse(null)`. */
        fun locale(locale: Optional<String>) = locale(locale.getOrNull())

        fun properties(properties: String?) = apply { this.properties = properties }

        /** Alias for calling [Builder.properties] with `properties.orElse(null)`. */
        fun properties(properties: Optional<String>) = properties(properties.getOrNull())

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
         * Returns an immutable instance of [PropertyGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyGetParams =
            PropertyGetParams(
                checkRequired("objectType", objectType),
                propertyName,
                archived,
                dataSensitivity,
                locale,
                properties,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType
            1 -> propertyName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                dataSensitivity?.let { put("dataSensitivity", it.toString()) }
                locale?.let { put("locale", it) }
                properties?.let { put("properties", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class DataSensitivity @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HIGHLY_SENSITIVE = of("highly_sensitive")

            @JvmField val NON_SENSITIVE = of("non_sensitive")

            @JvmField val SENSITIVE = of("sensitive")

            @JvmStatic fun of(value: String) = DataSensitivity(JsonField.of(value))
        }

        /** An enum containing [DataSensitivity]'s known values. */
        enum class Known {
            HIGHLY_SENSITIVE,
            NON_SENSITIVE,
            SENSITIVE,
        }

        /**
         * An enum containing [DataSensitivity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataSensitivity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGHLY_SENSITIVE,
            NON_SENSITIVE,
            SENSITIVE,
            /**
             * An enum member indicating that [DataSensitivity] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HIGHLY_SENSITIVE -> Value.HIGHLY_SENSITIVE
                NON_SENSITIVE -> Value.NON_SENSITIVE
                SENSITIVE -> Value.SENSITIVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HIGHLY_SENSITIVE -> Known.HIGHLY_SENSITIVE
                NON_SENSITIVE -> Known.NON_SENSITIVE
                SENSITIVE -> Known.SENSITIVE
                else -> throw HubSpotInvalidDataException("Unknown DataSensitivity: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DataSensitivity = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubSpotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataSensitivity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyGetParams &&
            objectType == other.objectType &&
            propertyName == other.propertyName &&
            archived == other.archived &&
            dataSensitivity == other.dataSensitivity &&
            locale == other.locale &&
            properties == other.properties &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            propertyName,
            archived,
            dataSensitivity,
            locale,
            properties,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PropertyGetParams{objectType=$objectType, propertyName=$propertyName, archived=$archived, dataSensitivity=$dataSensitivity, locale=$locale, properties=$properties, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
