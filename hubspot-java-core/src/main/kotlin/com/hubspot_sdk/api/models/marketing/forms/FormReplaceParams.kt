// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update all fields of a hubspot form definition. */
class FormReplaceParams
private constructor(
    private val formId: String?,
    private val hubSpotFormDefinition: HubSpotFormDefinition,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun formId(): Optional<String> = Optional.ofNullable(formId)

    fun hubSpotFormDefinition(): HubSpotFormDefinition = hubSpotFormDefinition

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        hubSpotFormDefinition._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FormReplaceParams].
         *
         * The following fields are required:
         * ```java
         * .hubSpotFormDefinition()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormReplaceParams]. */
    class Builder internal constructor() {

        private var formId: String? = null
        private var hubSpotFormDefinition: HubSpotFormDefinition? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(formReplaceParams: FormReplaceParams) = apply {
            formId = formReplaceParams.formId
            hubSpotFormDefinition = formReplaceParams.hubSpotFormDefinition
            additionalHeaders = formReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = formReplaceParams.additionalQueryParams.toBuilder()
        }

        fun formId(formId: String?) = apply { this.formId = formId }

        /** Alias for calling [Builder.formId] with `formId.orElse(null)`. */
        fun formId(formId: Optional<String>) = formId(formId.getOrNull())

        fun hubSpotFormDefinition(hubSpotFormDefinition: HubSpotFormDefinition) = apply {
            this.hubSpotFormDefinition = hubSpotFormDefinition
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
         * Returns an immutable instance of [FormReplaceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hubSpotFormDefinition()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormReplaceParams =
            FormReplaceParams(
                formId,
                checkRequired("hubSpotFormDefinition", hubSpotFormDefinition),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): HubSpotFormDefinition = hubSpotFormDefinition

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> formId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormReplaceParams &&
            formId == other.formId &&
            hubSpotFormDefinition == other.hubSpotFormDefinition &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(formId, hubSpotFormDefinition, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FormReplaceParams{formId=$formId, hubSpotFormDefinition=$hubSpotFormDefinition, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
