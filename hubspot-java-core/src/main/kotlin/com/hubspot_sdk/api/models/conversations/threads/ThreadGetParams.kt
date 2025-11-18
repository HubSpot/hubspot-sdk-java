// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a single thread by its ID */
class ThreadGetParams
private constructor(
    private val threadId: Long?,
    private val archived: Boolean?,
    private val association: List<Association>?,
    private val property: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun threadId(): Optional<Long> = Optional.ofNullable(threadId)

    /** Whether to return only results that have been archived. Default is false. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /**
     * You can specify an association type here of `TICKET`. If this is set the response will
     * included a thread associations object and associated ticket id if present. If there are no
     * associations to a ticket with this conversation, then the thread associations object will not
     * be present on the response.
     */
    fun association(): Optional<List<Association>> = Optional.ofNullable(association)

    /** A specific property to include in the thread response. */
    fun property(): Optional<String> = Optional.ofNullable(property)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ThreadGetParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ThreadGetParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadGetParams]. */
    class Builder internal constructor() {

        private var threadId: Long? = null
        private var archived: Boolean? = null
        private var association: MutableList<Association>? = null
        private var property: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(threadGetParams: ThreadGetParams) = apply {
            threadId = threadGetParams.threadId
            archived = threadGetParams.archived
            association = threadGetParams.association?.toMutableList()
            property = threadGetParams.property
            additionalHeaders = threadGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = threadGetParams.additionalQueryParams.toBuilder()
        }

        fun threadId(threadId: Long?) = apply { this.threadId = threadId }

        /**
         * Alias for [Builder.threadId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun threadId(threadId: Long) = threadId(threadId as Long?)

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<Long>) = threadId(threadId.getOrNull())

        /** Whether to return only results that have been archived. Default is false. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /**
         * You can specify an association type here of `TICKET`. If this is set the response will
         * included a thread associations object and associated ticket id if present. If there are
         * no associations to a ticket with this conversation, then the thread associations object
         * will not be present on the response.
         */
        fun association(association: List<Association>?) = apply {
            this.association = association?.toMutableList()
        }

        /** Alias for calling [Builder.association] with `association.orElse(null)`. */
        fun association(association: Optional<List<Association>>) =
            association(association.getOrNull())

        /**
         * Adds a single [Association] to [Builder.association].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: Association) = apply {
            this.association = (this.association ?: mutableListOf()).apply { add(association) }
        }

        /** A specific property to include in the thread response. */
        fun property(property: String?) = apply { this.property = property }

        /** Alias for calling [Builder.property] with `property.orElse(null)`. */
        fun property(property: Optional<String>) = property(property.getOrNull())

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
         * Returns an immutable instance of [ThreadGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThreadGetParams =
            ThreadGetParams(
                threadId,
                archived,
                association?.toImmutable(),
                property,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> threadId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                association?.let { put("association", it.joinToString(",") { it.toString() }) }
                property?.let { put("property", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Association @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TICKET = of("TICKET")

            @JvmStatic fun of(value: String) = Association(JsonField.of(value))
        }

        /** An enum containing [Association]'s known values. */
        enum class Known {
            TICKET
        }

        /**
         * An enum containing [Association]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Association] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TICKET,
            /**
             * An enum member indicating that [Association] was instantiated with an unknown value.
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
                TICKET -> Value.TICKET
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TICKET -> Known.TICKET
                else -> throw HubspotInvalidDataException("Unknown Association: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Association = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is Association && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadGetParams &&
            threadId == other.threadId &&
            archived == other.archived &&
            association == other.association &&
            property == other.property &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            threadId,
            archived,
            association,
            property,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ThreadGetParams{threadId=$threadId, archived=$archived, association=$association, property=$property, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
