// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.contacts

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInput
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update an existing contact, identified by ID or email/unique property value. To identify a
 * contact by ID, include the ID in the request URL path. To identify a contact by their email or
 * other unique property, include the email/property value in the request URL path, and add the
 * `idProperty` query parameter (`/crm/v3/objects/contacts/jon@website.com?idProperty=email`).
 * Provided property values will be overwritten. Read-only and non-existent properties will result
 * in an error. Properties values can be cleared by passing an empty string.
 */
class ContactUpdateParams
private constructor(
    private val contactId: String?,
    private val simplePublicObjectInput: SimplePublicObjectInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun contactId(): Optional<String> = Optional.ofNullable(contactId)

    /**
     * Represents the input required to create or update a CRM object, containing an object with
     * property names and their corresponding values.
     */
    fun simplePublicObjectInput(): SimplePublicObjectInput = simplePublicObjectInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        simplePublicObjectInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContactUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .simplePublicObjectInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactUpdateParams]. */
    class Builder internal constructor() {

        private var contactId: String? = null
        private var simplePublicObjectInput: SimplePublicObjectInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contactUpdateParams: ContactUpdateParams) = apply {
            contactId = contactUpdateParams.contactId
            simplePublicObjectInput = contactUpdateParams.simplePublicObjectInput
            additionalHeaders = contactUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contactUpdateParams.additionalQueryParams.toBuilder()
        }

        fun contactId(contactId: String?) = apply { this.contactId = contactId }

        /** Alias for calling [Builder.contactId] with `contactId.orElse(null)`. */
        fun contactId(contactId: Optional<String>) = contactId(contactId.getOrNull())

        /**
         * Represents the input required to create or update a CRM object, containing an object with
         * property names and their corresponding values.
         */
        fun simplePublicObjectInput(simplePublicObjectInput: SimplePublicObjectInput) = apply {
            this.simplePublicObjectInput = simplePublicObjectInput
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
         * Returns an immutable instance of [ContactUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .simplePublicObjectInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactUpdateParams =
            ContactUpdateParams(
                contactId,
                checkRequired("simplePublicObjectInput", simplePublicObjectInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SimplePublicObjectInput = simplePublicObjectInput

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> contactId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactUpdateParams &&
            contactId == other.contactId &&
            simplePublicObjectInput == other.simplePublicObjectInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(contactId, simplePublicObjectInput, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContactUpdateParams{contactId=$contactId, simplePublicObjectInput=$simplePublicObjectInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
