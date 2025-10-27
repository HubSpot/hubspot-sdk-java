// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiWebhookAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionId: JsonField<String>,
    private val method: JsonField<Method>,
    private val queryParams: JsonField<List<ApiInputVariable>>,
    private val type: JsonField<Type>,
    private val webhookUrl: JsonField<String>,
    private val authSettings: JsonField<AuthSettings>,
    private val connection: JsonField<ApiConnection>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
        @JsonProperty("queryParams")
        @ExcludeMissing
        queryParams: JsonField<List<ApiInputVariable>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("webhookUrl")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authSettings")
        @ExcludeMissing
        authSettings: JsonField<AuthSettings> = JsonMissing.of(),
        @JsonProperty("connection")
        @ExcludeMissing
        connection: JsonField<ApiConnection> = JsonMissing.of(),
    ) : this(
        actionId,
        method,
        queryParams,
        type,
        webhookUrl,
        authSettings,
        connection,
        mutableMapOf(),
    )

    /**
     * The ID for this action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionId(): String = actionId.getRequired("actionId")

    /**
     * The HTTP method to use when calling the webhook URL
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): Method = method.getRequired("method")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queryParams(): List<ApiInputVariable> = queryParams.getRequired("queryParams")

    /**
     * The type of action this is, can be: "STATIC_BRANCH", "LIST_BRANCH", "AB_TEST_BRANCH",
     * "CUSTOM_CODE", "WEBHOOK", or "SINGLE_CONNECTION"
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The URL to call each time this action is executed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhookUrl(): String = webhookUrl.getRequired("webhookUrl")

    /**
     * The type of auth to use when calling the webhook endpoint.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authSettings(): Optional<AuthSettings> = authSettings.getOptional("authSettings")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connection(): Optional<ApiConnection> = connection.getOptional("connection")

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

    /**
     * Returns the raw JSON value of [queryParams].
     *
     * Unlike [queryParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queryParams")
    @ExcludeMissing
    fun _queryParams(): JsonField<List<ApiInputVariable>> = queryParams

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookUrl") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

    /**
     * Returns the raw JSON value of [authSettings].
     *
     * Unlike [authSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authSettings")
    @ExcludeMissing
    fun _authSettings(): JsonField<AuthSettings> = authSettings

    /**
     * Returns the raw JSON value of [connection].
     *
     * Unlike [connection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection")
    @ExcludeMissing
    fun _connection(): JsonField<ApiConnection> = connection

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
         * Returns a mutable builder for constructing an instance of [ApiWebhookAction].
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .method()
         * .queryParams()
         * .type()
         * .webhookUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiWebhookAction]. */
    class Builder internal constructor() {

        private var actionId: JsonField<String>? = null
        private var method: JsonField<Method>? = null
        private var queryParams: JsonField<MutableList<ApiInputVariable>>? = null
        private var type: JsonField<Type>? = null
        private var webhookUrl: JsonField<String>? = null
        private var authSettings: JsonField<AuthSettings> = JsonMissing.of()
        private var connection: JsonField<ApiConnection> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiWebhookAction: ApiWebhookAction) = apply {
            actionId = apiWebhookAction.actionId
            method = apiWebhookAction.method
            queryParams = apiWebhookAction.queryParams.map { it.toMutableList() }
            type = apiWebhookAction.type
            webhookUrl = apiWebhookAction.webhookUrl
            authSettings = apiWebhookAction.authSettings
            connection = apiWebhookAction.connection
            additionalProperties = apiWebhookAction.additionalProperties.toMutableMap()
        }

        /** The ID for this action. */
        fun actionId(actionId: String) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

        /** The HTTP method to use when calling the webhook URL */
        fun method(method: Method) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [Method] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<Method>) = apply { this.method = method }

        fun queryParams(queryParams: List<ApiInputVariable>) =
            queryParams(JsonField.of(queryParams))

        /**
         * Sets [Builder.queryParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryParams] with a well-typed `List<ApiInputVariable>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun queryParams(queryParams: JsonField<List<ApiInputVariable>>) = apply {
            this.queryParams = queryParams.map { it.toMutableList() }
        }

        /**
         * Adds a single [ApiInputVariable] to [queryParams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addQueryParam(queryParam: ApiInputVariable) = apply {
            queryParams =
                (queryParams ?: JsonField.of(mutableListOf())).also {
                    checkKnown("queryParams", it).add(queryParam)
                }
        }

        /**
         * The type of action this is, can be: "STATIC_BRANCH", "LIST_BRANCH", "AB_TEST_BRANCH",
         * "CUSTOM_CODE", "WEBHOOK", or "SINGLE_CONNECTION"
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The URL to call each time this action is executed. */
        fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

        /** The type of auth to use when calling the webhook endpoint. */
        fun authSettings(authSettings: AuthSettings) = authSettings(JsonField.of(authSettings))

        /**
         * Sets [Builder.authSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authSettings] with a well-typed [AuthSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authSettings(authSettings: JsonField<AuthSettings>) = apply {
            this.authSettings = authSettings
        }

        /**
         * Alias for calling [authSettings] with
         * `AuthSettings.ofApiAuthKeyWebhook(apiAuthKeyWebhook)`.
         */
        fun authSettings(apiAuthKeyWebhook: ApiAuthKeyWebhookAuthSettings) =
            authSettings(AuthSettings.ofApiAuthKeyWebhook(apiAuthKeyWebhook))

        /**
         * Alias for calling [authSettings] with
         * `AuthSettings.ofApiSignatureWebhook(apiSignatureWebhook)`.
         */
        fun authSettings(apiSignatureWebhook: ApiSignatureWebhookAuthSettings) =
            authSettings(AuthSettings.ofApiSignatureWebhook(apiSignatureWebhook))

        fun connection(connection: ApiConnection) = connection(JsonField.of(connection))

        /**
         * Sets [Builder.connection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connection] with a well-typed [ApiConnection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connection(connection: JsonField<ApiConnection>) = apply {
            this.connection = connection
        }

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
         * Returns an immutable instance of [ApiWebhookAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .method()
         * .queryParams()
         * .type()
         * .webhookUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiWebhookAction =
            ApiWebhookAction(
                checkRequired("actionId", actionId),
                checkRequired("method", method),
                checkRequired("queryParams", queryParams).map { it.toImmutable() },
                checkRequired("type", type),
                checkRequired("webhookUrl", webhookUrl),
                authSettings,
                connection,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiWebhookAction = apply {
        if (validated) {
            return@apply
        }

        actionId()
        method().validate()
        queryParams().forEach { it.validate() }
        type().validate()
        webhookUrl()
        authSettings().ifPresent { it.validate() }
        connection().ifPresent { it.validate() }
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
        (if (actionId.asKnown().isPresent) 1 else 0) +
            (method.asKnown().getOrNull()?.validity() ?: 0) +
            (queryParams.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0) +
            (authSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (connection.asKnown().getOrNull()?.validity() ?: 0)

    /** The HTTP method to use when calling the webhook URL */
    class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        /** An enum containing [Method]'s known values. */
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
         * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Method] can contain an unknown value in a couple of cases:
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
            /** An enum member indicating that [Method] was instantiated with an unknown value. */
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
                else -> throw HubSpotInvalidDataException("Unknown Method: $value")
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

        fun validate(): Method = apply {
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

            return other is Method && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of action this is, can be: "STATIC_BRANCH", "LIST_BRANCH", "AB_TEST_BRANCH",
     * "CUSTOM_CODE", "WEBHOOK", or "SINGLE_CONNECTION"
     */
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

            @JvmField val WEBHOOK = of("WEBHOOK")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WEBHOOK
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
            WEBHOOK,
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
                WEBHOOK -> Value.WEBHOOK
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
                WEBHOOK -> Known.WEBHOOK
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

    /** The type of auth to use when calling the webhook endpoint. */
    @JsonDeserialize(using = AuthSettings.Deserializer::class)
    @JsonSerialize(using = AuthSettings.Serializer::class)
    class AuthSettings
    private constructor(
        private val apiAuthKeyWebhook: ApiAuthKeyWebhookAuthSettings? = null,
        private val apiSignatureWebhook: ApiSignatureWebhookAuthSettings? = null,
        private val _json: JsonValue? = null,
    ) {

        fun apiAuthKeyWebhook(): Optional<ApiAuthKeyWebhookAuthSettings> =
            Optional.ofNullable(apiAuthKeyWebhook)

        fun apiSignatureWebhook(): Optional<ApiSignatureWebhookAuthSettings> =
            Optional.ofNullable(apiSignatureWebhook)

        fun isApiAuthKeyWebhook(): Boolean = apiAuthKeyWebhook != null

        fun isApiSignatureWebhook(): Boolean = apiSignatureWebhook != null

        fun asApiAuthKeyWebhook(): ApiAuthKeyWebhookAuthSettings =
            apiAuthKeyWebhook.getOrThrow("apiAuthKeyWebhook")

        fun asApiSignatureWebhook(): ApiSignatureWebhookAuthSettings =
            apiSignatureWebhook.getOrThrow("apiSignatureWebhook")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiAuthKeyWebhook != null -> visitor.visitApiAuthKeyWebhook(apiAuthKeyWebhook)
                apiSignatureWebhook != null -> visitor.visitApiSignatureWebhook(apiSignatureWebhook)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): AuthSettings = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiAuthKeyWebhook(
                        apiAuthKeyWebhook: ApiAuthKeyWebhookAuthSettings
                    ) {
                        apiAuthKeyWebhook.validate()
                    }

                    override fun visitApiSignatureWebhook(
                        apiSignatureWebhook: ApiSignatureWebhookAuthSettings
                    ) {
                        apiSignatureWebhook.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitApiAuthKeyWebhook(
                        apiAuthKeyWebhook: ApiAuthKeyWebhookAuthSettings
                    ) = apiAuthKeyWebhook.validity()

                    override fun visitApiSignatureWebhook(
                        apiSignatureWebhook: ApiSignatureWebhookAuthSettings
                    ) = apiSignatureWebhook.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthSettings &&
                apiAuthKeyWebhook == other.apiAuthKeyWebhook &&
                apiSignatureWebhook == other.apiSignatureWebhook
        }

        override fun hashCode(): Int = Objects.hash(apiAuthKeyWebhook, apiSignatureWebhook)

        override fun toString(): String =
            when {
                apiAuthKeyWebhook != null -> "AuthSettings{apiAuthKeyWebhook=$apiAuthKeyWebhook}"
                apiSignatureWebhook != null ->
                    "AuthSettings{apiSignatureWebhook=$apiSignatureWebhook}"
                _json != null -> "AuthSettings{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AuthSettings")
            }

        companion object {

            @JvmStatic
            fun ofApiAuthKeyWebhook(apiAuthKeyWebhook: ApiAuthKeyWebhookAuthSettings) =
                AuthSettings(apiAuthKeyWebhook = apiAuthKeyWebhook)

            @JvmStatic
            fun ofApiSignatureWebhook(apiSignatureWebhook: ApiSignatureWebhookAuthSettings) =
                AuthSettings(apiSignatureWebhook = apiSignatureWebhook)
        }

        /**
         * An interface that defines how to map each variant of [AuthSettings] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitApiAuthKeyWebhook(apiAuthKeyWebhook: ApiAuthKeyWebhookAuthSettings): T

            fun visitApiSignatureWebhook(apiSignatureWebhook: ApiSignatureWebhookAuthSettings): T

            /**
             * Maps an unknown variant of [AuthSettings] to a value of type [T].
             *
             * An instance of [AuthSettings] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown AuthSettings: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<AuthSettings>(AuthSettings::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AuthSettings {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiAuthKeyWebhookAuthSettings>())
                                ?.let { AuthSettings(apiAuthKeyWebhook = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiSignatureWebhookAuthSettings>())
                                ?.let { AuthSettings(apiSignatureWebhook = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> AuthSettings(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<AuthSettings>(AuthSettings::class) {

            override fun serialize(
                value: AuthSettings,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiAuthKeyWebhook != null ->
                        generator.writeObject(value.apiAuthKeyWebhook)
                    value.apiSignatureWebhook != null ->
                        generator.writeObject(value.apiSignatureWebhook)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AuthSettings")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiWebhookAction &&
            actionId == other.actionId &&
            method == other.method &&
            queryParams == other.queryParams &&
            type == other.type &&
            webhookUrl == other.webhookUrl &&
            authSettings == other.authSettings &&
            connection == other.connection &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionId,
            method,
            queryParams,
            type,
            webhookUrl,
            authSettings,
            connection,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiWebhookAction{actionId=$actionId, method=$method, queryParams=$queryParams, type=$type, webhookUrl=$webhookUrl, authSettings=$authSettings, connection=$connection, additionalProperties=$additionalProperties}"
}
