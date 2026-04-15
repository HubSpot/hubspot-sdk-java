// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns.budget

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.marketing.campaigns.PublicBudgetItemInput
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a specific budget item by ID */
class BudgetUpdateParams
private constructor(
    private val campaignGuid: String,
    private val budgetId: Long?,
    private val publicBudgetItemInput: PublicBudgetItemInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun campaignGuid(): String = campaignGuid

    fun budgetId(): Optional<Long> = Optional.ofNullable(budgetId)

    fun publicBudgetItemInput(): PublicBudgetItemInput = publicBudgetItemInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        publicBudgetItemInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BudgetUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .campaignGuid()
         * .publicBudgetItemInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BudgetUpdateParams]. */
    class Builder internal constructor() {

        private var campaignGuid: String? = null
        private var budgetId: Long? = null
        private var publicBudgetItemInput: PublicBudgetItemInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(budgetUpdateParams: BudgetUpdateParams) = apply {
            campaignGuid = budgetUpdateParams.campaignGuid
            budgetId = budgetUpdateParams.budgetId
            publicBudgetItemInput = budgetUpdateParams.publicBudgetItemInput
            additionalHeaders = budgetUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = budgetUpdateParams.additionalQueryParams.toBuilder()
        }

        fun campaignGuid(campaignGuid: String) = apply { this.campaignGuid = campaignGuid }

        fun budgetId(budgetId: Long?) = apply { this.budgetId = budgetId }

        /**
         * Alias for [Builder.budgetId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun budgetId(budgetId: Long) = budgetId(budgetId as Long?)

        /** Alias for calling [Builder.budgetId] with `budgetId.orElse(null)`. */
        fun budgetId(budgetId: Optional<Long>) = budgetId(budgetId.getOrNull())

        fun publicBudgetItemInput(publicBudgetItemInput: PublicBudgetItemInput) = apply {
            this.publicBudgetItemInput = publicBudgetItemInput
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
         * Returns an immutable instance of [BudgetUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .campaignGuid()
         * .publicBudgetItemInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BudgetUpdateParams =
            BudgetUpdateParams(
                checkRequired("campaignGuid", campaignGuid),
                budgetId,
                checkRequired("publicBudgetItemInput", publicBudgetItemInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PublicBudgetItemInput = publicBudgetItemInput

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> campaignGuid
            1 -> budgetId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BudgetUpdateParams &&
            campaignGuid == other.campaignGuid &&
            budgetId == other.budgetId &&
            publicBudgetItemInput == other.publicBudgetItemInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            campaignGuid,
            budgetId,
            publicBudgetItemInput,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BudgetUpdateParams{campaignGuid=$campaignGuid, budgetId=$budgetId, publicBudgetItemInput=$publicBudgetItemInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
