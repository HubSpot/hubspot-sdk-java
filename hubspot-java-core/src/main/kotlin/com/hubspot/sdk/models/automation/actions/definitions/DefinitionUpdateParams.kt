// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions.definitions

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.automation.actions.PublicActionDefinitionPatch
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update an existing action definition by ID. */
class DefinitionUpdateParams
private constructor(
    private val appId: Int,
    private val definitionId: String?,
    private val publicActionDefinitionPatch: PublicActionDefinitionPatch,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun definitionId(): Optional<String> = Optional.ofNullable(definitionId)

    fun publicActionDefinitionPatch(): PublicActionDefinitionPatch = publicActionDefinitionPatch

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicActionDefinitionPatch._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DefinitionUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .publicActionDefinitionPatch()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefinitionUpdateParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var definitionId: String? = null
        private var publicActionDefinitionPatch: PublicActionDefinitionPatch? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(definitionUpdateParams: DefinitionUpdateParams) = apply {
            appId = definitionUpdateParams.appId
            definitionId = definitionUpdateParams.definitionId
            publicActionDefinitionPatch = definitionUpdateParams.publicActionDefinitionPatch
            additionalHeaders = definitionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = definitionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun definitionId(definitionId: String?) = apply { this.definitionId = definitionId }

        /** Alias for calling [Builder.definitionId] with `definitionId.orElse(null)`. */
        fun definitionId(definitionId: Optional<String>) = definitionId(definitionId.getOrNull())

        fun publicActionDefinitionPatch(publicActionDefinitionPatch: PublicActionDefinitionPatch) =
            apply {
                this.publicActionDefinitionPatch = publicActionDefinitionPatch
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
         * Returns an immutable instance of [DefinitionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .publicActionDefinitionPatch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DefinitionUpdateParams =
            DefinitionUpdateParams(
                checkRequired("appId", appId),
                definitionId,
                checkRequired("publicActionDefinitionPatch", publicActionDefinitionPatch),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicActionDefinitionPatch = publicActionDefinitionPatch

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> definitionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DefinitionUpdateParams &&
            appId == other.appId &&
            definitionId == other.definitionId &&
            publicActionDefinitionPatch == other.publicActionDefinitionPatch &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            definitionId,
            publicActionDefinitionPatch,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DefinitionUpdateParams{appId=$appId, definitionId=$definitionId, publicActionDefinitionPatch=$publicActionDefinitionPatch, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
