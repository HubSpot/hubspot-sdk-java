// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionHookActionBody
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val httpMethod: JsonField<HttpMethod>,
    private val propertyNamesIncluded: JsonField<List<String>>,
    private val type: JsonField<Type>,
    private val url: JsonField<String>,
    private val confirmation: JsonField<ActionConfirmationBody>,
    private val label: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("httpMethod")
        @ExcludeMissing
        httpMethod: JsonField<HttpMethod> = JsonMissing.of(),
        @JsonProperty("propertyNamesIncluded")
        @ExcludeMissing
        propertyNamesIncluded: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confirmation")
        @ExcludeMissing
        confirmation: JsonField<ActionConfirmationBody> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
    ) : this(httpMethod, propertyNamesIncluded, type, url, confirmation, label, mutableMapOf())

    /**
     * The HTTP method to be used when making the call, which can be set to GET, POST, PUT, DELETE,
     * or PATCH. If using GET or DELETE
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun httpMethod(): HttpMethod = httpMethod.getRequired("httpMethod")

    /**
     * A list of property names that will be included on the action. See the documentation for more
     * information
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyNamesIncluded(): List<String> =
        propertyNamesIncluded.getRequired("propertyNamesIncluded")

    /**
     * The type of status.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The URL endpoint that will be called when the action is triggered.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun confirmation(): Optional<ActionConfirmationBody> = confirmation.getOptional("confirmation")

    /**
     * The label for this property as you'd like it displayed to users.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Returns the raw JSON value of [httpMethod].
     *
     * Unlike [httpMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("httpMethod")
    @ExcludeMissing
    fun _httpMethod(): JsonField<HttpMethod> = httpMethod

    /**
     * Returns the raw JSON value of [propertyNamesIncluded].
     *
     * Unlike [propertyNamesIncluded], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("propertyNamesIncluded")
    @ExcludeMissing
    fun _propertyNamesIncluded(): JsonField<List<String>> = propertyNamesIncluded

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [confirmation].
     *
     * Unlike [confirmation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confirmation")
    @ExcludeMissing
    fun _confirmation(): JsonField<ActionConfirmationBody> = confirmation

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
         * Returns a mutable builder for constructing an instance of [ActionHookActionBody].
         *
         * The following fields are required:
         * ```java
         * .httpMethod()
         * .propertyNamesIncluded()
         * .type()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionHookActionBody]. */
    class Builder internal constructor() {

        private var httpMethod: JsonField<HttpMethod>? = null
        private var propertyNamesIncluded: JsonField<MutableList<String>>? = null
        private var type: JsonField<Type>? = null
        private var url: JsonField<String>? = null
        private var confirmation: JsonField<ActionConfirmationBody> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionHookActionBody: ActionHookActionBody) = apply {
            httpMethod = actionHookActionBody.httpMethod
            propertyNamesIncluded =
                actionHookActionBody.propertyNamesIncluded.map { it.toMutableList() }
            type = actionHookActionBody.type
            url = actionHookActionBody.url
            confirmation = actionHookActionBody.confirmation
            label = actionHookActionBody.label
            additionalProperties = actionHookActionBody.additionalProperties.toMutableMap()
        }

        /**
         * The HTTP method to be used when making the call, which can be set to GET, POST, PUT,
         * DELETE, or PATCH. If using GET or DELETE
         */
        fun httpMethod(httpMethod: HttpMethod) = httpMethod(JsonField.of(httpMethod))

        /**
         * Sets [Builder.httpMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.httpMethod] with a well-typed [HttpMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun httpMethod(httpMethod: JsonField<HttpMethod>) = apply { this.httpMethod = httpMethod }

        /**
         * A list of property names that will be included on the action. See the documentation for
         * more information
         */
        fun propertyNamesIncluded(propertyNamesIncluded: List<String>) =
            propertyNamesIncluded(JsonField.of(propertyNamesIncluded))

        /**
         * Sets [Builder.propertyNamesIncluded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyNamesIncluded] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun propertyNamesIncluded(propertyNamesIncluded: JsonField<List<String>>) = apply {
            this.propertyNamesIncluded = propertyNamesIncluded.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.propertyNamesIncluded].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPropertyNamesIncluded(propertyNamesIncluded: String) = apply {
            this.propertyNamesIncluded =
                (this.propertyNamesIncluded ?: JsonField.of(mutableListOf())).also {
                    checkKnown("propertyNamesIncluded", it).add(propertyNamesIncluded)
                }
        }

        /** The type of status. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The URL endpoint that will be called when the action is triggered. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun confirmation(confirmation: ActionConfirmationBody) =
            confirmation(JsonField.of(confirmation))

        /**
         * Sets [Builder.confirmation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confirmation] with a well-typed [ActionConfirmationBody]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun confirmation(confirmation: JsonField<ActionConfirmationBody>) = apply {
            this.confirmation = confirmation
        }

        /** The label for this property as you'd like it displayed to users. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

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
         * Returns an immutable instance of [ActionHookActionBody].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .httpMethod()
         * .propertyNamesIncluded()
         * .type()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionHookActionBody =
            ActionHookActionBody(
                checkRequired("httpMethod", httpMethod),
                checkRequired("propertyNamesIncluded", propertyNamesIncluded).map {
                    it.toImmutable()
                },
                checkRequired("type", type),
                checkRequired("url", url),
                confirmation,
                label,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ActionHookActionBody = apply {
        if (validated) {
            return@apply
        }

        httpMethod().validate()
        propertyNamesIncluded()
        type().validate()
        url()
        confirmation().ifPresent { it.validate() }
        label()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (httpMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (propertyNamesIncluded.asKnown().getOrNull()?.size ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (confirmation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (label.asKnown().isPresent) 1 else 0)

    /**
     * The HTTP method to be used when making the call, which can be set to GET, POST, PUT, DELETE,
     * or PATCH. If using GET or DELETE
     */
    class HttpMethod @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CONNECT = of("CONNECT")

            @JvmField val DELETE = of("DELETE")

            @JvmField val GET = of("GET")

            @JvmField val HEAD = of("HEAD")

            @JvmField val OPTIONS = of("OPTIONS")

            @JvmField val PATCH = of("PATCH")

            @JvmField val POST = of("POST")

            @JvmField val PUT = of("PUT")

            @JvmField val TRACE = of("TRACE")

            @JvmStatic fun of(value: String) = HttpMethod(JsonField.of(value))
        }

        /** An enum containing [HttpMethod]'s known values. */
        enum class Known {
            CONNECT,
            DELETE,
            GET,
            HEAD,
            OPTIONS,
            PATCH,
            POST,
            PUT,
            TRACE,
        }

        /**
         * An enum containing [HttpMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HttpMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONNECT,
            DELETE,
            GET,
            HEAD,
            OPTIONS,
            PATCH,
            POST,
            PUT,
            TRACE,
            /**
             * An enum member indicating that [HttpMethod] was instantiated with an unknown value.
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
                CONNECT -> Value.CONNECT
                DELETE -> Value.DELETE
                GET -> Value.GET
                HEAD -> Value.HEAD
                OPTIONS -> Value.OPTIONS
                PATCH -> Value.PATCH
                POST -> Value.POST
                PUT -> Value.PUT
                TRACE -> Value.TRACE
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
                CONNECT -> Known.CONNECT
                DELETE -> Known.DELETE
                GET -> Known.GET
                HEAD -> Known.HEAD
                OPTIONS -> Known.OPTIONS
                PATCH -> Known.PATCH
                POST -> Known.POST
                PUT -> Known.PUT
                TRACE -> Known.TRACE
                else -> throw HubSpotInvalidDataException("Unknown HttpMethod: $value")
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

        fun validate(): HttpMethod = apply {
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

            return other is HttpMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of status. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACTION_HOOK = of("ACTION_HOOK")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACTION_HOOK
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTION_HOOK,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ACTION_HOOK -> Value.ACTION_HOOK
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
                ACTION_HOOK -> Known.ACTION_HOOK
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionHookActionBody &&
            httpMethod == other.httpMethod &&
            propertyNamesIncluded == other.propertyNamesIncluded &&
            type == other.type &&
            url == other.url &&
            confirmation == other.confirmation &&
            label == other.label &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            httpMethod,
            propertyNamesIncluded,
            type,
            url,
            confirmation,
            label,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionHookActionBody{httpMethod=$httpMethod, propertyNamesIncluded=$propertyNamesIncluded, type=$type, url=$url, confirmation=$confirmation, label=$label, additionalProperties=$additionalProperties}"
}
